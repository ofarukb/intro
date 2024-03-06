package MiniProjeAsalSayi;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {

		int sayi = 29;

		boolean asal_mi = true;
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asal_mi = false;
				break;
			}
		}

		if (asal_mi) {
			System.out.println(sayi + " bir asal sayıdır.");
		} else {
			System.out.println(sayi + " bir asal sayı değildir.");
		}
	}
}
