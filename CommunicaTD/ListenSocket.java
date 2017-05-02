package CommunicaTD;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by tahel on 28/02/17.
 */
public class ListenSocket extends Thread {

    private BufferedReader reader;

    //private String lastline;

    private ArrayBlockingQueue<String> lines;

    public ListenSocket(BufferedReader reader) {
        this.reader = reader;

        lines = new ArrayBlockingQueue<String>(1024);
        //lastline = " ";
        this.start();

    }

    public void run() {
        //String tmp = "";
        while (true) {
            try {
                //tmp = reader.readLine();
                //this.lastline += tmp;
                lines.add(reader.readLine() + "\n");
                //this.lastline += reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getLastline() {
        /*String buf = lastline;
        lastline = " ";
        return buf;*/
        try {
            return lines.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
