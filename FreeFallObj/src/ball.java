import java.awt.*;
import javax.swing.*;

public class ball extends JPanel {
	// Properties of the ball
	int intX = 25;
	int intY = 25;
	int intX1 = 100;
	int intY1 = 20;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillOval(intX, intY, 50, 50);
	}
	
	
	
}
