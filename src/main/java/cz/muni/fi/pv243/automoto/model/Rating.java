package cz.muni.fi.pv243.automoto.model;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rating
 *
 */
@Entity

public class Rating implements Serializable {

	@Id	@GeneratedValue
	private int id;
	private String rating;
	private int ratingScore;
	private Date ratingDate;
	private int advertisementid;
	private int userid;
	private static final long serialVersionUID = 1L;

	public Rating() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}   
	public int getRatingScore() {
		return this.ratingScore;
	}

	public void setRatingScore(int ratingScore) {
		this.ratingScore = ratingScore;
	}   
	public Date getRatingDate() {
		return this.ratingDate;
	}

	public void setRatingDate(Date ratingDate) {
		this.ratingDate = ratingDate;
	}   
	public int getAdvertisementid() {
		return this.advertisementid;
	}

	public void setAdvertisementid(int advertisementid) {
		this.advertisementid = advertisementid;
	}   
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
   
}
