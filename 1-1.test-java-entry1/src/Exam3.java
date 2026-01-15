public class Exam3 {
public static void main(String[] args) {
    int smallTotal = (200 * 3) + (250 * 4);
    int tax = smallTotal / 10;
    int total = smallTotal + tax;

    System.out.println("小計");
    System.out.println(smallTotal + "円");
    System.out.println("消費税");
    System.out.println(tax + "円");
    System.out.println("合計金額");
    System.out.println(total + "円");
}
}
