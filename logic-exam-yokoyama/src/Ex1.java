public class Ex1 {
public static void main(String[] args) {
    for(int i = 1; i <= 9; i++){
        for(int j = 1; j <= 9; j++){
            int total = i * j;
            if(total <= 9){
                System.out.print("0" + total+ " ");
            }else{
                System.out.print(total+ " ");
            }
        }System.out.println();
    }
}
}
