public class Array4 {
    public static void main(String[] args) {
        int[][] student = new int[4][3];

        student[0][0] = 64;
        student[0][1] = 73;
        student[0][2] = 69;

        student[1][0] = 58;
        student[1][1] = 81;
        student[1][2] = 75;

        student[2][0] = 86;
        student[2][1] = 68;
        student[2][2] = 79;

        student[3][0] = 72;
        student[3][1] = 55;
        student[3][2] = 80;

        System.out.println("生徒1:国語" + student[0][0] + "点、数学" + student[0][1] + "点、英語" + student[0][2] + "点");
        System.out.println("生徒2:国語" + student[1][0] + "点、数学" + student[1][1] + "点、英語" + student[1][2] + "点");
        System.out.println("生徒3:国語" + student[2][0] + "点、数学" + student[2][1] + "点、英語" + student[2][2] + "点");
        System.out.println("生徒4:国語" + student[3][0] + "点、数学" + student[3][1] + "点、英語" + student[3][2] + "点");

        System.out.println("");

        System.out.println("国語の平均点は" + ((student[0][0] + student[1][0] + student[2][0] + student[3][0]) / 4) + "点です。");
        System.out.println("数学の平均点は" + ((student[0][1] + student[1][1] + student[2][1] + student[3][1]) / 4) + "点です。");
        System.out.println("英語の平均点は" + ((student[0][2] + student[1][2] + student[2][2] + student[3][2]) / 4) + "点です。");
    }
}
