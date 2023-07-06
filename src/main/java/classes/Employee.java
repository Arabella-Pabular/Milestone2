/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package classes;
/**
 *
 * @author aj bab
 */

/**
 * IMPORT CLASSES
 * This section contains the external classes to used to Create, Read, Update and Delete Student Records
 */
import java.io.FileWriter;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class Employee {
    /**
     * ATTRIBUTES
     * This section contains the declaration of the attributes associated to 
     * the Student class
     */
    int Standard_Work = 168; //Standard Working hours in a Month
    private String _employeeNo;
    private String _employeeLastname;
    private String _employeeFirstname;
    private String _DOB;
    private String _address;
    private String _phone;
    private String _sss;
    private String _philhealth;
    private String _tin;
    private String _pagibig;
    private String _status;
    private String _position;
    private String _supervisor;
    private String _basicsalary;
    private String _rice;
    private String _phoneAllowance;
    private String _clothingAllowance;
    private String _grossSemiMonthlyRate;
    private String _hourRate;
    private String _leavetype;
    private float _hourlyRate;
    private float _basicPay;
    private float _hoursworked;
    private float _overtime;
    private float _overtimeRate;
    private float _overtimePay;
    private float _grossSalary;
    
    /**
     * CONSTRUCTOR METHODS
     */
    public Employee() {}
    public Employee(String EmployeeNo, String EmployeeLastName,String EmployeeFirstName,String ClothingAllowance, String GrossSemiMonthlyRate, String HourlyRate, String BasicSalary,String RiceSubsidy,String PhoneAllowance, String Address,String TinNo, String Supervisor, String Phone, String DOB, String Position, String Status, String SSSNo, String PhilHealth, String PagibigNo){
        _employeeNo = EmployeeNo;
        _employeeLastname = EmployeeLastName;
        _employeeFirstname = EmployeeFirstName;
        _address = Address;
        _phone = Phone;
        _DOB = DOB;
        _sss = SSSNo;
        _philhealth = PhilHealth;
        _tin = TinNo;
        _pagibig = PagibigNo;
        _status = Status; 
        _position = Position;
        _supervisor = Supervisor;
        _basicsalary = BasicSalary;
        _rice = RiceSubsidy;
        _phoneAllowance = PhoneAllowance;
        _clothingAllowance = ClothingAllowance;
        _grossSemiMonthlyRate = GrossSemiMonthlyRate;
        _hourRate = HourlyRate;
        
    }
    
    /**
     * GETTER AND SETTER METHODS
     * This section contains the declaration for the methods to be used for
     * accessing (get) and assigning (set) values to the attributes
     * @return 
     */
    //GETTER METHODS
    public String GetEmployeeNo(){
        return _employeeNo;
    }
    
    public String GetLastName(){
        return _employeeLastname;
    }
     public String GetFirstName() {
        return _employeeFirstname;
    }
     public String GetEmployeeAddress() {
        return _address;
    }
    
    
    public String GetPhone() {
        return _phone;
    }
    
    public String GetDOB() {
        return _DOB;
    }
    
     public String GetPosition() {
        return _position;
    }
    
    public String GetStatus() {
        return _status;
    }
    
    public String GetSSSNo() {
        return _sss;
    } 
    
     public String GetPhilhealthNo() {
        return _philhealth;
    }
      public String GetTinNo() {
        return _tin;
    }
    
    public String GetPagibigNo() {
        return _pagibig;
    } 
  
     public String GetImmediateSupervisor() {
        return _supervisor;
    }
      public String GetBasicSalary() {
        return _basicsalary;
    }
       public String GetRiceSubsidy() {
        return _rice;
    }
        public String GetPhoneAllowance() {
        return _phoneAllowance;
    }
         public String GetClothingAllowance() {
        return _clothingAllowance;
    }
          public String GetGrossSemiMonthlyRate() {
        return _grossSemiMonthlyRate;
    }
           public String GetHourRate() {
        return _hourRate;
    }
    public float GetHoursWorked(){
        return _hoursworked;
    }
    
    public float GetHourlyRate(){
        return _hourlyRate;
    }
    
    public float GetOvertime(){
        return _overtime;
    }
    
    public float GetOvertimePay(){
        return _overtimePay;
    }
    
    public float GetBasicpay(){
        return _basicPay;
    }
    public float GetOvertimeRate() {
        return _overtimeRate;
    }
    
    public float GetGrossSalary() {
        return _grossSalary;
    }
    
    public float GetStandardWork() {
        return Standard_Work;
    }
    public String GetLeaveType() {
        return _leavetype;
    }
    
    
    
    
    //SETTER METHODS
    public void SetEmployeeNo(String EmployeeNo){
       _employeeNo = EmployeeNo;
    }
    
    public void SetEmployeeLastName(String EmployeeName){
        _employeeLastname = EmployeeName;
    }
    public void SetLeaveType(String LeaveType) {
        _leavetype = LeaveType;
    }
    
    public void SetFirstName(String FirstName) {
        _employeeFirstname = FirstName;
    }
    
    public void SetEmployeeAddress(String EmployeeAddress) {
        _address = EmployeeAddress;
    }
    
    
    public void SetPhone(String Phone) {
        _phone = Phone;
    }
    
    public void SetDOB(String DOB) {
        _DOB = DOB; 
    }
    
     public void SetPosition(String Position) {
        _supervisor = Position;
    }
     
      public void SetStatus(String Status) {
        _status = Status;
    }
      
       public void SetSSS(String SSS) {
        _sss  = SSS;
    }
       
        public void SetPhilhealth(String Philhealth) {
        _philhealth = Philhealth;
    }
        
         public void SetTinNo(String TinNo) {
        _tin = TinNo;
    }   
         public void SetPagibig(String Pagibig) {
        _pagibig = Pagibig;
    }
         public void SetSupervisor(String ImmediateSupervisor) {
        _position = ImmediateSupervisor;
    }
     
      public void SetBasicSalary(String BasicSalary) {
        _basicsalary = BasicSalary;
    }
      
       public void SetRice(String RiceSubsidy) {
        _rice  = RiceSubsidy;
    }
       
        public void SetPhoneAllowance(String PhoneAllowance) {
        _phoneAllowance = PhoneAllowance;
    }
        
         public void SetClothingAllowance(String ClothingAllowance) {
        _clothingAllowance = ClothingAllowance;
    }
         
         public void SetGrossSemiMonthlyRate(String GrossSemiMonthlyRate) {
        _grossSemiMonthlyRate = GrossSemiMonthlyRate;
    }
         
         public void SetHourRate(String HourlyRate) {
        _hourRate = HourlyRate;
    }
    
    public void SetHoursWorked(float HoursWorked){
        _hoursworked = HoursWorked;
    }
    
    public void SetHourlyRate(float HourlyRate){
        _hourlyRate = HourlyRate;
    }
    
    public void SetOvertime(float Overtime){
        _overtime = Overtime;
    }
    
    public void SetOvertimeRate(float OvertimeRate){
        _overtimeRate = OvertimeRate;
    }
    
    public void SetOvertimePay (float OvertimePay){
        _overtimePay = OvertimePay;
    }
    
    public void SetBasicPay (float BasicPay) {
        _basicPay = BasicPay;
    }
    
    public void SetGrossSalary (float GrossSalary) {
        _grossSalary = GrossSalary;
    }
    
    public void SetStandardWork (final int StandardWork) {
        Standard_Work = StandardWork;
    }
    
    /**
     * METHODS
     * This section contains the declaration of the methods or actions performed by
     * the class Student
     * @return 
     */
    public double ComputeSalary(){
        
        return (_hoursworked + _hourlyRate + _overtimePay + _basicPay + _overtime) / 5;
    }
    
    public void CreateEmployeeFile(String CSVFilename) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] headers = new String[19];
            headers[0] = "Employee No.";
            headers[1] = "Last Name";
            headers[2] = "First Name";
            headers[3] = "Birthday";
            headers[4] = "Address";
            headers[5] = "Phone Number";
            headers[6] = "SSS No.";
            headers[7] = "PhilHealth No.";
            headers[8] = "TIN No.";
            headers[9] = "Pag-ibig No.";
            headers[10] = "Position";
            headers[11] = "PhilHealth No.";
            headers[12] = "Immediate Supervisor";
            headers[13] = "Basic Salary";
            headers[14] = "Rice Subsidy";
            headers[15] = "Phone Allowance";
            headers[16] = "Clothin Allowance";
            headers[17] = "Gross Semi-Monthly Rate";
            headers[18] = "Hourly Rate";
            
           
             writer.writeNext(headers);
        }
    }
    
    public void AddEmployee(String CSVFilename) throws IOException {
        try(CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] employeeRecord = new String[10];
            employeeRecord[0] = _employeeNo;
            employeeRecord[1] = _employeeLastname;
            employeeRecord[2] = _employeeFirstname;
            employeeRecord[3] = _DOB;
            employeeRecord[4] = _address;
            employeeRecord[5] = _phone;
            employeeRecord[6] = _sss;
            employeeRecord[7] = _philhealth;
            employeeRecord[8] = _tin;
            employeeRecord[9] = _pagibig;
            employeeRecord[10] = _status;
            employeeRecord[11] = _position;
            employeeRecord[12] = _supervisor;
            employeeRecord[13] = _basicsalary;
            employeeRecord[14] = _rice;
            employeeRecord[15] = _phoneAllowance;
            employeeRecord[16] = _clothingAllowance;
            employeeRecord[17] = _grossSemiMonthlyRate;
            employeeRecord[18] = _hourRate;
            writer.writeNext(employeeRecord);
        }
    }
    
    public DefaultTableModel FetchEmployees(String CSVFilename) throws IOException, CsvValidationException {
        DefaultTableModel _employees;
        try(CSVReader reader = new CSVReader(new FileReader(CSVFilename))){
            String[] header = reader.readNext();
            _employees = new DefaultTableModel(header,0);
            String[] line;
            while((line = reader.readNext()) != null){
                _employees.addRow(line);
            }
        }
        return _employees;
    }
    
    public void EditEmployee(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException{
        String tempFilename = CSVFilename.replace(".csv", ".tmp");
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))){
            while((line = reader.readNext()) != null){
                if(line[0].equals(_employeeNo)){
                    line[0] = _employeeNo;
                     line[1] = _employeeLastname;
            line[2] = _employeeFirstname;
            line[3] = _DOB;
            line[4] = _address;
            line[5] = _phone;
            line[6] = _sss;
            line[7] = _philhealth;
            line[8] = _tin;
            line[9] = _pagibig;
            line[10] = _status;
            line[11] = _position;
            line[12] = _supervisor;
            line[13] = _basicsalary;
            line[14] = _rice;
            line[15] = _phoneAllowance;
            line[16] = _clothingAllowance;
            line[17] = _grossSemiMonthlyRate;
            line[18] = _hourRate;
                }
                writer.writeNext(line);
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }
    
    public void DeleteEmployee(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException {
        String tempFilename = CSVFilename.replace(".csv", ".tmp");
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))){
            while((line = reader.readNext()) != null){
                if(!line[0].equals(_employeeNo))
                writer.writeNext(line);
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }

    public void ApplyLeave(String CSVFilename) throws IOException {
        try(CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] LeaveRecord = new String[10];
            LeaveRecord[0] = _employeeNo;
            LeaveRecord[1] = _employeeLastname;
            LeaveRecord[2] = _employeeFirstname;
            LeaveRecord[3] = _phone;
            LeaveRecord[4] = _position;
            LeaveRecord[5] = _supervisor;
            LeaveRecord[6] = _leavetype;
            LeaveRecord[7] = _philhealth;
           
            writer.writeNext(LeaveRecord);
        }
    }

  
}
