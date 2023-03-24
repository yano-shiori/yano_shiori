package game;

/*
 * 1.25
 * 名前を入力したら下記がコンソールに出力されるように作ってください
 * 条件：数値は毎回変わるように作ってください
 * サブクラスを使用してください
 * メソッドのオーバーライドを使用してください
 * superクラスを使用してください
 * getterとsetterを使用してください
 * Projectを2つ作ってメインと処理を分けてください
 * 命名する場合は規則にのっとってください
 * コンストラクタを使用してください
 *
 * こんにちは 「 名前 」 さん
 * ステータス
 * HP：849
 * MP：862
 * 攻撃力：375
 * 素早さ：937
 * 防御力：24
 *
 * さあ冒険に出かけよう！
 *
 */
public class Player {
    private String name;
    private int hp;
    private int mp;
    private int com;
    private int dex;
    private int def;

    Player(String name, int hp, int mp, int com, int dex, int def) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.com = com;
        this.dex = dex;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}

class Hero extends Player {
    Hero(String name, int hp, int mp, int com, int dex, int def) {
        super(name, hp, mp, com, dex, def);
    }
}