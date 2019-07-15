package teamproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class BookInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField img;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookInfo frame = new BookInfo();
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
	public BookInfo() {
		setTitle("\uB3C4\uC11C\uC0C1\uC138\uC815\uBCF4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		img = new JTextField();
		img.setBounds(14, 12, 95, 124);
		contentPane.add(img);
		img.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uB3C4\uC11C\uBA85");
		lblNewLabel_1.setBounds(126, 10, 75, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(203, 12, 192, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\uC800\uC790");
		label.setBounds(126, 50, 75, 28);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(203, 52, 192, 28);
		contentPane.add(textField_1);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(126, 90, 75, 28);
		contentPane.add(lblIsbn);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(203, 92, 192, 28);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel("\uCD9C\uD310\uC0AC");
		label_2.setBounds(126, 130, 75, 28);
		contentPane.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(203, 132, 192, 28);
		contentPane.add(textField_3);
		
		JLabel label_3 = new JLabel("\uCD9C\uAC04\uC77C");
		label_3.setBounds(126, 170, 75, 28);
		contentPane.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(203, 172, 192, 28);
		contentPane.add(textField_4);
		
		JLabel label_4 = new JLabel("\uCCAD\uAD6C\uAE30\uD638");
		label_4.setBounds(126, 212, 75, 28);
		contentPane.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(203, 212, 192, 28);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("\uB300\uC5EC\uC5EC\uBD80");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel.setBounds(126, 278, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uB300\uC5EC\uC790");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		label_1.setBounds(126, 297, 62, 18);
		contentPane.add(label_1);
		
		JLabel label_5 = new JLabel("\uBC18\uB0A9\uC608\uC815\uC77C");
		label_5.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		label_5.setBounds(126, 322, 62, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		label_6.setBounds(203, 278, 192, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		label_7.setBounds(203, 297, 192, 18);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		label_8.setBounds(203, 322, 192, 18);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\uB3D9\uC77C\uB3C4\uC11C \uD604\uD669");
		label_9.setBounds(14, 344, 121, 28);
		contentPane.add(label_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 372, 381, 107);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("\uD655\uC778");
		button.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		button.setBounds(338, 489, 57, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uC218\uC815");
		button_1.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		button_1.setBounds(269, 489, 57, 27);
		contentPane.add(button_1);
	}
}
