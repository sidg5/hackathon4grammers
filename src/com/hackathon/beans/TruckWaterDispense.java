package com.hackathon.beans; 

public class TruckWaterDispense
{
	private  int truckId;
	private String truckNumber;
	private  int waterNeedDispense;
	private  int noOfPatches;
	private  String areaName;
	
	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	public int getWaterNeedDispense() {
		return waterNeedDispense;
	}

	public void setWaterNeedDispense(int waterNeedDispense) {
		this.waterNeedDispense = waterNeedDispense;
	}

	public int getNoOfPatches() {
		return noOfPatches;
	}

	public void setNoOfPatches(int noOfPatches) {
		this.noOfPatches = noOfPatches;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}