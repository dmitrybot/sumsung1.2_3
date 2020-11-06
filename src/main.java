import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int c = a + 1 + (a + 1) % 2;
        System.out.println(c);
    }
}