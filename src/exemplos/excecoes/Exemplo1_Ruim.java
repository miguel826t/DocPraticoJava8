package exemplos.excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation1_Ruim;

/**
 * Classe exemplo de modelo ruim de solucao para excocoes Dependencias:
 * entities.Reservation1_Ruim Obs: Solução ruim (sem excecoes) por conta de toda
 * a logica e validação estar no programa.
 * 
 * AULA: 174
 */
public class Exemplo1_Ruim {

	static SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		System.out.print("Numero do quarto: ");
		int roomNumber = sc.nextInt();

		System.out.println("Data de entrada (dd/mm/yyyy): ");
		Date checkIn = dtFormat.parse(sc.next());

		System.out.println("Data de saida (dd/mm/yyyy): ");
		Date checkOut = dtFormat.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.err.println("Erro na reserva, Data de saida deve ser maior que a data de entrada");
		} else {
			Reservation1_Ruim reservation = new Reservation1_Ruim(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());

			System.out.println("");
			System.out.println("Entre com as informacoes para atualizar as datas");

			System.out.println("Data de entrada (dd/mm/yyyy): ");
			checkIn = dtFormat.parse(sc.next());

			System.out.println("Data de saida (dd/mm/yyyy): ");
			checkOut = dtFormat.parse(sc.next());

			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.err.println("Erro na reserva, as datas devem ser datas futuras");
			} else if (!checkOut.after(checkIn)) {
				System.err.println("Erro na reserva, Data de saida deve ser maior que a data de entrada");
			} else {
				reservation.UpdateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation.toString());
			}
		}
	}
}
