package com.LinkedIn.service;

import java.util.List;

import com.LinkedIn.entity.LinkedInUser;

public interface LinkedInServiceInterface {


	int createProfileService(LinkedInUser lu);

	LinkedInUser viewProfileService(LinkedInUser lu);

	int deleteProfile(LinkedInUser lu);

	List<LinkedInUser> viewAll();


	int updateProfileService(LinkedInUser lu);


	List<LinkedInUser> viewProfileBName(LinkedInUser lu);

}
