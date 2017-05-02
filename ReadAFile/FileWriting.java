package ReadAFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by FatePc on 5/2/2017.
 */
public class FileWriting {

    public static void main(String[] args) {
        try {
            System.out.println("Working Directory = " + System.getProperty("user.dir"));

            FileWriter fileWriter = new FileWriter("./Output.txt");
            BufferedWriter buf = new BufferedWriter(fileWriter);

            String line = "couycou\n";

            buf.write(line);
            buf.flush();

            buf.close();
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
