package activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {
    private static String filename="C:\\Users\\003T5O744\\IdeaProjects\\FST_JAVA\\src\\main\\resources\\Testsheet.xlsx";
    public static void main(String[] args) {
        XSSFWorkbook wb= new XSSFWorkbook();
        XSSFSheet sheet= wb.createSheet("Data types");
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };
        int rowNum=0;
        for(Object[] datatype:datatypes){
            Row row= sheet.createRow(rowNum++);
            int colNum=0;
            for(Object col:datatype){
                Cell cell=row.createCell(colNum++);
                if(col instanceof String)
                    cell.setCellValue((String) col);
                else if (col instanceof Integer) {
                    cell.setCellValue((Integer) col);
                }
            }
        }
        try {
            FileOutputStream fout= new FileOutputStream(filename);
            wb.write(fout);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }


}
