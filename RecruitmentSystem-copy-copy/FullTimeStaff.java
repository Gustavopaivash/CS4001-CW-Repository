public class FullTimeStaff extends StaffHire
{
    protected double salary;
    protected int weeklyFractionalHours;

    //Constructor for objects of class FulltimeStaff
    public FullTimeStaff(int vacancyNumber,String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy,boolean joined,double salary, int weeklyFractionalHours)
    {
        super(vacancyNumber,designationType,jobType,staffName,joiningDate,qualification,appointedBy,joined);
        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;
    }

    //Accessor methods
    public double getSalary()
    {
        return this.salary;
    }
    
    public int getWeeklyFractionalHours()
    {
        return this.weeklyFractionalHours;
    }
    
    //Mutator methods
    public void setSalary(double salary)
    {
        if (joined)
        {
            this.salary = salary;
        } else 
        {
            System.out.println("There is no staff appointed to set the salary.");
        }
    }
    
    public void setWeeklyFractionalHours(int weeklyFractionalHours)
    {
        this.weeklyFractionalHours = weeklyFractionalHours;
    }
    
    //display methods
    @Override
    public void display()
    {
        super.display();
        if (joined)
        {
            System.out.println("Salary         :" + salary);
            System.out.println("Weekly Hours   :" + weeklyFractionalHours);
        } 
    }
}
