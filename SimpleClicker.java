import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener {
    private int xClick=-9999;
	private int yClick=-9999;
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }
    public void paintComponent(Graphics g){
		if(xClick != -9999 && yClick != -9999)
			g.setColor(Color.red);
			g.fillOval(xClick-300,yClick-300,600,600);
	}
    public void mouseClicked (MouseEvent event) {
		
		xClick = event.getX();
		yClick = event.getY();
		repaint();
	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}
