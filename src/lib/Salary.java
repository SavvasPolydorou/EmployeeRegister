package lib;

public class Salary {

	//fields
	private double salary;
	private Date paymentDate;
	
	//constructors
	public Salary()
	{
		salary = 1200.0;
		paymentDate = new Date();
	}
	
	public Salary(double salary, Date paymentDate)
	{
		this.salary = salary;
		this.paymentDate = paymentDate;
	}
	
	
	//methods
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void addBenefits(double benefits)
	{
		salary+= benefits;
	}
	
	public Date getPaymentDate()
	{
		
		return paymentDate;
	}
	
	public void changePaymentDate(Date date)
	{
		this.paymentDate = date;
	}
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " "+ salary + 
				" Date of Payment "
				+ paymentDate + "]";
	}

	

	
}
