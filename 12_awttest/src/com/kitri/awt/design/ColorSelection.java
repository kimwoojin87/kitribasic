package com.kitri.awt.design;



import java.awt.*;


public class ColorSelection extends Frame{
//�����
    Panel labelmenu = new Panel();
    Panel scrollmenu = new Panel();
//    Panel centermenu = new Panel();
    Panel colormenu    = new Panel();
    Panel centercol = new Panel();
    Panel southcol = new Panel();
    
    Label Lr = new Label("����");
    Label Lg = new Label("�ʷ�");
    Label Lb = new Label("�Ķ�");
    
    Scrollbar scr = new Scrollbar(0, 127, 10, 0, 265);
    Scrollbar scg = new Scrollbar(0, 127, 10, 0, 265);
    Scrollbar scb = new Scrollbar(0, 127, 10, 0, 265);
    
    Button colorp = new Button("color P");
    
    TextField colorl = new TextField();
    Button ok = new Button("Ȯ��");
    
//    Scrollbar (int orientation, int value, int visible, int minimum, int maximum) 
    public ColorSelection() {
        //��ġ��
        labelmenu.setLayout(new GridLayout(3,1,10,10));
        labelmenu.add(Lr);
        Lr.setForeground(Color.red);
        labelmenu.add(Lg);
        Lg.setForeground(Color.green);
        labelmenu.add(Lb);
        Lb.setForeground(Color.blue);
        
        scrollmenu.setLayout(new GridLayout(3,1,10,10));
        scrollmenu.add(scr);
//        scr.setSize(10, 20);
        scrollmenu.add(scg);
//        scg.setSize(10,20);
        scrollmenu.add(scb);
//        scb.setSize(10,20);
        scrollmenu.setSize(30, 50);
        
        centercol.setLayout(new BorderLayout());
        centercol.add(colorp);
    
        southcol.setLayout(new BorderLayout());
        southcol.add(colorl,"Center");
        southcol.add(ok,"East");
        
        colormenu.setLayout(new BorderLayout());
        colormenu.add(centercol,"Center");
        colormenu.add(southcol,"South");
        
        
        add(labelmenu,"West");
        add(scrollmenu,"Center");
        add(colormenu,"East");
        
        setBounds(400, 300, 500, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ColorSelection();
    }


}