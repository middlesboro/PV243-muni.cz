package cz.muni.fi.pv243.automoto.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Brand
 *
 */
@Entity

public class Brand implements Serializable {

	@Id @GeneratedValue
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Brand() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
