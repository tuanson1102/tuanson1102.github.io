public class WeightEx extends Exception {
    public WeightEx(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập cân nặng: " + super.getMessage();
    }
}
