package calculatorGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener{
	
	int First,Second;
	String sign;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button bPlus,bMinus,bDivide,bMulti,bEq,bClr; 
	
	Frame F = new Frame();
	Panel p1 = new Panel(); 
	Panel p2 = new Panel();
	TextField screen = new TextField(20);
	String a;
	String b; 
	
	public Calculator(){
		
		 
		p2.setLayout(new GridLayout(4,4));
		
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		
		bPlus = new Button("+");
		bMinus = new Button("-");
		bDivide = new Button("/");
		bMulti = new Button("x");
		bEq = new Button("=");
		bClr = new Button("C");
		
		p1.add(screen); 
		p2.add(b0);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bClr);
		p2.add(bEq);
		p2.add(bPlus);
		p2.add(bMinus);
		p2.add(bDivide);
		p2.add(bMulti);
		
		DigitEvents D = new DigitEvents(screen); 
		mathsEvents m = new mathsEvents(screen); 
		 
		b0.addActionListener(D);
		b1.addActionListener(D);
		b2.addActionListener(D);
		b3.addActionListener(D);
		b4.addActionListener(D);
		b5.addActionListener(D);
		b6.addActionListener(D);
		b7.addActionListener(D);
		b8.addActionListener(D);
		b9.addActionListener(D);
		
		
		bPlus.addActionListener(m);
		bMinus.addActionListener(m);
		bMulti.addActionListener(m);
		bEq.addActionListener(m);
		bClr.addActionListener(this);
		
		F.add(p1, BorderLayout.NORTH);
		F.add(p2, BorderLayout.CENTER); 
		
		
	
		F.setSize(400, 400);
		F.setVisible(true);
	
	}
	
	class DigitEvents implements ActionListener{
		TextField Txt; 
		
		int result;
		
		
		public DigitEvents(TextField T) {
			
			Txt = T; 
			
		}
		
		public void actionPerformed(ActionEvent e) {
			 
            a = Txt.getText();
			Button btn =  (Button) e.getSource(); 
			Txt.setText(Txt.getText() + btn.getLabel());
          
		}
		
		
		
		
	}
	
	class mathsEvents implements ActionListener{
		TextField Txt;	
		public mathsEvents(TextField T) {
			Txt = T; 
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Button btn =  (Button) e.getSource(); 
			
			 
			b = Txt.getText();
			  if (btn == bEq) {
				  System.out.println(sign);
				  Second=Integer.parseInt(screen.getText());
				  if (sign.equals("+")) {
					  screen.setText(Integer.toString(First+Second));
				  }
				  if (sign.equals("-")) {
					  screen.setText(Integer.toString(First-Second));
				  }
				  if (sign.equals("/")) {
					  screen.setText(Integer.toString(First/Second));
				  }
				  if (sign.equals("x")) {
					  screen.setText(Integer.toString(First*Second));
				  }
				  
			  }
				else {
					First=Integer.parseInt(screen.getText());
					screen.setText("");
					sign=btn.getLabel();				
			  }
		}
		
	}
	
public static void main(String abc[]) {
		
		new Calculator(); 

	}





@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}





