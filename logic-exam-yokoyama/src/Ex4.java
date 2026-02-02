public class Ex4 {

    private int year = 2001;  


    public static boolean judge(int year){
        if(year % 400 == 0){
            System.out.println(year + "年はうるう年です");
            return true;
        }else if(year % 100 == 0){
            System.out.println(year + "年はうるう年ではありません");
            return false;
        }else if(year % 4 == 0){
            System.out.println(year + "年はうるう年です");
        }
            return false;
        
        
    }
public static void main(String[] args) {
    System.out.println(judge(4));
}
}
