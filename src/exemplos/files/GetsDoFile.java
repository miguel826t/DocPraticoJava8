package exemplos.files;

import java.io.File;


/**
 * Metodos mais comuns usados no na classe File.
 */
public class GetsDoFile {

	public static void main(String[] args) {
	
		String path = GetsDoFile.class.getResource("ArquivoTxt.txt").getPath();
		
		File file = new File(path);
		
		System.out.println("getName: \n -> "         +file.getName());
		System.out.println("getParent: \n -> "       +file.getParent());
		System.out.println("getPath: \n -> "         +file.getPath());
		System.out.println("getAbsolutePath: \n -> " +file.getAbsolutePath());
		System.out.println("getParentFile: \n -> "   +file.getParentFile());
		
		long space  = file.getTotalSpace();
		double spaceKB = space / 1000; //1000 KB //1000000 MB //1000000000 GB
		System.out.println("getTotalSpace: \n -> "  + spaceKB+" KB");
		
		
	}

}
