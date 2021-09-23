import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Revesal string = new Revesal(input.nextLine());
        System.out.println(string.reverseString());
    }
}
