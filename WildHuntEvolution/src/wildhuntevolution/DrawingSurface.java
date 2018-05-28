package wildhuntevolution;
    import java.awt.Color;
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JPanel;
    import javax.swing.ImageIcon;
    import java.awt.Image;
public class DrawingSurface extends JPanel{

    //does the actual drawing
     private void doDrawing(Graphics g) {        
        Graphics2D g2d = (Graphics2D) g; 
        Image forest1 = new ImageIcon(this.getClass().getResource("/wildhuntevolution/forest1.jpg")).getImage();
        g2d.drawImage(forest1,0,0,getWidth(),getHeight(),null);
        
    }
     
    //overrides paintComponent in JPanel class
    //performs custom painting
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//does the necessary work to prepare the panel for drawing
        doDrawing(g);
    }
}
