package ex;

/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021038 傅琬鈞
 */

import java.util.Scanner;

public class ex01_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		float p = (float) 0.5;
		int a = scn.nextInt();
		int x;
		if (a <= 600) {
			x = (int) (a * p);
		} else {
			if (a <= 1200 && a >= 600) {
				x = (int) (a * p * 0.9);
			} else {
				x = (int) (a * p *  0.79);

			}
		}
		System.out.println(x);

	}

}
