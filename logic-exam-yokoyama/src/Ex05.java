import java.time.temporal.ValueRange;

public class Ex05 {
public static void main(String[] args) {
    
    String[] count = {
            "soccer", "baseball", "jogging", "jogging", "soccer", 
            "surfing", "surfing", "soccer", "surfing", "baseball", 
            "boxing", "surfing", "soccer", "surfing", "jogging", 
            "boxing", "jogging", "baseball", "soccer", "soccer" 
        };

        int soccer = 0;
        int baseball = 0;
        int jogging = 0;
        int surfing = 0;
        int boxing = 0;


        for (int i = 0; i < count.length; i++) {
            switch (count[i]) {
                case "soccer": soccer++; break;
                case "baseball": baseball++; break;
                case "jogging": jogging++; break;
                case "surfing": surfing++; break;
                case "boxing": boxing++; break;

            }
        }
        System.out.println(soccer);
        System.out.println(baseball);
        System.out.println(jogging);
        System.out.println(surfing);
        System.out.println(boxing);

        System.out.println("最も出現回数の多いスポーツはサッカーで出現回数は 、" + soccer + "回です");


}
}
