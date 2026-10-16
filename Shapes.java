/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
// g.setColor(Color.red);
// g.fillOval(100, 100, 50, 50);
// g.setColor(Color.green);
// g.fillRect(200, 200, 25, 25);
// this.drawBullsEye(g);
 this.olympicRings(g);
// this.trafficlight(g);
      

   }

   public void drawBullsEye(Graphics g){
      g.setColor(Color.red);
      g.fillOval(0, 0, 100, 100);
      g.setColor(Color.black);
      g.fillOval(10, 10,80, 80);
      g.setColor(Color.red);
      g.fillOval(20, 20, 60, 60);
      g.setColor(Color.black);
      g.fillOval(30, 30,40, 40);
      g.setColor(Color.red);
      g.fillOval(40, 40,20, 20);


   }
   public void olympicRings(Graphics g){
       g.setColor(Color.blue);
       g.drawOval(0, 0, 50, 50);
       g.setColor(Color.black);
       g.drawOval(50, 0, 50, 50);
       g.setColor(Color.red);
       g.drawOval(100, 0, 50, 50);
       g.setColor(Color.yellow);
       g.drawOval(025, 25, 50, 50);
       g.setColor(Color.green);
       g.drawOval(75, 25, 50, 50);

   }
   public void trafficlight(Graphics g){}
}

