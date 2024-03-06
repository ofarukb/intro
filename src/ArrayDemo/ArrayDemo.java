package ArrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		double[] sayilar = new double[] { 1.3, 1.4, 7.6, 4.6, 8.9, 5.5, 3.3 };

		double toplam = 0;
		double max = sayilar[0];

		for (double sayi : sayilar) {
			if (max < sayi) {
				max = sayi;
			}
			toplam += sayi;
			System.out.println(sayi);
		}

		System.out.println("Toplam: " + toplam);
		System.out.println("En büyük: " + max);
	}

}
