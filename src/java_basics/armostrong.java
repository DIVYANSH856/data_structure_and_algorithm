package java_basics;
import java.util.Scanner;


public class armostrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num=scanner.nextInt();
        int temp,digit=0,last=0,sum=0;
        temp=num;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=num;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
        if(num==sum)
            System.out.println(num+" is a armstrong");
        else
            System.out.println(num+" not a armstrong");
    }
}


