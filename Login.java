import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {

    public Login() {
        setSize(300, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel etiq1 = new JLabel();
        etiq1.setText("Login: ");
        etiq1.setBounds(10, 50, 50, 50);
        JTextField login = new JTextField();
        login.setBounds(50, 65, 60, 20);
        JLabel etiq2 = new JLabel();
        etiq2.setText("Password: ");
        etiq2.setBounds(10, 70, 50, 50);
        JTextField pw = new JTextField();
        pw.setBounds(50, 85, 60, 20);
        JButton log = new JButton();
        log.setBounds(50, 110, 90, 20);
        log.setText("Log in");
        JLabel err = new JLabel();
        err.setForeground(Color.red);
        err.setText("Incorrect login or password!");
        err.setBounds(40, 100, 150, 80);

        log.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(301, 301);
                WriteRead both = new WriteRead();
                String log = login.getText();
                String pas = pw.getText();
                if (log.equals("admin") && pas.equals("admin1")) {
                    both.setVisible(true);
                    setVisible(false);
                    add(both);
                } else
                    add(err);

            }
        });


        add(etiq1);
        add(login);
        add(etiq2);
        add(pw);
        add(log);
    }
}