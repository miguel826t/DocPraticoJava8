package exemplos.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe para leitura de arquivo Obs: Essa classe mostra como ler um arquivo
 * utilizando SCANNER
 * 
 * AULA: 216
 */
public class LerTryAvancado {

	public static void main(String[] args) {

		String path = LerFecharArquivoManual.class.getResource("ArquivoTxt.txt").getPath();

		try (BufferedReader buff = new BufferedReader(new FileReader(path))) {

			String line = buff.readLine();
			while (line != null) {
				System.out.println(line);
				line = buff.readLine();
			}
		} catch (IOException e) {
			System.err.println("ERRO: " + e.getMessage());
		}
	}
}
