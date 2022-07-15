import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.io.IOException;

public class Read extends JFrame{
    public Read() throws IOException{
        setSize(300, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JTextField read = new JTextField();
        read.setBounds(20, 20, 150, 150);
        JButton prev3 = new JButton();
        prev3.setText("Previous");
        prev3.setBounds(200, 0, 80, 40);

        prev3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                WriteRead both = new WriteRead();
                both.setVisible(true);
                setVisible(false);

            }
        });



        try {
            FileReader in = new FileReader("C:/Desktop/Text.txt");

            String content = new Scanner(in).useDelimiter("\\Z").next();
            in.close();

            read.setText(content);
            add(read);


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        add(prev3);

    }
}