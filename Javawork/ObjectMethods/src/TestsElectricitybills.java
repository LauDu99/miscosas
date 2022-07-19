
public class TestsElectricitybills {

	public static void main(String[] args) {
			ElectricityBill elb = new ElectricityBill();
			elb.setMeterNo(145);
			elb.setName("Antonio");
			elb.setAddress("rio del carrizo");
			
			ElectricityBill elb2 = new ElectricityBill();
			elb2.setMeterNo(145);
			elb2.setName("Antonio");
			elb2.setAddress("rio naranjo");
			
			System.out.println(elb.getMeterNo()+elb.getName()+elb.getAddress());
			System.out.println(elb.equals(elb2));
			
	}

}
