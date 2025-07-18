package model;

public class Customer {
	private User user;
    private String memberStatus;
    private String memberNo;
   
    public Customer() {}
    public Customer(User user, String memberStatus, String memberNo) {
    	this.user = user;
    	this.memberStatus = memberStatus;
    	this.memberNo = memberNo;
    }
    public User getUser() {
    	return user;
    }
    public void setUser(User user) {
    	this.user = user;
    }
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
}
