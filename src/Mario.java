import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Mario extends KeyAdapter {
    Image marioImg;
    int x,y;
    //Set Mario in Board
    Mario(){
        ImageIcon mI = new ImageIcon("rick.gif");
        marioImg = mI.getImage().getScaledInstance(200,200,Image.SCALE_FAST);
        x=60;
        y=215;
    }
    //What will happen after keypress
    public void keyPressed(KeyEvent press) {
        int key = press.getKeyCode();
        if(key==68 && y==215)
            if(x<=630) x = x+7;
        if (key==65 && y==215)
            if(x>=-25) x = x-7;

    }
}
