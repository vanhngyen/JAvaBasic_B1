import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen x: ");
        int x = sc.nextInt();
        String result = "So le.";
        if (x % 2 == 0) {
            result = "So chan.";
        }
        System.out.println(result);
    }
}
