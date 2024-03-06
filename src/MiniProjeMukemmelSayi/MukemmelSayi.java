package MiniProjeMukemmelSayi;

public class MukemmelSayi {

	public static void main(String[] args) {
		// 6 -> 1,2,3
		// 28 -> 1,2,4,7,14

		int sayi = 28;
		int bolenToplam = 0;
		double sayininYarisi = (double) (sayi / 2);
		for (int i = 1; i <= sayininYarisi; i++) {
			if (sayi % i == 0) {
				bolenToplam += i;
			}
		}
		if (sayi == bolenToplam) {
			System.out.println(sayi + " bir mükemmel sayıdır.");
		} else {
			System.out.println(sayi + " bir mükemmel sayı değildir.");
		}

	}

}
