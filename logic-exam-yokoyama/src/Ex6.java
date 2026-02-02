import java.util.ArrayList;
import java.util.List;

public class Ex6 {
public static void main(String[] args) {
int num1 = (int)Math.floor(Math.random() * 10);
int num2 = (int)Math.floor(Math.random() * 10);
int num3 = (int)Math.floor(Math.random() * 10);

System.out.println(num1);

int[] result = {num1, num2, num3};
for (int i = 0; i < 5; i++) {
            System.out.println(result[i]);
        }
}


}
