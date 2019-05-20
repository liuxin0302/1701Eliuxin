package com.bawei.bean;

public class Goods {
	private int gid;
	private String gname;
	private double price;
	private String gdate;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGdate() {
		return gdate;
	}
	public void setGdate(String gdate) {
		this.gdate = gdate;
	}
	public Goods(String gname, double price, String gdate) {
		super();
		this.gname = gname;
		this.price = price;
		this.gdate = gdate;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", gdate=" + gdate + "]";
	}
	
}
