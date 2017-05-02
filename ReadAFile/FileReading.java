package ReadAFile;

import java.io.*;
import java.nio.file.Files;

/**
 * Created by FatePc on 5/2/2017.
 */
public class FileReading {
    public static void main(String[] args) {
        try {
            System.out.println("Working Directory = " + System.getProperty("user.dir"));

            FileReader fileReader = new FileReader("./CompilerJava.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
