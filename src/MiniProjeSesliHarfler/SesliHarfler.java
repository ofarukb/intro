package MiniProjeSesliHarfler;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'ü';

		String inceSesliler = "EİÖÜeiöü", kalinSesliler = "AIOUaıou";

		int indexOfInceSesliler = inceSesliler.indexOf(harf);
		int indexOfKalinSesliler = kalinSesliler.indexOf(harf);
		if (indexOfInceSesliler == -1 && indexOfKalinSesliler == -1) {
			System.out.println("Sessiz harf girdiniz.");
			return;
		}

		if (indexOfInceSesliler > -1) {
			System.out.println(harf + " harfi ince seslidir");
		} else if (indexOfKalinSesliler > -1) {
			System.out.println(harf + " harfi kalın seslidir");
		}
	}

}
