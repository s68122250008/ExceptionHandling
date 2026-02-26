public class TestDemoException2 {
    static void validateAge(int age) {
        if (age < 18) {
            throw new MyException1("Age must be >= 18", 1001);
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {

        try {
            validateAge(15); // ทดลองค่า invalid
        } catch (MyException1 e) {

            System.out.println("Error message: " + e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());

        }

        System.out.println("Program continues...");
    }
}
