package com.liuxin.bean;

public class Goods {
	private int gid;
	private String gname;
	private String gEname;
	private int tid;
	private int zid;
	private String chicun;
	private double price;
	private int kcl;
	private String biaoqian;
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
	public String getGEname() {
		return gEname;
	}
	public void setGEname(String gEname) {
		this.gEname = gEname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getZid() {
		return zid;
	}
	public void setZid(int zid) {
		this.zid = zid;
	}
	public String getChicun() {
		return chicun;
	}
	public void setChicun(String chicun) {
		this.chicun = chicun;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getKcl() {
		return kcl;
	}
	public void setKcl(int kcl) {
		this.kcl = kcl;
	}
	public String getBiaoqian() {
		return biaoqian;
	}
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	public Goods(int gid, String gname, String gEname, int tid, int zid, String chicun, double price, int kcl,
			String biaoqian) {
		this.gid = gid;
		this.gname = gname;
		this.gEname = gEname;
		this.tid = tid;
		this.zid = zid;
		this.chicun = chicun;
		this.price = price;
		this.kcl = kcl;
		this.biaoqian = biaoqian;
	}
	public Goods() {
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gEname=" + gEname + ", tid=" + tid + ", zid=" + zid
				+ ", chicun=" + chicun + ", price=" + price + ", kcl=" + kcl + ", biaoqian=" + biaoqian + "]";
	}
	
	
}
