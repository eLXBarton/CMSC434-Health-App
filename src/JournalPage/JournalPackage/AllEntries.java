package JournalPackage;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AllEntries extends JPanel {

	/**
	 * Create the panel.
	 */
	public AllEntries() {
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(212, 84));
		
		JScrollPane scroll = new JScrollPane (this, 
	    		   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		
	}
	
	

}
