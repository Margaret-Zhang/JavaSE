package com.link.array.hotel;

public class Hotel {
	private Room[][] rooms;

	public Hotel() {
		rooms = new Room[3][10];
		for (int i = 0; i < 10; ++i) {
			rooms[0][i] = new Room(i + 101, "单人间", true);
		}

		for (int i = 0; i < 10; ++i) {
			rooms[1][i] = new Room(i + 201, "标准间", true);
		}

		for (int i = 0; i < 10; ++i) {
			rooms[2][i] = new Room(i + 301, "豪华间", true);
		}
	}

	public Room[][] getRooms() {
		return rooms;
	}

	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}

	public boolean orderRoom(int no) {
		int i = no / 100 - 1, j = no % 100 - 1;
		if (i >= 0 && i < rooms.length) {
			if (j >= 0 && j < rooms[i].length && rooms[i][j].isStatus() == true) {
				rooms[i][j].setStatus(false);
				System.out.println("订房成功！");
				return true;
			}
		}
		System.out.println("订房失败！请检查房间号以及空闲状态！");
		return false;
	}

	public boolean exitRoom(int no) {
		int i = no / 100 - 1, j = no % 100 - 1;
		if (i >= 0 && i < rooms.length) {
			if (j >= 0 && j < rooms[i].length && rooms[i][j].isStatus() == false) {
				rooms[i][j].setStatus(true);
				System.out.println("退房成功！");
				return true;
			}
		}
		System.out.println("退房失败！请检查房间号以及空闲状态！");
		return false;
	}

	public void printRoomsInformation() {
		for (int i = 0; i < rooms.length; ++i) {
			for (int j = 0; j < rooms[i].length; ++j) {
				System.out.println(rooms[i][j]);
			}
			System.out.println();
		}
	}
}
