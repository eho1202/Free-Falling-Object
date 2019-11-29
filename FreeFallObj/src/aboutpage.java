import java.awt.*;
import javax.swing.*;

public class aboutpage {
	// Properties
	JFrame theframe = new JFrame("About Page");
	JPanel thepanel = new JPanel();
	JLabel theimagelabel = new JLabel();
	JLabel thelabel = new JLabel();
	// Gets image ehlogo.png
	ImageIcon image = new ImageIcon(this.getClass().getResource("/ehlogo.png"));

	// Method
	public void aboutpage() {
		thepanel.setPreferredSize(new Dimension(540, 232));
		thepanel.setLayout(null);

		theimagelabel.setSize(192, 192);
		theimagelabel.setLocation(20, 20);
		theimagelabel.setIcon(image);
		thepanel.add(theimagelabel);

		thelabel.setSize(308, 232);
		thelabel.setLocation(252, 0);
		thelabel.setText("<html><div style='text-align: center;'>This program was created by Ernestine Ho<br/>in St. Augustine CHS ICS4U1 Course</div></html>");
		thepanel.add(thelabel);

		theframe.setContentPane(thepanel);
		theframe.pack();
		theframe.setVisible(true);
		theframe.setLocationRelativeTo(null);
		theframe.setResizable(false);

	}

	// Main Method
	public static void main(String[] args) {
		new aboutpage();

	}

}
