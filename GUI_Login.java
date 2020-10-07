import javax.swing.*;
import java.awt.event.*;

public class GUI_Login implements ActionListener{
    // Setting the variables that are accessible but are private
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    public static void main(String[] args) { 
        // Declaring the JFrame and JPanel for getting the window
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        // Setting the JFrame
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.add(panel);
        // Setting the Panel and adding the buttons and labels for the user input
        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new GUI_Login());
        panel.add(button);
        
        success = new JLabel();
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setVisible(true);
 }
/* 
This determines the action performed by the user and also determines
that is the user related to the password and if yes then printing the
login was successful and if not then printing the login was unsuccessful
*/


 @Override
 public void actionPerformed(ActionEvent e) {
   String user = userText.getText();
   String password = passwordText.getText();

   if (user.equals("Jatan_YT") && password.equals("JatanlikesCows123")){
       success.setText("Login successful!");
   }
   else{
    success.setText("Login unsuccessful!");
   }
 }
}