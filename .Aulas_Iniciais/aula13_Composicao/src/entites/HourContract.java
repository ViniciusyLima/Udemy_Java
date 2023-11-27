package entites;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePoerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuePoerHour, Integer hours) {
		this.date = date;
		this.valuePoerHour = valuePoerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePoerHour() {
		return valuePoerHour;
	}

	public void setValuePoerHour(Double valuePoerHour) {
		this.valuePoerHour = valuePoerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePoerHour * hours;
	}
	
}

