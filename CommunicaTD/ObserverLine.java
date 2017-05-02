package CommunicaTD;

/**
 * Created by tahel on 28/02/17.
 */
public class ObserverLine extends Thread {

    private ListenSocket l;
    private Comunica c;

    public ObserverLine(ListenSocket l, Comunica c) {
        this.l = l;
        this.c = c;
        this.start();
    }

    public void run() {
        while(true) {
            c.getTextRec().append(l.getLastline());
        }
    }
}
