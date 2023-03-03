public class Switch {
    public static void main(String[] args) throws Exception {
        int month = 1;
        switch (month) {
            case 2:
                System.out.println(month + "月は28日です。");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月は30日です。");
                break;
            default:
                System.out.println(month + "月は31日です。");
                break;
        }
    }
}
