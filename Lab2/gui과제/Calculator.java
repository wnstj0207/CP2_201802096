package gui°úÁ¦;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("\uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("23");
		panel.add(textField);
		textField.setColumns(20);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton button = new JButton("1");
		button.setBounds(12, 134, 49, 30);
		panel_1.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(68, 134, 49, 30);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(129, 134, 49, 30);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("-");
		button_3.setBounds(183, 134, 49, 30);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("0");
		button_4.setBounds(12, 174, 49, 30);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("00");
		button_5.setBounds(68, 174, 49, 30);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("=");
		button_6.setBounds(129, 174, 49, 30);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("+");
		button_7.setBounds(183, 174, 49, 30);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.setBounds(12, 94, 49, 30);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.setBounds(68, 94, 49, 30);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("6");
		button_10.setBounds(129, 94, 49, 30);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.setBounds(183, 94, 49, 30);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton("7");
		button_12.setBounds(12, 54, 49, 30);
		panel_1.add(button_12);
		
		JButton button_13 = new JButton("8");
		button_13.setBounds(68, 54, 49, 30);
		panel_1.add(button_13);
		
		JButton button_14 = new JButton("9");
		button_14.setBounds(129, 54, 49, 30);
		panel_1.add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.setBounds(183, 54, 49, 30);
		panel_1.add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(12, 10, 49, 30);
		panel_1.add(btnC);
	}
}
