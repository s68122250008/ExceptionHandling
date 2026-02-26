public class TestDemoException1 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new MyException("Age must be at least 18");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

class MyException1 extends RuntimeException {
    private int errorCode;

    public MyException1(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
