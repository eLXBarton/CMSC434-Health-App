package MealPage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class AddMealPage {

	private JFrame addMealPageFrame;
	private JFrame prevFrame;
	private LinksPage links = null;
	private DefaultListModel<String> listToAdd;
	private JTextField nameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMealPage window = new AddMealPage(null,null);
					window.addMealPageFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddMealPage(JFrame prev, DefaultListModel<String> listToAdd) {
		prevFrame = prev;
		prevFrame.setVisible(false);
		this.listToAdd = listToAdd;
		initialize();
	}

	/**
	 * Initialize the contents of the addMealPageFrame.
	 */
	private void initialize() {
		addMealPageFrame = new JFrame();
		addMealPageFrame.getContentPane().setBackground(new Color(0, 128, 0));
		addMealPageFrame.getContentPane().setForeground(new Color(192, 192, 192));
		addMealPageFrame.setBounds(100, 100, 375, 500);
		addMealPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMealPageFrame.getContentPane().setLayout(null);
		
		JPanel BodyPanel = new JPanel();
		BodyPanel.setBounds(10, 107, 339, 343);
		addMealPageFrame.getContentPane().add(BodyPanel);
		BodyPanel.setLayout(null);
		
		JLabel suggestionLabel = new JLabel("Reccomended Meals:");
		suggestionLabel.setBounds(113, 5, 124, 14);
		BodyPanel.add(suggestionLabel);
		
		JPanel suggestionPanel = new JPanel();
		suggestionPanel.setBounds(10, 30, 319, 70);
		BodyPanel.add(suggestionPanel);
		suggestionPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton suggMeal1 = new JButton("Meal 1");
		suggestionPanel.add(suggMeal1);
		
		JButton suggMeal2 = new JButton("Meal 2");
		suggestionPanel.add(suggMeal2);
		
		JButton suggMeal3 = new JButton("Meal 3");
		suggestionPanel.add(suggMeal3);
		
		JPanel addPanel = new JPanel();
		addPanel.setForeground(new Color(0, 0, 0));
		addPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		addPanel.setBounds(10, 111, 319, 221);
		BodyPanel.add(addPanel);
		addPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add your own");
		lblNewLabel.setBounds(121, 9, 82, 14);
		addPanel.add(lblNewLabel);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddToList();
			}
		});
		addButton.setBounds(108, 154, 89, 23);
		addPanel.add(addButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 188, 299, 22);
		addPanel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton linkButton = new JButton("Other Recipes");
		linkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenLinksTab();
			}
		});
		panel_2.add(linkButton);
		
		JLabel nameLabel = new JLabel("Meal Name:");
		nameLabel.setBounds(10, 39, 111, 14);
		addPanel.add(nameLabel);
		
		JLabel caloriesLabel = new JLabel("Calories:");
		caloriesLabel.setBounds(10, 67, 111, 14);
		addPanel.add(caloriesLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(131, 62, 178, 22);
		addPanel.add(textArea_1);
		
		JLabel nameLabel_1_1 = new JLabel("Time of Day:");
		nameLabel_1_1.setBounds(10, 95, 111, 14);
		addPanel.add(nameLabel_1_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(131, 90, 178, 22);
		addPanel.add(textArea_1_1);
		
		JLabel nameLabel_1_1_1 = new JLabel("Tags:");
		nameLabel_1_1_1.setBounds(10, 125, 111, 14);
		addPanel.add(nameLabel_1_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setBounds(131, 120, 178, 22);
		addPanel.add(textArea_1_1_1);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(131, 34, 178, 20);
		addPanel.add(nameTextField);
		nameTextField.setColumns(10);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBounds(10, 11, 339, 68);
		addMealPageFrame.getContentPane().add(headerPanel);
		headerPanel.setLayout(null);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prevFrame.setVisible(true);
                addMealPageFrame.setVisible(false);
			}
		});
		backButton.setBounds(10, 11, 89, 23);
		headerPanel.add(backButton);
		
		JLabel pageTitle = new JLabel("Add A Meal!");
		pageTitle.setBounds(266, 15, 73, 14);
		headerPanel.add(pageTitle);
		
		addMealPageFrame.setVisible(true);
	}
	
	private void OpenLinksTab() {
		links = new LinksPage(addMealPageFrame);
	} 
	
	public DefaultListModel<String> AddToList(){
		String toAdd = nameTextField.getText();
		listToAdd.addElement(toAdd);
		
		return listToAdd;
	}
}
