import java.awt.*;
import javax.swing.*;
//import java.awt.event;
//import javax.swing.event;

public class main {
	// Properties
	JFrame theframe = new JFrame();
	ball mainpanel = new ball();
	JPanel graphicspanel = new JPanel();
	JPanel infopanel = new JPanel();
	
	
	
	// Constructor
	public main() {
		
		mainpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		mainpanel.setPreferredSize(new Dimension(960,640));
		
		graphicspanel.setPreferredSize(new Dimension(640,640));
		graphicspanel.setLocation(0,0);
		graphicspanel.setBorder(BorderFactory.createTitledBorder("Ball"));
		mainpanel.add(graphicspanel);
		
		infopanel.setPreferredSize(new Dimension(315,640));
		infopanel.setLocation(645,0);
		infopanel.setBorder(BorderFactory.createTitledBorder("info"));
		mainpanel.add(infopanel);
		
		theframe.setContentPane(mainpanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
		theframe.setLocationRelativeTo(null);
		theframe.setResizable(false);
	}
	
	public static void main(String[] args) {
		new main();
	}
	
}
