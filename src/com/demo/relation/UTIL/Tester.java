package com.demo.relation.UTIL;

import com.demo.relation.DAO.TeamDAO;
import com.demo.relation.DTO.CaptainDTO;
import com.demo.relation.DTO.TeamDTO;

public class Tester
{
	public static void main(String[]args)
	{
		TeamDTO tdto=new TeamDTO();
		
		tdto.setTeam_size(25);
		tdto.setTeam_logo("abcd");
		tdto.setTeam_type("cricket");
		
		CaptainDTO cdto=new CaptainDTO();
		cdto.setCapt_name("stuvw");
		cdto.setCapt_age(35);
		cdto.setCapt_Place("BA");
		
		tdto.setCaptdto(cdto);
		cdto.setTdto(tdto);
		
		new TeamDAO().save(tdto);
	}

	public Tester()
	{
	
	}

}
