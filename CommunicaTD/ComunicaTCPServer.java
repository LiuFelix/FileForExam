package CommunicaTD;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by tahel on 15/02/17.
 */
public class ComunicaTCPServer {
    private ServerSocket socketServer;
    private Socket sockClient;

    private InputStream inputStream;
    private OutputStream outputStream;

    public ComunicaTCPServer(int port) {
        try {
            socketServer = new ServerSocket(port);

            sockClient = socketServer.accept();
            System.out.println("Connexion établie");

            inputStream = sockClient.getInputStream();
            outputStream = sockClient.getOutputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }
}
