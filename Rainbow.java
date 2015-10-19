// Chapter 5 Question 27


// Christopher Woo

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.math.*;

public class Rainbow extends JPanel
{
  private Color skyColor=Color.CYAN;
  private int radius;
  

  public Rainbow()
  {
    setBackground(skyColor);
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    int xCenter = width/2;
    int yCenter = 3*height/4;
    int largeRadius = width/4;
    {
    	g.setColor(Color.RED);
    	g.fillArc(xCenter-largeRadius/2, yCenter-largeRadius/2, largeRadius, largeRadius, 0, 180);
    }
    int magentaRadius = height/4;
    int greenRadius = (int)Math.sqrt(largeRadius*magentaRadius);
    {
    	g.setColor(Color.GREEN);
    	g.fillArc(xCenter-greenRadius/2, yCenter-greenRadius/2, greenRadius, greenRadius, 0, 180);
    }
    {
    	g.setColor(Color.MAGENTA);
    	g.fillArc(xCenter-magentaRadius/2, yCenter-magentaRadius/2, magentaRadius, magentaRadius, 0, 180);
    }
    int skyRadius = 3*magentaRadius/4;
    {
    	g.setColor(skyColor);
    	g.fillArc(xCenter-skyRadius/2, yCenter-skyRadius/2, skyRadius, skyRadius, 0, 180);
    }
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
