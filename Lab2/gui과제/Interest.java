package gui°úÁ¦;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Interest extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interest frame = new Interest();
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
	public Interest() {
		setTitle("\uC774\uC790 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("1000");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel.add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		panel_3.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		panel_3.add(textField_2);
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setText("7.5");
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\uBCC0\uD658");
		panel.add(btnNewButton);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_2, textField, lblNewLabel, panel_3, lblNewLabel_1, textField_2}));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		textField_1 = new JTextField();
		textField_1.setText("\uC774\uC790\uB294 \uC5F0 75\uB9CC\uC6D0 \uC785\uB2C8\uB2E4.");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField_1);
		textField_1.setColumns(20);
	}

}
