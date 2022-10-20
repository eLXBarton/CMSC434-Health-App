package MealPage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MealPageMain {

	private JFrame frame;
	private JTextField txtFood;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MealPageMain window = new MealPageMain();
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
	public MealPageMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.getContentPane().setForeground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 375, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel bodyPanel = new JPanel();
		bodyPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		bodyPanel.setBackground(new Color(159, 242, 145));
		bodyPanel.setForeground(new Color(240, 240, 240));
		bodyPanel.setBounds(10, 70, 339, 354);
		frame.getContentPane().add(bodyPanel);
		bodyPanel.setLayout(new GridLayout(2, 2, 20, 20));
		
		JButton btnA = new JButton("\r\nAdd Meal");
		bodyPanel.add(btnA);
		
		JButton btnB = new JButton("b2");
		bodyPanel.add(btnB);
		
		JButton btnC = new JButton("Your Recipies");
		bodyPanel.add(btnC);
		
		JButton btnD = new JButton("Links To New Recipies");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bodyPanel.add(btnD);
		
		JButton ProfileButton = new JButton("Profile");
		ProfileButton.setBounds(260, 11, 89, 23);
		frame.getContentPane().add(ProfileButton);
		
		JButton SettingsButton = new JButton("Settings");
		SettingsButton.setBounds(160, 11, 89, 23);
		frame.getContentPane().add(SettingsButton);
		
		txtFood = new JTextField();
		txtFood.setText("FOOD");
		txtFood.setBounds(10, 12, 86, 20);
		frame.getContentPane().add(txtFood);
		txtFood.setColumns(10);
		
		JButton DietTipsButton = new JButton("Tips For Your Diet");
		DietTipsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DietTipsButton.setBounds(20, 427, 318, 23);
		frame.getContentPane().add(DietTipsButton);
	}
}
