import javax.swing.*;
import java.awt.*;

public class mariogames extends JPanel {
    Image bg;
    Image m;

    mariogames(){
        ImageIcon bgimg = new ImageIcon("marioreal.gif");
        bg = bgimg.getImage().getScaledInstance(705,460,Image.SCALE_FAST);
        ImageIcon mario = new ImageIcon("gmario.gif");
        m = mario.getImage().getScaledInstance(120,120,Image.SCALE_FAST);



    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawImage(bg,0,0,this);
        graphics.drawImage(m,150,350,this);
    }
}
