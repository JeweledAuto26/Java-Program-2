public class Commission extends Hourly
{
	private double totalSales;
	private double commissionRate;

	public Commission(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double commissionRate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
	}
	
	public void addSales (double additionalSales)
	{
		totalSales += additionalSales;
	}
	
	public double pay()
	{
		double amount = super.pay() + (totalSales * commissionRate);
		totalSales = 0.0;
		return amount;
	}
	
	public String toString()
	{
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales;
		return result;
	}
}
