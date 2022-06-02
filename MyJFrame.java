import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {
    MyJFrame(ImageIcon image){

        this.setTitle("Test Room");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x234567));
    }
}