import java.util.Scanner;

/**
 * Created by sigae on 2017. 10. 18..
 */
public class main {
    public static void main(String[] args) {
        Scanner antonium = new Scanner(System.in);
        Scanner soulPiece = new Scanner(System.in);

        System.out.println("응축된 안토니움 갯수를 입력하세요 : ");
        int countAntonium = antonium.nextInt();

        System.out.println("영혼 조각 갯수를 입력하세요 : ");
        int countSoulPiece = soulPiece.nextInt();

        if (countSoulPiece >= 20) {
            System.out.println("정가 ㅊㅊ");
            return;
        }
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

        System.out.println("정가까지 남은 레이드 횟수는\n 최소 " + targetSoulPiece + "회\n 최대 " + remainRaid  +"회 입니다");

    }
}
