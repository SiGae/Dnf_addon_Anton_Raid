import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
/**
 * Created by sigae on 21/10/17.
 */

public class Main extends JFrame {
    private JTextField antonium;
    public JPanel DNF;
    private JTextField soulpiece;
    private JButton button1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;

    public Main() {

        textArea1.setText("응축된 안토니움 갯수를 입력해주세요");
        textArea2.setText("안톤의 영혼조각 갯수를 입력해주세요");

        antonium.addFocusListener(new changeListener());
        soulpiece.addFocusListener(new changeListener());

        button1.addActionListener(e -> {
            int countAntonium = Integer.parseInt(getAntonium());
            int countSoulPiece = Integer.parseInt(getSoulPiece());
            if (countAntonium >= 120) {
                countSoulPiece += ( countAntonium / 120 );
                countAntonium %= 120;
            }

            int targetSoulPiece = 20 - countSoulPiece;
            int remainAntonium = (targetSoulPiece * 120) - countAntonium;

            if (remainAntonium <= 0) {
                remainAntonium = 0;
            }
            int remainRaid = remainAntonium / 15;
            int extra = 0;

            if ((remainAntonium % 15) != 0) {
                extra += 1;
            }

            remainRaid += extra;
            textArea3.setText("정가까지 남은 레이드 횟수는\n 최소 " + targetSoulPiece + "회\n 최대 " + remainRaid +"회 입니다");
        });
    }

    private class changeListener extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent e) {
            super.focusLost(e);
        }
    }

    private String getAntonium() {
        return antonium.getText();
    }

    private  String getSoulPiece() {
        return soulpiece.getText();
    }
}
