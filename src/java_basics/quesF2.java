import java.util.Scanner;

public class quesF2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        check(num);
    }
    static void check(int b){
        if(b%2==0){
            System.out.println(b+" is an even number");
        }
        else {
            System.out.println(b +" is a odd nuber");
        }
    }

}
