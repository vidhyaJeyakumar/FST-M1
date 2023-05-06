package activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcel {
    public static String filename="C:\\Users\\003T5O744\\IdeaProjects\\FST_JAVA\\src\\main\\resources\\Data.xlsx";

    public static void main(String[]args) throws IOException {
        XSSFWorkbook wb= new XSSFWorkbook();
        XSSFSheet sheet= wb.createSheet("Details");
        Object[][] details={
                {"name","DOB"},
                {"Vidhya", "29-01-1996"},
                {"Sasi", "24-05-1993"}
        };
        System.out.println("Excel created");
        int rowNum=0;
        for (Object[] detail:details){
            Row row=sheet.createRow(rowNum++);
            int colNum=0;
            for(Object colvalue:row){
                Cell cell= row.createCell(colNum++);
                if(colvalue instanceof String){
                    cell.setCellValue((String)colvalue);
                } else if (colvalue instanceof Integer) {
                    cell.setCellValue((Integer)colvalue);
                }
            }
        }
        try{
            FileOutputStream fout= new FileOutputStream(filename);
            wb.write(fout);
            wb.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
