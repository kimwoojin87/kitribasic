package com.kitri.awt.event;



import java.awt.*;

public class CalculatorTest extends Frame{
    
	Panel pCenter = new Panel();
	Panel pNorth = new Panel();
	
    Label label = new Label("¾å¾å");
    Label label2 = new Label("»£»£");
    
    Button bt[] = new Button[16];
    String strBtn[] = new String[]{"7","8","9","+","4","5","6","-",
                                    "1","2","3","*","0","=","C","/"};
    
    
    Button southbutton = new Button("Á¾ ·á");
    
    CalculatorController calculatorController; 
    
    



    public CalculatorTest() {
        // TODO Auto-generated constructor stub
        super("°è»ê±â¾ß");
        pNorth.setLayout(new BorderLayout(10,0));
        pNorth.add(label,"Center");
        label.setBackground(Color.green);
        pNorth.add(label2,"East");
        label2.setBackground(Color.red);
        
        pCenter.setLayout(new GridLayout(4, 4, 5, 5));
        for(int i=0; i<strBtn.length; i++){
            bt[i] = new Button(strBtn[i]);
            Color col = new Color(255,200,i*14);
            bt[i].setBackground(col);
            pCenter.add(bt[i]);
        }
        

        
        
        setLayout(new BorderLayout(0,10));
        add(pNorth,"North");
        add(pCenter,"Center");
        add(southbutton,"South");

        
        setBounds(300, 500, 300, 200);
        setResizable(false);
        setVisible(true);
    
        
    }
    
    public static void main(String[] args) {
        new CalculatorTest();
        
    }


}