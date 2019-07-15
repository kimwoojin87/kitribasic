package teamproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class memberinfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberinfo frame = new memberinfo();
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
	public memberinfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC815\uBCF4");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(152, 10, 180, 70);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uBC88\uD638");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(53, 94, 100, 40);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(53, 144, 100, 40);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(53, 244, 100, 40);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\uB098\uC774");
		label_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(53, 194, 100, 40);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\uD578\uB4DC\uD3F0\uBC88\uD638");
		label_3.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(53, 344, 100, 40);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\uC131\uBCC4");
		label_4.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(53, 294, 100, 40);
		panel.add(label_4);
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField.setText("123");
		textField.setBounds(152, 97, 220, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\uD638\uB0A0\uB450");
		textField_1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(152, 147, 220, 40);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField_2.setText("34");
		textField_2.setColumns(10);
		textField_2.setBounds(152, 194, 220, 40);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField_3.setText("1985\uB144 2\uC6D4 5\uC77C");
		textField_3.setColumns(10);
		textField_3.setBounds(152, 244, 220, 40);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField_4.setText("\uB0A8\uC790");
		textField_4.setColumns(10);
		textField_4.setBounds(152, 294, 220, 40);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField_5.setText("010-0909-8282");
		textField_5.setColumns(10);
		textField_5.setBounds(152, 347, 220, 40);
		panel.add(textField_5);
		
		JButton btnNewButton = new JButton("\uD655 \uC778");
		btnNewButton.setBounds(125, 417, 90, 35);
		panel.add(btnNewButton);
		
		JButton button = new JButton("\uCDE8 \uC18C");
		button.setBounds(260, 417, 90, 35);
		panel.add(button);
		
		JButton button_1 = new JButton("\uC218\uC815");
		button_1.setBounds(364, 38, 97, 23);
		panel.add(button_1);
	}
}
