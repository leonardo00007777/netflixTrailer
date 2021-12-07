package com.x62life.mo.model.category;

/*@Alias("category")*/
public class Category {
	
	private String id;
	private String subject;
	private String content;
	private String writer;
	private String registerDatetime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getregisterDatetime() {
		return registerDatetime;
	}
	public void setregisterDatetime(String registerDatetime) {
		this.registerDatetime = registerDatetime;
	}
	
}
