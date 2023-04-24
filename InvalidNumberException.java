import java.util.Scanner;

public class InvalidNumberException extends Exception {
    private String message;
    private int number;

    public InvalidNumberException(String message, int number) {
        super();
        this.message = message;
        this.number = number;
    }

    public String getMessage() {
        return this.message;
    }

    public int getNumber() {
        return this.number;
    }

    try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive even number: ");
        int num = scanner.nextInt();
        if (num <= 0 || num % 2 != 0) {
            try {
                throw new InvalidNumberException("Invalid input. Please enter a positive even number.", num);
            } catch (InvalidNumberException ex) {
                ex.printStackTrace();
            }
        }
    } catch (InvalidNumberException e) {
        System.out.println("Error: " + e.getMessage());
    }


}

