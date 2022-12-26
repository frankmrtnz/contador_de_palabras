import java.util.Iterator;
import java.util.Scanner;

public class Operador {

	public static void main(String[] args) {
		System.out.println("Introduza su frase:");
		Scanner scanner = new Scanner(System.in);
		String fraseIntroducida = scanner.nextLine();
		scanner.close();
		fraseIntroducida = fraseIntroducida.trim();
		int contador = 0;
		if (fraseIntroducida.length() == 0) {
			contador = 0;
		} else {
			// cuenta la primera palabra
			// si existe, ya que el primer caracter
			// no puede ser un espacio
			contador++;
			for (int i = 0; i < fraseIntroducida.length(); i++) {
				if (fraseIntroducida.charAt(i) == ' ' && fraseIntroducida.charAt(i + 1) != ' ') {
					// ' ?'
					contador++;
				}
			}
		}

		System.out.println("Palabras contadas: " + contador);
	}

}
