package tellafriend;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReferalProgramDTO referalProgramDTO = new ReferalProgramDTO();
		
		AdvocateRewardDTO advocateRewardDTO = new AdvocateRewardDTO();
		advocateRewardDTO.setCreationDate(new Date());
		advocateRewardDTO.setValueType(TellAFriendConstants.AMOUNT.toString());
		
		FriendRewardDTO friendRewardDTO = new FriendRewardDTO();
		friendRewardDTO.setCreationDate(new Date());
		friendRewardDTO.setStatus(false);
		friendRewardDTO.setTittle("friend");
		
		referalProgramDTO.setAdvocateReward(advocateRewardDTO);
		referalProgramDTO.setFriendReward(friendRewardDTO);
		
		System.out.println(referalProgramDTO.getAdvocateReward());
		System.out.println(referalProgramDTO.getFriendReward());
	}

}
