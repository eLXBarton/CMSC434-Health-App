package HomePage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
	private JTextField weightTextField;
	private JTextField heightTextField;
	private JTextField profileTextField;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile profile = new Profile();
					profile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 * Create the frame.
	 */
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
		
		JButton homeButton = new JButton("Home");
		homeButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 10));
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
		
		weightTextField = new JTextField();
		weightTextField.setBounds(40, 296, 150, 20);
		frame.getContentPane().add(weightTextField);
		weightTextField.setColumns(10);
		
		heightTextField = new JTextField();
		heightTextField.setBounds(40, 339, 150, 20);
		frame.getContentPane().add(heightTextField);
		heightTextField.setColumns(10);
		
		JButton updateWButton = new JButton("Update Weight");
		updateWButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 10));
		updateWButton.setHorizontalAlignment(SwingConstants.LEFT);
		updateWButton.setBounds(235, 295, 96, 23);
		frame.getContentPane().add(updateWButton);
		
		JButton updateHButton = new JButton("Update Height");
		updateHButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 10));
		updateHButton.setBounds(235, 338, 96, 23);
		frame.getContentPane().add(updateHButton);
		
		JButton updateProfButton = new JButton("Update Profile Picture");
		updateProfButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 10));
		updateProfButton.setBounds(129, 187, 136, 23);
		frame.getContentPane().add(updateProfButton);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.DARK_GRAY);
		canvas.setBounds(129, 31, 136, 135);
		frame.getContentPane().add(canvas);
		
		profileTextField = new JTextField();
		profileTextField.setText("");
		profileTextField.setBounds(40, 246, 150, 20);
		frame.getContentPane().add(profileTextField);
		profileTextField.setColumns(10);
		
		JButton updateName = new JButton("Update Name");
		updateName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 10));
		updateName.setBounds(235, 245, 96, 23);
		frame.getContentPane().add(updateName);
		
	}
}
