import java.awt.EventQueue;

import javax.swing.JFrame;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

/* Copyright To barkat ishak To present 
All rights Reserved .
 */

public class Firstpag {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
					Firstpag window = new Firstpag();
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
	public Firstpag() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("imgs/icon-cardiology.png"));
		frame.setResizable(false);
		frame.setBounds(100, 100, 984, 861);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imgs/Sanstitre-2.png"));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				mainwindow window1 = new mainwindow();
				window1.frame.setVisible(true);
                frame.dispose();
			}
		});
		lblNewLabel.setBounds(-3, 196, 781, 620);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imgs/Sanstffitre-1.jpg"));
		label.setBounds(0, 0, 994, 971);
		frame.getContentPane().add(label);
		
		

	}
}
