import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
//giving the name of the event
import java.awt.event.ActionEvent;
//respond to the event 
import java.awt.event.ActionListener;

public class GUI implements ActionListener
{
    //database component
    protected ArrayList<StaffHire> database;

    //GUI components 
    protected JTextField vacancyNumberField;
    protected JTextField designationTypeField;
    protected JTextField jobTypeField;
    protected JTextField staffNameField;
    protected JTextField joiningDateField;
    protected JTextField qualificationField;
    protected JTextField appointedByField;
    protected JTextField joinedField;
    protected JTextField salaryField;
    protected JTextField weeklyFractionalHoursField;
    protected JTextField workingHourField;
    protected JTextField wagesPerHourField;
    protected JTextField shiftsField;
    protected JTextField displayStaffField;
    //Display number (the same as the index of the staff in the arraylist)
    protected JTextField displayNumberField;  
    //Empty field and text only for layout/design of program 
    protected JTextField emptyA;
    protected JTextField emptyB;
    protected JTextField emptyC;
    protected JTextField emptyD;
    protected JTextField textAField;
    protected JTextField textBField;

    protected JRadioButton joinedButton;
    protected JRadioButton shiftMButton;
    protected JRadioButton shiftDButton;
    protected JRadioButton shiftEButton;

    protected JButton mainFTStaffButton;
    protected JButton mainPTStaffButton;
    protected JButton mainDisplayNumberButton;
    protected JButton mainSetSalaryFTButton;
    protected JButton mainTerminatePTstaffButton;
    protected JButton mainSetWorkingShiftsPTButton;
    protected JButton addFTStaffButton;
    protected JButton addPTStaffButton;
    protected JButton displayNumberButton;
    protected JButton clearButtonFT;
    protected JButton clearButtonPT;
    protected JButton returnButton;
    protected JButton submitDisplayButton;
    protected JButton nextButton;
    protected JButton submitSetSalaryButton;
    protected JButton submitSetShiftButton;
    protected JButton submitTerminateButton;

    protected JFrame frame;

