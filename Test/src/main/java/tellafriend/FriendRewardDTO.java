package tellafriend;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Andres
 * 
 *
 */

public class FriendRewardDTO extends ReferalProgramRewardConfiguration {
	
	@ApiModelProperty(notes = "Discount Id autogenered", required = true)
	private long discountID;
	
	@ApiModelProperty(notes = "Discount Id from shop")
	private String shopDiscountID;
	
	@ApiModelProperty(notes = "It's the status of the Reward", required = true)
	private boolean status;
	
	@ApiModelProperty(notes = "It's the modify Date ", required = true)
	private Date lastUpdate;
	
	@ApiModelProperty(notes = "It's the variable who limits the use of the codes")
	private int usageLimit;
	
	@ApiModelProperty(notes = "It's the initial date of the discount will be available", required = true)
	private Date startDate;
	
	@ApiModelProperty(notes = "It's the end date of the discount will be available", required = true)
	private Date endDate;
	
	@ApiModelProperty(notes = "The minimum subtotal for the price rule to be applicable", required = true)
	private double prerequisite_subtotal_range;
	
	public long getDiscountID() {
		return discountID;
	}
	public void setDiscountID(long discountID) {
		this.discountID = discountID;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public int getUsageLimit() {
		return usageLimit;
	}
	public void setUsageLimit(int usageLimit) {
		this.usageLimit = usageLimit;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getPrerequisite_subtotal_range() {
		return prerequisite_subtotal_range;
	}
	public void setPrerequisite_subtotal_range(double prerequisite_subtotal_range) {
		this.prerequisite_subtotal_range = prerequisite_subtotal_range;
	}
	public String getShopDiscountID() {
		return shopDiscountID;
	}
	public void setShopDiscountID(String shopDiscountID) {
		this.shopDiscountID = shopDiscountID;
	}
	@Override
	public String toString() {
		return "FriendRewardDTO [discountID=" + discountID + ", shopDiscountID=" + shopDiscountID + ", status=" + status
				+ ", lastUpdate=" + lastUpdate + ", usageLimit=" + usageLimit + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", prerequisite_subtotal_range=" + prerequisite_subtotal_range
				+ ", getValueType()=" + getValueType() + ", getValue()=" + getValue() + ", getMaximumOrderAmount()="
				+ getMaximumOrderAmount() + ", getMinimumOrderAmount()=" + getMinimumOrderAmount() + ", getTittle()="
				+ getTittle() + ", getCreationDate()=" + getCreationDate() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
