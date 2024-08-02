package com.LinkedIn.controller;

import java.util.List;
import java.util.Scanner;

import com.LinkedIn.entity.LinkedInUser;
import com.LinkedIn.service.LinkedInService;
import com.LinkedIn.service.LinkedInServiceInterface;

public class LinkedInController implements LinkedInControllerInterface {
	Scanner scan=new Scanner(System.in);
	LinkedInUser lu=new LinkedInUser();


	public void createProfileController() {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		String name=scan.next();
		System.out.println("Enter mail");
		String mail=scan.next();
		System.out.println("Enter your mobile number");
		int mbl=scan.nextInt();
		
		lu.setName(name);
		lu.setMail(mail);
		lu.setMnum(mbl);
		
		
		LinkedInServiceInterface lsi=new LinkedInService();
		int i=lsi.createProfileService(lu);
		
		
		if(i>0) {
			System.out.println("Account created");
		}else {
			System.out.println("Failed to create");
		}

	}

	public void viewProfileController() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter mail");
		String mail=scan.next();
		
		
		lu.setMail(mail);
		
		LinkedInServiceInterface lsi=new LinkedInService();
		LinkedInUser liu =lsi.viewProfileService(lu);
		
		if(liu!=null) {
			System.out.println("Name is "+liu.getName());
			System.out.println("Mail is "+liu.getMail());
			System.out.println("mobile number is "+liu.getMnum());
		}
		else {
			System.out.println("No profile found for your searching mail");
		}

		
		

	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		System.out.println("Enter name of recoed which you want to delete");
		String name=scan.next();
		
		lu.setName(name);
		
		LinkedInServiceInterface lsi=new LinkedInService();
		int llu=lsi.deleteProfile(lu);
		
		if(llu>0) {
			System.out.println("succesfully deleted");
		}
		else {
			System.out.println("Failed to delete");
		}
		
		
	}

	@Override
	public void viewAll() {
		// TODO Auto-generated method stub
		LinkedInServiceInterface lsi=new LinkedInService();
		List<LinkedInUser> llu=lsi.viewAll();
		
		for(LinkedInUser li:llu) {
			System.out.println(li);
		}
		
		
		
	}

	public void updateProfile() {
		// TODO Auto-generated method stub
		System.out.println("Enter name you want to have for updated record");
		String name=scan.next();
		System.out.println("Enter mail of the record you want to update");
		String mail=scan.next();
		System.out.println("Enter mobile number you want to update");
		int mn=scan.nextInt();
		System.out.println("Give the mail of the record you want to update");
		String upMail=scan.next();
		
		lu.setName(name);
		lu.setMail(mail);
		lu.setMnum(mn);
		lu.setupMail(upMail);
		
		LinkedInServiceInterface lsi=new LinkedInService();
		int i=lsi.updateProfileService(lu);
		
		if(i>0) {
			System.out.println("updated succesfully");
		}
		else {
			System.out.println("Failed to update");
		}
		
		
	}

	public void viewProfileBName() {
		// TODO Auto-generated method stub
		System.out.println("Enter name of the record you want to view all details");
		String name=scan.next();
		
		lu.setName(name);
		
		LinkedInServiceInterface lsi=new LinkedInService();
		List<LinkedInUser> llu=lsi.viewProfileBName(lu);
		
		for(LinkedInUser ll:llu) {
			System.out.println(ll);
		}
		
	}

}
