package com.kitri.awt.design;

import java.awt.*;

public class ListTest extends Frame {
//선언부
	Panel left = new Panel();
	Panel cent = new Panel();
	Panel right = new Panel();
	Panel south = new Panel();

	List listl = new List();
	
	Button btr = new Button("▷");
	Button btrall = new Button("▶");
	Button btl = new Button("◁");
	Button btlall = new Button("◀");
	
	List listr = new List(15);
	
	TextField tfl = new TextField(10);
	TextField tfr = new TextField(10);

	public ListTest() {
		// 배치부
		left.setLayout(new BorderLayout(0,10));
		left.add(listl);
		listl.add("Mercury");
		listl.add("Venus");
		listl.add("Earth");
		listl.add("JavaSoft");
		listl.add("Mars");
		listl.add("Jupiter");
		listl.add("Saturn");
		listl.add("Uranus");
		listl.add("Neptune");
		listl.add("Pluto");
		left.add(listl);

		cent.setLayout(new GridLayout(4, 1, 5, 10));
		cent.add(btr);
		cent.add(btrall);
		cent.add(btl);
		cent.add(btlall);
		
		right.setLayout(new BorderLayout());
		right.add(listr);
		listr.add("Mercury");
		listr.add("Venus");
		listr.add("Earth");
		listr.add("JavaSoft");
		listr.add("Mars");
		listr.add("Jupiter");
		listr.add("Saturn");
		listr.add("Uranus");
		listr.add("Neptune");
		listr.add("Pluto");
		right.add(listr);
		
		south.setLayout(new BorderLayout());
		south.add(tfl,BorderLayout.WEST);
		south.add(tfr,BorderLayout.EAST);
		
		add(left, "West");
		add(cent,"Center");
		add(right,"East");
		add(south,"South");

		setBounds(600, 400, 300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListTest();
	}

}
