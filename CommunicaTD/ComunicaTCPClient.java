package CommunicaTD;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by tahel on 15/02/17.
 */
public class ComunicaTCPClient {

    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public ComunicaTCPClient(InetAddress adr, int port) {

        try {
            socket = new Socket(adr, port);
            //socket.connect(new InetSocketAddress(adr, port));

            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
