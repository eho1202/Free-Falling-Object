import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

/* 
 * acceleration due to gravity
 * gravity equation --> d =  v1t  + (at^2)/2
 * where v1 = 0
 */

public class mainprogram implements ActionListener, ChangeListener, MouseMotionListener, MouseListener {
	// Properties
	JFrame theframe = new JFrame();
	ball mainpanel = new ball();
	JSlider timeslider = new JSlider(0, 100, 10);
	JLabel timelabel = new JLabel("Time:");
	Timer thetimer = new Timer (1000/48, this);

	// Methods
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == thetimer) {
			mainpanel.repaint();
		}
	}
	
	public void stateChanged(ChangeEvent evt) {
		
	}
	
	public void mouseDragged(MouseEvent evt) {
		mouseMoved(evt);
	}

	public void mouseMoved(MouseEvent evt) {
		mainpanel.intDistanceX = evt.getX();
		mainpanel.intDistanceY = evt.getY();
		mainpanel.repaint();
	}
	
	public void mouseClicked(MouseEvent evt) {
		mainpanel.intDistanceX = evt.getX();
		mainpanel.intDistanceY = evt.getY();
		mainpanel.repaint();
	}

	public void mouseEntered(MouseEvent evt) {
		
	}

	public void mouseExited(MouseEvent evt) {
		
	}

	public void mousePressed(MouseEvent evt) {
		
	}

	public void mouseReleased(MouseEvent evt) {
		
	}
	
	// Constructor
	public mainprogram() {
		
		mainpanel.setPreferredSize(new Dimension(960,640));
		mainpanel.setLayout(null);
		
		timelabel.setSize(320,30);
		timelabel.setLocation(660,320);
		mainpanel.add(timelabel);
		
		timeslider.setSize(320,40);
		timeslider.setLocation(650, 350);
		timeslider.setMajorTickSpacing(10);
		timeslider.setMinorTickSpacing(2);
		timeslider.setPaintLabels(true);
		timeslider.setPaintTicks(true);
		timeslider.setSnapToTicks(true);
		timeslider.addChangeListener(this);
		mainpanel.add(timeslider);
		
		mainpanel.addMouseMotionListener(this);
		mainpanel.addMouseListener(this);
		
		theframe.setContentPane(mainpanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
		theframe.setLocationRelativeTo(null);
		theframe.setResizable(false);
		
		thetimer.start();
	}
	
	public static void main(String[] args) {
		new mainprogram();
		
	}
	
}
