package com.entity;

public class Articles {
	
	private int articleid;
	private String title;
	private String type;
	private String link;
	
	public Articles()
	{
		
	}

	public Articles(int articleid, String title, String type, String link) {
		super();
		this.articleid = articleid;
		this.title = title;
		this.type = type;
		this.link = link;
		
		
	}

	public Articles(String title, String type, String link) {
		super();
		this.title = title;
		this.type = type;
		this.link = link;
		
	}

	public int getArticleid() {
		return articleid;
	}

	public void setArticleid(int articleid) {
		this.articleid = articleid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}
 
	public void setType(String type) {
		this.type = type;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Articles [articleid=" + articleid + ", title=" + title + ", type=" + type + ", link=" + link + "]";
	}


}
