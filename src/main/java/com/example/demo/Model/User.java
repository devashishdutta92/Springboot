package com.example.demo.Model;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
	@Column(name = "mobile")
	private String mobile;
	
	public User() {
		
	}

	public User( String username, String email, String password, String mobile) {
		
	
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "UserRegister [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + "]";
	}

//	public void save(CustomerRegister userForm) {
//		// TODO Auto-generated method stub
//		
//	}

   
}