public class fibonacci {
    public static void main (String[] args) {
        int i, a = 1, b = 1;
        i = 0;
        System.out.print("1 1");
        while (i <= 100) {
            i = a + b;
            System.out.print(i + "");
            a = b;
            b = i;
        }
    }
}
