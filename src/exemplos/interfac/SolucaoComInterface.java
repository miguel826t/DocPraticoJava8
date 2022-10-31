package exemplos.interfac;
/**
 * Main classe do exercicio de interfaces
 * 
 * Obs: Utiliza todas as classes de model.entities.interfac
 * AULA: 227
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.interfac.AlugarCarro;
import model.entities.interfac.AluguelService;
import model.entities.interfac.Carro;
import model.entities.interfac.Fatura;
import model.entities.interfac.TaxaSP;

public class SolucaoComInterface {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			Locale.setDefault(Locale.US);
			DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			
			System.out.println("Entre com os dados do alugel");
			System.out.println("Modelo do carro: ");
			String carModel = sc.nextLine();
			System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
			LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtFormat);
			System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
			LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtFormat);
			
			AlugarCarro alugel = new AlugarCarro(start, finish, new Carro(carModel));
			
			System.out.println("Entre com o preco por hora: ");
			double pricePerHour = sc.nextDouble();
			System.out.println("Entre com o preco por dia: ");
			double pricePerDay = sc.nextDouble();
			
			AluguelService service = new AluguelService(pricePerHour,pricePerDay,new TaxaSP());		
			service.ProcessarAluguel(alugel);
			
			System.out.println("Fatura:");
			System.out.println("Pagamento basico: " + alugel.getFatura().getBasicPayment());
			System.out.println("Imposto: "+ alugel.getFatura().getTax());
			System.out.println("Pagamento total: "+ alugel.getFatura().getTotalPayment());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
