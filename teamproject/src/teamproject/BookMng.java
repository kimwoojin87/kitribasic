package teamproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bookservice.BookDao;

public class BookMng extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btSearch;
	private JButton btAdd;
	private JButton btDelete;
	private JButton btCancel;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	
	Vector v;
	Vector cols;
	DefaultTableModel model;
	BookAdd bookadd;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BookMng frame = new BookMng();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public BookMng() {
		setTitle("\uB3C4\uC11C\uAD00\uB9AC");
		
		BookDao bkdao = new BookDao();
		bookadd = new BookAdd();
		v = bkdao.getBookList();
		cols = getColumn();
		model = new DefaultTableModel(v,cols);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(14, 12, 127, 24);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(154, 12, 385, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btSearch = new JButton("\uAC80\uC0C9");
		btSearch.setBounds(552, 11, 105, 27);
		contentPane.add(btSearch);
		
		btAdd = new JButton("\uCD94\uAC00");
		btAdd.setBounds(14, 352, 97, 23);
		contentPane.add(btAdd);
		
		btDelete = new JButton("\uC0AD\uC81C");
		btDelete.setBounds(133, 352, 97, 23);
		contentPane.add(btDelete);
		
		btCancel = new JButton("\uCDE8\uC18C");
		btCancel.setBounds(552, 352, 97, 23);
		contentPane.add(btCancel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 48, 640, 290);
		contentPane.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		table = new JTable(model);
		table.setBounds(0, 0, 639, 290);
		panel.add(table);
		
		btAdd.addActionListener(this);
		
		
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); // 종료 막기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	private Vector getColumn() {
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
		if(ob == btAdd) {
			bookadd.setVisible(true);
		}
		
	}
}
