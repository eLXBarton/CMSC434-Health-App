package JournalPackage;

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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.util.Scanner;

public class JournalPagex extends JFrame {

	private JPanel contentPane;
	private AllEntries lst;
	private int count = 1;
    
    private JButton btnNewButton_3;
	int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
	int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);;
	JLabel l = new JLabel("", JLabel.CENTER);
	String day = "";
	JDialog d;
	JButton[] button = new JButton[49];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JournalPagex frame = new JournalPagex();
					
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
	public JournalPagex() {
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
		//p1.setPreferredSize(new Dimension(169, 170));
		p1.setBounds(95,84,266,194);


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
		
		JTextArea txtrJournalPage = new JTextArea();
		txtrJournalPage.setText("Journal Page");
		txtrJournalPage.setBounds(95, 10, 117, 35);
		contentPane.add(txtrJournalPage);
		
		JButton btnNewButton = new JButton("Home Page");
		btnNewButton.setBounds(0, 10, 95, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.setBounds(266, 12, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrCalendarChecklist = new JTextArea();
		txtrCalendarChecklist.setText("Calendar Checklist");
		txtrCalendarChecklist.setBounds(159, 55, 158, 22);
		contentPane.add(txtrCalendarChecklist);
		
		JTextArea txtrUpdateTheCalendar = new JTextArea();
		txtrUpdateTheCalendar.setText("Update the calendar with \\n days you've worked out");
		txtrUpdateTheCalendar.setBounds(10, 153, 75, 80);
		contentPane.add(txtrUpdateTheCalendar);
		
		JButton btnNewButton_2 = new JButton("Advice Page");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(10, 83, 75, 46);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Add Journal Entry");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(10, 312, 341, 57);
		contentPane.add(btnNewButton_3);
		
		
		
		lst = new AllEntries();
		
		JScrollPane scroll = new JScrollPane (lst, 
	    		   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    contentPane.add(scroll);
		
		
		lst.setBounds(20, 385, 331, 68);
		contentPane.add(lst);
		
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e)
			{   
				
				
				
			    
				JournalEntry newEntry = new JournalEntry("Add Note", "Add Desc");
				
				
				
				
				
				newEntry.setBounds(40, 365 + count*30, 200, 30);
				count++;
				lst.add(newEntry);
				contentPane.add(newEntry);



				/*newEntry.getDone().addMouseListener(new MouseAdapter() {

					public void mousePressed(MouseEvent e)
					{

						newEntry.changeState();

						revalidate();

					}
				}); */
			}

		});
		//d.add(p1, BorderLayout.CENTER);
        // d.add(p2, BorderLayout.SOUTH);
        d.pack();
        d.setLocationRelativeTo(this);
        displayDate();
        p1.setVisible(true);
        p2.setVisible(true);
        d.setVisible(true);
        






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
		//l.setText(sdf.format(cal.getTime()));
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
	 
}
