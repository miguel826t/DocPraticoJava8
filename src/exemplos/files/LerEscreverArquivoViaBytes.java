package exemplos.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileAlreadyExistsException;

/**
 * Classe para gravação de arquivos com meta dados
 * Gravação de PDF e IMAGENS
 * 
 */
public class LerEscreverArquivoViaBytes {

	public static void main(String[] args) throws IOException {

		String pathFileOrigente = "c:\\temp\\PDF1.pdf";
		String pathFileDestino = "c:\\temp\\PDF2.pdf";
		
		File fileOrigem = new File(pathFileOrigente);
		
		if(!fileOrigem.exists() && !fileOrigem.isFile()) {
			throw new FileNotFoundException("Arquivo passado em origem para copiar não existe.");
		}
		
		InputStream is = new FileInputStream(fileOrigem);
		try(OutputStream os = new FileOutputStream(pathFileDestino)){
			
			byte[] buff = new byte[1024];
			int leg;
			while((leg = is.read(buff)) > 0) {
				os.write(buff,0,leg);
			}
			
			// Abrir o arquivo copiado na tela.
			ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/C",pathFileDestino);
		    processBuilder.start();	
		}
		catch (FileNotFoundException e) {
			throw new FileNotFoundException("Falha ao tentar criar arquivo destino, verifique diretorio/nome do arquivo.");
		}
		catch (FileAlreadyExistsException e) {
			throw new FileAlreadyExistsException("Arquivo destino já existe criado.");
		}
		catch (Exception e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		}finally {
			is.close();
		}
	}
}
