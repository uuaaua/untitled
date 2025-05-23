package reviews.reviews1;

public class Review5 {
    public static void main(String[] args) {
        int a = 10 ; int b = 20; int c = 10;
        System.out.println(a == b);//①
        System.out.println(a == c);//②
        System.out.println(a != b);//③
        System.out.println(a != c);//④
        System.out.println(a < b);//⑤
        System.out.println(a <= c);//⑥
        System.out.println(a > b);//⑦
        System.out.println(a >= c);//⑧
        System.out.println(a + 10 == b);//⑨
        System.out.println(c + 10 < b + -5);//⑩
    }
}
