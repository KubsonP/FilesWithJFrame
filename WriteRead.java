import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WriteRead extends JFrame{
    public WriteRead(){
        setSize(300, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JButton sav = new JButton();
        sav.setText("Write");
        sav.setBounds(50, 35, 80, 50);
        JButton read1 = new JButton();
        read1.setText("Read");
        read1.setBounds(50, 85, 80, 50);
        JButton close = new JButton();
        close.setText("Close");
        close.setBounds(50, 135, 80, 50);
        JButton prev1 = new JButton();
        prev1.setText("Previous");
        prev1.setBounds(200, 0, 80, 40);

        sav.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Write sav = new Write();
                sav.setVisible(true);
                setVisible(false);

            }
        });

        read1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Read read2;
                try {
                    read2 = new Read();
                    read2.setVisible(true);
                    setVisible(false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }


            }
        });

        prev1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Login login = new Login();
                login.setVisible(true);
                setVisible(false);
            }
        });

        prev1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });



        add(sav);
        add(read1);
        add(close);
        add(prev1);
    }
}