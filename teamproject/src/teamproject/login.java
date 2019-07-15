package teamproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC544\uC774\uB514 ");
		label.setForeground(UIManager.getColor("Button.disabledForeground"));
		label.setBounds(232, 361, 54, 36);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		lblNewLabel.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel.setBounds(232, 426, 54, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("\uB0B4\uC6A9\uC744 \uC785\uB825\uD558\uC138\uC694.");
		textField.setBounds(342, 365, 131, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\uB0B4\uC6A9\uC744 \uC785\uB825\uD558\uC138\uC694.");
		textField_1.setBounds(342, 427, 131, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\uB85C\uADF8\uC778");
		button.setBounds(495, 365, 35, 91);
		contentPane.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("\uC2DC\uBD80\uB7F4 \uB3C4\uC11C\uAD00");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 54));
		lblNewLabel_1.setForeground(UIManager.getColor("Button.disabledForeground"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1.setBounds(123, 116, 552, 209);
		contentPane.add(lblNewLabel_1);
	}
}
