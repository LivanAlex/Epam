package by.jonline.four.class06;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {
	
	private int hours;
	private int minutes;
	private int seconds;
	private long time; //86339

	public Time() {
		setDefaultTime();
	}
	
	public Time(int hh, int mm, int ss) {
		setTime(hh, mm, ss);
	}
	
	public Time(String time) {
		Integer [] hms = parse(time);
		setTime(hms[0], hms[1], hms[2]);
	}
	
	
	/**
	 * Returns Integer[] array with hours (array[0]) minutes (array[1]) and seconds (array[2]) in positive parse way.
	 * On negative - returns Integer[] array with default time {0,0,0}
	 */
	private Integer[] parse(String time) {
		ArrayList <Integer> hms = new ArrayList<>();
		Integer[] array = new Integer[] {0,0,0};
		Pattern pat = Pattern.compile("[0-9]+");
		Matcher mat = pat.matcher(time);
	
		while (mat.find()) {
			hms.add(Integer.valueOf(mat.group()));
				if(hms.size() > 3) {
					errorMessage();
					return array;
				}
		}
		if (hms.size() == 3){
			array = hms.toArray(array);
			return array;
		} else {
			errorMessage();
			return array;
		}
	}

	
	/** Fills all Time fields by zero by default and in case of exception or check fails */
	private void setDefaultTime() {
		hours = 0;
		minutes = 0;
		seconds = 0;
		time = 0;
	}
	
	
	/**
	 * Checks int (hh mm ss) for [0:24) [0:60) [0:60) values
	 * fills hours minutes seconds fields
	 * or uses constrDefault() in case of check fails
	 */
	private void setTime(int hours, int minutes, int seconds) {
		if ((hours >= 0 && hours < 24)&&(minutes >= 0 && minutes < 60)&&(seconds >= 0 && seconds < 60)) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
			this.time = seconds + (minutes + hours * 60) * 60;
		} else {
			setDefaultTime();
			errorMessage ();
		}
		
	}
	
	public void setTime(String time) {
		Integer [] hms = parse(time);
		setTime(hms[0], hms[1], hms[2]);
	}
	
	
	/** Sets hour with [0:24) check. Sets hours to zero with error message in case of check fail */
	public void setHours(int hours) {
		addHours(this.hours * (-1));
		if (hours >= 0 && hours < 24) {
			addHours(hours);
		} else {
			errorMessage ();
		}
	}
	
	
	/** Sets minutes with [0:60) check. Sets minutes to zero with error message in case of check fail */
	public void setMinutes(int minutes) {
		addMinutes(this.minutes * (-1));
		if (minutes >= 0 && minutes < 60) {
			addMinutes(minutes);
		} else {
			errorMessage ();
		}
	}

	
	/** Sets seconds with [0:60) check. Sets seconds to zero with error message in case of check fail */
	public void setSeconds(int seconds) {
		addSeconds(this.seconds * (-1));
		if (seconds >= 0 && seconds < 60) {
			addSeconds(seconds);
		} else {
			errorMessage ();
		}
	}
	
	
	private void errorMessage () {
		System.out.print("Вы допустили ошибку при вводе данных!\n");
	}
	
	
	/** Adds hours to time */
	public void addHours(int hours) {
		time += (hours * 60 * 60);
		timeToHMS();
	}
	
	
	/** Adds minutes to time */
	public void addMinutes(int minutes) {
		time += (minutes * 60);
		timeToHMS();
	}
	
	
	/** Adds seconds to time */
	public void addSeconds(int seconds) {
		time += seconds;
		timeToHMS();
	}
	
	
	/**
	 * Checks and sets time for 00:00:00 - 23:59:59 period
	 * when other methods adds hours, minutes or seconds
	 * 00:00:00 - 10 ss = 23:59:50
	 * 23:50:00 + 20 mm = 00:10:00
	 * 00:00:00 + 25 hh = 01:00:00
	 */
	private void timeToHMS () {
		while (time > 86339) {
			time -= 86400;
		}
		while (time < 0) {
			time += 86400;
		}
		hours = (int) time / (60*60);
		minutes = (int) (time % (60*60))/60;
		seconds = (int) (time % (60*60))%60;
	}
	
	
	/** Print */
	public void printTime () {
		System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
}
