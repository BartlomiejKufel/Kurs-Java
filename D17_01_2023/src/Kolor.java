
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Kolor extends JFrame implements ActionListener {


        JPanel panel;
        JButton przycisk1;
        JButton przycisk2;
        JButton przycisk3;



        Kolor()
        {
            super("Kolory");
            setSize(700, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel  = new JPanel(null);

            przycisk1 = new JButton("Czerwony");
            przycisk2 = new JButton("Zielony");
            przycisk3 = new JButton("Żółty");

            przycisk1.setBounds(100, 40, 120, 25);
            przycisk2.setBounds(250, 40, 120, 25);
            przycisk3.setBounds(400, 40, 120, 25);

            przycisk1.addActionListener(this);
            przycisk2.addActionListener(this);
            przycisk3.addActionListener(this);

            panel.add(przycisk1);
            panel.add(przycisk2);
            panel.add(przycisk3);

            panel.setBackground(Color.white);
            setContentPane(panel);
            setVisible(true);

        }

        public static void main(String[] args) {

            new Kolor();
        }


        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Object o = actionEvent.getSource();

            if(o==przycisk1)
            {
                panel.setBackground(Color.RED);
            }else if(o==przycisk2)
            {
                panel.setBackground(Color.GREEN);
            }else if(o==przycisk3)
            {
                panel.setBackground(Color.YELLOW);
            }

        }
    }

