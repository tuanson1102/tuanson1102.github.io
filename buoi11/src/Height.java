import java.util.Scanner;

public class Height implements InputData {
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Nhập chiều cao của bạn: ");
            try {
                height = Double.parseDouble(sc.nextLine());
                if ((height <= 0) || (height > 2.5))
                    throw new HeightEx("chiều cao không được nhỏ hơn 0 và lớn hơn 2m5");
                isValid = true;
            } catch (NumberFormatException e1) {
                System.out.println("chiều cao phải là một số.");
            } catch (HeightEx e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Chiều cao= " + height;
    }

}