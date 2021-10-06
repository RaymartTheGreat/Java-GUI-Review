// SubClass
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
  
	/**
	*
	*/
	private static final long serialVersionUID = 3866707498457681736L;
	
	JTextField fName;
	JTextField lName;
	JTextField mName;
		
	JButton display;
	JButton clear;
		
	// Constructor
	MyFrame(){

		// Label Fields
		JLabel first = new JLabel();
		JLabel last = new JLabel();
		JLabel middle = new JLabel();
		
		// Text Fields
		fName = new JTextField();
		lName = new JTextField();
		mName = new JTextField();
		
		// Button Fields
		display = new JButton();
		clear = new JButton();
		
		first.setText("Name: ");
		last.setText("Last Name: ");
		middle.setText("Middle Name: ");
		
		fName.setPreferredSize(new Dimension(200,20));
		lName.setPreferredSize(new Dimension(200,20));
		mName.setPreferredSize(new Dimension(200,20));
		
		// Display Button
		display.setText("Display");
		display.addActionListener(this);
		display.setFocusable(false);
		
		// Clear Button
		clear.setText("Clear");
		clear.addActionListener(this);
		clear.setFocusable(false);
		
		this.setTitle("Activity 2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(850,100);
		this.setResizable(false);
		
		this.add(first);
		this.add(fName);
		this.add(last);
		this.add(lName);
		this.add(middle);
		this.add(mName);
		this.add(display);
		this.add(clear);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
    
		// if display button is clicked
		if(e.getSource() == display && fName.getText().isBlank() && lName.getText().isBlank() && mName.getText().isBlank()){
		
			JOptionPane.showMessageDialog(null, "All information is Missing!", "Error", JOptionPane.ERROR_MESSAGE);
		
		}
		else if(e.getSource() == display && fName.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Name is Missing!","Error", JOptionPane.ERROR_MESSAGE);
		
		}
		else if(e.getSource() == display && lName.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Last name is Missing!","Error", JOptionPane.ERROR_MESSAGE);
		
		}
		else if(e.getSource() == display && mName.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Middle is Missing!","Error", JOptionPane.ERROR_MESSAGE);
		
		}
		else if(e.getSource() == display){
			JOptionPane.showMessageDialog(null, lName.getText() + ", " + fName.getText() + " " + mName.getText(), "Success", JOptionPane.INFORMATION_MESSAGE);
		
		}
    
		// if clear button is clicked
		if(e.getSource() == clear) {
			fName.setText("");
			lName.setText("");
			mName.setText("");
		}
	}
}
