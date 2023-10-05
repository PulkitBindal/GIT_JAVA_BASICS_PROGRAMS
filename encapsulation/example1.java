import java.util.Scanner;
class Name {
    private String n;
    public Name() {
        // Constructor to initialize the Scanner object
    }
    public void fun() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any name:");
        n = in.nextLine();
        in.close(); // Close the Scanner object to prevent resource leak
    }
    public static void main(String[] args) {
        Name obj = new Name();
        obj.fun();
    }
}
