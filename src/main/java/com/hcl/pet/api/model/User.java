package com.hcl.pet.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String userName;
	private String password;
	private String confirmPass;
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL) private Pet pet;
	 * 
	 * public Pet getPet() { return pet; } public void setPet(Pet pet) { this.pet =
	 * pet; }
	 */
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPass() {
		return confirmPass;
	}
	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", confirmPass="
				+ confirmPass + "]";
	}
	
	
	

}
