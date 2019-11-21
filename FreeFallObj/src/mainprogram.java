import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

/* 
 * acceleration due to gravity
 * gravity equation --> d =  v1t  + (at^2)/2
 * where v1 = 0
 */

public class mainprogram implements MouseListener, MouseMotionListener {
	// Properties
	JFrame theframe = new JFrame();
	ball mainpanel = new ball();
	boolean blnFall;
	boolean blnDrag;
	double dblTime;
	
	// Methods
	
	public void moveBall() {
		
	}
	
	public void mousePressed(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		if (x >= mainpanel.dblDistanceX && x <= mainpanel.dblDistanceX + 15 && y >= mainpanel.dblDistanceY && x <= mainpanel.dblDistanceY + 15) {
			blnDrag = true;
		}
	}

	public void mouseReleased(MouseEvent evt) {

	}
	
	public void mouseDragged(MouseEvent evt) {
		if (blnDrag) {
			mainpanel.dblDistanceX = evt.getX();
			mainpanel.dblDistanceY = evt.getY();
			
			mainpanel.repaint();
			
		}
	}

	public void mouseMoved(MouseEvent evt) {
		
	}
	
	public void mouseClicked(MouseEvent evt) {
		
	}

	public void mouseEntered(MouseEvent evt) {
		
	}

	public void mouseExited(MouseEvent evt) {
		blnDrag = false;
	}
	
	// Constructor
	public mainprogram() {
		
		mainpanel.setPreferredSize(new Dimension(960,640));
		mainpanel.setLayout(null);	
		
		theframe.setContentPane(mainpanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
		theframe.setLocationRelativeTo(null);
		theframe.setResizable(false);
	}
	
	public static void main(String[] args) {
		new mainprogram();
	}
	
}
