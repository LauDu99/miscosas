
public class ElectricityBill {
	
	private int meterNo;
	private String name;
	private String address;
	
	
	public int getMeterNo() {
		return meterNo;
	}
	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "ElectricityBill information: "+this.meterNo+this.name+this.address; 
	}
	
	@Override
	public boolean equals(Object obj) {
		ElectricityBill elb =(ElectricityBill) obj;
		if(elb.getMeterNo()==this.meterNo) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return meterNo;
	}

}
