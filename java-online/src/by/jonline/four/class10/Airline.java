package by.jonline.four.class10;

import static by.jonline.four.class10.AirlineLogic.*;

import java.util.Arrays;
import java.util.Date;

/*
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 */

public class Airline {
	
	private String destination;
	private int flightNumber;
	private String airplane;
	private Date time;
	private Date [] day;
	
	public Airline() {
		setPlain(this);
	}
	
	public Airline(String destination, int flightNumber, String airplane, String time, String day) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplane = airplane;
		setTime(time);
		setDay(day);
		setPlain(this);
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplane() {
		return airplane;
	}

	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}
	
	/** Converts String time to Date time */
	public void setTime(String time) {
		setTime(stringToTime(time));
	}
	
	public Date[] getDay() {
		return day;
	}

	/** Converts String day to Date [] day */
	public  void setDay (String day) {
		setDay(stringToDayArr(day));
	}
	
	public  void setDay (Date[] day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airplane=" + airplane
				+ ", time=" + time + ", day= "+ Arrays.toString(day) + "]";
	}

	
	

}
