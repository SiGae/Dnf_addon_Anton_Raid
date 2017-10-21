import javax.swing.*;

/**
 * Created by sigae on 21/10/17.
 */


public class MainActivity {
    public static void main(String[] args){
        JFrame frame = new JFrame("정가 계산기");
        frame.setContentPane(new Main().DNF);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.pack();
        frame.setVisible(true);

    }
}




