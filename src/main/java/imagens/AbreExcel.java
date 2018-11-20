package imagens;

import com.github.viniciussoaresti.pmgus.controladores.ArmaController;
import com.github.viniciussoaresti.pmgus.negocio.Arma;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
  
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
  
public class AbreExcel {
  
       private static final String fileName = "C:\\Users\\barro.DESKTOP-RV892QA\\Documents\\teste1.xls";
  
       public static void main(String[] args) throws IOException {
  
            List<Arma> listaArma = new ArrayList<Arma>();
            ArmaController armaC = new ArmaController();
             try {
                    FileInputStream arquivo = new FileInputStream(new File(
                                  AbreExcel.fileName));
  
                    HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
  
                    HSSFSheet sheetArma = workbook.getSheetAt(0);
  
                    Iterator<Row> rowIterator = sheetArma.iterator();
  
                    while (rowIterator.hasNext()) {
                        int rownum = 1;
                           Row row = rowIterator.next();
                           Iterator<Cell> cellIterator = row.cellIterator();
  
                           Arma arma = new Arma();
                           listaArma.add(arma);
                           
                           while (cellIterator.hasNext()) {
                                  Cell cell = cellIterator.next();
                                  switch (cell.getColumnIndex()) {
                                  case 0:
                                        arma.setCodigo(cell.getCellType());
                                        break;
                                  case 1:
                                        arma.setTipoDeArma(cell.getStringCellValue());
                                        break;
                                  case 2:
                                        arma.setModelo(cell.getStringCellValue());
                                        break;
                                  case 3:
                                        arma.setMarca(cell.getStringCellValue());
                                        break;
                                  case 4:
                                         arma.setCalibre(cell.getCellType());
                                        break;
                                 
                                  }
                           }
                    }
                    arquivo.close();
  
             } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("Arquivo Excel não encontrado!");
             }
  
             if (listaArma.size() == 0) {
                    System.out.println("Nenhum aluno encontrado!");
             } else {
                    
                    for (Arma arma : listaArma) {
   
                          System.out.println("Arma: " + arma.getMarca());
 
                    }                    
             }
       }
}