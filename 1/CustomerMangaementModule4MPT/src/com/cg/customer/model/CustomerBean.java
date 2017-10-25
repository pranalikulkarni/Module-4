package com.cg.customer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer_table")
@NamedQueries
({
		@NamedQuery(name = "getAll", query = "SELECT customer FROM CustomerBean customer"),
		@NamedQuery(name = "getById", query = "SELECT cust FROM CustomerBean cust WHERE cust.custId=:custIdd"),
		@NamedQuery(name = "removeById", query = "DELETE FROM CustomerBean cust WHERE cust.custId=:custIdd")
})
public class CustomerBean implements Serializable {

	
@Column(name="CUSTOMER_NAME")

	private String customerName;
	@Id
	@Column(name="CUSTOMER_ID")
	@NotNull(message="User ID is required")
	private int custId;
	@NotNull(message="Mobile No is Required")
	@Column(name="CUSTOMER_NO")
	private String mobNo;
	@Column(name="EMAILID")
	@NotEmpty(message="email is required")
	private String email;
	@Past
	@Column(name="CUSTOMER_DOB")
	private Date custDob;
	
	public CustomerBean() {
		
	}
	
	@Override
	public String toString() {
		return "CustomerBean [customerName=" + customerName + ", custId="
				+ custId + ", mobNo=" + mobNo + ", email=" + email
				+ ", custDob=" + custDob + "]";
	}
	private static final long serialVersionUID = 1L;
	public CustomerBean(String customerName, int custId, String mobNo,
			String email, Date custDob) {
		super();
		this.customerName = customerName;
		this.custId = custId;
		this.mobNo = mobNo;
		this.email = email;
		this.custDob = custDob;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCustDob() {
		return custDob;
	}
	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}
	
	
}
