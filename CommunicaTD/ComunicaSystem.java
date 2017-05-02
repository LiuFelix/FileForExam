package CommunicaTD;

import CommunicaTD.Comunica;

import java.io.*;
import java.net.Inet4Address;

/**
 * Created by tahel on 15/02/17.
 */
public class ComunicaSystem {

    public static void main(String[] args) {

        try {
            /*FileWriter fileWriterA2B = new FileWriter("A2B.txt");
            FileReader fileReaderA2B = new FileReader("A2B.txt");

            FileWriter fileWriterB2A = new FileWriter("B2A.txt");
            FileReader fileReaderB2A = new FileReader("B2A.txt");

            BufferedReader readerA2B = new BufferedReader(fileReaderA2B);
            BufferedReader readerB2A = new BufferedReader(fileReaderB2A);

            BufferedWriter writerA2B = new BufferedWriter(fileWriterA2B);
            BufferedWriter writerB2A = new BufferedWriter(fileWriterB2A);

            Comunica c1 = new Comunica(readerB2A, writerA2B);
            Comunica c2 = new Comunica(readerA2B, writerB2A);*/
        if (args[0].equals("0")) {
            ComunicaTCPServer comunicaTCPServer = new ComunicaTCPServer(1854);

            BufferedReader readerA2B = new BufferedReader(new InputStreamReader(comunicaTCPServer.getInputStream()));
            BufferedWriter writerA2B = new BufferedWriter(new OutputStreamWriter(comunicaTCPServer.getOutputStream()));

            ListenSocket l1 = new ListenSocket(readerA2B);
            Comunica c1 = new Comunica(l1, writerA2B);
            ObserverLine ol = new ObserverLine(l1, c1);
        } else {
            ComunicaTCPClient comunicaTCPClient = new ComunicaTCPClient(Inet4Address.getLocalHost(), 1854);

            BufferedReader readerB2A = new BufferedReader(new InputStreamReader(comunicaTCPClient.getInputStream()));
            BufferedWriter writerB2A = new BufferedWriter(new OutputStreamWriter(comunicaTCPClient.getOutputStream()));

            ListenSocket l1 = new ListenSocket(readerB2A);
            Comunica c1 = new Comunica(l1, writerB2A);
            ObserverLine ol = new ObserverLine(l1, c1);
        }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
