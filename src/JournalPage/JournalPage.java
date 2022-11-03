package JournalPage;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class JournalPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JournalPage frame = new JournalPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JournalPage() {
		setTitle("Journal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 0, 68, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Journal");
		btnNewButton_1.setBounds(65, 0, 129, 57);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("?");
		btnNewButton_2.setBounds(192, 0, 60, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Settings");
		btnNewButton_3.setBounds(249, 0, 60, 57);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Profile");
		btnNewButton_4.setBounds(307, 0, 54, 57);
		contentPane.add(btnNewButton_4);
		
		JTextArea txtrAdvice = new JTextArea();
		txtrAdvice.setText("Advice");
		txtrAdvice.setBounds(0, 55, 194, 180);
		contentPane.add(txtrAdvice);
		
		JTextArea txtrCalendar = new JTextArea();
		txtrCalendar.setBackground(new Color(128, 255, 255));
		txtrCalendar.setText("Calendar");
		txtrCalendar.setBounds(192, 55, 169, 180);
		contentPane.add(txtrCalendar);
		
		JTextArea txtrNewNote = new JTextArea();
		txtrNewNote.setBackground(new Color(0, 255, 255));
		txtrNewNote.setText("New Note");
		txtrNewNote.setBounds(0, 233, 371, 104);
		contentPane.add(txtrNewNote);
		
		JTextArea txtrAllEntries = new JTextArea();
		txtrAllEntries.setText("All entries");
		txtrAllEntries.setBounds(0, 336, 295, 137);
		contentPane.add(txtrAllEntries);
		
		JButton btnNewButton_5 = new JButton("Plus");
		btnNewButton_5.setBounds(276, 338, 85, 21);
		contentPane.add(btnNewButton_5);
	}
}
