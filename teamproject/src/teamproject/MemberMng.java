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

public class MemberMng extends JFrame {

	private JPanel contentPane;
	private JTextField tfSearch;
	private JTable table;
	
	String person[] = {"ȸ����ȣ","�̸�","�������"};
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
					MemberMng frame = new MemberMng();
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
	public MemberMng() {
		setTitle("\uD68C\uC6D0\uAD00\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 430);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox(person);
		comboBox.setFont(new Font("����", Font.PLAIN, 12));
		comboBox.setForeground(SystemColor.inactiveCaptionText);
		
		comboBox.setToolTipText("\uD68C\uC6D0\uC544\uC774\uB514");
		comboBox.setBounds(14, 12, 105, 24);
		contentPane.add(comboBox);
		
		tfSearch = new JTextField();
		tfSearch.setText("\uB0B4\uC6A9\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		tfSearch.setBounds(154, 12, 385, 24);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		JButton btSearch = new JButton("\uAC80\uC0C9");
		btSearch.setForeground(SystemColor.inactiveCaptionText);
		btSearch.setFont(new Font("����", Font.PLAIN, 12));
		btSearch.setBackground(Color.LIGHT_GRAY);
		btSearch.setBounds(552, 12, 105, 28);
		contentPane.add(btSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 48, 640, 290);
		contentPane.add(scrollPane);
		
		table = new JTable(contents,header);
		scrollPane.setViewportView(table);
		
		JButton btAdd = new JButton("\uCD94\uAC00");
		btAdd.setForeground(SystemColor.inactiveCaptionText);
		btAdd.setFont(new Font("����", Font.PLAIN, 12));
		btAdd.setBounds(14, 352, 97, 23);
		contentPane.add(btAdd);
		
		JButton btDelete = new JButton("\uC0AD\uC81C");
		btDelete.setForeground(SystemColor.inactiveCaptionText);
		btDelete.setFont(new Font("����", Font.PLAIN, 12));
		btDelete.setBounds(133, 352, 97, 23);
		contentPane.add(btDelete);
		
		JButton btCancel = new JButton("\uCDE8\uC18C");
		btCancel.setForeground(SystemColor.inactiveCaptionText);
		btCancel.setFont(new Font("����", Font.PLAIN, 12));
		btCancel.setBounds(552, 352, 97, 23);
		contentPane.add(btCancel);
	}
}
