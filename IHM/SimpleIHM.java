package IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by FatePc on 5/2/2017.
 */
public class SimpleIHM extends JFrame {
    /** a label for the name */
    private JLabel label;
    /** a textfield for the name */
    private JTextField text;
    /** a button to perform an action: e.g. say hello (TBD) */
    private JButton button;

    JLabel textHello;

    /** Creates a Fenetre */
    public SimpleIHM() {
        initComponents();
    }

    /** Initializes the Fenetre components */

    private void initComponents() {
        // create the components
        // a new label with the "Nom" as value
        label = new JLabel("Nom: ");
        // a new text field with 20 columns
        text = new JTextField(20);
        // a new button identified as OK
        button = new JButton("OK");
        textHello = new JLabel();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textHello.setText("hello" + text.getText());
            }
        });


        // configures the JFrame layout using a border layout
        this.setLayout(new BorderLayout());
        // places the components in the layout
        this.add("West",label);
        this.add("Center",text);
        this.add("East",button);
        this.add("South", textHello);
        // packs the fenetre: size is calculated
        // regarding the added components
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // the JFrame is visible now
        this.setVisible(true);
    }

    /** main entry point */
    public static void main(String[] args) {
        SimpleIHM f = new SimpleIHM();
    }
}
