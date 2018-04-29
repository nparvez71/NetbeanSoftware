package Custom;

public class TestCustomException1 {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]) {
        try {
            validate(20);
        } catch (InvalidAgeException i) {
            System.out.println("Exception occured: " + i);
        }

        System.out.println("rest of the code...");
    }
}
