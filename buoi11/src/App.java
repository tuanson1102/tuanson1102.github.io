public class App {
    public static void main(String[] args) throws Exception {
        Height height = new Height();
        Weight weight = new Weight();

        height.input();
        weight.input();

        System.out.println(height);
        System.out.println(weight);

        BMI bmi = new BMI(height.getHeight(), weight.getWeight());
        System.out.printf("chỉ số BMI của bạn là: %.1f \n", bmi.getScore());

    }
}
