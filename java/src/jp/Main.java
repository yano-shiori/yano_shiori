package jp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import jp.prefecture.*;

public class Main {
    // 1.29~1.30
    public static void main(String[] args) {
        // 都道府県の配列を生成
        Prefecture[] list = PrintList.importList();
        // キー入力した値たちを配列化
        int[] array = PrintList.inputNum();
        // 入力した数値と一致する都道府県を出力
        for(int i=0; i<array.length; i++) {
            int num = array[i];
            System.out.println();
            System.out.println(Prefecture.getpName(list[num]));
            System.out.println(Prefecture.getcName(list[num]));
            System.out.println(Prefecture.getArea(list[num]));
        }
    }
}

class PrintList {
    // 入力した値を配列にして返すメソッド
    public static int[] inputNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0~10の数値を入力し、入力が終われば「99」を送信してください");
        List<Integer> inputList = new ArrayList<Integer>();
        try {
            while(true) {
                int num = scanner.nextInt();
                inputList.add(num);
                if (num > 10 || num < 0) {
                    int indexOfLastElement = inputList.size() - 1;
                    inputList.remove(indexOfLastElement);
                    System.out.println("結果を表示します");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("数値以外が入力されました。最初からやり直してください");
        } finally {
            scanner.close();
        }
        List<Integer> sortedList = new ArrayList<Integer>(new HashSet<>(inputList));
        int[] inputArray = sortedList.stream().mapToInt(Integer::intValue).toArray();
        return inputArray;
    }

    // 都道府県配列を生成するメソッド
    public static Prefecture[] importList() {
        // 空のリストに都道府県を挿入していく
        List<Prefecture> list = new ArrayList<Prefecture>();
        list.add(Prefecture.hokkaido);
        list.add(Prefecture.aomori);
        list.add(Prefecture.iwate);
        list.add(Prefecture.miyagi);
        list.add(Prefecture.akita);
        list.add(Prefecture.yamagata);
        list.add(Prefecture.fukushima);
        list.add(Prefecture.ibaraki);
        list.add(Prefecture.tochigi);
        list.add(Prefecture.gunma);
        list.add(Prefecture.saitama);

        // リストを配列化
        Prefecture[] array = list.toArray(new Prefecture[list.size()]);
        return array;
    }
}

/*
 *
 * 0, "北海道:札幌市:83424"
 * 1, "青森県:青森市:9646"
 * 2, "岩手県:盛岡市:15275"
 * 3, "宮城県:仙台市:7282"
 * 4, "秋田県:秋田市:11638"
 * 5, "山形県:山形市:9323"
 * 6, "福島県:福島市:13784"
 * 7, "茨城県:水戸市:6097"
 * 8, "栃木県:宇都宮市:6408"
 * 9, "群馬県:前橋市:6362"
 * 10, "埼玉県:さいたま市:3798"
 *
 * コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 * 都道府県がソートされてコンソールに出力されるように作ってください
 * ※Packageを2つ作ってください
 * ※複数選択できるようにしてください
 *
 * 例:
 * 8
 * 5
 * 9
 * と入力された場合（昇順）
 *
 * 都道府県名：山形県
 * 県庁所在地：山形市
 * 面積：9323.0km2
 *
 * 都道府県名：栃木県
 * 県庁所在地：宇都宮市
 * 面積：6408.0km2
 *
 * 都道府県名：群馬県
 * 県庁所在地：前橋市
 * 面積：6362.0km2
 *
 */
