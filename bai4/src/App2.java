import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập n; Chuỗi array[n]");
            int n = Integer.parseInt(sc.nextLine());
            String [] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = sc.nextLine();
            }
            System.out.println("Nhập chuỗi bất kì: ");
            String checkString = sc.nextLine();
            String checkStringIndex = "";
            String JAVA = "JAVA";
            int javaCount = 0;
            for (int i = 0; i < n; i++) {
                if (stringArray[i].equalsIgnoreCase(JAVA)) {
                    javaCount++;
                }
                if (checkString.equals(stringArray[i])) {
                    checkStringIndex += i + " ";
                }
            }
            System.out.println("Số lần Java xuất hiện trong mảng: " + javaCount);
            if (checkStringIndex.length() > 0) {
                System.out.println("Chuỗi ở vị trí trong mảng là: " + checkStringIndex);
            } else {
                System.out.print("Chuỗi nhập không có trong mảng");
            }
    
            sc.close();
        }
}
