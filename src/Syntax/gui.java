package Syntax;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class gui extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

		    double gewinn =  0;
			double verlust = 0;
			double konto =1000;
			double x = 0;
			
			public void run() {
				try {
					gui app = new gui();
					app.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public gui() {
		initialize();
	}

	private void initialize() {
		setBounds(650, 400, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel panelTitel = new JPanel();
		panelTitel.add(new JLabel("Spielautomat"));
		getContentPane().add(panelTitel, BorderLayout.NORTH);
		
		JPanel beenden = new JPanel();
		JButton button = new JButton("Beenden");
		beenden.add(button);
		getContentPane().add(beenden);
		
		
		
		
		//panelTitle Image[] frames = {
				
			//	ImageI0.read(new URL("https://cdna.artstation.com/p/assets/images/images/018/325/172/original/artforgame-gamedesign-seven-red-0.gif?1558970739"))
				
		//}
		
		JPanel panelButton = new JPanel();
		JButton buttonAendern = new JButton("Spielen");
		panelButton.add(buttonAendern);
		getContentPane().add(panelButton, BorderLayout.SOUTH);		
		buttonAendern.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame spielautomat = new JFrame();
				spielautomat.setSize(1200, 800);
				spielautomat.setLocation(250, 150);
				
				
				
				
				
				spielautomat.setVisible(true);
	
			}
			
		});
		
		
		JPanel panel = new JPanel();
		
		
		
		getContentPane().add(panel, BorderLayout.CENTER);
				
	}

}