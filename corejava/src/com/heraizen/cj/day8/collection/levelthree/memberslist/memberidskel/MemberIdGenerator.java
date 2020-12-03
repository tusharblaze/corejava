package com.heraizen.cj.day8.collection.levelthree.memberslist.memberidskel;

public class MemberIdGenerator {
	private static int count = 5005;
	public static String suffix = "IND";
	public static String prifix = "ASHO";

	public  String getMemeberId() {
		count++;
		return (prifix +(count)+suffix);
	}
}
