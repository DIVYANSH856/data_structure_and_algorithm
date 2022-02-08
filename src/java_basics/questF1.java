import java.util.Scanner;

public class questF1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter three numbers");
        int num1 =scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        max(num1,num2,num3);
        min(num1,num2,num3);

    }
    static void max(int a,int b,int c){
        int temp,m;
        temp=(a<b?b:a);
        m=(temp<c?c:temp);
        System.out.println("maximum number is "+m);
    }
    static void min(int a,int b,int c){
        int temp,m;
        temp=(a<b?a:b);
        m=(temp<c?temp:c);
        System.out.println("minimum number is "+m);
    }
}
