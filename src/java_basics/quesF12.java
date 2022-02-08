public class quesF12 {
    public static void main(String[] args) {
        int arr[]={12,32,3,43,2,4,5,64,13,24};
        check(arr);
    }

    static void check(int ar[]) {
        int n=10;
        for (int i =0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Calculate square of array elements
                    int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

                    if (x == y + z || y == x + z || z == x + y)
                        System.out.println(ar[i]+" "+ar[k]+" "+ar[j]);
                }
            }

        }
    }
}
//this is the worst way to solve this