package com.kitri.io;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class notepad extends JFrame implements ActionListener {

	JPanel panel = new JPanel();
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("\uD30C \uC77C");
	JMenuItem open = new JMenuItem("\uC5F4 \uAE30");
	JMenuItem save = new JMenuItem("\uC800 \uC7A5");
	JMenuItem exit = new JMenuItem("\uC885 \uB8CC");

	JMenu help = new JMenu("\uB3C4\uC6C0\uB9D0");
	JMenuItem helpi = new JMenuItem("\uB3C4\uC6C0\uB9D0");

	JPanel panel_1 = new JPanel();
	JScrollPane scrollPane = new JScrollPane();
	JTextArea editor = new JTextArea();

	public notepad() {
		super("¸Þ¸ðÀå!!");
		setBounds(new Rectangle(0, 0, 500, 340));
		getContentPane().setLayout(null);

		panel.setBounds(0, 0, 484, 42);
		getContentPane().add(panel);
		panel.setLayout(null);

		menuBar.setBounds(0, 0, 484, 42);
		panel.add(menuBar);

		menu.setPreferredSize(new Dimension(70, 22));
		menu.setBounds(new Rectangle(0, 0, 114, 41));
		menuBar.add(menu);

		menu.add(open);
		menu.add(save);
		menu.add(exit);

		help.setPreferredSize(new Dimension(70, 22));
		menuBar.add(help);

		help.add(helpi);

		panel_1.setBounds(0, 40, 484, 262);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		scrollPane.setBounds(0, 0, 484, 262);
		panel_1.add(scrollPane);

		scrollPane.setViewportView(editor);

		setBounds(300, 400, 500, 340);
		setVisible(true);

		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);

		helpi.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object oj = e.getSource();
		if (oj == open) {
//			FileDialog fdO = new FileDialog(this, "FileDialog", FileDialog.LOAD);
			JFileChooser jfc = new JFileChooser();
			jfc.setCurrentDirectory(new File("d:\\javadata\\javasource"));
			jfc.setSize(600, 300);
			jfc.showOpenDialog(this);

			BufferedReader fin = null;
			File file = jfc.getSelectedFile();

			if (file != null) {
				String infile = file.getPath();
				try {
					fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
					editor.setText("");
					String str = null;
					while ((str = fin.readLine()) != null) {
						editor.append(str + "\n");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if (fin != null)
							fin.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}

			}

		} else if (oj == save) {
//			FileDialog fdS = new FileDialog(this, "FileDialog", FileDialog.SAVE);
			JFileChooser jfs = new JFileChooser();
			jfs.setCurrentDirectory(new File("d:\\javadata\\javasource"));
			jfs.setSize(600, 300);
			jfs.showSaveDialog(this);

			String data = editor.getText();
			FileWriter fw = null;
			File file = jfs.getSelectedFile();
			String outfile = file.getPath();
			try {
				fw = new FileWriter(new File(outfile));
				fw.write(data.replace("\n", "\r\n"));
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if (fw != null)
						fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		} else if (oj == exit) {
			System.exit(0);
		} else {

		}

	}

	public static void main(String[] args) {
		new notepad();
	}
}
