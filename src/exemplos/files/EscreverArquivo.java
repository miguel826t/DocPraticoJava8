package exemplos.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;

/**
 * Classe para gravação de arquivos
 * Obs: Essa classe mostra como Instanciar e escrever um file
 * 
 * AULA: 216
 */
public class EscreverArquivo {

	public static void main(String[] args) {
		
		
		String[] lines = new String[] {"MB1","MB2","Anno 1800"};
		
		String path = "c:\\temp\\teste.txt";
		//                                                      FileWriter(path, true) -> Se vc n quiser recriar o arquivo
		try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(path,true))){
			for (String line : lines) {
				buffWriter.write(line);
				buffWriter.newLine();
			}
			buffWriter.write("----------FIM-----------" + Instant.now());
			buffWriter.newLine();
			System.out.println("Sucesso.");
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
