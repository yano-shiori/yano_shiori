public class Practice2 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            for (int j : arr) {
                System.out.print(String.valueOf(i) + "x" + String.valueOf(j) + "=" +(i*j) + " ");
            }
            System.out.println();
        }
    }
}
