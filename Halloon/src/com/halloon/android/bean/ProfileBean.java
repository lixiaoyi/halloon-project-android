package com.halloon.android.bean;

public class ProfileBean {
	private String openId;
	private String nick;
	private String name;
	private String head;
	private String sex;
	private TweetBean tweetBean;
	private String introduction;
	private String location;
	private String tag;
	private String tweetNum;
	private String fansNum;
	private String idolNum;
	private String favNum;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TweetBean getTweetBean() {
		return tweetBean;
	}

	public void setTweetBean(TweetBean tweetBean) {
		this.tweetBean = tweetBean;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTweetNum() {
		return tweetNum;
	}

	public void setTweetNum(String tweetNum) {
		this.tweetNum = tweetNum;
	}

	public String getFansNum() {
		return fansNum;
	}

	public void setFansNum(String fansNum) {
		this.fansNum = fansNum;
	}

	public String getIdolNum() {
		return idolNum;
	}

	public void setIdolNum(String idolNum) {
		this.idolNum = idolNum;
	}

	public String getFavNum() {
		return favNum;
	}

	public void setFavNum(String favNum) {
		this.favNum = favNum;
	}

	@Override
	public String toString() {
		return openId + " " + nick + " " + name + " " + head + " " + sex + " "
				+ introduction + " " + location + " " + tweetNum + " "
				+ fansNum + " " + idolNum;
	}
}
