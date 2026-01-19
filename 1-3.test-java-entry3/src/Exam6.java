public class Exam6 {
public static void main(String[] args) {
    int last = calc(7, 2, '/');
    System.out.println(last);
}
static int calc(int num1, int num2, char example){
   int result1 = num1 + num2;
   int result2 = num1 - num2;
   int result3 = num1 * num2;
   int result4 = num1 / num2;
    if(example == '+'){
    int answer1 = result1;
    return answer1;
   }else if(example == '-'){
    int answer2 = result2;
    return answer2;
   }else if(example == '*'){
    int answer3 = result3;
    return answer3;
   }else if(example == '/'){
    int answer4 = result4;
    return answer4;
   }else{
    int answer5 = -1;
    return answer5;
   }
}
}
