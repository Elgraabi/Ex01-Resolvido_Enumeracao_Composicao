package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private double valuePerHour = 0.0;
	private Integer hours = 0;
	
	public double totalValue() {
		return this.valuePerHour * this.hours;
	}
	
	public HourContract() {
		super();
	}

	public HourContract(Date date, double valuePerHour, Integer hours) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
}
