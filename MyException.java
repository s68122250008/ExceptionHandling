class MyException extends RuntimeException {
    public MyException(String message) {
        super(message); // ส่ง message ไป JVM
    }
}
