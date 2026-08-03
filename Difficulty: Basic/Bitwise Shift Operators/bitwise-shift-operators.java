import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // Right shift and Left shift
        System.out.println((a >> b) + " " + (a << b));
    }
}