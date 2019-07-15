package teamproject;


import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

import bookcont.BookDto;

import java.awt.Font;
import java.awt.event.*;
import java.sql.Date;

public class BookAdd extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfImgPath;
	private JTextField tfBookName;
	private JTextField tfAuthor;
	private JTextField tfIsbn;
	private JTextField tfBookPub;
	private JTextField tfPubDate;
	private JTextField tfCall;
	private JTextField tfGenre;
	JButton btOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAdd frame = new BookAdd();
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
	public BookAdd() {
		super("도서 추가 !!");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfImgPath = new JTextField();
		tfImgPath.setText("\uD3F4\uB354\uC774\uBBF8\uC9C0\uACBD\uB85C");
		tfImgPath.setColumns(10);
		tfImgPath.setBounds(12, 10, 95, 124);
		contentPane.add(tfImgPath);
		
		JLabel lbBookname = new JLabel("\uB3C4\uC11C\uBA85");
		lbBookname.setBounds(126, 10, 75, 28);
		contentPane.add(lbBookname);
		
		tfBookName = new JTextField();
		tfBookName.setColumns(10);
		tfBookName.setBounds(203, 12, 192, 28);
		contentPane.add(tfBookName);
		
		JLabel lbAuthor = new JLabel("\uC800\uC790");
		lbAuthor.setBounds(126, 50, 75, 28);
		contentPane.add(lbAuthor);
		
		tfAuthor = new JTextField();
		tfAuthor.setColumns(10);
		tfAuthor.setBounds(203, 52, 192, 28);
		contentPane.add(tfAuthor);
		
		JLabel lbIsbn = new JLabel("ISBN");
		lbIsbn.setBounds(126, 90, 75, 28);
		contentPane.add(lbIsbn);
		
		tfIsbn = new JTextField();
		tfIsbn.setColumns(10);
		tfIsbn.setBounds(203, 92, 192, 28);
		contentPane.add(tfIsbn);
		
		JLabel lbBookPub = new JLabel("\uCD9C\uD310\uC0AC");
		lbBookPub.setBounds(126, 130, 75, 28);
		contentPane.add(lbBookPub);
		
		tfBookPub = new JTextField();
		tfBookPub.setColumns(10);
		tfBookPub.setBounds(203, 132, 192, 28);
		contentPane.add(tfBookPub);
		
		JLabel lbPubDate = new JLabel("\uCD9C\uAC04\uC77C");
		lbPubDate.setBounds(126, 170, 75, 28);
		contentPane.add(lbPubDate);
		
		tfPubDate = new JTextField();
		tfPubDate.setColumns(10);
		tfPubDate.setBounds(203, 172, 192, 28);
		contentPane.add(tfPubDate);
		
		JLabel lbCall = new JLabel("\uCCAD\uAD6C\uAE30\uD638");
		lbCall.setBounds(126, 210, 75, 28);
		contentPane.add(lbCall);
		
		tfCall = new JTextField();
		tfCall.setColumns(10);
		tfCall.setBounds(203, 212, 192, 28);
		contentPane.add(tfCall);
		
		btOk = new JButton("\uD655\uC778");
		btOk.setFont(new Font("굴림", Font.PLAIN, 12));
		btOk.setBounds(340, 280, 57, 27);
		contentPane.add(btOk);
		
		JLabel lbGenre = new JLabel("\uC7A5\uB974");
		lbGenre.setBounds(126, 248, 75, 28);
		contentPane.add(lbGenre);
		
		tfGenre = new JTextField();
		tfGenre.setColumns(10);
		tfGenre.setBounds(203, 248, 192, 28);
		contentPane.add(tfGenre);
		
		//리스너추가
		tfBookName.addActionListener(this);
		
		btOk.addActionListener(this);
		
		
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); // 종료 막기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		String str = tfPubDate.getText();
		Date sqldate = java.sql.Date.valueOf(str);
		//날짜입력방식
		if(ob == btOk) {
			BookDto bookdto = new BookDto(tfIsbn.getText(), tfBookName.getText(), 
					tfAuthor.getText(), tfImgPath, tfGenre.getText(),
					tfBookPub.getText(), tfCall.getText(), sqldate);
			
			
			setVisible(false);
		}
	}
}
