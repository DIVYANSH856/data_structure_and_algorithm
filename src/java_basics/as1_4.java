import java.util.Scanner;

public class as1_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your number");
            int num = scanner.nextInt();

            int temp, digit = 0, sum = 0, num1 = 0;
            temp = num;
            while (temp>0) {
                temp = temp / 10;
                digit++;
            }

            temp = num;
            while (temp > 0) {
                num1 = temp % 10;
                temp=temp/10;
                sum += Math.pow(num1, digit);
            }
            if (sum == num)
                System.out.println("its an armostong");
            else
                System.out.println("its not a armstong");
        }
    }
