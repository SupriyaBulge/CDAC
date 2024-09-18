package org.demo3.com;

public class Main {
	public static void main(String[] args) {
		BMITracker tracker = BMITrackerUtil.acceptRecord();
		BMITrackerUtil.menuList(tracker);
	}
}
