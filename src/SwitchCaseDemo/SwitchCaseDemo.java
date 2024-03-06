package SwitchCaseDemo;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		char grade='C';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok iyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("iyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kötü not : Kaldınız");
			break;
		default:
			System.out.println("Geçersin not girdiniz");
			break;
		}
	}
}
