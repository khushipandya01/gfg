import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String separator = sc.nextLine();

        // Print the strings with the separator
        System.out.println(a + separator + b);

        sc.close();
    }
}