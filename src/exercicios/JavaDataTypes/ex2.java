package exercicios.JavaDataTypes;

import java.time.LocalTime;


public class ex2 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(24, 50);
        System.out.println(time);
        
        //Erro pois o LocalTime não aceita valores fora do escopo (0-23 | 0-59)
	}

}
