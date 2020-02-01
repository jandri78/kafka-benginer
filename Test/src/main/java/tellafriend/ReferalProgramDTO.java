package tellafriend;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class ReferalProgramDTO {

	@ApiModelProperty(notes = "Referalprogram Id autogenered", required = true)
	private long referalProgramId;
	
	@ApiModelProperty(notes = "Date of creation", required = true)
	private Date creationDate;

	@ApiModelProperty(notes = "It's the shop Object", required = true)
	private Merchant merchant;

	@ApiModelProperty(notes = "It's the template objects", required = true)
	private ReferalProgramStyle referalProgramStyle;
	
	@ApiModelProperty(notes = "Share Channels where we send our promotions", required = true)
	private ReferalProgramShareChannel referalProgramShareChannel;
	
	@ApiModelProperty(notes = "Contact information", required = true)
	private ReferalProgramContactInformation referalProgramContactInformation;
	
	@ApiModelProperty(notes = "Friend Discount Rules", required = true)
	private FriendRewardDTO friendReward;
	
	@ApiModelProperty(notes = "Advocate Discount Rules", required = true)
	private AdvocateRewardDTO AdvocateReward;
	
	@ApiModelProperty(notes = "Status of the ReferalProgram", required = true)
	private boolean status;
	
	
	public long getReferalProgramId() {
		return referalProgramId;
	}
	public void setReferalProgramId(long referalProgramId) {
		this.referalProgramId = referalProgramId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public ReferalProgramStyle getReferalProgramStyle() {
		return referalProgramStyle;
	}
	public void setReferalProgramStyle(ReferalProgramStyle referalProgramStyle) {
		this.referalProgramStyle = referalProgramStyle;
	}
	public ReferalProgramShareChannel getReferalProgramShareChannel() {
		return referalProgramShareChannel;
	}
	public void setReferalProgramShareChannel(ReferalProgramShareChannel referalProgramShareChannel) {
		this.referalProgramShareChannel = referalProgramShareChannel;
	}
	public ReferalProgramContactInformation getReferalProgramContactInformation() {
		return referalProgramContactInformation;
	}
	public void setReferalProgramContactInformation(ReferalProgramContactInformation referalProgramContactInformation) {
		this.referalProgramContactInformation = referalProgramContactInformation;
	}
	public FriendRewardDTO getFriendReward() {
		return friendReward;
	}
	public void setFriendReward(FriendRewardDTO friendReward) {
		this.friendReward = friendReward;
	}
	public AdvocateRewardDTO getAdvocateReward() {
		return AdvocateReward;
	}
	public void setAdvocateReward(AdvocateRewardDTO advocateReward) {
		AdvocateReward = advocateReward;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ReferalProgramDTO [referalProgramId=" + referalProgramId + ", creationDate=" + creationDate
				+ ", merchant=" + merchant + ", referalProgramStyle=" + referalProgramStyle
				+ ", referalProgramShareChannel=" + referalProgramShareChannel + ", referalProgramContactInformation="
				+ referalProgramContactInformation + ", friendReward=" + friendReward + ", AdvocateReward="
				+ AdvocateReward + ", status=" + status + "]";
	}
	

}
