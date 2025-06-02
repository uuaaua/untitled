package reviews.reviews1;

public class Review14 {
    public static void main(String[] args) {
        String color = "blue";
        if (color.equals("red")) {
            System.out.println("停止");
        }else if (color.equals("yellow")) {
            System.out.println("注意");
        }else if (color.equals("blue")) {
            System.out.println("進行");
        }else {
            System.out.println("無効な信号の色です。");
        }
    }
}
