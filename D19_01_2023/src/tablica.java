import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tablica extends JFrame implements ActionListener {

    JButton butt[][];

    public tablica(){
        super("Tablica");
        setBounds(100,100,600,600);
        JPanel panel = new JPanel(new GridLayout(3,3,0,0));
        butt = new JButton[3][3];


        for (int i = 0; i < butt.length; i++) {
            for (int j = 0; j < butt.length; j++) {
                butt[i][j] = new JButton();
                butt[i][j].setBackground(Color.white);
                panel.add(butt[i][j]);
                butt[i][j].addActionListener(this);
            }
        }

        setContentPane(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        new tablica();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AbstractButton button = (AbstractButton) e.getSource();
        Color color = button.getBackground();

        if(color==Color.red){
            button.setBackground(Color.black);
        } else if (color==Color.black) {
            button.setBackground(Color.red);
        } else if (color==Color.white) {
            button.setBackground(Color.red);
        }


    }

}
