import java.util.Scanner;

public class as1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int num =  scanner.nextInt();
        int fact=0;
        for(int i=1;i<num;i++)
        {
            fact=i*num;
        }
        System.out.println(fact);

    }
}
