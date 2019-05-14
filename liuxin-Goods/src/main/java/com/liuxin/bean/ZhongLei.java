package com.liuxin.bean;

public class ZhongLei {
	private int zid;
	private String zname;
	public int getZid() {
		return zid;
	}
	public void setZid(int zid) {
		this.zid = zid;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	public ZhongLei(int zid, String zname) {
		this.zid = zid;
		this.zname = zname;
	}
	public ZhongLei() {
	}
	@Override
	public String toString() {
		return "ZhongLei [zid=" + zid + ", zname=" + zname + "]";
	}
	
}
