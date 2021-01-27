package lib;


public class Employee  {
    
    private Name name;
    private Date dob;
    private Gender gender;
    private Salary salary;
    
    public Employee() {
        name = new Name();
        dob = new Date();
        gender = Gender.Female;
        salary = new Salary();
    }
    
    public Employee(Name name, Date dob, Gender gender, Salary salary) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.salary = salary;
    }
 
    
    public void setName(Name name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Gender getGender() {
        return gender;
    }
    
    public void setSalary(double s)
    {
    	this.salary.setSalary(s);
    }
    
 
    
    public void addBenefits(double b)
    {
    	salary.addBenefits(b);
    }
    public Salary getSalary()
    {
    	return salary;
    }
    
   public void setPaymentDate(Date s)
   {
	   salary.changePaymentDate(new Date(s.getDay(), s.getMonth(), s.getYear()));
   }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name 
        		+", " + "Date of Birth " + dob + " Gender " + gender + " " + salary;
               
    }
    
}
