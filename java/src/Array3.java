public class Array3 {
    public static void main(String[] args) {
        String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        for (String str : arr) {
            System.out.println(str);
            if (str == "d") {
                break;
            }
        }

        System.out.println("");

        String[] arr2 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        for (String str2 : arr2) {
            if (str2 == "i") {
                continue;
            }
            System.out.println(str2);
        }
    }
}
