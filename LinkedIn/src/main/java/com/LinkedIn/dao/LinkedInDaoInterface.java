package com.LinkedIn.dao;

import java.util.List;

import com.LinkedIn.entity.LinkedInUser;

public interface LinkedInDaoInterface {

	int createProfileDao(LinkedInUser lu);

	LinkedInUser viewProfileDao(LinkedInUser lu);

	int deleteProfileDao(LinkedInUser lu);


	List<LinkedInUser> viewAllDao();

	int updateProfileDao(LinkedInUser lu);




	List<LinkedInUser> viewProfileBNameDao(LinkedInUser lu);

}
