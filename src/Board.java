import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel{
    Image backgroundImage;
    Mario setmario;
    Board(){
        ImageIcon imageIcon = new ImageIcon("marioreal.gif");
        backgroundImage = imageIcon.getImage().getScaledInstance(720,450,Image.SCALE_FAST);
        setmario = new Mario();
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent press) {
                super.keyPressed(press);
                setmario.keyPressed(press);
            }
        });
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawImage(backgroundImage,0,0,this);
        graphics.drawImage(setmario.marioImg,setmario.x,setmario.y,this);
        repaint();
    }
}
