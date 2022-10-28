package exemplos.excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation1_Ruim;
import model.entities.Reservation2_Boa;
import model.exceptions.DomainException;

/**
 * Classe exemplo de modelo ruim de solucao para excocoes Dependencias:
 * entities.Reservation1_Ruim Obs: Melhor pratica
 * 
 * Vantagens: -> Logica fica delegada a entidade -> Podemos tratar excecoes no
 * construtor -> Auxilio do compilador -> Codigo mais simples (sem ifs e elses)
 * AULA: 176
 */
public class Exemplo2_Boa {

	static SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/* ==* Todas as excecoes seram tradas nos catch *== */
		try {

			System.out.print("Numero do quarto: ");
			int roomNumber = sc.nextInt();

			System.out.println("Data de entrada (dd/mm/yyyy): ");
			Date checkIn = dtFormat.parse(sc.next());

			System.out.println("Data de saida (dd/mm/yyyy): ");
			Date checkOut = dtFormat.parse(sc.next());

			Reservation2_Boa reservation = new Reservation2_Boa(roomNumber, checkIn, checkOut);
			System.out.println("Reserva: " + reservation.toString());
//******
			System.out.println("");
			System.out.println("Entre com as informacoes para atualizar as datas");

			System.out.println("Data de entrada (dd/mm/yyyy): ");
			checkIn = dtFormat.parse(sc.next());

			System.out.println("Data de saida (dd/mm/yyyy): ");
			checkOut = dtFormat.parse(sc.next());

			reservation.UpdateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());

		} catch (ParseException e) {
			System.err.println("Formato da data invalido.");
		}
		/* ==* Excecao personalidada para a classe Reservation *== */
		catch (DomainException e) {
			System.err.println("Erro na reserva: " + e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("Erro inesperado: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
