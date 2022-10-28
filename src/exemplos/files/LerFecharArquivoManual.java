package exemplos.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe para leitura de arquivo e fechamento de arquivos 
 * Obs: Demonstração de... 
 *   -> Ler arquivo atravez do FileReader e BufferedReader Ambos são mais rapidos para realizar a leitura 
 *   -> Mostrar como é para fechar manualmente os arquivos abertos Com bloco Finally e Try 
 * 
 * AULA: 215
 */
public class LerFecharArquivoManual {

	public static void main(String[] args) {

		FileReader reader = null;
		BufferedReader buff = null;
		try {
			String path = LerFecharArquivoManual.class.getResource("ArquivoTxt.txt").getPath();

			reader = new FileReader(path);
			buff = new BufferedReader(reader);

			String line = buff.readLine();
			while (line != null) {
				System.out.println(line);
				line = buff.readLine();
			}
		} catch (IOException e) {
			System.err.println("ERRO: " + e.getMessage());
		} finally {
			try {
				if (buff != null)
					buff.close();
				if (reader != null)
					reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
