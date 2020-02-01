package tellafriend;

import java.util.Date;

public abstract class ReferalProgramRewardConfiguration {
	
	private String valueType;
	private double value;
	private int maximumOrderAmount;
	private int minimumOrderAmount;
	private String tittle;
	private Date creationDate;
	
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public int getMaximumOrderAmount() {
		return maximumOrderAmount;
	}
	public void setMaximumOrderAmount(int maximumOrderAmount) {
		this.maximumOrderAmount = maximumOrderAmount;
	}
	public int getMinimumOrderAmount() {
		return minimumOrderAmount;
	}
	public void setMinimumOrderAmount(int minimumOrderAmount) {
		this.minimumOrderAmount = minimumOrderAmount;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@Override
	public String toString() {
		return "ReferalProgramRewardConfiguration [valueType=" + valueType + ", value=" + value
				+ ", maximumOrderAmount=" + maximumOrderAmount + ", minimumOrderAmount=" + minimumOrderAmount
				+ ", tittle=" + tittle + ", creationDate=" + creationDate + "]";
	}

	

}
