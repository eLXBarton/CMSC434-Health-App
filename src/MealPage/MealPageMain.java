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

import HomePage.Profile;
import WorkoutPage.LogPage;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
	private JFrame prev;
	private AddMealPage addMealPage = null;
	private RecipiesPage rp = null;
	private LinksPage links = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MealPageMain window = new MealPageMain(null);
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
	public MealPageMain(JFrame prev) {
		this.prev = prev;
		initialize();
	}
	public JFrame getFrame() {
		return frame;
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
		
		//Main functionality - Add a meal (Will connect with "Your Recipes")
		JButton btnA = new JButton("\r\nAdd Meal");
		btnA.setBounds(20, 20, 298, 156);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenAddMealTab();
			}
		});
		bodyPanel.setLayout(null);
		bodyPanel.add(btnA);
		
		//Recipes Page - Goes to "Your Recipes"
		JButton btnC = new JButton("Your Recipes");
		btnC.setBounds(20, 187, 139, 147);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenRecipiesTab();
			}

		});
		bodyPanel.add(btnC);
		
		JButton btnD = new JButton("New Recipie Links");
		btnD.setBounds(179, 187, 139, 147);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenLinksTab();
			}
		});
		bodyPanel.add(btnD);
		
		//Code for profile button (creates new profile page and opens it)
		JButton ProfileButton = new JButton("Profile");
		ProfileButton.setBounds(260, 11, 89, 23);
		
		ActionListener profPage = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Profile prof = new Profile(frame);
                prof.frame.setVisible(true);
                frame.setVisible(false);
            }
        };
        ProfileButton.addActionListener(profPage);
		frame.getContentPane().add(ProfileButton);
		
		//Diet Tips - Opens new page to diet tips
		JButton DietTipsButton = new JButton("Tips For Your Diet");
		DietTipsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DietTipsButton.setBounds(20, 427, 318, 23);
		frame.getContentPane().add(DietTipsButton);
		
		JLabel PageTitle = new JLabel("FOOD!");
		PageTitle.setOpaque(false);
		PageTitle.setBackground(new Color(159, 242, 145));
		PageTitle.setBounds(154, 45, 46, 14);
		frame.getContentPane().add(PageTitle);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prev.setVisible(true);
	            frame.setVisible(false);
			}
		});
		backButton.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(backButton);
	}
	/* Private Methods to open other tabs */
	//Checks if add meal page is already made- If not, then make one, else set visibility to true.
	private void OpenAddMealTab() {
		addMealPage = new AddMealPage(frame);
	}
	
	//Checks if recipe page is already made- If not, then make one, else set visibility to true.
	private void OpenRecipiesTab() {
		rp = new RecipiesPage(frame);
	}
	
	private void OpenLinksTab() {
		links = new LinksPage(frame);
	}
}
