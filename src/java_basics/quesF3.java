import java.util.Scanner;

public class quesF3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter numbers you want the product of");
        int num1 =scanner.nextInt();
        int num2 = scanner.nextInt();
        int a=prod(num1,num2);
        System.out.println("product = "+a);
    }
    static int prod(int b,int c){
        int a=b*c;
        return a;
    }
}
