/**
 * Created by Christa on 7/9/2015.
 * Citation - http://php.scripts.psu.edu/djh300/cmpsc221/notes-graphics-intro.php
 */
import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

    public class Draw_Circle extends JPanel
    {
        public Draw_Circle()                       // set up graphics window
        {
            super();
            setBackground(Color.WHITE);
        }

        public void paintComponent(Graphics g)  // draw graphics in the panel
        {
            int width = getWidth();             // width of window in pixels
            int height = getHeight();           // height of window in pixels

            super.paintComponent(g);            // call superclass to make panel display correctly

            // Drawing code goes here

            //create circle object with radius of 10
            Circle c1 = new Circle();

            //cast radius as integer for drawing
            double radius = c1.getRadius();
            int r = (int) radius;

            //get color of circle
            if(c1.getColor().equals("blue"))
                g.setColor(Color.BLUE);
            if(c1.getColor().equals("red"))
                g.setColor(Color.RED);

            //fill circle with color
            g.fillOval(10,10,r,r);

            //draw circle
            g.drawOval(10,10,r,r);

        }

        public static void main(String[] args)
        {
            Draw_Circle panel = new Draw_Circle();                            // window for drawing
            JFrame application = new JFrame();                            // the program itself

            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // set frame to exit
            // when it is closed
            application.add(panel);


            application.setSize(500, 400);         // window is 500 pixels wide, 400 high
            application.setVisible(true);
        }

    }

