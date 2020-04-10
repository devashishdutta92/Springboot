package com.example.demo.Model;

import java.sql.Date;

import javax.persistence.*;



@Entity
@Table(name = "Reservation")
public class RoomReservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "fullname")
	private String fullname;

	@Column(name = "email")
	private String email;

	@Column(name = "travellers")
	private String travellers;

	@Column(name = "fromDate")
	private Date fromDate;

	@Column(name = "toDate")
	private Date toDate;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "address")
	private String address;

	public RoomReservation() {
	}

	public RoomReservation(String fullname, String email, String travellers, Date fromDate, Date toDate, String mobile,
			String address) {
		
		this.fullname = fullname;
		this.email = email;
		this.travellers = travellers;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.mobile = mobile;
		this.address = address;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTravellers() {
		return travellers;
	}

	public void setTravellers(String travellers) {
		this.travellers = travellers;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "RoomReservation [id=" + id + ", fullname=" + fullname + ", email=" + email + ", travellers="
				+ travellers + ", fromDate=" + fromDate + ", toDate=" + toDate + ", mobile=" + mobile + ", address="
				+ address + "]";
	}

	
	
	

}
