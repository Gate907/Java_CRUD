
public class Student {
	private int sid,smarks;
	private String snm;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public String getSnm() {
		return snm;
	}
	public void setSnm(String snm) {
		this.snm = snm;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", smarks=" + smarks + ", snm=" + snm + "]";
	}
	
	
}
