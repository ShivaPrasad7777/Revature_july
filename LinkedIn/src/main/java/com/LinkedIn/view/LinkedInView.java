package com.LinkedIn.view;

import java.util.Scanner;

import com.LinkedIn.controller.LinkedInController;
import com.LinkedIn.controller.LinkedInControllerInterface;

public class LinkedInView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String ss="y";
		
		while(ss.equals("y")) {
		System.out.println("*****MAIN MENU*****");
		System.out.println("select 1 to create profile");
		System.out.println("select 2 to view profile");
		System.out.println("Select 3 to delete record in table");
		System.out.println("Select 4 to view all the records in table");
		System.out.println("select 5 to update record");
		System.out.println("Select 6 to view profile based on name");
		LinkedInControllerInterface lci=new LinkedInController();
		int opt=scan.nextInt();
		switch(opt) {
		case 1 : 
			lci.createProfileController();
			break;
		case 2:
			lci.viewProfileController();
			break;
		case 3:
			lci.deleteProfile();
			break;
		case 4:
			lci.viewAll();
			break;
		case 5:
			lci.updateProfile();
			break;
		case 6:
			lci.viewProfileBName();
			break;
		default:System.out.println("Invalid option");
		}
		
		
		System.out.println("select y to continue");
		ss=scan.next();
		}
		

	}

}
