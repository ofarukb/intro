package VariableArgumentsDemo;

public class VariableArgumentsDemo {

	public static void main(String[] args) {

		System.out.println("toplam: " + topla(2, 3, 5, 9, 6, 0, 5));
	}

	public static int topla(int... sayilar) {
		int toplam = 0;

		for (int i : sayilar) {
			toplam += i;
		}

		return toplam;
	}
}
