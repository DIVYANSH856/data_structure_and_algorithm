import java.util.Scanner;

public class ASSIGNMENT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius of circle");
        float radius=scanner.nextFloat();
        float area = 3.14f * radius *radius;
        System.out.println("area of circle is "+area);

    }
    static int binarySearch(int target, int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start - (end - start)/2;
            if(arr[mid] > target){
                end = mid -1;
            }else if(arr[mid] <target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}