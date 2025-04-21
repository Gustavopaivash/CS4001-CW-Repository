public class StaffHire
{
    // Eight attributes
    protected int vacancyNumber;
    protected String designationType;
    protected String jobType;
    protected String staffName;
    protected String joiningDate;
    protected String qualification;
    protected String appointedBy;
    protected boolean joined;

    //Constructor for objects of class StaffHire
    public StaffHire(int vacancyNumber,String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy,boolean joined)
    {
        this.vacancyNumber = vacancyNumber;
        this.designationType = designationType;
        this.jobType = jobType;
        this.staffName =staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
    
    }
    
    // Main method for the class
    public static void main(String[] args)
    {
        
    }

    // Setting methods
    public void setVacancy(int vacancyNumber)
    {
        this.vacancyNumber = vacancyNumber;
    }
    
    public void setDesignation(String designationType)
    {
        this.designationType = designationType;
    }
    
    public void setJobType(String jobType)
    {
        this.jobType = jobType;
    }
    
    public void setStaffName(String staffName)
    {
        this.staffName = staffName;
    }
    
    public void setJoiningDate(String joiningDate)
    {
        this.joiningDate = joiningDate;
    }
    
     public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }
    
     public void setAppointedBy(String appointedBy)
    {
        this.appointedBy = appointedBy;
    }
    
     public void setJoined(boolean joined)
    {
        this.joined = joined;
    }
    
    // getting method
    public int getVacancy()
    {
        return this.vacancyNumber;
    }
    
    public String getDesignation()
    {
        return this.designationType;
    }
    
    public String getJobType()
    {
        return this.jobType;
    }
    
    public String getStaffName()
    {
        return this.staffName;
    }
    
    public String getJoiningDate()
    {
        return this.joiningDate;
    }
    
     public String getQualification()
    {
        return this.qualification;
    }
    
     public String getAppointedBy()
    {
        return this.appointedBy;
    }
    
     public boolean getJoined()
    {
        return joined;
    }
    
    // Display method
    public void display()
    {
        System.out.println(" ");
        System.out.println("       Staff Information ");
        System.out.println(" ");
        System.out.println("Name           :" + staffName);
        System.out.println("Vacancy N.     :" + vacancyNumber);
        System.out.println("Designation    :" + designationType);
        System.out.println("Job Type       :" + jobType);
        System.out.println("Joining Date   :" + joiningDate);
        System.out.println("Qualification  :" + qualification);
        System.out.println("Appointed By   :" + appointedBy);
        System.out.println("Joined         :" + joined);
    }
    
    //method to amend the joined status
     public void changeJoined()
    {
        if (joined)
        { joined = false; }
        else 
        { joined = true; }
    }
}
