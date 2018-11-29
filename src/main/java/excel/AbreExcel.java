package excel;

import com.github.viniciussoaresti.pmgus.negocio.Arma;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AbreExcel {

    private static final String teste = "src/main/java/com/github/viniciussoaresti/pmgus/controladores//teste.xlsx";

    public static void main(String[] args) throws IOException {
        List<Arma> armas = new ArrayList<>();
        //ArmaController armaC = new ArmaController();
        try {
            OPCPackage pkg = OPCPackage.open(new File(teste));
            XSSFWorkbook wb = new XSSFWorkbook(pkg);
            for (Sheet sheet : wb) {
                for (int i = 0; i < sheet.getLastRowNum(); i++) { //linha
                    Row linha = null;
                    if(sheet.getRow(i)!=null){
                    linha = sheet.getRow(i);
                    }
                    if (linha!=null&&linha.getCell(i)!=null&&!linha.getCell(0).getCellType().equals(CellType.BLANK)) {
                        Arma arma = new Arma();
                        for (Cell celula : linha) { //coluna
                            switch (celula.getColumnIndex()) {
                                case 0: //lembrar q o código é automatico quando definir no banco
                                    arma.setCodigo((int) celula.getNumericCellValue());
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
                                    arma.setCalibre(Double.toString(celula.getNumericCellValue()));
                                    break;
                            }
                        }
                        armas.add(arma);
                    }
                }
            }
            pkg.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (armas.size() == 0) {
            System.out.println("Nenhuma arma encontrada!");
        } else {
            int a = 0;
            for (Arma arma : armas) {
                System.out.println("Arma" + a + ": " + arma.toString());
                a++;
            }
        }
    }
}
