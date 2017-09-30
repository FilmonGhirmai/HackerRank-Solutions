package workingArea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/22/17.
 * Software Developer
 */
public class FileCoping {
    public static void main(String[] args) {
        String SourceFile = "files/sample.txt";
        String TargetFile = "files/sample2.txt";

        try(
                FileReader fileReader = new FileReader(SourceFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(TargetFile);
                ){
            while(true){
                String line = bufferedReader.readLine();
                if(line == null){
                    break;
                }else{
                    fileWriter.write(line + "\n");
                }
            }
            System.out.println("File copied!");
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
