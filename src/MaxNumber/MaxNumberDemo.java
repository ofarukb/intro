package MaxNumber;

public class MaxNumberDemo {
	public static void main(String[] args) {
		int sayi1 = 30, sayi2 = 23, sayi3 = 44;

		int max = sayi1;

		if (sayi2 > max) {
			max = sayi2;
		}
		if (sayi3 > max) {
			max = sayi3;
		}

		System.out.println("En büyük sayı: " + max);
	}
}
