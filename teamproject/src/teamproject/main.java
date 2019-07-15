package teamproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import bookservice.BookDao;

public class main extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField maintf;
	private JTable table;
	Vector v;
	Vector cols;
	DefaultTableModel model;
	JButton mainsearch;
	JButton rent;
	JButton returns;
	JButton members;
	JButton bookmang;
	JButton statis;
	
	BookMng BMG;
	
	
//	String header[] = {"회원번호","이름","나이","생년월일","성별","핸드폰번호","대여도서개수"};
//	String contents[][] = {
//			{"123","김두한","100","1918년 5월 15일","남자","0104561234","0"},
//			{"124","호날두","34","1985년 2월 5일","남자","0101234567","3"},
//			{"125","손흥민","27","1992년 7월 8일","남자","0109873246","2"},
//			{"126","박지성","38","1981년 2월 25일","남자","0106547321","1"},
//			{"127","김연아","27","1990년 9월 5일","여자","0106241487","1"}
//			
//	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setTitle("main");
		BookDao bkdao = new BookDao();
		BMG = new BookMng();
		
		v = bkdao.getBookList();
		cols = getColumn();
		model = new DefaultTableModel(v,cols);
		
		
		setBounds(new Rectangle(0, 0, 800, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(380, 40, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBounds(new Rectangle(0, 0, 800, 1000));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox maincomboBox = new JComboBox();
		maincomboBox.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		maincomboBox.setBounds(58, 117, 110, 30);
		contentPane.add(maincomboBox);
		
		maintf = new JTextField();
		maintf.setBorder(new LineBorder(Color.BLACK));
		maintf.setBounds(203, 117, 419, 30);
		contentPane.add(maintf);
		maintf.setColumns(10);
		
		mainsearch = new JButton("");
		mainsearch.setBackground(Color.LIGHT_GRAY);
		mainsearch.setBorder(null);
		mainsearch.setForeground(SystemColor.inactiveCaptionText);
		mainsearch.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		mainsearch.setBounds(677, 117, 76, 30);
		contentPane.add(mainsearch);
		
		
		//대여버튼
		rent = new JButton("\uB300\uC5EC");
		rent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rent.setBorder(null);
		rent.setBackground(Color.LIGHT_GRAY);
		rent.setForeground(Color.WHITE);
		rent.setFont(new Font("한컴돋움", Font.BOLD, 15));
		rent.setBounds(25, 32, 93, 30);
		contentPane.add(rent);
		
		//반납버튼
		returns = new JButton("\uBC18\uB0A9");
		returns.setBackground(Color.LIGHT_GRAY);
		returns.setBorder(null);
		returns.setForeground(new Color(255, 255, 255));
		returns.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		returns.setBounds(175, 32, 93, 30);
		contentPane.add(returns);
		
		//회원정보버튼
		members = new JButton("\uD68C\uC6D0\uC815\uBCF4");
		members.setBackground(Color.LIGHT_GRAY);
		members.setBorder(new EmptyBorder(0, 0, 0, 0));
		members.setForeground(SystemColor.inactiveCaptionText);
		members.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		members.setBounds(330, 32, 103, 30);
		contentPane.add(members);
		
		//도서관리버튼
		bookmang = new JButton("\uB3C4\uC11C\uC815\uBCF4");
		bookmang.setBackground(Color.LIGHT_GRAY);
		bookmang.setBorder(new EmptyBorder(0, 0, 0, 0));
		bookmang.setForeground(SystemColor.inactiveCaptionText);
		bookmang.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		bookmang.setBounds(497, 32, 103, 30);
		contentPane.add(bookmang);
		
		//통계버튼
		statis = new JButton("\uD1B5\uACC4");
		statis.setBackground(Color.LIGHT_GRAY);
		statis.setBorder(new EmptyBorder(0, 0, 0, 0));
		statis.setForeground(SystemColor.inactiveCaptionText);
		statis.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		statis.setBounds(667, 32, 93, 30);
		contentPane.add(statis);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 196, 736, 556);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		table = new JTable(model);
		table.setBounds(12, 549, 710, -548);
		scrollPane.setViewportView(table);
		
		//리스너 추가
		bookmang.addActionListener(this);
		
		
	}

	private Vector getColumn() {
		//지금은 전체 불러오기함. 이제는 내가 필요한 정보만 불러오게해야지.
		Vector col = new Vector();
		col.add("ISBN");
		col.add("책이름");
		col.add("작가");
		col.add("장르");
		col.add("출판사");
		col.add("청구기호");
		col.add("출간일");
		
		return col;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == bookmang) {
			BMG.setVisible(true);
		}
		
		
	}
}
