package imagens;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.github.viniciussoaresti.pmgus.negocio.Arma;
import com.github.viniciussoaresti.pmgus.controladores.ArmaController;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioArmaImplBD;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;

public class CriaExcel {

    private static final String fileName = "C:\\Users\\barro.DESKTOP-RV892QA\\Documents\\teste1.xls";

    public static void main(String[] args) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheetArma = workbook.createSheet("Armas");
        
        
      List<Arma> listaArma = new ArrayList<Arma>();
        listaArma.add(new Arma(1,"Industrial", "Revolver", "Taurus", 35));
         listaArma.add(new Arma(1,"Industrial", "Pistola", "Bolsonaro", 35));

        int rownum = 0;
        int cellnumS = 0;
        Row rowS = sheetArma.createRow(rownum++);
        Cell cellMunicipio = rowS.createCell(cellnumS++);
        cellMunicipio.setCellValue("Codigo");
        Cell cell2017 = rowS.createCell(cellnumS++);
        cell2017.setCellValue("Tipo");
        Cell cell2018 = rowS.createCell(cellnumS++);
        cell2018.setCellValue("Modelo");
        Cell cellParteCvli = rowS.createCell(cellnumS++);
        cellParteCvli.setCellValue("Marca");
        Cell cellVarCvli = rowS.createCell(cellnumS++);
        cellVarCvli.setCellValue("Calibre");
       



        for (Arma arma : listaArma) {
            Row row = sheetArma.createRow(rownum++);
            int cellnum = 0;
            Cell cellCodigo = row.createCell(cellnum++);
            cellCodigo.setCellValue(arma.getCodigo());
            Cell cellTipo = row.createCell(cellnum++);
            cellTipo.setCellValue(arma.getTipoDeArma());
            Cell cellModelo = row.createCell(cellnum++);
            cellModelo.setCellValue(arma.getModelo());
            Cell cellMarca = row.createCell(cellnum++);
            cellMarca.setCellValue(arma.getMarca());
            Cell cellCalibre = row.createCell(cellnum++);
            cellCalibre.setCellValue(arma.getCalibre());

        }

        try {
            FileOutputStream out
                    = new FileOutputStream(new File(CriaExcel.fileName));
            workbook.write(out);
            out.close();
            System.out.println("Arquivo Excel criado com sucesso!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro na edição do arquivo!");
        }

    }

}
