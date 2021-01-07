package application;

public class BilgilerLogin {
	private int id;
	private String adi;
	private String mail;
	private String sifre;
	public BilgilerLogin(int id, String adi, String mail, String sifre) {
		super();
		this.id = id;
		this.adi = adi;
		this.mail = mail;
		this.sifre = sifre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	

}
