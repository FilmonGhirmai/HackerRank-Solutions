package workingArea;

import com.sun.corba.se.spi.copyobject.CopyobjectDefaults;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/22/17.
 * Software Developer
 */
public class nio {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Path sourceFile = Paths.get("files","sample.txt");
        Path targetFile = Paths.get("files","target.txt");

        try {
            Files.copy(sourceFile,targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
