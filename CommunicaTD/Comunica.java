package CommunicaTD;

import javax.smartcardio.CommandAPDU;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by tahel on 15/02/17.
 */
public class Comunica extends JFrame {

    private BufferedWriter writer;
    private BufferedReader reader;
    private JButton bReceive;
    private JButton bSend;
    private JLabel Imessrec;
    private JLabel Imesssend;
    private JTextArea textRec;
    private JTextArea textToSend;
    private ListenSocket ls;
    private ObserverLine ol;

    public Comunica(ListenSocket ls, BufferedWriter writer) {
        this.writer = writer;
        this.ls = ls;;
        //this.reader = reader;

        this.initComponents();

    }

    private void initComponents() {
        bReceive = new JButton("receive");
        bReceive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*try {

                    /*String tmp;
                    String buf = "";
                    while (reader.ready() && ((tmp = reader.readLine()) != null)) {
                        buf += tmp;
                        System.out.println(buf);
                    }



                    textRec.setText(buf);*/

                    //textRec.setText(ls.getLastline());
                /*} catch (IOException e1) {
                    e1.printStackTrace();
                }*/
            }
        });

        bSend = new JButton("send");
        bSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    writer.write(textToSend.getText() + "\n");
                    writer.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        Imessrec = new JLabel("received message");
        Imesssend = new JLabel("message to send");

        textRec = new JTextArea(5,30);
        textRec.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textRec);


        textToSend = new JTextArea(5,30);
        JScrollPane jScrollPaneSend = new JScrollPane(textToSend);

        this.setLayout(new GridLayout(3,2, 30, 30));

        this.add(Imesssend);
        this.add(jScrollPaneSend);

        this.add(bSend);
        this.add(bReceive);

        this.add(Imessrec);
        this.add(scrollPane);


        this.setSize(200, 100);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

    }

    public JTextArea getTextRec() {
        return textRec;
    }

    public ListenSocket getlistenSoket() {
        return this.ls;
    }
}
