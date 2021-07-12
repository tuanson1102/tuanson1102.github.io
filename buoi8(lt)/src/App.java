import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product(1, "note 10", "abc", 18000000, 150, 80, "Sam sung",Category.PHONE));
        listProducts.add(new Product(2, "galaxy", "abc", 12900000, 150, 80, "Sam sung",Category.PHONE));
        listProducts.add(new Product(3, "rog strix", "abc", 21000000, 150, 80, "ASUS",Category.LAPTOP));
        listProducts.add(new Product(4, "nitro 5", "abc", 17000000, 150, 80, "ACER",Category.LAPTOP));
        listProducts.add(new Product(5, "Iphone 11 prm", "abc", 23000000, 150, 80, "APPLE",Category.APPLE));
        listProducts.add(new Product(6, "Apple watch", "abc", 5000000, 150, 80, "APPLE",Category.APPLE));
        listProducts.add(new Product(7, "tai nghe", "abc", 3500000, 150, 80, "APPLE",Category.ACCESSORIES));
        listProducts.add(new Product(8, "chuột", "abc", 200000, 150, 80, "ASUS",Category.ACCESSORIES));
        listProducts.add(new Product(9, "bàn phím", "abc", 550000, 150, 80, "ASUS",Category.ACCESSORIES));
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Lựa chọn của bạn: ");
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose){
            case 1:
                for (int i = 0; i <listProducts.size(); i++){
                    if (listProducts.get(i).getCategory().toString().equals("PHONE")) {
                        System.out.println(listProducts.get(i));
                    }
                }
                break;
            case 2:
                System.out.println("Lựa chọn hãng: ");
                String brand = sc.nextLine();
                for (int i = 0; i < listProducts.size(); i++){
                    if (listProducts.get(i).getBrand().equalsIgnoreCase(brand)) {
                        System.out.println(listProducts.get(i));
                    }
                }
                break;
            case 3:
                System.out.println("chọn mức giá: ");
                long Price = sc.nextLong();
                for (int i = 0; i < listProducts.size(); i++){
                    if (listProducts.get(i).getPrice()< 2000000) {
                        System.out.println(listProducts.get(i));
                    }else if (listProducts.get(i).getPrice() >= 2000000 && listProducts.get(i).getPrice() < 4000000) {
                        System.out.println(listProducts.get(i));
                    }else if (listProducts.get(i).getPrice() >= 4000000 && listProducts.get(i).getPrice() < 7000000){
                        System.out.println(listProducts.get(i));
                    }else if (listProducts.get(i).getPrice() >= 7000000 && listProducts.get(i).getPrice() < 13000000){
                        System.out.println(listProducts.get(i));
                    }else if (listProducts.get(i).getPrice() >= 13000000){
                        System.out.println(listProducts.get(i));
                    }
                
                }
                break;
            case 4:
            System.out.println("tìm kiếm: ");
                String name = sc.nextLine();
            for (int i = 0; i < listProducts.size(); i++) {
                if (listProducts.get(i).getName().contains(name)) {
                    System.out.println(listProducts.get(i));
                }
            }
                
                break;
        }

    }
    }