    public GUI()
    {
        //initialize database
        database = new ArrayList<StaffHire>();

        //initialize GUI interface 
        frame = new JFrame("System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 0, 5, 0);

        JLabel textALabel = new JLabel("Recruitment System");
        textALabel.setFont(new Font("Arial", Font.BOLD, 50));
        textAField = new JTextField(30);

        JLabel textBLabel = new JLabel("Gustavo Paiva");
        textBLabel.setFont(new Font("Arial", Font.BOLD, 25));
        textBField = new JTextField(20);

        gbc.gridy = 0;
        panel.add(textALabel, gbc);
        gbc.gridy = 1;
        panel.add(textBLabel, gbc);

        //Button 
        nextButton = new JButton("NEXT");
        nextButton.addActionListener(this);

        gbc.gridy = 2;
        panel.add(nextButton, gbc);

        frame.add(panel);    
        // centralize the window
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    public void menuMain()
    {
        //initialize GUI interface 
        JFrame frame = new JFrame("Main");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; // Column index
        gbc.gridy = 0; // Row index
        gbc.anchor = GridBagConstraints.CENTER; // Align text in center
        gbc.insets = new Insets(5, 0, 5, 0); // Padding (top, left, bottom, right)

        //Button 
        mainFTStaffButton = new JButton(" Full Time Staff ");
        mainFTStaffButton.addActionListener(this);

        mainSetSalaryFTButton = new JButton("     Set Salary     ");
        mainSetSalaryFTButton.addActionListener(this);

        mainPTStaffButton = new JButton(" Part Time Staff ");
        mainPTStaffButton.addActionListener(this);

        mainSetWorkingShiftsPTButton = new JButton("    Set Shifts    ");
        mainSetWorkingShiftsPTButton.addActionListener(this);

        mainTerminatePTstaffButton = new JButton("   Terminated   ");
        mainTerminatePTstaffButton.addActionListener(this);

        mainDisplayNumberButton = new JButton("Display Number");
        mainDisplayNumberButton.addActionListener(this);

        panel.add(mainFTStaffButton, gbc);
        gbc.gridy++;
        panel.add(mainSetSalaryFTButton, gbc);
        gbc.gridy++;
        panel.add(mainPTStaffButton, gbc);
        gbc.gridy++;
        panel.add(mainSetWorkingShiftsPTButton, gbc);
        gbc.gridy++;
        panel.add(mainTerminatePTstaffButton, gbc);
        gbc.gridy++;
        panel.add(mainDisplayNumberButton, gbc);

        frame.add(panel);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    public void addFullTimeStaff()
    {
        //initialize GUI interface 
        JFrame frame = new JFrame("Full Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(0,2,5,5));
        //creating GUI component
        
        //Label
        JLabel vacancyNumberLabel = new JLabel("Vacancy number:");
        vacancyNumberField = new JTextField(15);

        JLabel designationTypeLabel = new JLabel("Designation:");
        designationTypeField = new JTextField(15);

        JLabel jobTypeLabel = new JLabel("Job type:");
        jobTypeField = new JTextField(15);

        JLabel staffNameLabel = new JLabel("Staff name:");
        staffNameField = new JTextField(15);

        JLabel joiningDateLabel = new JLabel("Joining Date:");
        joiningDateField = new JTextField(15);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationField = new JTextField(15);

        JLabel appointedByLabel = new JLabel("Appointed by:");
        appointedByField = new JTextField(15);

        JLabel joinedLabel = new JLabel("Joined:");
        joinedButton = new JRadioButton ("YES (if not, do not select the button)");

        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(15);

        JLabel weeklyFractionalHoursLabel = new JLabel("Weekly fractional hours:");
        weeklyFractionalHoursField = new JTextField(15);

        //Buttons 
        addFTStaffButton = new JButton("Add Staff");
        addFTStaffButton.addActionListener(this);

        clearButtonFT = new JButton("Clear");
        clearButtonFT.addActionListener(this);

        returnButton = new JButton("Return");
        returnButton.addActionListener(this);

        panel.add(staffNameLabel);
        panel.add(staffNameField);
        panel.add(vacancyNumberLabel);
        panel.add(vacancyNumberField);
        panel.add(designationTypeLabel);
        panel.add(designationTypeField);
        panel.add(jobTypeLabel);
        panel.add(jobTypeField);
        panel.add(joiningDateLabel);
        panel.add(joiningDateField);
        panel.add(qualificationLabel);
        panel.add(qualificationField);
        panel.add(appointedByLabel);
        panel.add(appointedByField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(weeklyFractionalHoursLabel);
        panel.add(weeklyFractionalHoursField);
        panel.add(joinedLabel);        
        panel.add(joinedButton);

        JPanel buttonPanel = new JPanel(new GridLayout(2,0,5,5));
        buttonPanel.add(addFTStaffButton);
        buttonPanel.add(clearButtonFT);
        buttonPanel.add(returnButton);

        //EMPTY, JUST TO MAKE SPACE IN THE CORNERS (DESIGN OF THE PROGRAM)
        JLabel emptyALable = new JLabel("               ");
        displayNumberField = new JTextField(15);

        JLabel emptyBLable = new JLabel("               ");
        displayNumberField = new JTextField(15);

        JLabel emptyCLable = new JLabel("               ");
        displayNumberField = new JTextField(15);

        JPanel buttonPanel3 = new JPanel(new GridLayout(1,1));
        buttonPanel3.add(emptyALable);

        JPanel buttonPanel4 = new JPanel(new GridLayout(1,1));
        buttonPanel4.add(emptyBLable);

        JPanel buttonPanel5 = new JPanel(new GridLayout(1,1));
        buttonPanel4.add(emptyCLable);

        frame.add(buttonPanel5, BorderLayout.NORTH);
        frame.add(buttonPanel4, BorderLayout.WEST);
        frame.add(buttonPanel3, BorderLayout.EAST);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    public void addPartTimeStaff()
    {
        //initialize GUI interface 
        JFrame frame = new JFrame("Part Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(0,2,5,5));
        //creating GUI component
        
        //Label
        JLabel vacancyNumberLabel = new JLabel("Vacancy number:");
        vacancyNumberField = new JTextField(15);

        JLabel designationTypeLabel = new JLabel("Designation:");
        designationTypeField = new JTextField(15);

        JLabel jobTypeLabel = new JLabel("Job type:");
        jobTypeField = new JTextField(15);

        JLabel staffNameLabel = new JLabel("Staff name:");
        staffNameField = new JTextField(15);

        JLabel joiningDateLabel = new JLabel("Joining Date:");
        joiningDateField = new JTextField(15);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationField = new JTextField(15);

        JLabel appointedByLabel = new JLabel("Appointed by:");
        appointedByField = new JTextField(15);

        JLabel joinedLabel = new JLabel("Joined:");
        joinedButton = new JRadioButton("YES (if not, do not select the button)");

        JLabel workingHourLabel = new JLabel("Working hour:");
        workingHourField = new JTextField(15);

        JLabel wagesPerHourLabel = new JLabel("Wages per hour:");
        wagesPerHourField = new JTextField(15);

        JLabel shiftsLabel = new JLabel("Shifts:");
        shiftMButton = new JRadioButton ("Morning");
        shiftDButton = new JRadioButton ("Day");
        shiftEButton = new JRadioButton ("Evening");
    

        panel.add(staffNameLabel);
        panel.add(staffNameField);
        panel.add(vacancyNumberLabel);
        panel.add(vacancyNumberField);
        panel.add(designationTypeLabel);
        panel.add(designationTypeField);
        panel.add(jobTypeLabel);
        panel.add(jobTypeField);
        panel.add(joiningDateLabel);
        panel.add(joiningDateField);
        panel.add(qualificationLabel);
        panel.add(qualificationField);
        panel.add(appointedByLabel);
        panel.add(appointedByField);
        panel.add(workingHourLabel);
        panel.add(workingHourField);
        panel.add(wagesPerHourLabel);
        panel.add(wagesPerHourField);
        panel.add(joinedLabel);        
        panel.add(joinedButton);

        //ButtonS 
        addPTStaffButton = new JButton("Add Staff");
        addPTStaffButton.addActionListener(this);

        clearButtonPT = new JButton("Clear ");
        clearButtonPT.addActionListener(this);

        returnButton = new JButton("Return");
        returnButton.addActionListener(this);

        JPanel panelB = new JPanel(new GridLayout(2,0,5,5));
        panelB.add(addPTStaffButton);
        panelB.add(clearButtonPT);
        panelB.add(returnButton);

        JPanel panelA = new JPanel(new GridLayout(0,4));
        panelA.add(shiftsLabel);
        panelA.add(shiftMButton);
        panelA.add(shiftDButton);
        panelA.add(shiftEButton);

        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.add(panel, BorderLayout.CENTER);
        panel1.add(panelA, BorderLayout.SOUTH);

        //EMPTY, JUST TO MAKE SPACE IN THE CORNERS 
        JLabel emptyALable = new JLabel("            ");
        displayNumberField = new JTextField(15);

        JLabel emptyBLable = new JLabel("            ");
        displayNumberField = new JTextField(15);

        JLabel emptyCLable = new JLabel("            ");
        displayNumberField = new JTextField(15);

        JPanel buttonPanel3 = new JPanel(new GridLayout(1,1));
        buttonPanel3.add(emptyALable);

        JPanel buttonPanel4 = new JPanel(new GridLayout(1,1));
        buttonPanel4.add(emptyBLable);

        JPanel buttonPanel5 = new JPanel(new GridLayout(1,1));
        buttonPanel4.add(emptyCLable);

        frame.add(buttonPanel5, BorderLayout.NORTH);
        frame.add(buttonPanel4, BorderLayout.WEST);
        frame.add(buttonPanel3, BorderLayout.EAST);
        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panelB, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    public void setSalary()
    {
        //initialize GUI interface 
        JFrame frame = new JFrame("Salary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; // Column index
        gbc.gridy = 0; // Row index
        gbc.anchor = GridBagConstraints.CENTER; // Align text in center
        gbc.insets = new Insets(5, 0, 5, 0); // Padding (top, left, bottom, right)

        //creating GUI component
        //Label
        JLabel vacancyNumberLabel = new JLabel("Vacancy number:");
        vacancyNumberField = new JTextField(15);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(15);

        submitSetSalaryButton = new JButton(" Submit ");
        submitSetSalaryButton.addActionListener(this);

        returnButton = new JButton("Return");
        returnButton.addActionListener(this);

        panel.add(vacancyNumberLabel, gbc);
        gbc.gridy++;
        panel.add(vacancyNumberField, gbc);
        gbc.gridy++;
        panel.add(salaryLabel, gbc);
        gbc.gridy++;
        panel.add(salaryField, gbc);
        gbc.gridy++;
        panel.add(submitSetSalaryButton, gbc);
        gbc.gridy++;
        panel.add(returnButton, gbc);
        gbc.gridy++;

        frame.add(panel);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 
    }

    public void setShifts()
    {
        //initialize GUI interface 
        JFrame frame = new JFrame("Shifts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; // Column index
        gbc.gridy = 0; // Row index
        gbc.anchor = GridBagConstraints.CENTER; // Align text in center
        gbc.insets = new Insets(5, 0, 5, 0); // Padding (top, left, bottom, right)

        //creating GUI component
        //Label
        JLabel vacancyNumberLabel = new JLabel("Vacancy number:");
        vacancyNumberField = new JTextField(15);

        JLabel shiftsLabel = new JLabel("Shifts:");
        shiftMButton = new JRadioButton ("Morning");
        shiftDButton = new JRadioButton ("Day");
        shiftEButton = new JRadioButton ("Evening");

        submitSetShiftButton = new JButton(" Submit ");
        submitSetShiftButton.addActionListener(this);

        returnButton = new JButton("Return");
        returnButton.addActionListener(this);

        gbc.gridx =10;
        panel.add(vacancyNumberLabel, gbc);
        gbc.gridy++;gbc.gridx =10;
        panel.add(vacancyNumberField, gbc);
        gbc.gridy++;gbc.gridx =10;
        panel.add(shiftsLabel, gbc);
        gbc.gridy++;gbc.gridx =5;
        panel.add(shiftMButton, gbc);
        gbc.gridx =10;
        panel.add(shiftDButton, gbc);
        gbc.gridx =15;
        panel.add(shiftEButton, gbc);
        gbc.gridx =10;gbc.gridy++;
        panel.add(submitSetShiftButton, gbc);
        gbc.gridy++;gbc.gridx =10;
        panel.add(returnButton, gbc);
        gbc.gridy++;gbc.gridx =10;

        frame.add(panel);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 
    }

    public void terminate()
    {
        //initialize GUI interface 
        JFrame frame = new JFrame("Terminated");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; // Column index
        gbc.gridy = 0; // Row index
        gbc.anchor = GridBagConstraints.CENTER; // Align text in center
        gbc.insets = new Insets(5, 0, 5, 0); // Padding (top, left, bottom, right)

        //creating GUI component
        //Label
        JLabel vacancyNumberLabel = new JLabel("Vacancy number:");
        vacancyNumberField = new JTextField(15);

        submitTerminateButton = new JButton(" Submit ");
        submitTerminateButton.addActionListener(this);

        returnButton = new JButton("Return");
        returnButton.addActionListener(this);

        panel.add(vacancyNumberLabel, gbc);
        gbc.gridy++;
        panel.add(vacancyNumberField, gbc);
        gbc.gridy++;
        panel.add(submitTerminateButton, gbc);
        gbc.gridy++;
        panel.add(returnButton, gbc);
        gbc.gridy++;

        frame.add(panel);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 
    }

    public void displayNumber()
    {
        //initialize GUI interface 
        JFrame frame = new JFrame("Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; // Column index
        gbc.gridy = 0; // Row index
        gbc.anchor = GridBagConstraints.CENTER; // Align text in center
        gbc.insets = new Insets(5, 0, 5, 0); // Padding (top, left, bottom, right)

        JLabel displayStaffLabel = new JLabel("Display number:");
        displayStaffField = new JTextField(15);

        panel.add(displayStaffLabel, gbc);
        gbc.gridy++;
        panel.add(displayStaffField, gbc);
        gbc.gridy++;

        //Button 

        submitDisplayButton = new JButton("Submit");
        submitDisplayButton.addActionListener(this);

        returnButton = new JButton("Return");
        returnButton.addActionListener(this);

        panel.add(submitDisplayButton, gbc);
        gbc.gridy++;
        panel.add(returnButton, gbc);
        gbc.gridy++;

        frame.add(panel);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == nextButton)
        {
            menuMain();
        }
        else if (e.getSource() == mainFTStaffButton)
        {
            addFullTimeStaff();
        }
        else if(e.getSource() == mainPTStaffButton)
        {
            addPartTimeStaff();
        }
        else if(e.getSource() == mainDisplayNumberButton)
        {
            displayNumber();
        }
        else if(e.getSource() == addFTStaffButton)
        {
            String designationType = designationTypeField.getText();
            String jobType = jobTypeField.getText();
            String staffName = staffNameField.getText();
            String joiningDate = joiningDateField.getText();
            String qualification = qualificationField.getText();
            String appointedBy = appointedByField.getText();
            boolean joined = false;

            if (joinedButton.isSelected ())
            {
                joined = true;
            }

            try {
                int weeklyFractionalHours = Integer.parseInt(weeklyFractionalHoursField.getText());
                int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
                double salary = Double.parseDouble(salaryField.getText()); 

                FullTimeStaff emp = new FullTimeStaff(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined, salary, weeklyFractionalHours);
                database.add(emp);

                JOptionPane.showMessageDialog(null, "Staff added successfully", " Information ", JOptionPane.INFORMATION_MESSAGE);

            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Invalid values: \nVacancy number, Salary and/or Weekly hours \n These fields only accept number format. \n (Instead of , use .) ", " ERROR ", JOptionPane.ERROR_MESSAGE);
                addFullTimeStaff();
            }

        }
        else if(e.getSource() == addPTStaffButton)
        {
            String designationType = designationTypeField.getText();
            String jobType = jobTypeField.getText();
            String staffName = staffNameField.getText();
            String joiningDate = joiningDateField.getText();
            String qualification = qualificationField.getText();
            String appointedBy = appointedByField.getText();
            boolean joined = false;
            boolean terminated = false;

            String shifts = "";
            if (shiftMButton.isSelected()){
                shifts = "Morning";
            } else if (shiftDButton.isSelected()){
                shifts = "Day";
            } else {
                shifts = "Evening";
            }

            if (joinedButton.isSelected ())
            {
                joined = true;
            }

            try {
                int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
                int workingHour = Integer.parseInt(workingHourField.getText());
                double wagesPerHour = Double.parseDouble(wagesPerHourField.getText());

                PartTimeStaff emp = new PartTimeStaff(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined, workingHour, wagesPerHour, shifts);
                database.add(emp);

                JOptionPane.showMessageDialog(null, "Staff added successfully", " Information ", JOptionPane.INFORMATION_MESSAGE);

            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid values: \n\nVacancy number, \nWorking hours \nand/or \nWage per hour \n\n These fields only accept number format. \n\n (Instead of , use .) ", " ERROR ", JOptionPane.ERROR_MESSAGE);
                addPartTimeStaff();
            }
        }else if(e.getSource() == submitDisplayButton){

            try {

                int displayStaff = Integer.parseInt(displayStaffField.getText());

                if (displayStaff < 0 || displayStaff >= database.size()) {

                    JOptionPane.showMessageDialog(null,"The value must to be bigger than 0 and less than " + (database.size()-1), " ERROR ", JOptionPane.ERROR_MESSAGE);

                } else {
                    for (int i = 0; i < database.size();)
                    {
                        if (i == displayStaff){

                            StaffHire emp = database.get(displayStaff);
                            emp.display();
                            break;

                        }
                    }
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Value invalid, insert a number", "ERROR",  JOptionPane.ERROR_MESSAGE);
            }

        }

        else if(e.getSource() == mainSetSalaryFTButton)
        {
            setSalary();    
        }
        else if(e.getSource() == submitSetSalaryButton)
        {
            try{
                int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
                double salary = Double.parseDouble(salaryField.getText());
                boolean found = false;

                for(StaffHire staffNew : database){
                    if(staffNew.getVacancy() == vacancyNumber){
                        found = true;

                        if (staffNew instanceof FullTimeStaff) {
                            FullTimeStaff fullTimeStaff = (FullTimeStaff) staffNew;
                            fullTimeStaff.setSalary(salary);
                            JOptionPane.showMessageDialog(null, "Salary set successfully", " Information ", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "This position is not for a Full-Time staff member.", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                        break; 
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Vacancy number not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            catch (NumberFormatException ex){

                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values for vacancy number and salary.", " ERROR ", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == mainSetWorkingShiftsPTButton)
        {
            setShifts();
        }
        else if (e.getSource() == submitSetShiftButton)
        {
            try{
                int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());

                String shifts = "";
                if (shiftMButton.isSelected()){
                    shifts = "Morning";
                } else if (shiftDButton.isSelected()){
                    shifts = "Day";
                } else {
                    shifts = "Evening";
                }

                boolean found = false;

                for(StaffHire staffNew : database){
                    if(staffNew.getVacancy() == vacancyNumber){
                        found = true;

                        if (staffNew instanceof PartTimeStaff) {
                            PartTimeStaff partTimeStaff = (PartTimeStaff) staffNew;
                            partTimeStaff.setShifts(shifts);
                            JOptionPane.showMessageDialog(null, "Shift set successfully", " Information ", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "This position is not for a Part-Time staff member.", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                        break; 
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Vacancy number not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            catch (NumberFormatException ex){

                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values for vacancy number and choose the shift.", " ERROR ", JOptionPane.ERROR_MESSAGE);
            }

        }
        else if(e.getSource() == mainTerminatePTstaffButton)
        {
            terminate();
        }
        else if(e.getSource() == submitTerminateButton)
        {
            int confirm = JOptionPane.showConfirmDialog(null,"Are you sure that you want to terminate this staff?","Confirm Termination",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION){
                try{
                    int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());

                    boolean found = false;

                    for(StaffHire staffNew : database){
                        if(staffNew.getVacancy() == vacancyNumber){
                            found = true;

                            if (staffNew instanceof PartTimeStaff) {
                                PartTimeStaff partTimeStaff = (PartTimeStaff) staffNew;
                                partTimeStaff.setTerminated();
                                JOptionPane.showMessageDialog(null, "Staff terminated successfully", " Information ", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "This position is not for a Part-Time staff member.", "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                            break; 
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(null, "Vacancy number not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                catch (NumberFormatException ex){

                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values for vacancy number and choose the shift.", " ERROR ", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                terminate();
            }
        }

        else if (e.getSource() == clearButtonFT)
        {
            designationTypeField.setText("");
            jobTypeField.setText("");
            staffNameField.setText("");
            joiningDateField.setText("");
            qualificationField.setText("");
            appointedByField.setText("");
            weeklyFractionalHoursField.setText(" ");
            vacancyNumberField.setText("");
            salaryField.setText(""); 
        }
        else if (e.getSource() == clearButtonPT)
        {
            designationTypeField.setText("");
            jobTypeField.setText("");
            staffNameField.setText("");
            joiningDateField.setText("");
            qualificationField.setText("");
            appointedByField.setText("");
            shiftsField.setText("");   
            vacancyNumberField.setText("");
            workingHourField.setText("");
            wagesPerHourField.setText("");
        }
        else if(e.getSource() == returnButton) 
        {
            menuMain();
        }
        else if(e.getSource() == addPTStaffButton)
        {
            System.out.println("Current contents of the database:");

            for (int i = 0; i < database.size(); i++)
            {
                System.out.println("Emploee at index: "+ i);
                StaffHire emp = database.get(i);
                emp.display();
            }
        }
    }

    //Database
    public void addDatabase(StaffHire aStaff)
    {
        database.add(aStaff);
    }
    //Main method
    public static void main(String[] args)
    {
        GUI gui = new GUI();
    }
}
