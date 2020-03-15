package by.jonline.four.class10;

import by.jonline.four.class10.Airline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class AirlineLogic {
	
	private static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
	private static SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
	
	private static ArrayList <Airline> plains = new ArrayList<>();
	
	public static void setPlain (Airline plain) {
		plains.add(plain);
	}
	
	/** Prints all plains of "plains" ArrayList with same destination as a "string" argument */
	public static void findPlaneByDestination(String str) {
		System.out.println("");
		System.out.println("список рейсов для пункта назначения " + str);
		for (Airline i : plains) {
			if (str.equals(i.getDestination())) {
				outAirline(i);
			}
		}
	}
	
	/** Prints all plains of "plains" ArrayList with same Date of "day" field as a "string" argument */
	public static void findPlaneByDay(String str) {
		Date temp = new Date();
		try {
			temp = dayFormat.parse(str);
		} catch (ParseException e) {
			System.out.println(str + " - недопустимый формат дня!\n");
			e.printStackTrace();
			return;
		}
		str = dayFormat.format(temp);
		System.out.println("");
		System.out.println("список рейсов отправляющихся в  " + str);
		for (Airline i : plains) {
			for (int j = 0; j < i.getDay().length; j++) {
				Date day = i.getDay()[j];
				String txtDay = dayFormat.format(day);
				if (txtDay.equals(str)) {
					outAirline(i);
				}
			}
		}
	}
	
	/**
	 * Prints all plains of "plains" ArrayList with same Date of "day" field as a "string" argument
	 * and time more than String "strTime"
	 */
	public static void findPlaneByDay(String strDay, String strTime) {
		
		Date tempTime = stringToTime(strTime);
		Date temp = new Date();
		try {
			temp = dayFormat.parse(strDay);
		} catch (ParseException e) {
			System.out.println(strDay + " - недопустимый формат дня!\n");
			e.printStackTrace();
			return;
		}
		strDay = dayFormat.format(temp);
		System.out.println("");
		System.out.println("список рейсов отправляющихся в  " + strDay + " после " + strTime);
		for (Airline i : plains) {
			for (int j = 0; j < i.getDay().length; j++) {
				Date day = i.getDay()[j];
				String txtDay = dayFormat.format(day);
				if (txtDay.equals(strDay) && i.getTime().compareTo(tempTime) == 1) {
					outAirline(i);
				}
			}
		}
	}
	
	/** Parses String time to Date time  */
	public static Date stringToTime (String time) {
		try {
			return timeFormat.parse(time);
		} catch (ParseException e) {
			System.out.println(time + " - не допустимый формат времени!");
			e.printStackTrace();
			return new Date();
		}
	}
	
	/**
	 * Splits String day to days [] array
	 * Parses days [] array to Date [] day
	 */
	public static Date[] stringToDayArr (String str) {
		try {
			String days []  = str.split("[ ,]?[ ,]");
			Date [] day = new Date [days.length];
			for (int i = 0; i < days.length; i++) {
				day[i] = dayFormat.parse(days[i]);
			}
			return day;
		} catch (ParseException e) {
			System.out.println(str + " - недопустимый формат дня!\n");
			e.printStackTrace();
			Date [] day = new Date [0];
			return day;
		}
	}
	
	private static String getTimeString(Airline plain) {
		return timeFormat.format(plain.getTime());
	}
	
	private static String getDayString(Airline plain) {
		String out ="";
		for (Date i : plain.getDay()) {
			out += dayFormat.format(i) + ", ";
		}
		return out.substring(0, out.length()-2);
	}
	
	
	private static void outAirline(Airline plain) {
		System.out.format("%4d | %12s | %10s | %5s | %5s\n", plain.getFlightNumber(), plain.getAirplane(), plain.getDestination(), getTimeString(plain), getDayString(plain));
	}

}
