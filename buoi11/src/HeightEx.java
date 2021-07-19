public class HeightEx extends Exception {
    public HeightEx(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập chiều cao: " + super.getMessage();
    }
}