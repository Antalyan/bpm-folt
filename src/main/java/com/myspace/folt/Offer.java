package com.myspace.folt;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Offer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<com.myspace.folt.OfferItem> items;

	public Offer() {
	}

	public java.util.List<com.myspace.folt.OfferItem> getItems() {
		return this.items;
	}

	public void setItems(java.util.List<com.myspace.folt.OfferItem> items) {
		this.items = items;
	}

	public Offer(java.util.List<com.myspace.folt.OfferItem> items) {
		this.items = items;
	}

}