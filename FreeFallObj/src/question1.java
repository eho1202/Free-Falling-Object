import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class question1 implements ActionListener, MouseListener{
	JFrame theframe = new JFrame("Question 1");
	JPanel thepanel = new JPanel();
	ImageIcon image = new ImageIcon(this.getClass().getResource("/question1.png"));
	JLabel theimagelabel = new JLabel();
	JLabel thelabel = new JLabel();
	JTextField thefield = new JTextField();
	JLabel theanswerlabel = new JLabel();
	JButton thebutton = new JButton("Submit");
	
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == thebutton) {
			if (thefield.getText().equalsIgnoreCase("0.14")) {
				theanswerlabel.setText("You are correct!");
			} else if (!thefield.getText().equalsIgnoreCase("0.14")) {
				theanswerlabel.setText("You are incorrect!");
			}
		}
	}
	
	public void mouseClicked(MouseEvent evt) {
		thefield.setText("");
	}

	public void mouseEntered(MouseEvent evt) {
		
	}

	public void mouseExited(MouseEvent evt) {
		
	}

	public void mousePressed(MouseEvent evt) {
		
	}

	public void mouseReleased(MouseEvent evt) {
		
	}
	
	public void question1() {
		thepanel.setPreferredSize(new Dimension(960, 530));
		thepanel.setLayout(null);
		thepanel.setBackground(Color.WHITE);
		
		theimagelabel.setSize(633, 319);
		theimagelabel.setLocation(0,0);
		theimagelabel.setIcon(image);
		thepanel.add(theimagelabel);
		
		thelabel.setSize(200, 100);
		thelabel.setLocation(663, 40);
		thelabel.setText("<html>Note: Significant Digits are considered in this problem<br/><br/>Equation: d = v1t + at^2/2</html>");
		thelabel.setFont(thelabel.getFont().deriveFont(16.0f));
		thepanel.add(thelabel);
		
		thefield.setSize(150,50);
		thefield.setLocation(663, 150);
		thefield.setText("Enter your answer here");
		thepanel.add(thefield);
		thefield.addMouseListener(this);
		
		theanswerlabel.setSize(200,50);
		theanswerlabel.setLocation(663, 200);
		thepanel.add(theanswerlabel);
		
		thebutton.setSize(75,25);
		thebutton.setLocation(830, 160);
		thepanel.add(thebutton);
		thebutton.addActionListener(this);
		
		theframe.setContentPane(thepanel);
		theframe.pack();
		theframe.setVisible(true);
		theframe.setLocationRelativeTo(null);
		theframe.setResizable(false);
	}
	
	public static void main(String[] args) {
		new question1();
	}

}
