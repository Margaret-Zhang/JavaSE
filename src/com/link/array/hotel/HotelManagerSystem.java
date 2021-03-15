package com.link.array.hotel;

import java.util.Scanner;

public class HotelManagerSystem {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		menu(hotel);
	}

	public static void menu(Hotel hotel) {
		int choice;
		int roomNo;
		Scanner scanner = new Scanner(System.in);

		System.out.println("欢迎使用酒店管理系统");
		while (true) {
			System.out.println("\n\n\n1. 订 房");
			System.out.println("2. 退 房");
			System.out.println("3. 查看房间列表");
			System.out.println("4. 退 出");
			System.out.print("请输入您的选择：");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.print("请输入要预订的房间编号：");
				roomNo = scanner.nextInt();
				hotel.orderRoom(roomNo);
			}
				break;
			case 2: {
				System.out.print("请输入要退出的房间编号：");
				roomNo = scanner.nextInt();
				hotel.exitRoom(roomNo);
			}
				break;
			case 3:
				hotel.printRoomsInformation();
				break;
			case 4:
				System.out.println("感谢使用酒店管理系统");
				scanner.close();
				return;
			default:
				break;
			}
		}
	}
}
