package test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame frame =new JFrame();
    frame.setSize(1280, 900);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setTitle("Ma première fenêtre");
    
    JPanel panel =new JPanel();
    frame.setContentPane(panel);
    panel.setBackground(Color.WHITE);
    panel.add(new JButton("Click me"));
    
     
    panel.add(getButton("3"));
    panel.add(getButton("34"));

    frame.setVisible(true);
    
    
	}
	
	public static JButton getButton(String txt) {
		JButton clickme = new JButton();
	    clickme.setText(txt);
	    clickme.setBounds(600, 600, 50, 70);
	    clickme.setBackground(Color.LIGHT_GRAY);
	    clickme.setFont(new Font("Arial",Font.ITALIC,20));
	    clickme.setForeground(Color.RED);
	    
	    return clickme;
	    
	}

}
