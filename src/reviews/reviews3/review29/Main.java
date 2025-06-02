package reviews.reviews3.review29;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.print("宛先を入力＞");
        String to = new Scanner(System.in).nextLine();
        System.out.print("件名を入力＞");
        String subject = new Scanner(System.in).nextLine();
        System.out.print("本文を入力＞");
        String body = new Scanner(System.in).nextLine();
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名：　" + subject);
        System.out.println("本文：　" + body);
    }
}
