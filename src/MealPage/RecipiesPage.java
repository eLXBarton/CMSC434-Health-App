package MealPage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.border.BevelBorder;

public class RecipiesPage {

	private JFrame recipiesFrame;
	private JFrame prevFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipiesPage window = new RecipiesPage(null);
					window.recipiesFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RecipiesPage(JFrame prev) {
		prevFrame = prev;
		prevFrame.setVisible(false);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame recipiesFrame = new JFrame();
		recipiesFrame.getContentPane().setBackground(new Color(0, 128, 0));
		recipiesFrame.getContentPane().setForeground(new Color(192, 192, 192));
		recipiesFrame.setBounds(100, 100, 375, 500);
		recipiesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		recipiesFrame.getContentPane().setLayout(null);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBounds(10, 11, 339, 68);
		recipiesFrame.getContentPane().add(headerPanel);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prevFrame.setVisible(true);
                recipiesFrame.setVisible(false);
			}
		});
		backButton.setBounds(10, 11, 89, 23);
		headerPanel.add(backButton);
		
		
		JPanel BodyPanel = new JPanel();
		BodyPanel.setLayout(null);
		BodyPanel.setBounds(10, 107, 339, 343);
		recipiesFrame.getContentPane().add(BodyPanel);
		
		JLabel recipiesLabel = new JLabel("Your Recipies!");
		recipiesLabel.setBounds(135, 11, 76, 14);
		BodyPanel.add(recipiesLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 30, 319, 302);
		BodyPanel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 269, 299, 22);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton linkButton_1 = new JButton("Other Recipies");
		panel_2.add(linkButton_1);
		
		JList list = new JList();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBounds(10, 252, 299, -240);
		panel_1.add(list);
		
		recipiesFrame.setVisible(true);
	}
}
