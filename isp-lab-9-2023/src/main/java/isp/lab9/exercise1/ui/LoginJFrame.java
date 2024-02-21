package isp.lab9.exercise1.ui;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mihai.hulea
 * @author radu.miron
 */
public class LoginJFrame extends JFrame {
    public static final Map<String, String> accounts = new HashMap<>();

    public LoginJFrame() {
        //setup the window
        this.setTitle("Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(200, 200, 300, 200);

        //create and add components
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 100, 20);
        this.add(userLabel);

        JTextField userInputField = new JTextField();
        userInputField.setBounds(160, 20, 100, 20);
        this.add(userInputField);

        JLabel pwdLabel = new JLabel("Password:");
        pwdLabel.setBounds(20, 60, 100, 20);
        this.add(pwdLabel);

        JPasswordField pwdInputField = new JPasswordField();
        pwdInputField.setBounds(160, 60, 100, 20);
        this.add(pwdInputField);

        JButton button = new JButton("Login");
        button.setBounds(20, 100, 240, 20);
        this.add(button);

        JButton button2 = new JButton("Singup");
        button2.setBounds(20, 130, 240, 20);
        this.add(button2);

        button2.addActionListener(e -> verifyCredentials2());
        // add event listener to button
        button.addActionListener(e -> verifyCredentials(userInputField, pwdInputField));

        //initialize accounts
        initAccounts();

        //display
        this.setVisible(true);
    }
    private void verifyCredentials2()
    {
        new SingUpJFrame();
    }
    private void verifyCredentials(JTextField userInputField, JPasswordField pwdInputField) {

        String username = userInputField.getText();
        String password = new String(pwdInputField.getPassword());
        if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
            LoginJFrame.this.setVisible(false);
            new StockMarketJFrame();
        }
        else {
            JOptionPane.showMessageDialog(LoginJFrame.this, "Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void initAccounts() {
        accounts.put("user1", "password1");
    }
    private void initAccounts2(String a,String b) {
        accounts.put(a,b);
    }
}
