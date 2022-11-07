package JournalPage.JournalPackage;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import HomePage.HomePage;
import HomePage.Profile;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;



import java.net.URL;


import java.awt.Desktop;


import javax.swing.JTextField;

public class JournalPage extends JFrame {

	private JPanel contentPane;
	
	private int count = 1;
    
    private JButton btnNewButton_3;
	int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
	int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);;
	JLabel l = new JLabel("", JLabel.CENTER);
	String day = "";
	JDialog d;
	JButton[] button = new JButton[49];
	JScrollPane scrollPane;
	JPanel panel;
	private JTextField txtJournalPage;

	/**
	 * Launch the application.
	 * 
	 * Testing purposes
	 */
	/*public static void main(String[] args) {
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
	public JournalPage(JFrame prev) {
		setTitle("Journal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(177, 210, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel calendarPanel = new JPanel();
		calendarPanel.setBounds(95, 83, 266, 150);
		contentPane.add(calendarPanel);

		d = new JDialog();
		d.setModal(true);
		String[] header = { "S", "M", "T", "W", "TH", "F", "SA" };
		JPanel p1 = new JPanel(new GridLayout(7, 7));
		p1.setBounds(95, 84, 266, 194);


		for (int x = 0; x < button.length; x++) {
			final int selection = x;
			button[x] = new JButton();
			button[x].setFocusPainted(false);
			button[x].setBackground(Color.white);
			button[x].setFont(new Font("Nunito", Font.PLAIN, 10));
			if (x > 6)
				button[x].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						day = button[selection].getActionCommand();
						if (button[selection].getBackground()==Color.white) {
							button[selection].setBackground(Color.GREEN); 
						} else {
							button[selection].setBackground(Color.white);
						}
					}
				});
			if (x < 7) {
				button[x].setText(header[x]);
				button[x].setForeground(Color.red);
				button[x].setMargin(new Insets(0,0,0,0));
			}
			p1.add(button[x]);
		}
		
		JPanel p2 = new JPanel(new GridLayout(1, 3));
		p2.setBounds(95, 277, 266, 25);
        JButton previous = new JButton("<< Previous");
        previous.setFont(new Font("Nunito", Font.PLAIN, 10));
        previous.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                        month--;
                        displayDate();
                        
                        for (int x = 0; x < button.length; x++) { 
                       	 
                      	  button[x].setBackground(Color.WHITE);
                        }
                }
        });
        p2.add(previous);
        p2.add(l);
        JButton next = new JButton("Next >>");
        next.setFont(new Font("Nunito", Font.PLAIN, 10));
        next.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                        month++;
                        displayDate();
                        
                 for (int x = 0; x < button.length; x++) {     
               	  button[x].setBackground(Color.WHITE);
                 }
                }
        });
        p2.add(next);

		contentPane.add(p1);
		contentPane.add(p2);
		
		JButton btnNewButton = new JButton("Home \nPage");
		btnNewButton.setBounds(0, 10, 95, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				prev.setVisible(true);
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.setBounds(266, 12, 85, 33);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Profile pPage = new Profile(prev);
				pPage.frame.setVisible(true);
				
			}
		});
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrCalendarChecklist = new JTextArea();
		txtrCalendarChecklist.setBounds(159, 55, 158, 22);
		txtrCalendarChecklist.setText("Calendar Checklist");
		txtrCalendarChecklist.setEditable(false);
		contentPane.add(txtrCalendarChecklist);
		
		JTextArea txtrUpdateTheCalendar = new JTextArea();
		txtrUpdateTheCalendar.setBounds(10, 153, 75, 95);
		txtrUpdateTheCalendar.setText("Use the \ncalendar \nto track \ndays worked \nout");
		txtrUpdateTheCalendar.setEditable(false);
		contentPane.add(txtrUpdateTheCalendar);
		
		JButton btnNewButton_2 = new JButton("Advice");
		btnNewButton_2.setBounds(10, 83, 75, 46);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenAdviceTab();
				
			}
		});
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Add Journal Entry");
		btnNewButton_3.setBounds(105, 313, 227, 35);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		scrollPane = new JScrollPane(scrollPane, 
	    		   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(24, 358, 308, 95);
		panel = new JPanel();
		
		
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e)
			{   
				
				
				
			    
				JournalEntry newEntry = new JournalEntry("Add Note", "Add Desc");
				newEntry.setText(new Integer(count).toString());
				newEntry.setMargin(new Insets(0,0,0,0));
				newEntry.setFont(new Font("Nunito", Font.PLAIN, 12));
				
				
				
				
				
				newEntry.setBounds(40, 365 + count*30, 200, 30);
				if (count % 3 == 0) {
					newEntry.setBackground(Color.GREEN);
					newEntry.setOpaque(true);
				} else if (count % 3 == 1) {
					newEntry.setBackground(Color.CYAN);
					newEntry.setOpaque(true);
				} else {
					newEntry.setBackground(Color.GRAY);
					newEntry.setOpaque(true);
				}
				count++;
				panel.add(newEntry);
				scrollPane.setViewportView(panel);
				scrollPane.setVisible(true);
				newEntry.setVisible(true);
				revalidate();


			}

		});
		
		contentPane.add(btnNewButton_3);
		contentPane.add(scrollPane);
		
		txtJournalPage = new JTextField();
		txtJournalPage.setText("Journal Page");
		txtJournalPage.setBounds(120, 10, 111, 35);
		txtJournalPage.setEditable(false);
		txtJournalPage.setHorizontalAlignment(JTextField.CENTER);
		contentPane.add(txtJournalPage);
		txtJournalPage.setColumns(10);
		
		
	
		
		
		
        d.pack();
        d.setLocationRelativeTo(this);
        displayDate();
        p1.setVisible(true);
        p2.setVisible(true);
        






	}


	public void displayDate() {
		for (int x = 7; x < button.length; x++) {
			button[x].setText("");
			button[x].setMargin(new Insets(0,0,0,0));
		}
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"MMMM yyyy");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(year, month, 1);
		int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
		int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
		for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++) {
			button[x].setText("" + day);
		    button[x].setMargin(new Insets(0,0,0,0));
		}
		l.setText(sdf.format(cal.getTime()));
		//d.setTitle("Date Picker");
	}
	
	 public String setPickedDate() {
         if (day.equals(""))
                 return day;
         java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                         "dd-MM-yyyy");
         java.util.Calendar cal = java.util.Calendar.getInstance();
         cal.set(year, month, Integer.parseInt(day));
         return sdf.format(cal.getTime());
 }
	 
	 private void OpenAdviceTab() {
			String urlString = "https://www.mayoclinic.org/healthy-lifestyle/fitness/in-depth/fitness/art-20048269";
		    try {
		        Desktop.getDesktop().browse(new URL(urlString).toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
}


