package org.demo5.com;

public class Main {
	public static void main(String[]args) {
		TollBoothRevenueManager manager=TollBoothRevenueManagerUtil.acceptRecord();
		TollBoothRevenueManagerUtil.menuList(manager);
	}

}
