package HomePage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.SwingConstants;

import MealPage.MealPageMain;
import WorkoutPage.WorkoutPage;
import JournalPage.JournalPage;

public class HomePage{

	private JFrame frame;

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
		frame.getContentPane().setBackground(new Color(101, 211, 255));
		frame.getContentPane().setForeground(new Color(101, 211, 255));
		frame.setBounds(100, 100, 375, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton profileButton = new JButton("Profile");
		profileButton.setForeground(Color.BLACK);
		profileButton.setBackground(Color.WHITE);
		profileButton.setHorizontalAlignment(SwingConstants.LEFT);
		profileButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 10));
		profileButton.setBounds(294, 0, 69, 64);
		Action profileAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				Profile profilePage = new Profile(frame);
				frame.setVisible(false);
				profilePage.frame.setVisible(true);
				
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
		profileButton.addActionListener(profileAction);
		frame.getContentPane().add(profileButton);
		
		JButton mealsButton = new JButton("Meals");
		mealsButton.setForeground(Color.BLACK);
		mealsButton.setBackground(Color.WHITE);
		mealsButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
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
		workOutButton.setForeground(Color.BLACK);
		workOutButton.setBackground(Color.WHITE);
		workOutButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
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
		journalButton.setForeground(Color.BLACK);
		journalButton.setBackground(Color.WHITE);
		journalButton.setBounds(121, 260, 111, 116);
		journalButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		Action journalAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				JournalPage jPage = new JournalPage();
				frame.setVisible(false);
				jPage.setVisible(true);
				
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
		journalButton.addActionListener(journalAction);
		frame.getContentPane().add(journalButton);
		
		JTextArea txtrWelcomeToIncluded = new JTextArea();
		txtrWelcomeToIncluded.setEditable(false);
		txtrWelcomeToIncluded.setLineWrap(true);
		txtrWelcomeToIncluded.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtrWelcomeToIncluded.setText("Welcome To Included Health!");
		txtrWelcomeToIncluded.setBounds(44, 30, 247, 54);
		txtrWelcomeToIncluded.setBackground(new Color(101, 211, 255));
		txtrWelcomeToIncluded.setForeground(Color.WHITE);
		frame.getContentPane().add(txtrWelcomeToIncluded);
		
		JButton exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 10));
		exitButton.setBounds(264, 407, 89, 23);
		Action exitAction = new Action() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
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
		exitButton.addActionListener(exitAction);
		frame.getContentPane().add(exitButton);
	}
	
}
