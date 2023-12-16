import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public  class JavaApplet extends Applet {

     public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawString("Hello Guys, Welcome to the tutorial", 50, 50);
        System.out.println();
     }
}