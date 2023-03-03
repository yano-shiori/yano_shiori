public class While {
    public static void main(String[] args) {
        int num = 0;
        do {
            num++;
            if (num % 2 == 0) {
                System.out.println(num + "は偶数です");
            } else {
                System.out.println(num + "は奇数です");
            }
        } while (num < 100);
    }
}
