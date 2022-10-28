package exemplos.files;

import java.io.File;
import java.util.Scanner;
/**
 * Classe mostra como manupular diretorios
 * -> Listar arquivos e pastas de um diretorio
 * -> Criar uma nova pasta
 * 
 * AULA: 218
 */
public class ManipuDiretorios {

	public static String startPath = "c:\\temp";
	
	public static void main(String[] args) {
		
		File path = new File(startPath);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(startPath);
		
		System.out.println("Pastas dentro do diretorio:");
		listarPastas(path);
		
		System.out.println("");
		
		System.out.println("Arquivos dentro do diretorio: ");
		listarArquivos(path);
		
		System.out.println("Criar uma nova pasta no diretorio: ");
		System.out.print("digite o nome da pasta:");
		String nome = sc.nextLine();
		boolean sucess = criarPasta(nome);
		if(sucess)
			System.out.println("Diretorio criado!");
			
		sc.close();
	}

	// File::isDirectory
	public static void listarPastas(File path) {
		File[] folders = path.listFiles(File::isDirectory);
		for (File folder : folders) {
			System.out.println(" -> " + folder);
		}
	}
	
	// File::isFile
	public static void listarArquivos(File path) {
		File[] folders = path.listFiles(File::isFile);
		for (File folder : folders) {
			System.out.println(" -> " + folder);
		}
	}
	
	public static boolean criarPasta(String nome) {
		return new File(startPath + "\\"+nome).mkdir();
	}
}
