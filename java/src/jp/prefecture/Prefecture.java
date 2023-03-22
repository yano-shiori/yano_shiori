package jp.prefecture;

public class Prefecture {
    // 1.29~1.30
    // コンストラクタを使って都道府県一覧を作成
    public static Prefecture hokkaido = new Prefecture("北海道", "札幌市", 83424);
    public static Prefecture aomori = new Prefecture("青森県", "青森市", 9646);
    public static Prefecture iwate = new Prefecture("岩手県", "盛岡市", 15275);
    public static Prefecture miyagi = new Prefecture("宮城県", "仙台市", 7282);
    public static Prefecture akita = new Prefecture("秋田県", "秋田市", 11638);
    public static Prefecture yamagata = new Prefecture("山形県", "山形市", 9323);
    public static Prefecture fukushima = new Prefecture("福島県", "福島市", 13784);
    public static Prefecture ibaraki = new Prefecture("茨城県", "水戸市", 6097);
    public static Prefecture tochigi = new Prefecture("栃木県", "宇都宮市", 6408);
    public static Prefecture gunma = new Prefecture("群馬県", "前橋市", 6362);
    public static Prefecture saitama = new Prefecture("埼玉県", "さいたま市", 3798);

    // インスタンスフィールドの定義
    public String pName;
    public String cName;
    public double area;

    // コンストラクタ
    public Prefecture(String pName, String cName, double area) {
        this.pName = pName;
        this.cName = cName;
        this.area = area;
    }

    public static String getpName(Prefecture list) {
        return "都道府県名:" + list.pName;
    }

    public static String getcName(Prefecture list) {
        return "県庁所在地:" + list.cName;
    }

    public static String getArea(Prefecture list) {
        return "面積:" + list.area + "km2";
    }
}
