

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ResultScreen {
	static JLabel lblResult = new JLabel("Result : ");
	static JLabel ident = new JLabel("");
	static JLabel secN = new JLabel("");

	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultScreen window = new ResultScreen();
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
	public ResultScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("imgs/icon-cardiology.png"));
		frame.setBounds(100, 100, 776, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		lblResult.setFont(new Font("Simplified Arabic", Font.BOLD, 17));
		lblResult.setBounds(252, 195, 324, 52);
		frame.getContentPane().add(lblResult);
		
		JLabel lblNewLabel = new JLabel("Patient Identification Number :");
		lblNewLabel.setFont(new Font("Candara", Font.PLAIN, 15));
		lblNewLabel.setBounds(215, 128, 208, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Social Security Number :");
		lblNewLabel_1.setFont(new Font("Candara", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(215, 157, 159, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblResults = new JLabel("YOUR RESULTS");
		lblResults.setFont(new Font("Century Gothic", Font.PLAIN, 49));
		lblResults.setBounds(205, 56, 371, 61);
		frame.getContentPane().add(lblResults);
		
		
		ident.setFont(new Font("Candara", Font.PLAIN, 15));
		ident.setBounds(429, 128, 147, 14);
		frame.getContentPane().add(ident);
		
		
		secN.setFont(new Font("Candara", Font.PLAIN, 15));
		secN.setBounds(429, 157, 159, 14);
		frame.getContentPane().add(secN);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(193, 93, 1, 154);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(692, 93, 1, 154);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(531, 93, 162, 1);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(193, 246, 500, 1);
		frame.getContentPane().add(panel_3);
	}
}

