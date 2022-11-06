package JournalPage.JournalPackage;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JournalEntry extends JButton {

	public String jt, jd;
	public EntryFrame entry;
	

	/**
	 * Create the panel.
	 */
	public JournalEntry(String journalTitle, String journalDescription) {

		jt = journalTitle;
		jd = journalDescription;
		
		setText(jt);

		EntryFrame newFrame = new EntryFrame(jt, jd);
		newFrame.getContentPane().setLayout(null);
		this.setPreferredSize(new Dimension(20,20));
		
		newFrame.setVisible(false);
		//add this line of code
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				newFrame.pack();
				
				if (newFrame.isVisible()) {
					Scanner textScan1 = new Scanner(newFrame.getTitle());
					Scanner textScan2 = new Scanner(newFrame.getDesc());
					
					
					
					newFrame.setTitle(textScan1.nextLine());
					newFrame.setDesc(textScan2.nextLine());
				  newFrame.setVisible(false);
				} else {
					newFrame.setVisible(true);
						
				}
			}
		});

	}

}
