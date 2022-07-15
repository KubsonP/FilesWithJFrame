import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Write extends JFrame{
    public Write(){

        setSize(300, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JTextField text1 = new JTextField();
        text1.setBounds(30, 50, 200, 20);
        JButton sav = new JButton();
        sav.setText("Write to file");
        sav.setBounds(30, 80, 150, 20);
        JButton prev2 = new JButton();
        prev2.setText("Previous");
        prev2.setBounds(200, 0, 80, 40);

        sav.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String val = text1.getText();
                File plik = new File("C:/Desktop/Text.txt");
                try{
                    if(plik.createNewFile()){

                    }
                }catch (Exception e1){
                    e1.printStackTrace();
                }
                Writer test;
                try {
                    test = new BufferedWriter(new FileWriter("C:/Desktop/Text.txt", true));
                    test.append(val + "\n");
                    test.close();

                }catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        });

        prev2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                WriteRead both = new WriteRead();
                both.setVisible(true);
                setVisible(false);

            }
        });


        add(text1);
        add(sav);
        add(prev2);

    }

}