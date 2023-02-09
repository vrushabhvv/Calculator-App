package swingexample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textfieldA;
	private JTextField textfieldB;
	private JTextField textfieldres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
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
	public FirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("CALCULATOR");
		Heading.setFont(new Font("Cambria", Font.BOLD, 18));
		Heading.setForeground(Color.RED);
		Heading.setBackground(Color.RED);
		Heading.setBounds(157, 10, 115, 22);
		contentPane.add(Heading);
		
		JLabel lableA = new JLabel("A");
		lableA.setFont(new Font("Cambria", Font.BOLD, 16));
		lableA.setBounds(78, 59, 35, 22);
		contentPane.add(lableA);
		
		textfieldA = new JTextField();
		textfieldA.setText("10");
		textfieldA.setBounds(107, 63, 96, 19);
		contentPane.add(textfieldA);
		textfieldA.setColumns(10);
		
		JLabel lableB = new JLabel("B");
		lableB.setFont(new Font("Cambria", Font.BOLD, 16));
		lableB.setBounds(78, 104, 35, 22);
		contentPane.add(lableB);
		
		textfieldB = new JTextField();
		textfieldB.setText("20");
		textfieldB.setColumns(10);
		textfieldB.setBounds(107, 108, 96, 19);
		contentPane.add(textfieldB);
		
		JLabel lableres = new JLabel("Result");
		lableres.setFont(new Font("Cambria", Font.BOLD, 16));
		lableres.setBounds(41, 153, 46, 20);
		contentPane.add(lableres);
		
		textfieldres = new JTextField();
		textfieldres.setColumns(10);
		textfieldres.setBounds(107, 156, 96, 19);
		contentPane.add(textfieldres);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to add
				String text1 = textfieldA.getText();
				String text2 = textfieldB.getText();
				
				Integer n1 = Integer.valueOf(text1);
				Integer n2 = Integer.valueOf(text2);
				
				int res=n1+n2;
				String addition = String.valueOf(res);
				
				textfieldres.setText(addition);
				
			}
		});
		add.setBounds(21, 209, 66, 21);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to sub
				String text1 = textfieldA.getText();
				String text2 = textfieldB.getText();
				
				Integer n1 = Integer.valueOf(text1);
				Integer n2 = Integer.valueOf(text2);
				
				int res=n1-n2;
				String substraction = String.valueOf(res);
				
				textfieldres.setText(substraction);
			}
		});
		sub.setBounds(96, 209, 67, 21);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to multiplication
				String text1 = textfieldA.getText();
				String text2 = textfieldB.getText();
				
				Integer n1 = Integer.valueOf(text1);
				Integer n2 = Integer.valueOf(text2);
				
				int res=n1*n2;
				String multiplication = String.valueOf(res);
				
				textfieldres.setText(multiplication);
			}
		});
		mul.setBounds(173, 209, 66, 21);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to div
				String text1 = textfieldA.getText();
				String text2 = textfieldB.getText();
				
				Float n1 = Float.valueOf(text1);
				Float n2 = Float.valueOf(text2);
				
				float res=n1/n2;
				String division = String.valueOf(res);
				
				textfieldres.setText(division);
			}
		});
		div.setBounds(256, 209, 66, 21);
		contentPane.add(div);
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to rem
				String text1 = textfieldA.getText();
				String text2 = textfieldB.getText();
				
				Integer n1 = Integer.valueOf(text1);
				Integer n2 = Integer.valueOf(text2);
				
				int res=n1%n2;
				String reminder = String.valueOf(res);
				
				textfieldres.setText(reminder);
				
			}
		});
		rem.setBounds(351, 209, 75, 21);
		contentPane.add(rem);
	}
}
