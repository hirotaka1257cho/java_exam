public class Exam6 {
public static void main(String[] args) {
    int last = calc(7, 2, '+');
    System.out.println(last);
}
static int calc(int num1, int num2, char example){

    if(example == '+'){
    return num1 + num2;
   }else if(example == '-'){
    int answer2 = num1 - num2;
    return answer2;
   }else if(example == '*'){
    int answer3 = num1 * num2;
    return answer3;
   }else if(example == '/'){
    int answer4 = num1 / num2;
    return answer4;
   }else{
    int answer5 = -1;
    return answer5;
   }
}
}
