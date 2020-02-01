package tellafriend;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class PurchaseDTO {

	@ApiModelProperty(notes = "pusrchase Id autogenered", required = true)
	private long purchaseId;
	
	@ApiModelProperty(notes = "advocate Id", required = true)
	private long advocateId;
	
	@ApiModelProperty(notes = "Create Date", required = true)
	private Date creationDate;
	
	@ApiModelProperty(notes = "It's the last update", required = true)
	private Date lastUpdate;
	
	@ApiModelProperty(notes = "Referal program Advocate Object", required = true)
	private ReferalProgramAdvocateDTO referalProgramAdvocateDTO;
	
	@ApiModelProperty(notes = "this is the friend's code who will be shared", required = true)
	private String discuontCode;
	
	@ApiModelProperty(notes = "Discount value represented in money")
	private double discountValue;
	
	@ApiModelProperty(notes = "Discount value represented in percentage")
	private double discountPercentage;
	
	@ApiModelProperty(notes = "This is the value of the purchase")
	private double totalpurchase;
	
	@ApiModelProperty(notes = "The friend name")
	private String friendName;
	
	@ApiModelProperty(notes = "The friend lastname")
	private String friendLastName;
	
	@ApiModelProperty(notes = "The friend mobile number")
	private String friendMobileNumber;
	
	@ApiModelProperty(notes = "The friend email")
	private String friendEmail;
	
	@ApiModelProperty(notes = "The friend Country")
	private String friendCountry;
	
	@ApiModelProperty(notes = "The friend city")
	private String friendCity;
	
	public long getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}
	public long getAdvocateId() {
		return advocateId;
	}
	public void setAdvocateId(long advocateId) {
		this.advocateId = advocateId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public ReferalProgramAdvocateDTO getReferalProgramAdvocateDTO() {
		return referalProgramAdvocateDTO;
	}
	public void setReferalProgramAdvocateDTO(ReferalProgramAdvocateDTO referalProgramAdvocateDTO) {
		this.referalProgramAdvocateDTO = referalProgramAdvocateDTO;
	}
	public String getDiscuontCode() {
		return discuontCode;
	}
	public void setDiscuontCode(String discuontCode) {
		this.discuontCode = discuontCode;
	}
	public double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public double getTotalpurchase() {
		return totalpurchase;
	}
	public void setTotalpurchase(double totalpurchase) {
		this.totalpurchase = totalpurchase;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public String getFriendLastName() {
		return friendLastName;
	}
	public void setFriendLastName(String friendLastName) {
		this.friendLastName = friendLastName;
	}
	public String getFriendMobileNumber() {
		return friendMobileNumber;
	}
	public void setFriendMobileNumber(String friendMobileNumber) {
		this.friendMobileNumber = friendMobileNumber;
	}
	public String getFriendEmail() {
		return friendEmail;
	}
	public void setFriendEmail(String friendEmail) {
		this.friendEmail = friendEmail;
	}
	public String getFriendCountry() {
		return friendCountry;
	}
	public void setFriendCountry(String friendCountry) {
		this.friendCountry = friendCountry;
	}
	public String getFriendCity() {
		return friendCity;
	}
	public void setFriendCity(String friendCity) {
		this.friendCity = friendCity;
	}
	@Override
	public String toString() {
		return "PurchaseDTO [purchaseId=" + purchaseId + ", advocateId=" + advocateId + ", creationDate=" + creationDate
				+ ", lastUpdate=" + lastUpdate + ", referalProgramAdvocateDTO=" + referalProgramAdvocateDTO
				+ ", discuontCode=" + discuontCode + ", discountValue=" + discountValue + ", discountPercentage="
				+ discountPercentage + ", totalpurchase=" + totalpurchase + ", friendName=" + friendName
				+ ", friendLastName=" + friendLastName + ", friendMobileNumber=" + friendMobileNumber + ", friendEmail="
				+ friendEmail + ", friendCountry=" + friendCountry + ", friendCity=" + friendCity + "]";
	}
	
	
}
