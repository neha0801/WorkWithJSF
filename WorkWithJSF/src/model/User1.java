package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USER1 database table.
 * 
 */
@Entity
@Table(name="User1",schema="testDB")
@NamedQuery(name="User1.findAll", query="SELECT u FROM User1 u")
public class User1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long userid;

	private BigDecimal birthyear;

	private String email;

	private String firstname;

	private String lastname;

	public User1() {
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public BigDecimal getBirthyear() {
		return this.birthyear;
	}

	public void setBirthyear(BigDecimal birthyear) {
		this.birthyear = birthyear;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}