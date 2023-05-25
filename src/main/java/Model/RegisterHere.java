package Model;

public class RegisterHere {
	private int regno;
    private String fname;
    private String MobNo;
    private String uname;
    private String pass;
    private double Amount;
	public RegisterHere(int regno, String fname, String mobNo, String uname, String pass, double Amount) {
		super();
		this.regno = regno;
		this.fname = fname;
		this.MobNo = mobNo;
		this.uname = uname;
		this.pass = pass;
		this.Amount = Amount;
	}
	public RegisterHere(int parseInt, String fname2) {
		// TODO Auto-generated constructor stub
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMobNo() {
		return MobNo;
	}
	public void setMobNo(String mobNo) {
		MobNo = mobNo;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmtount(double Amount) {
		Amount = Amount;
	}
	
    
    
}
