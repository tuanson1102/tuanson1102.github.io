import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //bài 1
        int a = (int) Math.pow(3, 2);
        int b = (int) Math.pow(4, 2);
        double c = Math.sqrt(a + b);
        System.out.println("Chiều dài của cạnh huyền là: " + c);


        // bài 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cân nặng");
        float weight = scanner.nextFloat();
        System.out.print("Nhập chiều cao");
        float height = scanner.nextFloat();
        

        double BMI = weight/(height * 2);
        System.out.printf("Chỉ số BMI của bạn là: %.2f", BMI);

          
    }
}
