package HomePage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import MealPage.MealPageMain;
import WorkoutPage.WorkoutPage;

public class HomePage{

	private JFrame frame;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Included Health App");
		frame.getContentPane().setBackground(new Color(221, 178, 255));
		frame.getContentPane().setForeground(new Color(221, 178, 255));
		frame.setBounds(100, 100, 375, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton profileButton = new JButton("Profile");
		profileButton.setForeground(Color.WHITE);
		profileButton.setBackground(new Color(72, 9, 121));
		profileButton.setHorizontalAlignment(SwingConstants.LEFT);
		profileButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 12));
		profileButton.setBounds(294, 0, 69, 64);
		frame.getContentPane().add(profileButton);
		
		JButton mealsButton = new JButton("Meals");
		mealsButton.setForeground(Color.WHITE);
		mealsButton.setBackground(new Color(72, 9, 121));
		mealsButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		mealsButton.setBounds(44, 98, 111, 116);
		Action mealsAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				MealPageMain mealPage = new MealPageMain(frame);
				frame.setVisible(false);
				mealPage.getFrame().setVisible(true);
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
		mealsButton.addActionListener(mealsAction);
		frame.getContentPane().add(mealsButton);
		
		JButton workOutButton = new JButton("Workouts");
		workOutButton.setForeground(Color.WHITE);
		workOutButton.setBackground(new Color(72, 9, 121));
		workOutButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		workOutButton.setBounds(180, 98, 111, 116);
		Action workOutAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				WorkoutPage workoutPage = new WorkoutPage(frame);
				frame.setVisible(false);
				workoutPage.frame.setVisible(true);
				
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
		workOutButton.addActionListener(workOutAction);
		frame.getContentPane().add(workOutButton);
		
		JButton journalButton = new JButton("Journal");
		journalButton.setForeground(Color.WHITE);
		journalButton.setBackground(new Color(72, 9, 121));
		journalButton.setBounds(44, 261, 111, 116);
		journalButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		frame.getContentPane().add(journalButton);
		
		JButton miscButton = new JButton("About the Creators");
		miscButton.setForeground(Color.WHITE);
		miscButton.setBackground(new Color(72, 9, 121));
		miscButton.setBounds(180, 261, 111, 116);
		miscButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		frame.getContentPane().add(miscButton);
		
		txt = new JTextField();
		txt.setBackground(new Color(255,121,214));
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		txt.setText("Welcome To Included Health!");
		txt.setEnabled(false);
		txt.setEditable(false);
		txt.setBounds(44, 11, 247, 64);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
	}
}
