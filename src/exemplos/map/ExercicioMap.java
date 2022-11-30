package exemplos.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


public class ExercicioMap {

	public static void main(String[] args) {
		
		/* ======* Map com candidato/votos *====== */
		Map<String, Integer> votes = new LinkedHashMap<>();
		String path = ExercicioMap.class.getResource("MapCandidatos.csv").getPath();
		
		try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
			
			String line = buff.readLine();
			line = buff.readLine();
			while (line != null) {
				
				/* ======* 2 Campos *====== */
				String[] fields = line.split(";");
				
				
				String name = fields[0];
				int votos = Integer.parseInt(fields[1]);
				
				/* ======* Se existe já a chave só soma os votos *====== */
				if (votes.containsKey(name)) {
					int nVotes = votes.get(name);
					votes.put(name, nVotes + votos);
				}else {
					votes.put(name, votos);
				}

				line = buff.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.err.println("ERRO: " + e.getMessage());
		}
	}

}
