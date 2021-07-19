public class BMI {
    double height;
    double weight;

    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getScore() {
        return weight/(height*height);
    }
}
