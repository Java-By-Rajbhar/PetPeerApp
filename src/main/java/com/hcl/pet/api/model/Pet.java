package com.hcl.pet.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pet_details")
public class Pet {

	public char getBuyingStatus() {
		return buyingStatus;
	}
	public void setBuyingStatus(char buyingStatus) {
		this.buyingStatus = buyingStatus;
	}

	/*
	 * public User getUser() { return user; } public void setUser(User user) {
	 * this.user = user; } public User getUser2() { return user2; } public void
	 * setUser2(User user2) { this.user2 = user2; }
	 */
	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private int age;
	private String place;
	private char buyingStatus;
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="OWNERID") User user;
	 * 
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="BUYERID") User user2;
	 */
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Pet() {
		super();
	}
	@Override
	public String toString() {
		return "Pet [Id=" + Id + ", name=" + name + ", age=" + age + ", place=" + place + ", buyingStatus="
				+ buyingStatus + "]";
	}

     
	
	
	
}
