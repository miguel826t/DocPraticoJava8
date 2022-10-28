package model.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation1_Ruim implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	public Reservation1_Ruim(Integer roomNumber, Date checkIn, Date checkOut) {
		super();
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
	
	public void UpdateDates(Date checkIn, Date checkOut) {
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
