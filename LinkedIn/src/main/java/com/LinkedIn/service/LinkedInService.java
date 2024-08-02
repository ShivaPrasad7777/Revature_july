package com.LinkedIn.service;

import java.util.ArrayList;
import java.util.List;

import com.LinkedIn.dao.LinkedInDao;
import com.LinkedIn.dao.LinkedInDaoInterface;
import com.LinkedIn.entity.LinkedInUser;

public class LinkedInService implements LinkedInServiceInterface {

	public int createProfileService(LinkedInUser lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ldi=new LinkedInDao();
		int i=ldi.createProfileDao(lu);
		return i;
	}

	@Override
	public LinkedInUser viewProfileService(LinkedInUser lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ldi=new LinkedInDao();
		LinkedInUser liu=ldi.viewProfileDao(lu);
		return liu;

		
		
	}

	@Override
	public int deleteProfile(LinkedInUser lu) {
		// TODO Auto-generated method stub
		
		LinkedInDaoInterface ldi=new LinkedInDao();
		int i=ldi.deleteProfileDao(lu);
		return i;
	}

	public List viewAll() {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ldi=new LinkedInDao();
		List llu=ldi.viewAllDao();
		return llu;
	}

	@Override
	public int updateProfileService(LinkedInUser lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ldi=new LinkedInDao();
		int i=ldi.updateProfileDao(lu);
		return i;
	}

	public List viewProfileBName(LinkedInUser lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ldi=new LinkedInDao();
		List<LinkedInUser> ll=ldi.viewProfileBNameDao(lu);
		return ll;
	}

}
