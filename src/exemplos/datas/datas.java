package exemplos.datas;

/**
 * AUTHOR. M.R.C. - 10/22.
 *
 * Classe com exemplos de como usar DATAS
 */

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class datas {

	public static void main(String[] args) {

//REFERENCIA: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

		// * *\\
		instanciarDataComNumeros(2022, 12, 30);

		// * *\\
		getDataLocal();

		// * *\\
		getDataLocalComHora();

		// * *\\
		getDataHoraGlobal();

		// * *\\
		instanciarDataLocalDeStringFormatada("07/10/2022", "dd/MM/yyyy");

		// * *\\
		mostrarDataLocalFormatada();

		// * Formatar data global *\\
		// * Para formatar uma data global é precisa informar o fuzorario *\\
		mostrarDataGlobalFormatada(Instant.now(), "dd/MM/yyyy HH:mm", ZoneId.systemDefault());

		System.out.println("//* - - - - -- -- - - - -- - - - - - - --  - - -- - - - *\\");
		System.out.println("* Conversoes e Calculos -- - - - - - - --  - - -- - - - *\\");

		// * Conversão de Data Global para Data Local *\\
		converterDtGlobal2DtLocal();

		// * Data Local *\\
		calculosDataLocal();

		// * Data Global *\\
		calculosDataGlobal();

	}

	public static void instanciarDataComNumeros(int ano, int mes, int dia) {
		LocalDate dataLocal = LocalDate.of(ano, mes, dia);
		System.out.println("Data local instanciada com numeros: " + dataLocal);
	}

	public static void getDataLocal() {
		LocalDate dataLocal = LocalDate.now();
		System.out.println("Data local de agora: " + dataLocal);
	}

	public static void getDataLocalComHora() {
		LocalDateTime dataLocalComHora = LocalDateTime.now();
		System.out.println("Data local de agora: " + dataLocalComHora);
	}

	public static void getDataHoraGlobal() {
		Instant dataGlobalComHora = Instant.now();
		System.out.println("Data local de agora: " + dataGlobalComHora);
	}

	public static void instanciarDataLocalDeStringFormatada(String stringData, String formatadoDaData) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern(formatadoDaData);
		LocalDate dLocal02 = LocalDate.parse(stringData, formato);
		System.out.println("Data instanciada de formatacao: " + dLocal02);
	}

	public static void mostrarDataLocalFormatada() {
		LocalDate dataLocal = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data formatada local: " + dataLocal.format(formato));
	}

	public static void mostrarDataGlobalFormatada(Instant dataUTC, String stringFormato, ZoneId zonaId) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern(stringFormato).withZone(zonaId);
		System.out.println("Data formatada global: " + formato.format(dataUTC));
	}

	public static void converterDtGlobal2DtLocal() {
		Instant dtGlobal = Instant.parse("2022-07-20T01:03:26Z"); // 1:30 da manha horario de londres - no Br -3H
		LocalDate dtLocal = LocalDate.ofInstant(dtGlobal, ZoneId.systemDefault());

		System.out.println("(Conversao de global para local) Data local é -3H da global: " + dtLocal);
	}

	public static void calculosDataLocal() {
		LocalDateTime dtLocalTimeNow = LocalDateTime.now();

		LocalDateTime dtMaisDias = dtLocalTimeNow.minusDays(7);
		LocalDateTime dtMenosDias = dtLocalTimeNow.plusDays(7);

		System.out.println("Data Local Now + 7 dias: " + dtMaisDias);
		System.out.println("Data Local Now - 7 dias: " + dtMenosDias);
	}

	public static void calculosDataGlobal() {
		Instant dtGlobalTimeNow = Instant.now();

		Instant dtMaisDias = dtGlobalTimeNow.minus(7, ChronoUnit.DAYS);
		Instant dtMenosDias = dtGlobalTimeNow.plus(7, ChronoUnit.DAYS);

		System.out.println("Data Global Now + 7 dias: " + dtMaisDias);
		System.out.println("Data Global Now - 7 dias: " + dtMenosDias);
	}

}
