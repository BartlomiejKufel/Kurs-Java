import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Hobby_aplikacja extends JFrame implements ActionListener{

    JPanel panel;
    JPanel panelplec;
    JPanel panelhobby;
    JLabel imie;
    JLabel nazwisko;
    JLabel wiek;
    JTextField poleimie;
    JTextField polenazwisko;
    JTextField polewiek;
    JRadioButton opcja1, opcja2;
    JCheckBox wybor1, wybor2, wybor3, wybor4;
    JButton przycisk;


    Hobby_aplikacja(){

        super("Hobby");
        setBounds(0,0,530,270);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel = new JPanel(null);

        ButtonGroup plec=new ButtonGroup();

        panelplec = new JPanel(null);

        panelplec.setBounds(5,130,220,80);

        TitledBorder tytul = BorderFactory.createTitledBorder("Płeć");
        panelplec.setBorder(tytul);


        ButtonGroup hooby=new ButtonGroup();
        panelhobby=new JPanel(null);
        panelhobby.setBounds(250,5, 225, 175);
        TitledBorder tytul2 = BorderFactory.createTitledBorder("Moje zainteresowania:");
        panelhobby.setBorder(tytul2);

        imie = new JLabel("Podaj imię: ");
        imie.setBounds(5, 25, 125, 25);
        poleimie = new JTextField();
        poleimie.setBounds(100, 25, 125, 25);

        nazwisko = new JLabel("Podaj nazwisko:");
        nazwisko.setBounds(5, 60, 125, 25);
        polenazwisko = new JTextField();
        polenazwisko.setBounds(100, 60, 125,25);

        wiek = new JLabel("Podaj wiek: ");
        wiek.setBounds(5, 95, 125, 25);
        polewiek = new JTextField();
        polewiek.setBounds(100, 95, 125,25);

        opcja1 = new JRadioButton("Kobieta");
        opcja1.setBounds(25, 20, 100, 25);

        opcja2 = new JRadioButton("Mężczyzna");
        opcja2.setBounds(25, 50, 100,25);

        wybor1 = new JCheckBox("Sport");
        wybor1.setBounds(25, 30, 125,25);

        wybor2 = new JCheckBox("Programowanie");
        wybor2.setBounds(25, 60, 125,25);

        wybor3 = new JCheckBox("Wędkarstwo");
        wybor3.setBounds(25, 90, 125,25);

        wybor4 = new JCheckBox("Ogrodnictwo");
        wybor4.setBounds(25, 120, 125,25);

        przycisk = new JButton("Potwierdź");
        przycisk.setBounds(250, 190, 225, 25);
        przycisk.addActionListener(this);


        panel.add(imie);
        panel.add(poleimie);
        panel.add(nazwisko);
        panel.add(polenazwisko);
        panel.add(wiek);
        panel.add(polewiek);
        panelplec.add(opcja1);
        panelplec.add(opcja2);
        panelhobby.add(wybor1);
        panelhobby.add(wybor2);
        panelhobby.add(wybor3);
        panelhobby.add(wybor4);
        panel.add(przycisk);
        panel.add(panelplec);
        panel.add(panelhobby);
        setContentPane(panel);
        setVisible(true);


    }


    public static void main(String[] args) {
        new Hobby_aplikacja();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object o=actionEvent.getSource();

        if(o==przycisk)
        {
            String I=poleimie.getText();
            String N=polenazwisko.getText();
            String W=polewiek.getText();

            String P="";
            String H="";

            if(opcja1.isSelected())
                P="Kobieta";
            else if(opcja2.isSelected())
                P="Mężczyzna";

            if(wybor1.isSelected())
                H+=" Sport ";
            if(wybor2.isSelected())
                H+=" Programowanie ";
            if(wybor3.isSelected())
                H+=" Wędkarstwo ";
            if(wybor4.isSelected())
                H+=" Ogrodnictwo ";


            System.out.println("Imię: "+I);
            System.out.println("Nazwisko: "+N);
            System.out.println("Wiek: "+W);
            System.out.println("Płeć: "+P);
            System.out.println("Hobby: "+H);

            JOptionPane.showMessageDialog(this,"\nImię: "+I+"\nNazwisko: "+N+"\nWiek: "+W+"\nPłeć: "+P+"\nHobby: "+H);

            String tekst = "\nImię: "+I+"\nNazwisko: "+N+"\nWiek: "+W+"\nPłeć: "+P+"\nHobby: "+H;

            try {
                FileWriter plik = new FileWriter("dane/wynik2.txt");
                plik.write(tekst);
                plik.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }









    }
}