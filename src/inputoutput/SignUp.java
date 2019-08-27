package inputoutput;
import java.util.*;
import java.util.Scanner;

// read from console
public class SignUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First Name:");
        String firstName= in.nextLine();
        System.out.print("Last Name:");
        String lastName= in.nextLine();
        System.out.print("Email:");
        String email= in.nextLine();
        System.out.print(firstName + " " + lastName + " "  + "Your registration is complete");

    }
}