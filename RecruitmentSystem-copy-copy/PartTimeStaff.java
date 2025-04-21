public class PartTimeStaff extends StaffHire
{
    protected int workingHour;
    protected double wagesPerHour;
    protected String shifts;
    protected boolean terminated;
    
    public PartTimeStaff(int vacancyNumber,String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy,boolean joined, int workingHour, double wagesPerHour, String shifts)
    {
        super(vacancyNumber,designationType,jobType,staffName,joiningDate,qualification,appointedBy,joined);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        terminated = false;
    }
    
    //accessor methods
    public int getWorkingHour()
    {
        return this.workingHour;
    }
    
    public double getWagesPerHour()
    {
        return this.wagesPerHour;
    }
    
    public String getShifts()
    {
        return this.shifts;
    }
    
    public boolean getTerminated()
    {
        return terminated;
    }
    
    //mutator methods
    public void setShifts(String shifts)
    {
        if (joined)
        {
            this.shifts = shifts;
        } else 
        {
            System.out.println("The staff has not joined yet");
        }
    }
    
    public void setTerminated()
    {
        if (terminated)
        {
            System.out.println("The staff is no longer in the company");
        } else 
        {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            joined = false;
            terminated = true;
        }
    }
    
    @Override
    public void display()
    {
        super.display();
        if (workingHour != 0)
        {
            System.out.println("Wages Per Hour :" + wagesPerHour);
            System.out.println("Working Hours  :" + workingHour);
            System.out.println("Shift          :" + shifts);
            System.out.println("Terminated     :" + terminated);
            double incomePerDay = wagesPerHour*workingHour;
            System.out.println("Income Per Day :" + incomePerDay);
        } 
    }
}
