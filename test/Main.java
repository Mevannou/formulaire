package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1280, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		JPanel mainPanel = new JPanel();
		frame.setContentPane(mainPanel);
		mainPanel.setLayout(new BorderLayout(20, 20));
		mainPanel.add(new JLabel("Formulaire Utilisateurs"), BorderLayout.NORTH);

		JPanel panel = new JPanel();
		mainPanel.add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(4, 2, 2, 4));
		JTextField firstname = new JTextField("Prénom");
		panel.add(firstname);
		JTextField lastname = new JTextField("Nom");
		panel.add(lastname);
		JTextField age = new JTextField("Âge");
		panel.add(age);
		JTextField mail = new JTextField("Émail");
		panel.add(mail);
		JTextField postalcode = new JTextField("Code Postal");
		panel.add(postalcode);
		JTextField city = new JTextField("Ville");
		panel.add(city);
		JCheckBox men = new JCheckBox("Homme");
		panel.add(men);
		JCheckBox women = new JCheckBox("Femme");
		panel.add(women);

		JButton jbutton = new JButton("Confirmer");
		jbutton.setSize(0, 45);
		mainPanel.add(jbutton, BorderLayout.SOUTH);

		frame.setVisible(true);
	}

}
