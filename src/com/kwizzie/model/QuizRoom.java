package com.kwizzie.model;

public abstract class QuizRoom {
	protected LeaderBoard leaderBoard;
	protected String description;
	protected String roomName;
	protected String roomID;
	
	public LeaderBoard getLeaderBoard() {
		return leaderBoard;
	}
	public void setLeaderBoard(LeaderBoard leaderBoard) {
		this.leaderBoard = leaderBoard;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	
}
