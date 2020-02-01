package tellafriend;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Andres
 * */

public class AdvocateRewardDTO extends ReferalProgramRewardConfiguration{

	@ApiModelProperty(notes = "Discount Id autogenered", required = true)
	private String discountID;
	
	@ApiModelProperty(notes = "Discount Id autogenered", required = true)
	private boolean status;
	
	@ApiModelProperty(notes = "Discount Id autogenered", required = true)
	private AdvocateDTO advocate;
	
	public String getDiscountID() {
		return discountID;
	}
	public void setDiscountID(String discountID) {
		this.discountID = discountID;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public AdvocateDTO getAdvocate() {
		return advocate;
	}
	public void setAdvocate(AdvocateDTO advocate) {
		this.advocate = advocate;
	}
	public AdvocateRewardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdvocateRewardDTO [discountID=" + discountID + ", status=" + status + ", advocate=" + advocate
				+ ", getValueType()=" + getValueType() + ", getValue()=" + getValue() + ", getMaximumOrderAmount()="
				+ getMaximumOrderAmount() + ", getMinimumOrderAmount()=" + getMinimumOrderAmount() + ", getTittle()="
				+ getTittle() + ", getCreationDate()=" + getCreationDate() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	
}
