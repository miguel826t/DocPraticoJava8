package exemplos.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classe para leitura de arquivo 
 * Obs: Essa classe mostra como ler um arquivo utilizando SCANNER
 * 
 * AULA: 214
 */
public class LerArquivoSimples1 {

	public static void main(String[] args) {

		File file = new File(LerArquivoSimples1.class.getResource("ArquivoTxt.txt").getFile());

		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
