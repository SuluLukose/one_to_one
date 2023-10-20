package com.demo.relation.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="capt_table")
public class CaptainDTO implements Serializable
{
    @Id
    @GenericGenerator(name="ref",strategy="increment")
    @GeneratedValue(generator="ref")
	private int capt_id;
	private String capt_name;
	private int capt_age;
	private String capt_Place;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Team")
	private TeamDTO tdto;
	
	public TeamDTO getTdto() {
		return tdto;
	}
	public void setTdto(TeamDTO tdto) {
		this.tdto = tdto;
	}
	public CaptainDTO() 

	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	@Override
	public String toString() {
		return "CaptainDTO [capt_id=" + capt_id + ", capt_name=" + capt_name + ", capt_age=" + capt_age
				+ ", capt_Place=" + capt_Place + "]";
	}
	public int getCapt_id() {
		return capt_id;
	}
	public void setCapt_id(int capt_id) {
		this.capt_id = capt_id;
	}
	public String getCapt_name() {
		return capt_name;
	}
	public void setCapt_name(String capt_name) {
		this.capt_name = capt_name;
	}
	public int getCapt_age() {
		return capt_age;
	}
	public void setCapt_age(int capt_age) {
		this.capt_age = capt_age;
	}
	public String getCapt_Place() {
		return capt_Place;
	}
	public void setCapt_Place(String capt_Place) {
		this.capt_Place = capt_Place;
	}

}
