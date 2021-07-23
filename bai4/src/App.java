import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Array[n][n]:");
        int [][] array = new int[n][n];
        for (int i =0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.print("Các phần tử trong đường chéo chính: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][i] + " ");
        }
    
    }
}
