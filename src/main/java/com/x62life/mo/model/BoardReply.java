package com.x62life.mo.model;

public class BoardReply {
	
	private String replyId;
	private String boardId;
	private String parentId;
	private String depth;
	private String replyContent;
	private String replyWriter;
	private String replyPassword;
	private String registerDatetime;
	
	public String getreplyId() {
		return replyId;
	}
	public void setreplyId(String replyId) {
		this.replyId = replyId;
	}
	public String getboardId() {
		return boardId;
	}
	public void setboardId(String boardId) {
		this.boardId = boardId;
	}
	public String getparentId() {
		return parentId;
	}
	public void setparentId(String parentId) {
		this.parentId = parentId;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	public String getreplyContent() {
		return replyContent;
	}
	public void setreplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getreplyWriter() {
		return replyWriter;
	}
	public void setreplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}
	public String getreplyPassword() {
		return replyPassword;
	}
	public void setreplyPassword(String replyPassword) {
		this.replyPassword = replyPassword;
	}
	public String getregisterDatetime() {
		return registerDatetime;
	}
	public void setregisterDatetime(String registerDatetime) {
		this.registerDatetime = registerDatetime;
	}
	
}
