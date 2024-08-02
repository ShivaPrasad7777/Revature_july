package com.LinkedIn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.LinkedIn.entity.LinkedInUser;

public class LinkedInDao implements LinkedInDaoInterface {

	public int createProfileDao(LinkedInUser lu) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("insert into linkedinuser values(?,?,?)");
			ps.setString(1, lu.getName());
			ps.setString(2, lu.getMail());
			ps.setInt(3, lu.getMnum());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public LinkedInUser viewProfileDao(LinkedInUser lu) {
		// TODO Auto-generated method stub
		LinkedInUser liu=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("select * from linkedinuser where mail=?");
			ps.setString(1, lu.getMail());
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String m=res.getString(2);
				int mn=res.getInt(3);
				
				liu=new LinkedInUser();
				liu.setName(n);
				liu.setMail(m);
				liu.setMnum(mn);
			}

		}
		catch(Exception e){
			
		}
		return liu;
	}

	public int deleteProfileDao(LinkedInUser lu) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("delete from linkedinuser where name=?");
			ps.setString(1, lu.getName());
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List viewAllDao() {
		// TODO Auto-generated method stub
		LinkedInUser llu=null;
		List<LinkedInUser> user=new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			Statement ps=con.createStatement();
			ResultSet res=ps.executeQuery("select * from linkedinuser");
			while(res.next()) {
				String n=res.getString(1);
				String m=res.getString(2);
				int mn=res.getInt(3);
				
				llu=new LinkedInUser();
				llu.setName(n);
				llu.setMail(m);
				llu.setMnum(mn);
				
				user.add(llu);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public int updateProfileDao(LinkedInUser lu) {
		// TODO Auto-generated method stub
		int i=0;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
		PreparedStatement ps=con.prepareStatement("update linkedinuser set name=?,mail=?,mob=? where mail=?");
		ps.setString(1, lu.getName());
		ps.setString(2, lu.getMail());
		ps.setInt(3, lu.getMnum());
		ps.setString(4, lu.getupMail());
		
		i=ps.executeUpdate();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
		
	}

	public List<LinkedInUser> viewProfileBNameDao(LinkedInUser lu) {
		// TODO Auto-generated method stub
		LinkedInUser lll=null;
		List<LinkedInUser> lus=new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("select * from linkedinuser where name=?");
			ps.setString(1, lu.getName());
			

			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String n=rs.getNString(1);
				String m=rs.getString(2);
				int mn=rs.getInt(3);
				
				lll=new LinkedInUser();
				
				lll.setName(n);
				lll.setMail(m);
				lll.setMnum(mn);
				
				lus.add(lll);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lus;
	}

}
