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
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import java.awt.CardLayout;

public class TipsPage {

	private JFrame recipiesFrame;
	private JFrame prevFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipsPage window = new TipsPage(null);
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
	public TipsPage(JFrame prev) {
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
		
		JLabel pageTitle = new JLabel("New Recipies!");
		pageTitle.setBounds(132, 43, 89, 14);
		headerPanel.add(pageTitle);
		
		
		JPanel BodyPanel = new JPanel();
		BodyPanel.setLayout(null);
		BodyPanel.setBounds(10, 107, 339, 343);
		recipiesFrame.getContentPane().add(BodyPanel);
		
		JLabel quickLabel = new JLabel("Quick Meals");
		quickLabel.setBounds(135, 11, 100, 14);
		BodyPanel.add(quickLabel);
		
		JLabel sub15Label = new JLabel("<15 Minutes");
		sub15Label.setBounds(135, 93, 100, 14);
		BodyPanel.add(sub15Label);
		
		JPanel sub15Panel = new JPanel();
		sub15Panel.setBounds(10, 112, 319, 52);
		BodyPanel.add(sub15Panel);
		sub15Panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton short1 = new JButton("Short 1");
		sub15Panel.add(short1);
		
		JButton short2 = new JButton("Short 2");
		sub15Panel.add(short2);
		
		JButton short3 = new JButton("Short 3");
		sub15Panel.add(short3);
		
		JButton short4 = new JButton("Short 4");
		sub15Panel.add(short4);
		
		JLabel about30Label = new JLabel("~30 Minutes");
		about30Label.setBounds(135, 175, 100, 14);
		BodyPanel.add(about30Label);
		
		JPanel about30Panel = new JPanel();
		about30Panel.setBounds(10, 194, 319, 52);
		BodyPanel.add(about30Panel);
		about30Panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton med1 = new JButton("Med 1");
		about30Panel.add(med1);
		
		JButton med2 = new JButton("Med 2");
		about30Panel.add(med2);
		
		JButton med3 = new JButton("Med 3");
		about30Panel.add(med3);
		
		JButton med4 = new JButton("Med 4");
		about30Panel.add(med4);
		
		JLabel longTimeLabel = new JLabel("Lots of Time?");
		longTimeLabel.setBounds(135, 261, 100, 14);
		BodyPanel.add(longTimeLabel);
		
		JPanel longTimePanel = new JPanel();
		longTimePanel.setBounds(10, 280, 319, 52);
		BodyPanel.add(longTimePanel);
		longTimePanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton lt1 = new JButton("Lots 1");
		lt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		longTimePanel.add(lt1);
		
		JButton lt2 = new JButton("Lots 2");
		longTimePanel.add(lt2);
		
		JButton lt3 = new JButton("Lots 3");
		longTimePanel.add(lt3);
		
		JButton lt4 = new JButton("Lots 4");
		longTimePanel.add(lt4);
		
		JPanel quickMealsPanel = new JPanel();
		quickMealsPanel.setBounds(10, 30, 319, 52);
		BodyPanel.add(quickMealsPanel);
		quickMealsPanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton quick1 = new JButton("Quick 1");
		quickMealsPanel.add(quick1);
		
		JButton quick2 = new JButton("Quick 2");
		quickMealsPanel.add(quick2);
		
		JButton quick3 = new JButton("Quick 3");
		quickMealsPanel.add(quick3);
		
		JButton quick4 = new JButton("Quick 4");
		quickMealsPanel.add(quick4);
		
		recipiesFrame.setVisible(true);
	}
}
