package teamproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Font;

public class membership extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	
	String person[] = {"ȸ�����̵�","�̸�","�������"};
	String header[] = {"ȸ����ȣ","�̸�","����","�������","����","�ڵ�����ȣ","�뿩��������"};
	String contents[][] = {
			{"123","�����","100","1918�� 5�� 15��","����","0104561234","0"},
			{"124","ȣ����","34","1985�� 2�� 5��","����","0101234567","3"},
			{"125","�����","27","1992�� 7�� 8��","����","0109873246","2"},
			{"126","������","38","1981�� 2�� 25��","����","0106547321","1"},
			{"127","�迬��","27","1990�� 9�� 5��","����","0106241487","1"}
			
	};
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					membership frame = new membership();
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
	public membership() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox(person);
		comboBox.setFont(new Font("HY������M", Font.PLAIN, 12));
		comboBox.setForeground(SystemColor.inactiveCaptionText);
		
		comboBox.setToolTipText("\uD68C\uC6D0\uC544\uC774\uB514");
		comboBox.setBounds(75, 46, 105, 47);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setText("\uB0B4\uC6A9\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		textField.setBounds(220, 46, 372, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton search = new JButton("\uAC80\uC0C9");
		search.setForeground(SystemColor.inactiveCaptionText);
		search.setFont(new Font("HY������M", Font.PLAIN, 12));
		search.setBackground(SystemColor.window);
		search.setBounds(625, 58, 105, 28);
		contentPane.add(search);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 137, 655, 374);
		contentPane.add(scrollPane);
		
		table = new JTable(contents,header);
		scrollPane.setViewportView(table);
		
		JButton add = new JButton("\uCD94\uAC00");
		add.setForeground(SystemColor.inactiveCaptionText);
		add.setFont(new Font("HY������M", Font.PLAIN, 12));
		add.setBounds(85, 521, 97, 23);
		contentPane.add(add);
		
		JButton delete = new JButton("\uC0AD\uC81C");
		delete.setForeground(SystemColor.inactiveCaptionText);
		delete.setFont(new Font("HY������M", Font.PLAIN, 12));
		delete.setBounds(220, 521, 97, 23);
		contentPane.add(delete);
		
		JButton cancel = new JButton("\uCDE8\uC18C");
		cancel.setForeground(SystemColor.inactiveCaptionText);
		cancel.setFont(new Font("HY������M", Font.PLAIN, 12));
		cancel.setBounds(633, 521, 97, 23);
		contentPane.add(cancel);
	}
}
