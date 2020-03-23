import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FDemo extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JLabel p1, p2, dr;
	
	FDemo() {
		Font f = new Font("Arial Black", Font.BOLD, 50);
		setFont(f);
		setLayout(null);
		setResizable(false);
		
		b1 = new JButton();
		b1.setSize(100,100);
		b1.setLocation(100,100);
		add(b1);
		b2 = new JButton();
		b2.setSize(100,100);
		b2.setLocation(200,100);
		add(b2);
		b3 = new JButton();
		b3.setSize(100,100);
		b3.setLocation(300,100);
		add(b3);
		b4 = new JButton();
		b4.setSize(100,100);
		b4.setLocation(100,200);
		add(b4);
		b5 = new JButton();
		b5.setSize(100,100);
		b5.setLocation(200,200);
		add(b5);
		b6 = new JButton();
		b6.setSize(100,100);
		b6.setLocation(300,200);
		add(b6);
		b7 = new JButton();
		b7.setSize(100,100);
		b7.setLocation(100,300);
		add(b7);
		b8 = new JButton();
		b8.setSize(100,100);
		b8.setLocation(200,300);
		add(b8);
		b9 = new JButton();
		b9.setSize(100,100);
		b9.setLocation(300,300);
		add(b9);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
	}
		
		int count=1, decision=0;
	
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton)e.getSource();
		Font f1 = new Font("Arial Black", Font.BOLD, 30);
		setFont(f1);
		
		if(count%2==1)
			b.setLabel("X");
		else
			b.setLabel("0");
		count++;
		b.removeActionListener(this);
		
		if(b1.getLabel()==b2.getLabel() && b2.getLabel()==b3.getLabel() && b3.getLabel()== "X") {
			System.out.println("P1-H1 is Equal");  
			p1 = new JLabel("  Player 1 is Winner     ");
			p1.setSize(400,100);
			p1.setLocation(150,450);
			p1.setForeground(Color.yellow);
			add(p1);
			decision++;
		}
		if(b1.getLabel()==b4.getLabel() && b4.getLabel()==b7.getLabel() && b7.getLabel()== "X") {
			System.out.println("P1-V1 is Equal");
			p1 = new JLabel("  Player 1 is Winner    ");
			p1.setSize(400,100);
			p1.setLocation(150,450);
			p1.setForeground(Color.yellow);
			add(p1);
			decision++;
		}
		if(b4.getLabel()==b5.getLabel() && b5.getLabel()==b6.getLabel() && b6.getLabel()== "X") {
			System.out.println("P1-H2 is Equal");
			p1 = new JLabel("  Player 1 is Winner     ");
			p1.setSize(400,100);
			p1.setLocation(150,450);
			p1.setForeground(Color.yellow);
			add(p1);
			decision++;
		}
		if(b2.getLabel()==b5.getLabel() && b5.getLabel()==b8.getLabel() && b8.getLabel()== "X") {
			System.out.println("P1-V2 is Equal");
			p1 = new JLabel("  Player 1 is Winner     ");
			p1.setSize(400,100);
			p1.setLocation(150,450);
			p1.setForeground(Color.yellow);
			add(p1);
			decision++;
		}
		if(b7.getLabel()==b8.getLabel() && b8.getLabel()==b9.getLabel() && b9.getLabel()== "X") {
			System.out.println("P1-H3 is Equal");
			p1 = new JLabel("  Player 1 is Winner     ");
			p1.setSize(400,100);
			p1.setLocation(150,450);
			p1.setForeground(Color.yellow);
			add(p1);
			decision++;
		}
		if(b3.getLabel()==b6.getLabel() && b6.getLabel()==b9.getLabel() && b9.getLabel()== "X") {
			System.out.println("P1-V3 is Equal");
			p1 = new JLabel("  Player 1 is Winner     ");
			p1.setSize(400,100);
			p1.setLocation(150,450);
			p1.setForeground(Color.yellow);
			add(p1);
			decision++;
		}
		if(b1.getLabel()==b5.getLabel() && b5.getLabel()==b9.getLabel() && b9.getLabel()== "X") {
			System.out.println("P1-D1 is Equal");
			p1 = new JLabel("  Player 1 is Winner     ");
			p1.setSize(400,100);
			p1.setLocation(150,450);
			p1.setForeground(Color.yellow);
			add(p1);
			decision++;
		}
		if(b3.getLabel()==b5.getLabel() && b5.getLabel()==b7.getLabel() && b7.getLabel()== "X") {
			System.out.println("P1-D2 is Equal");
			p1 = new JLabel("  Player 1 is Winner     ");
			p1.setSize(400,100);
			p1.setLocation(150,450);
			p1.setForeground(Color.yellow);
			add(p1);
			decision++;
		}
		if(b1.getLabel()==b2.getLabel() && b2.getLabel()==b3.getLabel() && b3.getLabel()== "0") {
			System.out.println("P2-H1 is Equal");
			p2 = new JLabel("  Player 2 is Winner     ");
			p2.setSize(400,100);
			p2.setLocation(150,450);
			p2.setForeground(Color.yellow);
			add(p2);
			decision++;
		}
		if(b1.getLabel()==b4.getLabel() && b4.getLabel()==b7.getLabel() && b7.getLabel()== "0") {
			System.out.println("P2-V1 is Equal");
			p2 = new JLabel("  Player 2 is Winner     ");
			p2.setSize(400,100);
			p2.setLocation(150,450);
			p2.setForeground(Color.yellow);
			add(p2);
			decision++;
		}
		if(b4.getLabel()==b5.getLabel() && b5.getLabel()==b6.getLabel() && b6.getLabel()== "0") {
			System.out.println("P2-H2 is Equal");
			p2 = new JLabel("  Player 2 is Winner     ");
			p2.setSize(400,100);
			p2.setLocation(150,450);
			p2.setForeground(Color.yellow);
			add(p2);
			decision++;
		}
		if(b2.getLabel()==b5.getLabel() && b5.getLabel()==b8.getLabel() && b8.getLabel()== "0") {
			System.out.println("P2-V2 is Equal");
			p2 = new JLabel("  Player 2 is Winner     ");
			p2.setSize(400,100);
			p2.setLocation(150,450);
			p2.setForeground(Color.yellow);
			add(p2);
			decision++;
		}
		if(b7.getLabel()==b8.getLabel() && b8.getLabel()==b9.getLabel() && b9.getLabel()== "0") {
			System.out.println("P2-H3 is Equal");
			p2 = new JLabel("  Player 2 is Winner     ");
			p2.setSize(400,100);
			p2.setLocation(150,450);
			p2.setForeground(Color.yellow);
			add(p2);
			decision++;
		}
		if(b3.getLabel()==b6.getLabel() && b6.getLabel()==b9.getLabel() && b9.getLabel()== "0") {
			System.out.println("P2-V3 is Equal");
			p2 = new JLabel("  Player 2 is Winner     ");
			p2.setSize(400,100);
			p2.setLocation(150,450);
			p2.setForeground(Color.yellow);
			add(p2);
			decision++;
		}
		if(b1.getLabel()==b5.getLabel() && b5.getLabel()==b9.getLabel() && b9.getLabel()== "0") {
			System.out.println("P2-D1 is Equal");
			p2 = new JLabel("  Player 2 is Winner     ");
			p2.setSize(400,100);
			p2.setLocation(150,450);
			p2.setForeground(Color.yellow);
			add(p2);
			decision++;
		}
		if(b3.getLabel()==b5.getLabel() && b5.getLabel()==b7.getLabel() && b7.getLabel()== "0") {
			System.out.println("P2-D2 is Equal");
			p2 = new JLabel("  Player 2 is Winner     ");
			p2.setSize(400,100);
			p2.setLocation(150,450);
			p2.setForeground(Color.yellow);
			add(p2);
			decision++;
		}
		decision++;
		if(decision == 9) {
			System.out.println("No Result");
			dr = new JLabel("  The Game is A DRAW     ");
			dr.setSize(400,100);
			dr.setLocation(150,450);
			dr.setForeground(Color.yellow);
			add(dr);
		}
	}

}

class tictactoe {
	public static void main(String SK [] ) {
		FDemo f = new FDemo();
		
		f.setBackground(Color.black);
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(100,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}