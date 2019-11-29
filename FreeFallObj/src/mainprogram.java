import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

/* 
 * acceleration due to gravity
 */

public class mainprogram implements ActionListener, MouseMotionListener, MouseListener {
	// Properties
	JFrame theframe = new JFrame("Rate of Accerlation due to Gravity");
	ball mainpanel = new ball();
	Timer thetimer = new Timer(1000 / 48, this);
	JMenuBar thebar = new JMenuBar();
	JMenu themenu = new JMenu("Click Me");
	JMenuItem theabout = new JMenuItem("About");
	JMenuItem thehelp = new JMenuItem("Help");
	JTextArea theta = new JTextArea();
	JLabel thefieldlabel = new JLabel();
	JScrollPane thescroll = new JScrollPane(theta);
	ImageIcon image = new ImageIcon(this.getClass().getResource("/acceleration.png"));
	JLabel theimagelabel = new JLabel();
	JMenu questionmenu = new JMenu("Practice Question");
	JMenuItem question1 = new JMenuItem("Question 1");

	// creates an object for aboutpage class
	aboutpage aboutpanel = new aboutpage();
	// creates an object for helppage class
	helppage helppanel = new helppage();
	// creates an object for question1 class
	question1 q1panel = new question1();

	// Methods
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == thetimer) {
			mainpanel.repaint();
		}

		if (evt.getSource() == theabout) {
			// calls on the aboutpage method in aboutpage class using aboutpanel object
			aboutpanel.aboutpage();
		}

		if (evt.getSource() == thehelp) {
			// calls on the helppage method in helppage class using helppanel object
			helppanel.helppage();
		}
		
		if (evt.getSource() == question1) {
			// calls on the question1 method in question1 class using q1panel object
			q1panel.question1();
		}

	}

	public void mouseDragged(MouseEvent evt) {
		// if blnDrag is true, user can drag ball
		if (mainpanel.blnDrag) {
			// compares ball coordinates with pointer coordinates
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
		// if the mouse pointer is within the parameter, blnDrag is true
		if (x >= mainpanel.intDistanceX && x <= mainpanel.intDistanceX + 30 && y >= mainpanel.intDistanceY
				&& y <= mainpanel.intDistanceY + 30) {
			mainpanel.blnDrag = true;
		}
	}

	public void mouseReleased(MouseEvent evt) {
		mainpanel.blnDrag = false;
		// instead of showing the y-coordinate of the ball, it shows the fall distance
		// of the ball
		int y = 529 - mainpanel.intDistanceY;
		String why = String.valueOf(y);
		theta.append(why + "m\n");
	}

	// Constructor
	public mainprogram() {

		mainpanel.setPreferredSize(new Dimension(960, 540));
		mainpanel.setLayout(null);

		thebar.setSize(960, 20);
		thebar.setLocation(0, 0);
		mainpanel.add(thebar);

		thebar.add(themenu);
		themenu.add(theabout);
		theabout.addActionListener(this);
		themenu.add(thehelp);
		thehelp.addActionListener(this);
		
		thebar.add(questionmenu);
		questionmenu.add(question1);
		question1.addActionListener(this);

		thefieldlabel.setSize(150, 40);
		thefieldlabel.setLocation(560, 50);
		thefieldlabel.setFont(thefieldlabel.getFont().deriveFont(14.0f)); // changes size of font
		thefieldlabel.setText("Drop Distance (m)");
		mainpanel.add(thefieldlabel);

		thescroll.setSize(150, 440);
		thescroll.setLocation(545, 80);
		mainpanel.add(thescroll);

		theimagelabel.setSize(250, 300);
		theimagelabel.setLocation(700, 120);
		theimagelabel.setIcon(image);
		mainpanel.add(theimagelabel);

		mainpanel.addMouseMotionListener(this);
		mainpanel.addMouseListener(this);

		theframe.setContentPane(mainpanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
		theframe.setLocationRelativeTo(null); // causes theframe to center on screen
		theframe.setResizable(false);

		thetimer.start();
	}

	public static void main(String[] args) {
		new mainprogram();

	}

}
