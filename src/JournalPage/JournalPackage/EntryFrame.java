package JournalPage.JournalPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;

public class EntryFrame extends JFrame {

	private JPanel contentPane;
	
	private JTextArea txtrDefault_1;
	
	private JTextArea txtrDefault;
	
	private static String jtt;

	private static String jdd;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntryFrame frame = new EntryFrame(jtt, jdd);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the frame.
	 */
	public EntryFrame(String jt, String jd) {
		
		jtt = jt;
	    jdd = jt;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(177, 210, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrDefault_1 = new JTextArea();
		txtrDefault_1.setText(jt);
		txtrDefault_1.setBounds(114, 10, 200, 39);
		contentPane.add(txtrDefault_1);
		
		txtrDefault = new JTextArea();
		txtrDefault.setText(jd);
		txtrDefault.setBounds(45, 84, 354, 156);
		contentPane.add(txtrDefault);
	}
	
	public void setTitle(String jt) {
		
		txtrDefault_1.setText(jt);
		
	}
	
	public void setDesc(String jd) {
		
		txtrDefault.setText(jd);
		
	}
	
	public String getTitle() {
		
		return txtrDefault_1.getText();
		
	}
	
	public String getDesc() {
		
		return txtrDefault.getText();
		
	}
	
	

}
