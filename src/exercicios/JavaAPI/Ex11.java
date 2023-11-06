package exercicios.JavaAPI;

public class Ex11 {

	public static void main(String[] args) {
		boolean flag = false;
		do {
			if (flag = !flag) { //Line n1
				System.out.print(1); //Line n2
				continue; //Line n3
			}
			System.out.print(2); //Line n4
		} while (flag); //Line n5
	}
}
