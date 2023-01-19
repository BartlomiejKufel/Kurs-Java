import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Klawisz extends JFrame implements ActionListener {

    int x=0,y=475;
    JPanel panel, panel2;
    JButton klawisz;
    JScrollBar barX, barY;

    Klawisz(){
        super("Klawisz");
        setSize(700,700);


        panel = new JPanel(null);

        panel2 = new JPanel(null);
        panel2.setBackground(Color.red);
        panel2.setBounds(200,0,500,500);


        klawisz = new JButton("0, 0");
        klawisz.setBounds(0,475,100,25);

        barY = new JScrollBar(1,475,0,0,475);
        barY.setBounds(180,0,20,500);
        barY.addAdjustmentListener(e->{
            y=e.getValue();
            klawisz.setBounds(x,y,100,25);
            klawisz.setText(x+", "+y);
        });

        barX = new JScrollBar(0,0,0,0,400);
        barX.setBounds(200,500,500,20);
        barX.addAdjustmentListener(e->{
            x=e.getValue();
            klawisz.setBounds(x,y,100,25);
            klawisz.setText(x+", "+y);

        });

        {
            panel2.add(klawisz);
        }

        {
            panel.add(barX);
            panel.add(barY);
            panel.add(panel2);
        }
        setContentPane(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Klawisz();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
