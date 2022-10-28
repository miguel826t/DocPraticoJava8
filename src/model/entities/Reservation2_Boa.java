package model.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation2_Boa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	public Reservation2_Boa(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Data de saida deve ser depois da data de entrada.");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	/* ==* Esse metodo ira propagar a excecao DomainException *== */
	public void UpdateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Data para atualização deve ser posterior a data atual.");
		}
		
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Data de saida deve ser depois da data de entrada.");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public long Duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MICROSECONDS);
	}
	
	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		
		build.append("Quarto: "+ this.roomNumber);
		build.append(", ");
		build.append("Data de entrada: "+ dtFormat.format(checkIn));
		build.append(", ");
		build.append("Data de saida: "  + dtFormat.format(checkOut));
		build.append(", ");
		build.append("Noites: "+Duration());
		
		return build.toString();
	}
	
}
