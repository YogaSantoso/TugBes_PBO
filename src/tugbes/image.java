package tugbes;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
/**
 *
 * @author Lita
 */
public class image extends JPanel {
    Image gambar;
    public image (){
        gambar =new ImageIcon(getClass().getResource("/Images/Images.PNG")).getImage();
    }
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D)g.create();
        gd.drawImage(gambar, 0, 0, getWidth(),getHeight(), null);
        gd.dispose();
    }
}
