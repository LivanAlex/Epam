package by.jonline.four.class04;

import static by.jonline.four.class04.TrainLogic.*;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.

public class Train {
	private String station;
	private int trainNum;
	private String time;
	
	public Train(String station, int trainNum, String time) {
		this.station = station;
		this.trainNum = trainNum;
		this.time = time;
		setTrain(this);
	}
	
	public Train() {
		setTrain(this);
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public int getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}

