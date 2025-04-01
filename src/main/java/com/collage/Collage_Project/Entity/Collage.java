package com.collage.Collage_Project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


@Entity
public class Collage {

	
	@Id
	@Column(name = "collegeid")
	private int collageId;
	
	@Column(name = "collagename")
	private String collageName;
	
	@Column(name = "collageaddress")
	private String collageAddress;
	
	@Column(name = "collagepincode")
	private int collagePincode;
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collage(int collageId, String collageName, String collageAddress, int collagePincode) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.collagePincode = collagePincode;
	}
	public int getCollageId() {
		return collageId;
	}
	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getCollageAddress() {
		return collageAddress;
	}
	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}
	public int getCollagePincode() {
		return collagePincode;
	}
	public void setCollagePincode(int collagePincode) {
		this.collagePincode = collagePincode;
	}
	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ ", collagePincode=" + collagePincode + "]";
	} 
	
	
}
