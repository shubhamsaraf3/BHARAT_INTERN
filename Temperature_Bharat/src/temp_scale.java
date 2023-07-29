import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class temp_scale {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp_scale window = new temp_scale();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public temp_scale() {
		initialize();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(245, 219, 171));
		frame.setBounds(100, 100, 485, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txt_header = new JTextArea();
		txt_header.setForeground(new Color(0, 0, 0));
		txt_header.setEditable(false);
		txt_header.setToolTipText("");
		txt_header.setText("\r\n          Temperature Convertor by SHUBHAM");
		txt_header.setBounds(0, 0, 469, 78);
		txt_header.setRows(1);
		txt_header.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		txt_header.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(txt_header);
		
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField1.setBounds(165, 119, 270, 44);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField2.setColumns(10);
		textField2.setBounds(165, 199, 270, 44);
		frame.getContentPane().add(textField2);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Celcius", "Fahrenheit", "Kelvin"}));
		comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox1.setBounds(38, 125, 100, 31);
		frame.getContentPane().add(comboBox1);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Fahrenheit", "Kelvin", "Celcius"}));
		comboBox2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox2.setBounds(38, 205, 100, 31);
		frame.getContentPane().add(comboBox2);
		
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String box1= (String)comboBox1.getSelectedItem();
				String box2= (String)comboBox2.getSelectedItem();
				double n1,n2;
				
				n1=Double.parseDouble(textField1.getText());
				if(box1.equals(box2)) {
					n2=n1;
				}
				else if(box1.equals("Celcius")) {
					if(box2.equals("Fahrenheit"))
						n2=(n1 * 1.8) + 32;
					else
						n2=n1+273;
				}
				else if(box1.equals("Fahrenheit")) {
					if(box2.equals("Celcius")) 
						n2=(n1 -32) * 0.556;
					else
						n2=((n1 -32) * 0.556) +273;
				}
				else {
					if(box2.equals("Celcius"))
						n2=n1-273;
					else
						n2=(n1-273) * 1.8 + 32;
				}
				
				textField2.setText(String.format("%.3f", n2));
			}
		});
		btnConvert.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnConvert.setBounds(206, 277, 100, 36);
		frame.getContentPane().add(btnConvert);

		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText("");
				textField2.setText("");
			}
		});
		btnClear.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnClear.setBounds(330, 277, 100, 36);
		frame.getContentPane().add(btnClear);
	}
}
