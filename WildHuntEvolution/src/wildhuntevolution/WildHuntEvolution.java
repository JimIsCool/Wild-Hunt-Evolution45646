package wildhuntevolution;
    import javax.swing.JFrame;
    import javax.swing.SwingUtilities;
public class WildHuntEvolution extends JFrame {
    //constructor
    public WildHuntEvolution() {
        //create the User interface
        initUI();
    }
    //create the custom JFrame
    private void initUI() {        
        //set title of the JFrame
        setTitle("Wild Hunt Evolution");
        //add a custom JPanel to draw on
        add(new DrawingSurface());
        //set the size of the window
        setSize(800, 600);
        //tell the JFrame what to do when closed
        //this is important if our application has multiple windows
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //instantiate the main window
                WildHuntEvolution windowFrame = new WildHuntEvolution();
                //make sure it can be seen
                windowFrame.setVisible(true);
            }
        });
    }
}
