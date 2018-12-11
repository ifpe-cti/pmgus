package com.github.viniciussoaresti.pmgus.controladores;

import com.github.viniciussoaresti.pmgus.negocio.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.swing.JFileChooser;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author vinic
 */
@ManagedBean
@ApplicationScoped
public class ExcelController {

    List<Arma> armas;
    List<TipoDroga> tiposDroga;
    List<UnidadeDroga> unidadesDroga;

    public void cadastrarArmas(ArmaController armacontroller) {
        JFileChooser arquivo = new JFileChooser();
        armas = new ArrayList<>();
        String caminho = null;
        try {
            if (arquivo.showDialog(null, "Enviar") == JFileChooser.APPROVE_OPTION) {
                caminho = arquivo.getSelectedFile().getAbsolutePath();
            }
            if (caminho == null) {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "Erro!", "As armas não foram cadastradas!"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O upload foi realizado com sucesso!"));
                OPCPackage pkg = OPCPackage.open(caminho);
                XSSFWorkbook wb = new XSSFWorkbook(pkg);
                for (Sheet sheet : wb) {
                    for (int i = 1; i < sheet.getLastRowNum(); i++) { //linha
                        Row linha = null;
                        if (sheet.getRow(i) != null) {
                            linha = sheet.getRow(i);
                        }
                        if (linha != null && linha.getCell(i) != null && !linha.getCell(0).getCellType().equals(CellType.BLANK)) {
                            Arma arma = new Arma();
                            for (Cell celula : linha) { //coluna
                                switch (celula.getColumnIndex()) {
                                    case 2:
                                        arma.setTipoDeArma(celula.getStringCellValue());
                                        break;
                                    case 3:
                                        arma.setModelo(celula.getStringCellValue());
                                        break;
                                    case 4:
                                        arma.setMarca(celula.getStringCellValue());
                                        break;
                                    case 5:
                                        arma.setCalibre(Double.toString(celula.getNumericCellValue()));
                                        break;
                                }
                            }
                            armas.add(arma);
                        }
                    }
                }
                for (Arma a : armas) {
                    if (!armacontroller.recuperarTodosArmas()
                            .parallelStream()
                            .anyMatch(arma -> {
                                return arma.equals(a);
                            })) {
                        armacontroller.setArmaCadastro(a);
                        armacontroller.inserir();
                    }
                }
                pkg.close();
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "As armas foram cadastradas com sucesso!"));
                FacesContext.getCurrentInstance().getExternalContext().redirect("crudArma.xhtml");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cadastrarDrogas(TipoDrogaController tdc, UnidadeDrogaController udc) {
        JFileChooser arquivo = new JFileChooser();
        tiposDroga = new ArrayList<>();
        unidadesDroga = new ArrayList<>();
        String caminho = null;
        try {
            if (arquivo.showDialog(null, "Enviar") == JFileChooser.APPROVE_OPTION) {
                caminho = arquivo.getSelectedFile().getAbsolutePath();
            }
            if (caminho == null) {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "Erro!", "As drogas não foram cadastradas!"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O upload foi realizado com sucesso!"));
                OPCPackage pkg = OPCPackage.open(caminho);
                XSSFWorkbook wb = new XSSFWorkbook(pkg);
                for (Sheet sheet : wb) {
                    for (int i = 0; i < sheet.getLastRowNum(); i++) { //linha
                        Row linha = null;
                        if (sheet.getRow(i) != null) {
                            linha = sheet.getRow(i);
                        }
                        if (linha != null && linha.getCell(i) != null && !linha.getCell(0).getCellType().equals(CellType.BLANK)) {
                            TipoDroga tipo = new TipoDroga();
                            UnidadeDroga unidade = new UnidadeDroga();
                            for (Cell celula : linha) { //coluna
                                switch (celula.getColumnIndex()) {
                                    case 4:
                                        tipo.setNome(celula.getStringCellValue());
                                        break;
                                    case 5:
                                        unidade.setUnidadeDroga(celula.getStringCellValue());
                                        break;
                                }
                            }
                            tiposDroga.add(tipo);
                            unidadesDroga.add(unidade);
                        }
                    }
                }
                for (TipoDroga t : tiposDroga) {
                    if (!tdc.recuperarTodosTipoDroga()
                            .parallelStream()
                            .anyMatch(tipo -> {
                                return tipo.equals(t);
                            })) {
                        tdc.setTipoDrogaCadastro(t);
                        tdc.inserir();
                    }
                }
                for (UnidadeDroga u : unidadesDroga) {
                    if (!udc.recuperarTodosUnidadeDroga()
                            .parallelStream()
                            .anyMatch(unidade -> {
                                return unidade.equals(u);
                            })) {
                        udc.setUnidadeDrogaCadastro(u);
                        udc.inserir();
                    }
                }
                pkg.close();
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "As armas foram cadastradas com sucesso!"));
                FacesContext.getCurrentInstance().getExternalContext().redirect("crudTipoDroga.xhtml");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
