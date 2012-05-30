package cz.muni.fi.pv243.automoto.model;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Advertisement
 *
 */
@Entity

public class Advertisement implements Serializable {

	@Id @GeneratedValue
	private int id;
	private String vehicleType;
	private boolean isNew;
	private int kilometerCover;
	private Date yearOfProduction;
	private int price;
	private Date created;
	private boolean sold;
	private int brandid;
	private int categoryid;
	private int userid;
	private int buyerid;
	private static final long serialVersionUID = 1L;

	public Advertisement() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}   
	public boolean getIsNew() {
		return this.isNew;
	}

	public void setIsNew(boolean isNew) {
		this.isNew = isNew;
	}   
	public int getKilometerCover() {
		return this.kilometerCover;
	}

	public void setKilometerCover(int kilometerCover) {
		this.kilometerCover = kilometerCover;
	}   
	public Date getYearOfProduction() {
		return this.yearOfProduction;
	}

	public void setYearOfProduction(Date yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}   
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}   
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}   
	public boolean getSold() {
		return this.sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}   
	public int getBrandid() {
		return this.brandid;
	}

	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}   
	public int getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}   
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}   
	public int getBuyerid() {
		return this.buyerid;
	}

	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
   
}
