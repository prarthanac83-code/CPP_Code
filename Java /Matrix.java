import java.util.Scanner;
public class Matrix{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[3][3];
    // int matrix[] = {1,2,3,4};

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print("Enter the Number:");
            arr[i][j] = sc.nextInt();
        }
    }

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){

            System.out.print(arr[i][j]+" ");
    }
        System.out.println("");
    }


}
}