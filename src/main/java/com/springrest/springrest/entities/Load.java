package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Loads")
public class Load {
	
	@Id
	private long loadId;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private String noOfTrucks;
	private String weight;
	private String optional;
	private String shipperId;
	private String date;
	public Load(long loadId, String loadingPoint, String unloadingPoint, String productType, String truckType,
			String noOfTrucks, String weight, String optional, String shipperId, String date) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.optional = optional;
		this.shipperId = shipperId;
		this.date = date;
	}
	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getLoadId() {
		return loadId;
	}
	public void setLoadId(long loadId) {
		this.loadId = loadId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Load [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", optional=" + optional + ", shipperId=" + shipperId + ", date=" + date + "]";
	}
	
	


}
