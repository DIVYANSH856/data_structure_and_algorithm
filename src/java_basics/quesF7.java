import java.util.Scanner;

public class quesF7 {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       int num=scanner.nextInt();
       prime(num);
    }
    static void prime(int a){
        int b=a/2;
        if(a<=1){
            System.out.println(a+"is a prime number");
        }
        else{
            int d=0;
            for (int i=2;i<=b;i++){
                if (a%i==0){
                    d=1;
                    System.out.println(a+" is not a prime number");
                    break;
                }
                }
            if(d==0){
                System.out.println(a + " is a prime number");
            }

            }
    }
}


