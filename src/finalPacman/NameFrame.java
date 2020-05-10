package finalPacman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameFrame extends JFrame implements ActionListener {
    private JButton btn;
    private JTextArea text;
    private JLabel lbl;
    private JPanel pnl;
    public static String name;
    private static String[] argss;

    public static void main(String[] args) {
        new NameFrame();
        argss = args;

    }

    public NameFrame(){
        super("Name");
        setLayout(new BorderLayout());
        btn = new JButton("OK");
        lbl = new JLabel("Enter your name: ");
        pnl = new JPanel();
        text = new JTextArea();
        this.setSize(300,70);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn.addActionListener(this);
        add(btn,BorderLayout.EAST);
        add(lbl,BorderLayout.WEST);
        add(text,BorderLayout.CENTER);





    }





    public void actionPerformed(ActionEvent e ){
        if (e.getSource() == btn ){
            name = text.getText();
            this.dispose();
            Main.main(argss);


        }

    }
}
