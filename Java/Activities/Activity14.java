package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    static String filepath="C:\\Users\\003T5O744\\IdeaProjects\\FST_JAVA\\src\\main\\resources\\newFile.txt";

    public static void main(String[]args){
       File file=new File(filepath);
        try {
            boolean filestatus= file.createNewFile();
            if(filestatus==true)
                System.out.println("File created successfully");
            else
                System.out.println("File not created successfully");
            File fileutil= FileUtils.getFile(filepath);
            System.out.println("Read file: "+FileUtils.readFileToString(fileutil,"Happy world"));
            File dir= new File("resources");
            FileUtils.copyFileToDirectory(file,dir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
