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

	private JFrame frmIncludedHealthApp;
	private JTextField txtWelcomeToIncluded;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frmIncludedHealthApp.setVisible(true);
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
		frmIncludedHealthApp = new JFrame();
		frmIncludedHealthApp.setTitle("Included Health App");
		frmIncludedHealthApp.getContentPane().setBackground(new Color(221, 178, 255));
		frmIncludedHealthApp.getContentPane().setForeground(new Color(221, 178, 255));
		frmIncludedHealthApp.setBounds(100, 100, 375, 500);
		frmIncludedHealthApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIncludedHealthApp.getContentPane().setLayout(null);
		
		JButton profileButton = new JButton("Profile");
		profileButton.setForeground(Color.WHITE);
		profileButton.setBackground(new Color(72, 9, 121));
		profileButton.setHorizontalAlignment(SwingConstants.LEFT);
		profileButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 12));
		profileButton.setBounds(294, 0, 69, 64);
		frmIncludedHealthApp.getContentPane().add(profileButton);
		
		JButton mealsButton = new JButton("Meals");
		mealsButton.setForeground(Color.WHITE);
		mealsButton.setBackground(new Color(72, 9, 121));
		mealsButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		mealsButton.setBounds(44, 98, 111, 116);
		Action mealsAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				MealPageMain.main(null);
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
		frmIncludedHealthApp.getContentPane().add(mealsButton);
		
		JButton workOutButton = new JButton("Workouts");
		workOutButton.setForeground(Color.WHITE);
		workOutButton.setBackground(new Color(72, 9, 121));
		workOutButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		workOutButton.setBounds(180, 98, 111, 116);
		Action workOutAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				WorkoutPage.main(null);
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
		frmIncludedHealthApp.getContentPane().add(workOutButton);
		
		JButton journalButton = new JButton("Journal");
		journalButton.setForeground(Color.WHITE);
		journalButton.setBackground(new Color(72, 9, 121));
		journalButton.setBounds(44, 261, 111, 116);
		journalButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		frmIncludedHealthApp.getContentPane().add(journalButton);
		
		JButton miscButton = new JButton("About the Creators");
		miscButton.setForeground(Color.WHITE);
		miscButton.setBackground(new Color(72, 9, 121));
		miscButton.setBounds(180, 261, 111, 116);
		miscButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		frmIncludedHealthApp.getContentPane().add(miscButton);
		
		txtWelcomeToIncluded = new JTextField();
		txtWelcomeToIncluded.setBackground(new Color(255,121,214));
		txtWelcomeToIncluded.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToIncluded.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		txtWelcomeToIncluded.setText("Welcome To Included Health!");
		txtWelcomeToIncluded.setEnabled(false);
		txtWelcomeToIncluded.setEditable(false);
		txtWelcomeToIncluded.setBounds(44, 11, 247, 64);
		frmIncludedHealthApp.getContentPane().add(txtWelcomeToIncluded);
		txtWelcomeToIncluded.setColumns(10);
	}
}