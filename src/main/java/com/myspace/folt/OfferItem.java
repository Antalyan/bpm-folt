package com.myspace.folt;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class OfferItem implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String unit;
	private java.lang.String email;

	private java.lang.Double price;

	private java.lang.Integer amount;

	public OfferItem() {
	}

	public java.lang.String getUnit() {
		return this.unit;
	}

	public void setUnit(java.lang.String unit) {
		this.unit = unit;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public java.lang.Integer getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Integer amount) {
		this.amount = amount;
	}

	public OfferItem(java.lang.String unit, java.lang.String email,
			java.lang.Double price, java.lang.Integer amount) {
		this.unit = unit;
		this.email = email;
		this.price = price;
		this.amount = amount;
	}

}