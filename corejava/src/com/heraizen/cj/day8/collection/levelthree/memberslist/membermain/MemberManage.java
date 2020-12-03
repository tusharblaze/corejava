package com.heraizen.cj.day8.collection.levelthree.memberslist.membermain;

import java.util.Scanner;

import com.heraizen.cj.day8.collection.levelthree.memberslist.memberidskel.MemberIdGenerator;
import com.heraizen.cj.day8.collection.levelthree.memberslist.memberservice.MemeberContainer;

public class MemberManage {

	public static void main(String[] args) {

		MemberIdGenerator genVal = MemeberContainer.getInstance();
		Scanner readVal = new Scanner(System.in);
		String name, city, country, id;

		while (true) {
			System.out.println("\n\n\t\t\t<++++++++++++++ Member List ++++++++++++>");
			System.out.println("1.Addmember\n\n" + "2.deleteMember\n\n" + "3.SearchById\n\n" + "4.searchByNameAndId\n\n"
					+ "5.displaySortingOrder\n\n" + "6.exit");

			System.out.printf("\n@> Enter Your Choice => ");
			int choice = readVal.nextInt();

			switch (choice) {

			case 1:
				System.out.printf("\n@> Enter Name of Member => ");
				readVal.nextLine();
				name = readVal.nextLine();
				System.out.printf("\n@> Enter City Name => ");
				
				city = readVal.nextLine();
				System.out.printf("\n@> Enter Country Name => ");
				country = readVal.nextLine();
				MemeberContainer.addMemeber(genVal.getMemeberId(), name, city, country);
				break;
			case 2:
				System.out.printf("\n@> Enter full ID of the Member => ");
				readVal.nextLine();
				id = readVal.nextLine();
				
				System.out.printf("%s",id);
				MemeberContainer.deleteMember(id);
				break;
			case 3:
				System.out.printf("\n@> Enter full ID of the Member => ");
				id = readVal.nextLine();
				MemeberContainer.searchById(id);
				break;
			case 4:
				MemeberContainer.searchMember(5006, "Tushar");
				break;
			case 5:
				System.out.println("\n\n\t\t\t<----------- Sort By -------------->");
				System.out.println("\n1.Ascending Wise\t\t2.Descending Wise");
				System.out.printf("\n\n@> Enter Your Choice = ");
				int choose = readVal.nextInt();
				if(choose == 1) {
					MemeberContainer.displaySortingOrder("aesc");
				}else if(choose == 2) {
					MemeberContainer.displaySortingOrder("desc");
				}else {
					System.out.println("\nWrong Choice Selection ");
				}
				break;
			case 6:
				System.out.println("\n\n\t\t\t\t Terminating The Program");
				break;
			default: System.out.println("\nWrong Choice Selection .. Re-Try Again !!");
				break;
			}

			if (choice == 6) {
				break;
			}
		}

		readVal.close();

	}

}
