import java.awt.*;
import java.awt.event.*;

public class AwtControlDemo {

   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtControlDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtControlDemo  awtControlDemo = new AwtControlDemo();
      awtControlDemo.showTextFieldDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Strategy Pattern Demo Application");
      mainFrame.setSize(350,200);
      mainFrame.setLayout(new GridLayout(1, 2));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }
      });
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,200);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }

   private void showTextFieldDemo(){

      Label  namelabel= new Label("Enter number ", Label.CENTER);
      Label  passwordLabel = new Label("Enter Email", Label.CENTER);
      final TextField userText = new TextField(10);
      final TextField passwordText = new TextField(10);
      Button loginButton = new Button("Login");
      String userString = userText.getText();
      Label  namelabelStr = new Label(userString + "lol", Label.CENTER);

      loginButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
           String userString = userText.getText();
           String emailString = passwordText.getText();
           System.out.println(userString);
           if (NumberValidation.isValid(userString)){
             userText.setBackground("green");
           } else {
             userText.setBackground("red");
           }
         }
      });

      controlPanel.add(namelabel);
      controlPanel.add(userText);
      controlPanel.add(passwordLabel);
      controlPanel.add(passwordText);
      controlPanel.add(loginButton);
      controlPanel.add(namelabelStr);
      mainFrame.setVisible(true);


   }
}
