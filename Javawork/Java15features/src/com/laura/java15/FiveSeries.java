package com.laura.java15;

public final class FiveSeries extends BMWSeries {
//usar registros locales dentro de una funcion
	public int start() {
		record PickupData (int pickupTime) {
			
		}
		
		return new PickupData(10).pickupTime;
	}
}
