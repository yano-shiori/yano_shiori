package zoo;
import zoo.animal.*;

public class Zoo {
    // 1.23
    /*
     *
     * 下記がコンソールに出力されるように作成してください
     * ※thisとsetterとgetterとフィールドを使ってください
     *
     * 動物名：ライオン
     * 体長：2.1m
     * 速度：80km/h
     *
     */
    public static void main(String[] args) {
        Animal lion = new Animal("ライオン", 2.1, 80);
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getHeight() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
