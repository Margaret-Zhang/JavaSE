package com.link.array.hotel;

/*
酒店的房间
*/

public class Room {
	private int no; // 房间编号
	private String type; // 房间类型
	private boolean status; // 房间空闲状态

	public Room(int no, String type, boolean status) {
		this.no = no;
		this.type = type;
		this.status = status;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "房间编号：" + no + "， 房间类型：" + type + "， 是否空闲：" + status;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Room))
			return false;
		if (obj == this)
			return true;
		Room room = (Room) obj;
		return (room.no == this.no);
	}
}
