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
    private String _employeeName;
    private String _employeeAddress;
    private String _phone;
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
    public Employee(String StudentNo, String StudentName, String StudentAddress, String Phone){
        _employeeNo = StudentNo;
        _employeeName = StudentName;
        _employeeAddress = StudentAddress;
        _phone = Phone;
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
    
    public String GetEmployeeName(){
        return _employeeName;
    }
    
    public String GetEmployeeAddress() {
        return _employeeAddress;
    }
    
    public String GetPhone() {
        return _phone;
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
    //SETTER METHODS
    public void SetEmployeeNo(String EmployeeNo){
       _employeeNo = EmployeeNo;
    }
    
    public void SetEmployeeName(String EmployeeName){
        _employeeName = EmployeeName;
    }
    
    public void SetEmployeeAddress(String EmployeeAddress) {
        _employeeAddress = EmployeeAddress;
    }
    
    
    public void SetPhone(String Phone) {
        _phone = Phone;
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
            String[] headers = new String[4];
            headers[0] = "Employee No.";
            headers[1] = "Name";
            headers[2] = "Address";
            headers[3] = "Phone";
             writer.writeNext(headers);
        }
    }
    
    public void AddEmployee(String CSVFilename) throws IOException {
        try(CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] employeeRecord = new String[4];
            employeeRecord[0] = _employeeNo;
            employeeRecord[1] = _employeeName;
            employeeRecord[2] = _employeeAddress;
            employeeRecord[3] = _phone;
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
    
    public void EditStudent(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException{
        String tempFilename = CSVFilename.replace(".csv", ".tmp");
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))){
            while((line = reader.readNext()) != null){
                if(line[0].equals(_employeeNo)){
                    line[0] = _employeeNo;
                    line[1] = _employeeName;
                    line[2] = _employeeAddress;
                    line[3] = _phone;
                }
                writer.writeNext(line);
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }
    
    public void DeleteStudent(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException {
        String tempFilename = CSVFilename.replace(".csv", ".tmp");
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))){
            while((line = reader.readNext()) != null){
                if(!line[0].equals(_employeeNo)){ //12346
                    writer.writeNext(line);
                }
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }

    public void EditEmployee(String csvFilename) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
