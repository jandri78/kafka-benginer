package arrays;

public class DTMFAction {

	private String dtmf;
	private String stepId;
	private int level;

	public String getDtmf() {
		return dtmf;
	}

	public void setDtmf(String dtmf) {
		this.dtmf = dtmf;
	}

	public String getStepId() {
		return stepId;
	}

	public void setStepId(String stepId) {
		this.stepId = stepId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "DTMFAction [dtmf=" + dtmf + ", stepId=" + stepId + ", level=" + level + "]";
	}

}
