public class Exam5 {

public static void main(String[] args) {
    int result1 = addition(5, 3);
    System.out.println(result1);

    int result2 = subtraction(5, 3);
    System.out.println(result2);    

    int result3 = multiplication(5, 3);
    System.out.println(result3);

    int result4 = division(5, 3);
    System.out.println(result4);

    int result5 = remainder(5, 3);
    System.out.println(result5);
}
static int addition(int num1, int num2){
    int answer1 = num1 + num2;
    return answer1;
}
static int subtraction(int num1, int num2){
    int answer2 = num1 - num2;
    return answer2;
}

static int multiplication(int num1, int num2){
    int answer3 = num1 * num2;
    return answer3;
}

static int division(int num1, int num2){
    int answer4 = num1 / num2;
    return answer4;
}

static int remainder(int num1, int num2){
    int answer5 = num1 % num2;
    return answer5;
}

}
