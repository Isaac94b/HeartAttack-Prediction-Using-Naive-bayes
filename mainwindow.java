import java.awt.EventQueue;



import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

import java.awt.Toolkit;

import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.plaf.ProgressBarUI;





import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.border.LineBorder;




public class mainwindow {
	private	double age,sex,cp,trestbps,chol,fbs,restecg,thalach,exang,oldpeak,slope,ca,thal,num;

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	final static int count = 1000;
	javax.swing.Timer t ;
	int i ; 
	Predict pre = new Predict();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
					mainwindow window = new mainwindow();
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
	public mainwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("imgs/icon-cardiology.png"));
		frame.setBounds(100, 100, 853,792);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        frame.addWindowListener(new WindowAdapter() {
    	    
    	    public void windowClosing(WindowEvent we)
    	    { 
    	        String ObjButtons[] = {"Yes","No"};
    	        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","EXIT ?",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
    	        if(PromptResult==JOptionPane.YES_OPTION)
    	        {
    	            System.exit(0);
    	        }
    	        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	    }
    	});
        final JProgressBar progressBar = new JProgressBar(0,20);
        progressBar.setStringPainted(true);
        progressBar.setForeground(SystemColor.textHighlight);
        progressBar.setEnabled(false);
        progressBar.setToolTipText("Loading");
		progressBar.setBounds(239, 681, 383, 50);
		frame.getContentPane().add(progressBar);
  
      
		

		
		JLabel lblNewLabel = new JLabel("1- Patient Identification Number :");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel.setBounds(91, 119, 194, 19);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(295, 118, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCcfSocial = new JLabel("2 -Social Security Number : ");
		lblCcfSocial.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCcfSocial.setBounds(443, 120, 155, 17);
		frame.getContentPane().add(lblCcfSocial);
		
		JLabel back= new JLabel(new ImageIcon("medical.jpg",null));
	    frame.getContentPane().add(back);
		
		textField_1 = new JTextField();
		textField_1.setBounds(608, 118, 125, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAge = new JLabel("3 - Age :");
		lblAge.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblAge.setBounds(239, 171, 46, 14);
		frame.getContentPane().add(lblAge);
		
		textField_2 = new JTextField();
		
		textField_2.setBounds(295, 168, 35, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSex = new JLabel("4 - Sex : ");
		lblSex.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblSex.setBounds(455, 171, 55, 14);
		frame.getContentPane().add(lblSex);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(520, 168, 59, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblchestPainType = new JLabel("5-Chest Pain Type : ");
		lblchestPainType.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblchestPainType.setBounds(91, 292, 122, 19);
		frame.getContentPane().add(lblchestPainType);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"typical angina ", "atypical angina ", "non-anginal pain", "asymptomatic"}));
		comboBox_1.setBounds(223, 286, 117, 27);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblPersonelInformation = new JLabel("Personel Information ");
		lblPersonelInformation.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 36));
		lblPersonelInformation.setBounds(246, 26, 359, 56);
		frame.getContentPane().add(lblPersonelInformation);
		
		JLabel lblMedicalInformation = new JLabel("Medical Information");
		lblMedicalInformation.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 33));
		lblMedicalInformation.setBounds(250, 211, 324, 44);
		frame.getContentPane().add(lblMedicalInformation);
		
		JLabel lblRestingBlood = new JLabel("6- Resting Blood Pressure :");
		lblRestingBlood.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblRestingBlood.setBounds(383, 292, 152, 14);
		frame.getContentPane().add(lblRestingBlood);
		
		textField_3 = new JTextField();
	
		textField_3.setBounds(554, 289, 25, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblinMmHg = new JLabel("(in mm Hg on admission to the hospital) ");
		lblinMmHg.setFont(new Font("Sylfaen", Font.PLAIN, 10));
		lblinMmHg.setBounds(588, 294, 190, 14);
		frame.getContentPane().add(lblinMmHg);
		
		JLabel lblNewLabel_1 = new JLabel("7- Serum Cholestoral : ");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(89, 350, 136, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_4 = new JTextField();
	
		textField_4.setBounds(225, 347, 35, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblInMgdl = new JLabel("(in mg/dl)");
		lblInMgdl.setBounds(270, 350, 59, 14);
		frame.getContentPane().add(lblInMgdl);
		
		JLabel lblEx = new JLabel("(ex : 20)");
		lblEx.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblEx.setBounds(340, 171, 46, 14);
		frame.getContentPane().add(lblEx);
		
		JLabel lblFastingBloodSugar = new JLabel("8- Fasting Blood Sugar > 120 mg/dl :");
		lblFastingBloodSugar.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblFastingBloodSugar.setBounds(358, 349, 212, 14);
		frame.getContentPane().add(lblFastingBloodSugar);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		comboBox_2.setBounds(594, 346, 51, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblRestingElectrocardiographic = new JLabel("9- Resting Electrocardiographic Results :");
		lblRestingElectrocardiographic.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblRestingElectrocardiographic.setBounds(91, 391, 228, 17);
		frame.getContentPane().add(lblRestingElectrocardiographic);
		
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));
		
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"normal ", "having ST-T wave abnormality", "showing probable or definite left ventricular hypertrophy"}));
		comboBox_3.setBounds(320, 388, 145, 20);
		frame.getContentPane().add(comboBox_3);
		
		JLabel lblmaximumHeart = new JLabel("10 -Maximum Heart Rate Achieved :");
		lblmaximumHeart.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblmaximumHeart.setBounds(480, 391, 197, 14);
		frame.getContentPane().add(lblmaximumHeart);
		
		textField_5 = new JTextField();
	
		textField_5.setBounds(687, 388, 46, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblExercise = new JLabel("11 - Rercise Induced Angina :");
		lblExercise.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblExercise.setBounds(91, 430, 173, 19);
		frame.getContentPane().add(lblExercise);
		
		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));
		
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Yes ", "No"}));
		comboBox_4.setBounds(265, 427, 57, 20);
		frame.getContentPane().add(comboBox_4);
		
		JLabel lblOldpeak = new JLabel("12- Oldpeak :");
		lblOldpeak.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblOldpeak.setToolTipText("ST depression induced by exercise relative to rest ");
		lblOldpeak.setBounds(342, 432, 83, 14);
		frame.getContentPane().add(lblOldpeak);
		
		textField_6 = new JTextField();
		
		textField_6.setBounds(435, 429, 35, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblSlope = new JLabel("13 - Slope :");
		lblSlope.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblSlope.setBounds(480, 432, 64, 14);
		frame.getContentPane().add(lblSlope);
		
		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));
		
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"upsloping ", "flat ", "downsloping "}));
		comboBox_5.setBounds(566, 429, 167, 20);
		frame.getContentPane().add(comboBox_5);
		
		JLabel lblNumberOfMajor = new JLabel("14 - Number Of Major Vessels (0-3) colored by flourosopy :");
		lblNumberOfMajor.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNumberOfMajor.setBounds(91, 478, 334, 19);
		frame.getContentPane().add(lblNumberOfMajor);
		
		textField_7 = new JTextField();
		
		textField_7.setBounds(424, 477, 35, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblThal = new JLabel("15 - Thal : ");
		lblThal.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblThal.setBounds(492, 480, 64, 14);
		frame.getContentPane().add(lblThal);
		
		final JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));
		
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"normal", "fixed defect", "reversable defect"}));
		comboBox_6.setBounds(566, 477, 125, 20);
		frame.getContentPane().add(comboBox_6);
		
		final JButton btnSubmit = new JButton("Analyse");
		btnSubmit.setForeground(SystemColor.textHighlight);
		btnSubmit.setFont(new Font("Agency FB", Font.PLAIN, 24));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
					
						String th=(String) comboBox_6.getSelectedItem();
						if(th=="normal"){
							thal=3.0;
						}
						if(th=="fixed defect"){
							thal=6.0;
						}
						if(th=="reversable defect"){
							thal=7.0;
						}
					;
				
				
			
						ca=Double.parseDouble(textField_7.getText());
				
				
				
						String slo=(String) comboBox_5.getSelectedItem();
						if(slo=="upsloping "){
							slope=1.0;
						}
						if(slo=="flat "){
							slope=2.0;
						}
						if(slo=="downsloping "){
							slope=3.0;
						}
				;
				
				
						oldpeak=Double.parseDouble(textField_6.getText());
				
				
				
						String exa=(String) comboBox_4.getSelectedItem();
						if(exa=="Yes "){
							exang=1.0;
						}else{
							exang=0.0;
						}
			;
				
				
						thalach=Double.parseDouble(textField_5.getText());
				
				
				
						String rest=(String) comboBox_3.getSelectedItem();
						if(rest=="normal "){
							restecg=0.0;
						}
						if(rest=="having ST-T wave abnormality"){
							restecg=1.0;
						}
						if(rest=="showing probable or definite left ventricular hypertrophy"){
							restecg=2.0;
						}
				;
				
			
						String blo=(String)comboBox_2.getSelectedItem();
						if(blo=="True"){
							fbs=1.0;
						}else{
							fbs=0.0;
						}
				;
				
			
						chol=Double.parseDouble(textField_4.getText());
				
				
				
						trestbps=Double.parseDouble(textField_3.getText());
				
				
				
						String type;
			    		type=(String)comboBox_1.getSelectedItem();
			    		if(type=="typical angina "){
			    			cp=1.0;
			    		}
			    		if(type=="atypical angina "){
			    			cp=2.0;
			    		}
			    		if(type=="non-anginal pain"){
			    			cp=3.0;
			    			
			    		}
			    		if(type=="asymptomatic"){
			    			cp=4.0;
			    		}
				;
				
				
						String sex1;
			    		sex1=(String)comboBox.getSelectedItem();
			    		
			    		if(sex1=="Male"){
			    			sex=1.0;
			    			
			    		}else{
			    			sex=0.0;
			    		}
				;
				
				
						age= Double.parseDouble(textField_2.getText());
			
				
				i = 0;
				t.start();
				btnSubmit.setEnabled(false);
				
				
			
				pre.CalculerProba(age,sex,cp,trestbps,chol,fbs,restecg,thalach,exang,oldpeak,slope,ca,thal);
				
				
	
					
				
			}
		});
		
		   t = new javax.swing.Timer(count, new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					
					if(i== 20 ){
						t.stop();
						btnSubmit.setEnabled(true);
						ResultScreen m=new ResultScreen();
						m.ident.setText(textField.getText());
						m.secN.setText(textField_1.getText());
						m.lblResult.setText("Your Result : "+pre.Max);
						
					}else {
						i++;
						progressBar.setValue(i);
					}
						
					
					
				}
			});
		
		
		
		btnSubmit.setIcon(new ImageIcon("imgs/Cardiology-blue-icon (1).png"));
		btnSubmit.setBounds(215, 578, 134, 41);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Agency FB", Font.PLAIN, 24));
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("imgs/blue-cross-icon.png"));
		btnNewButton.setBounds(523, 578, 113, 41);
		frame.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(306, 460, 1, 1);
		frame.getContentPane().add(list);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(59, 54, 1, 149);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(782, 53, 1, 150);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(59, 202, 724, 1);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(59, 54, 191, 1);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(566, 54, 212, 1);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(59, 235, 191, 1);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_6.setBounds(538, 235, 240, 1);
		frame.getContentPane().add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_7.setBounds(777, 235, 1, 289);
		frame.getContentPane().add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_8.setBounds(54, 523, 724, 1);
		frame.getContentPane().add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_9.setBounds(54, 235, 1, 289);
		frame.getContentPane().add(panel_9);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imgs/wallhaven.jpg"));
		label.setBounds(0, 0, 854, 752);
		frame.getContentPane().add(label);
		
		
		
		
		
	    JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText(" ");
				textField_6.setText(" ");
				textField_7.setText(" ");
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				comboBox_2.setSelectedItem(null);
				comboBox_3.setSelectedItem(null);
				comboBox_4.setSelectedItem(null);
				comboBox_5.setSelectedItem(null);
				comboBox_6.setSelectedItem(null);
				
				
				
			}
		});
		mnFile.add(mntmNew);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ObjButtons[] = {"Yes","No"};
    	        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","EXIT ?",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
    	        if(PromptResult==JOptionPane.YES_OPTION)
    	        {
    	            System.exit(0);
    	        }
    	        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mnAbout = new JMenuItem("About");
		mnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  
	    	        JOptionPane.showMessageDialog(frame, 
	    	        		"\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b*--This Project--* \n***Prédiction des crises cardiaques par classification bayesiènne *** \n \b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b*--Made By--* : \n \b\b\b-> Barkat ishak   \n  ",
	    	                " titre ",
	    	                JOptionPane.INFORMATION_MESSAGE);
	    	    
	    	
			}
		});
		menuBar.add(mnAbout);
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getSex() {
		return sex;
	}

	public void setSex(double sex) {
		this.sex = sex;
	}

	public double getCp() {
		return cp;
	}

	public void setCp(double cp) {
		this.cp = cp;
	}

	public double getTrestbps() {
		return trestbps;
	}

	public void setTrestbps(double trestbps) {
		this.trestbps = trestbps;
	}

	public double getChol() {
		return chol;
	}

	public void setChol(double chol) {
		this.chol = chol;
	}

	public double getFbs() {
		return fbs;
	}

	public void setFbs(double fbs) {
		this.fbs = fbs;
	}

	public double getRestecg() {
		return restecg;
	}

	public void setRestecg(double restecg) {
		this.restecg = restecg;
	}

	public double getThalach() {
		return thalach;
	}

	public void setThalach(double thalach) {
		this.thalach = thalach;
	}

	public double getExang() {
		return exang;
	}

	public void setExang(double exang) {
		this.exang = exang;
	}

	public double getOldpeak() {
		return oldpeak;
	}

	public void setOldpeak(double oldpeak) {
		this.oldpeak = oldpeak;
	}

	public double getSlope() {
		return slope;
	}

	public void setSlope(double slope) {
		this.slope = slope;
	}

	public double getCa() {
		return ca;
	}

	public void setCa(double ca) {
		this.ca = ca;
	}

	public double getThal() {
		return thal;
	}

	public void setThal(double thal) {
		this.thal = thal;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
}