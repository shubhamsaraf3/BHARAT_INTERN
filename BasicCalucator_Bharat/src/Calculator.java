import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double n1, n2, res;
	String op, ans;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 432, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("           BASIC CALUCLATOR by Shubham");
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 400, 27);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Bahnschrift", Font.PLAIN, 32));
		textField.setBounds(10, 49, 396, 70);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn0.getText();
				textField.setText(num);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(20, 288, 67, 62);
		frame.getContentPane().add(btn0);
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn1.getText();
				textField.setText(num);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.setBounds(97, 288, 67, 62);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn2.getText();
				textField.setText(num);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.setBounds(174, 288, 67, 62);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn3.getText();
				textField.setText(num);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.setBounds(251, 288, 67, 62);
		frame.getContentPane().add(btn3);
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.setBounds(97, 215, 67, 62);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn5.getText();
				textField.setText(num);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn5.setBounds(174, 215, 67, 62);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.setBounds(251, 215, 67, 62);
		frame.getContentPane().add(btn6);
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.setBounds(97, 142, 67, 62);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn8.getText();
				textField.setText(num);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn8.setBounds(174, 142, 67, 62);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setBounds(251, 142, 67, 62);
		frame.getContentPane().add(btn9);

		
		JButton btnNewButton_eval = new JButton("=");
		btnNewButton_eval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2=Double.parseDouble(textField.getText());
				switch(op) {
				case "+":
					res=n1+n2;
					ans=String.format("%.2f", res);
					textField.setText(ans);
					break;
				case "-":
					res=n1-n2;
					ans=String.format("%.2f", res);
					textField.setText(ans);
					break;
				case "*":
					res=n1*n2;
					ans=String.format("%.2f", res);
					textField.setText(ans);
					break;
				case "/":
					res=n1/n2;
					ans=String.format("%.2f", res);
					textField.setText(ans);
					break;
				default:
					textField.setText("ERROR");
					
				}
			}
		});
		btnNewButton_eval.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_eval.setBounds(20, 361, 144, 61);
		frame.getContentPane().add(btnNewButton_eval);
		
		JButton btnNewButton_add = new JButton("+");
		btnNewButton_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton_add.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_add.setBounds(174, 360, 144, 62);
		frame.getContentPane().add(btnNewButton_add);
		
		JButton btnNewButton_div = new JButton("/");
		btnNewButton_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		btnNewButton_div.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_div.setBounds(328, 215, 67, 62);
		frame.getContentPane().add(btnNewButton_div);
		
		JButton btnNewButton_mul = new JButton("*");
		btnNewButton_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		btnNewButton_mul.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_mul.setBounds(328, 288, 67, 62);
		frame.getContentPane().add(btnNewButton_mul);
		
		JButton btnNewButton_sub = new JButton("-");
		btnNewButton_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		btnNewButton_sub.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_sub.setBounds(328, 360, 67, 62);
		frame.getContentPane().add(btnNewButton_sub);
		
		
		JButton btnNewButton_reset = new JButton("C");
		btnNewButton_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_reset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_reset.setBounds(20, 142, 67, 62);
		frame.getContentPane().add(btnNewButton_reset);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_dot.getText();
				textField.setText(num);
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn_dot.setBounds(20, 215, 67, 62);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_backspace = new JButton("Back");
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int l=textField.getText().length();
				if(l>1) {
					String str=textField.getText().substring(0, l-1);
					if(str.length()>0)
						textField.setText(str);
					else
						textField.setText("");
				}
				else
					textField.setText("");
			}
		});
		btn_backspace.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_backspace.setBounds(328, 142, 67, 62);
		frame.getContentPane().add(btn_backspace);
	}
}
