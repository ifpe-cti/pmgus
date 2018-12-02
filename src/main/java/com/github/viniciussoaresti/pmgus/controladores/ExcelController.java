package com.github.viniciussoaresti.pmgus.controladores;

import com.github.viniciussoaresti.pmgus.negocio.Arma;
import java.io.File;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author vinic
 */
public class ExcelController {

    List<Arma> armas;
    private UploadedFile arquivoupload;

    public UploadedFile getArquivoupload() {
        return arquivoupload;
    }

    public void setArquivoupload(UploadedFile arquivoupload) {
        this.arquivoupload = arquivoupload;
    }

    public void upload() {
        if (arquivoupload != null) {
            FacesMessage message = new FacesMessage("Sucesso no upload de ", arquivoupload.getFileName() + ".");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage msg = new FacesMessage("Sucesso no upload de ", event.getFile().getFileName() + ".");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public boolean cadastrarArmas(ArmaController armacontroller) {
        try {
            if (arquivoupload != null) {
                System.out.println(arquivoupload.getFileName());
                OPCPackage pkg = OPCPackage.open(new File(arquivoupload.getFileName()));
                XSSFWorkbook wb = new XSSFWorkbook(pkg);
                for (Sheet sheet : wb) {
                    for (int i = 0; i < sheet.getLastRowNum(); i++) { //linha
                        Row linha = null;
                        if (sheet.getRow(i) != null) {
                            linha = sheet.getRow(i);
                        }
                        if (linha != null && linha.getCell(i) != null && !linha.getCell(0).getCellType().equals(CellType.BLANK)) {
                            Arma arma = new Arma();
                            for (Cell celula : linha) { //coluna
                                switch (celula.getColumnIndex()) {
                                    case 0://código é definido automaticamente
                                        break;
                                    case 1:
                                        arma.setTipoDeArma(celula.getStringCellValue());
                                        break;
                                    case 2:
                                        arma.setModelo(celula.getStringCellValue());
                                        break;
                                    case 3:
                                        arma.setMarca(celula.getStringCellValue());
                                        break;
                                    case 4:
                                        arma.setCalibre(celula.getStringCellValue());
                                        break;
                                }
                            }
                            armas.add(arma);
                        }
                    }
                }
                for (Arma a : armas) {
                    armacontroller.setArmaCadastro(a);
                    armacontroller.inserir();
                }
                pkg.close();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
