import java.util.Scanner;

public class as1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number :");
        int num = scanner.nextInt();
        int i=1;
        while(i<num){
            if(num%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
