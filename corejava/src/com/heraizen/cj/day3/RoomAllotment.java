package com.heraizen.cj.day3;
import java.util.*;

public class RoomAllotment {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter Total no. of Rooms:");
		int totalrooms = readVal.nextInt();
		
		System.out.println("Enter Total Capacity of Rooms:");
		int capacityOfRooms = readVal.nextInt();
		
		System.out.println("Enter Total no. of Peoples:");
		int totalPeople = readVal.nextInt();
		int people =1;
		if(totalPeople <= totalrooms*capacityOfRooms) {
			int requiredRoom =  totalPeople / capacityOfRooms ;
			int[][] allotedPeoples = new int[totalrooms][capacityOfRooms];
			
			for(int i=0;i< totalrooms;i++) {
				for(int j=0;j< capacityOfRooms;j++ ) {
					
					if(people <= totalPeople) {
						allotedPeoples[i][j] = people;
						people++;
					}else {
						allotedPeoples[i][j] = 0;
						
					}
				}
				
			}
			int cal=1;
			for(int[] x:allotedPeoples) {
				System.out.println("Peoples Alloted for Room ---> "+cal);
				System.out.println(Arrays.toString(x));
				System.out.println("\n");
				cal++;
			}
			
			
			
		}else {
			System.out.printf("\nThe rooms where not be allocated for %d peoples",totalPeople);
		}
		
		readVal.close();

	}

}
