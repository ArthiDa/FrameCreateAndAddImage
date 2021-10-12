import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
         frame.setSize(720,480);
         frame.add(new Board());
         frame.setVisible(true);
    }
    //C201073
}

