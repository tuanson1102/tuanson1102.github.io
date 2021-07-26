import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            
            case 1: 
                System.out.println("DANH SÁCH SẢN PHẨM");
                repository.show();
                break;
            
            case 2: 
                System.out.println("Các sản phẩm có giá trên 10000: ");
                repository.filterProductByPrice();
                break;

            case 3:
                repository.countProductByAmountSale();
                break;
            
            case 4:
                System.out.println("Các sản phẩm theo danh mục: ");
                repository.sortProductByCategory();
                break;
            case 5:
                System.out.println("Sản phẩm theo số lượng bán được: ");
                repository.sortProductByAmountSale();
                repository.show();
                break;
            case 6:
                System.out.println("Sản phẩm bán được nhiều nhất: ");
                repository.maxProductByAmountSale();
                repository.show();
            break;
            case 7:
                repository.sortProductByName();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                repository.show();
                break;
        }
    }
}
