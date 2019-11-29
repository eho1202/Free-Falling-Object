import java.awt.*;
import javax.swing.*;

public class helppage {
	// Properties
	JFrame theframe = new JFrame("Help Page");
	JPanel thepanel = new JPanel();
	JLabel thelabel = new JLabel();

	// Constructor
	public void helppage() {
		thepanel.setPreferredSize(new Dimension(540, 240));
		thepanel.setLayout(null);

		thelabel.setSize(540, 240);
		thelabel.setLocation(85, 0);
		thelabel.setText("<html><div style='text-align: center;'>This program simulates objects free falling with no air resistance<br/>This program follows SPH3U1 curriculum<br/><br/>To move ball, press and drag the ball</div></html>");
		thepanel.add(thelabel);

		theframe.setContentPane(thepanel);
		theframe.pack();
		theframe.setVisible(true);
		theframe.setLocationRelativeTo(null);
		theframe.setResizable(false);

	}

	// Main Method
	public static void main(String[] args) {
		new helppage();
	}

}
