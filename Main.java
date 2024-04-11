import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Dimension;
import java.util.Random;


public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("My Window");
        frame.setSize(750, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        MyPanel panel = new MyPanel();
        frame.add(panel);

        frame.setVisible(true);
        panel.updateDimensions();
    }
}

class MyPanel extends JPanel {

    // lets grab frame or panel width and height next save them into variables
    int width;
    int height;
    int initialValue = 30;
    Random rand = new Random();

    //Rock rock = new Rock();


    public void updateDimensions(){ // gets the dimensions of the frame
        
        width = getWidth();
        height = getHeight();
        //System.out.println(width);
        //System.out.println(height);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawImage(rock.image, 50, 50, this);

        for (int i=0; i < initialValue; i++){
            
            int rndX = rand.nextInt(width);
            int rndY = rand.nextInt(height);
            
            System.out.println(rndX);
            System.out.println(rndY);
        }

    }
}
//TODO work out how I make sure they dont overlap, Maybe I should give the hitboxes right now and check for that?

