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
	Timer thetimer = new Timer (1000/48, this);
	JMenuBar thebar = new JMenuBar();
	JMenu themenu = new JMenu ("Click Me");
	JMenuItem theabout = new JMenuItem("About");
	JMenuItem thehelp = new JMenuItem("Help");

	// Methods
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == thetimer) {
			mainpanel.repaint();
		}
		
		if (evt.getSource() == theabout) {
			
		}
		
		if (evt.getSource() == thehelp) {
			
		}
		
	}
	
	public void stateChanged(ChangeEvent evt) {
		
	}
	
	public void mouseDragged(MouseEvent evt) {
		if (mainpanel.blnDrag) {
			mainpanel.intDistanceX = evt.getX();
			mainpanel.intDistanceY = evt.getY();
			mainpanel.repaint();
		}
	}

	public void mouseMoved(MouseEvent evt) {
		mainpanel.blnDrag = false;
	}
	
	public void mouseClicked(MouseEvent evt) {
		
	}

	public void mouseEntered(MouseEvent evt) {
		mainpanel.blnDrag = false;
	}

	public void mouseExited(MouseEvent evt) {
		mainpanel.blnDrag = false;
	}

	public void mousePressed(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		if (x >= mainpanel.intDistanceX && x <= mainpanel.intDistanceX + 30 && y >= mainpanel.intDistanceY && y <= mainpanel.intDistanceY + 30) {
			mainpanel.blnDrag = true;
		}
		
	}
	
	public void mouseReleased(MouseEvent evt) {
		mainpanel.blnDrag = false;
	}
	
	// Constructor
	public mainprogram() {
		
		mainpanel.setPreferredSize(new Dimension(960,640));
		mainpanel.setLayout(null);
		
		thebar.setSize(970,20);
		thebar.setLocation(0,0);
		mainpanel.add(thebar);
		
		thebar.add(themenu);
		themenu.add(theabout);
		themenu.add(thehelp);
		
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
