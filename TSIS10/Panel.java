package tsis9;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel extends JPanel implements ActionListener {
	private JButton button = new JButton("Register");
	private JTextField input1 = new JTextField("", 20);
	private JLabel label1 = new JLabel("Enter number:");
	private JTextField input2 = new JTextField("", 20);
	private JLabel label2 = new JLabel("Enter email:");
	
	
	public Panel () {
		JPanel inputArea = new JPanel();
		inputArea.setLayout(new GridLayout(0, 2));
		inputArea.add(label1);
		inputArea.add(input1);
		inputArea.add(label2);
		inputArea.add(input2);
		inputArea.setBorder(BorderFactory.createEmptyBorder(10, 1, 10, 1));
		
		JPanel press = new JPanel();
	    press.setLayout(new BorderLayout());
	    press.add(button, BorderLayout.CENTER);
	    button.addActionListener(this);
	    
	    add(inputArea);
	    add(press);
	    
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			Context context = new Context(new NumberValidation());
			boolean validNumber = context.executeStrategy(input1.getText());
			context = new Context(new EmailValidation());
			boolean validEmail = context.executeStrategy(input2.getText());
			if (validNumber) 
				input1.setBackground(Color.GREEN);
			if (validEmail)
				input2.setBackground(Color.GREEN);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Strategy Pattern Demo Aplication");
		frame.setContentPane(new Panel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 110);
		frame.setResizable(true);
		frame.setVisible(true);	
	}	
}
