package MultidimensionalArrayDemo;

public class MultidimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] sehirler = new String[][] { { "İstanbul", "Bursa", "Bilecik" }, { "Ankara", "Konya", "Kayseri" },
				{ "Diyarbakır", "Şanlıurfa", "Gaziantep" } };

		for (int i = 0; i < sehirler.length; i++) {
			for (int j = 0; j < sehirler[i].length; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("---------------");
		}
	}

}
