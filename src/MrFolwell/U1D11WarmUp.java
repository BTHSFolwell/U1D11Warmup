package MrFolwell;

public class U1D11WarmUp {
    public static void main(String[] args) {
        int test1 = 10;
        int test2 = -5;
        while ((test1 >= 0) && (test2 < 0)) {
            test1--;
            test2++;
        }
        System.out.println("test1 = " + test1);
        System.out.println("test2 = " + test2);

        double a = 1234.0;
        double b = 10.0;
        while (a > 1.0) {
            a = a / b;
            System.out.println("a = " + a);
        }
    }
}