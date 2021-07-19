import java.util.Scanner;

public class Weight implements InputData {
    double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Nhập cân nặng của bạn: ");
            try {
                weight = Double.parseDouble(sc.nextLine());
                if ((weight <= 0) || (weight > 200)) {
                    throw new WeightEx("cân nặng không được nhỏ hơn 0kg và lớn hơn 200kg");
                }
                isValid = true;
            } catch (NumberFormatException e1) {
                System.out.println("cân nặng là một số.");
            } catch (WeightEx e2) {
                System.out.println(e2.getMessage());
            }
        }
    }


    @Override
    public String toString() {
        return "Cân nặng= " + weight;
    }
}
