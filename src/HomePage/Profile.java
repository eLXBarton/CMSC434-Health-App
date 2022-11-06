package HomePage;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JTextField;
import java.awt.Canvas;

public class Profile extends JFrame {

	public JFrame frame;
	private JTextField weightTxtField;
	private JTextField heightTextField;
	private JTextField greeting;

	public Profile(JFrame prev) {
		initialize(prev);
	}
	private void initialize(JFrame prev) {
		frame = new JFrame();
		frame.setTitle("Included Health App");
		frame.getContentPane().setBackground(new Color(101, 211, 255));
		frame.getContentPane().setForeground(new Color(101, 211, 255));
		frame.setBounds(100, 100, 375, 500);
		frame.getContentPane().setLayout(null);
		
		JButton homeButton = new JButton("Back");
		homeButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		homeButton.setHorizontalAlignment(SwingConstants.LEFT);
		homeButton.setBounds(10, 11, 65, 51);
		Action homeAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				prev.setVisible(true);
				
			}

			@Override
			public Object getValue(String key) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void putValue(String key, Object value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setEnabled(boolean b) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void addPropertyChangeListener(PropertyChangeListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removePropertyChangeListener(PropertyChangeListener listener) {
				// TODO Auto-generated method stub
				
			}
		};
		homeButton.addActionListener(homeAction);
		frame.getContentPane().add(homeButton);
		
		weightTxtField = new JTextField();
		weightTxtField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		weightTxtField.setText("Weight");
		weightTxtField.setBounds(115, 249, 150, 20);
		frame.getContentPane().add(weightTxtField);
		weightTxtField.setColumns(10);
		
		heightTextField = new JTextField();
		heightTextField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		heightTextField.setText("Height");
		heightTextField.setBounds(115, 295, 150, 20);
		frame.getContentPane().add(heightTextField);
		heightTextField.setColumns(10);
		
		JButton updateHButton = new JButton("Update");
		updateHButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		updateHButton.setBounds(115, 341, 150, 23);
		Action updateAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				heightTextField.setText("Height: " + heightTextField.getText());
				weightTxtField.setText("Weight: " + weightTxtField.getText()+ "lbs");
				greeting.setText("Hello " + greeting.getText()+ "!");
			}

			@Override
			public Object getValue(String key) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void putValue(String key, Object value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setEnabled(boolean b) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void addPropertyChangeListener(PropertyChangeListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removePropertyChangeListener(PropertyChangeListener listener) {
				// TODO Auto-generated method stub
				
			}
		};
		updateHButton.addActionListener(updateAction);
		frame.getContentPane().add(updateHButton);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.DARK_GRAY);
		canvas.setBounds(129, 31, 136, 135);
		frame.getContentPane().add(canvas);
		
		greeting = new JTextField();
		greeting.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		greeting.setHorizontalAlignment(SwingConstants.CENTER);
		greeting.setText("Hello 'X'!");
		greeting.setBounds(139, 175, 96, 20);
		frame.getContentPane().add(greeting);
		greeting.setColumns(10);
		
	}
}
