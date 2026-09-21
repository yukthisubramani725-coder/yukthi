class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }

            System.out.println("Valid age");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
