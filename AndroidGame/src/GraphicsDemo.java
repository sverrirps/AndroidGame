import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class GraphicsDemo extends JFrame{
	
	// The constructor follows:
    public GraphicsDemo() {
    	setTitle("GraphicsDemo with Kilobolt");
    	setSize(800,480);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g){

        //This sets the color of g as Black.
           g.setColor(Color.WHITE);

        //The first statement creates the background rectangle on which the others are drawn.
           g.fillRect(0,0,800,480);

        //This sets the color of g as Blue.
           g.setColor(Color.BLUE);

        //This will draw the outline of a Blue rectangle, as the color of g when this is called is Blue.
           g.drawRect(60, 200, 100, 250);

        //This sets the color of g as Black.
           g.setColor(Color.BLACK);

        //This will display a black string.
           g.drawString("My name is James", 200, 400);
            
    } 

    // All classes need a main method, so we create that here too!
    public static void main(String args[]) {
        // We will create a GraphicsDemo object in the main method like so:
        // This should be familiar, as we used this to create Random objects and
        // Thread objects:
        GraphicsDemo demo = new GraphicsDemo();

    }
}
