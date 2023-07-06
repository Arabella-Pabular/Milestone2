/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Default
 */
public class EmployeeSalary {
 
   
//Employee's basic details
   private String _employeeNo;
  
    
    //Needed for salary calculation
   
    private double grossSalary = 0; // Gross Salary without deductions 
    private double netSalary = 0; // Taxable Income 
   
    //Deductions
   
    private double philHealth = 0.015;
    private double SSS = 0.04;      //SSS Deduction percentage
    private double Pagibig = 0.02;  //Pagibig fund deduction percentage
    private double totaldeduct; //total deductions
    
    private double DeductSSS = grossSalary*SSS; //SSS percent contribution is multiplied to grossSalary 
    private double DeductPf = grossSalary*Pagibig;
    private double DeductPh = grossSalary*philHealth;
   private double totalsalary = 0; //Final Salary after tax deduction
  
   private double _finalSalary;
    
    
     public EmployeeSalary() {}
     
    public EmployeeSalary(String EmployeeNo){
        _employeeNo = EmployeeNo;
        
      
       
        
        
    }
    
    public double GetNetSalary(){
        return netSalary;
    }
        
    public double GetFinalSalary() {
        return _finalSalary;
    }
    
    
    
    
    
    
    
    //SETTER METHODS
    public void SetEmployeeNo(String EmployeeNo){
       _employeeNo = EmployeeNo;
    }
   
      
      
      public void SetSSS(double sss) {
          SSS = sss;
      }
      
     
        public void SetGrossSalary(double GrossSalary) {
        grossSalary = GrossSalary;
    }
        
         public void SetNetSalary(double netsalary) {
        netSalary = netsalary;
    }
     
         
        public void SetPhilhealth(double philhealth) {
        philHealth = philhealth;
    } 
        
       public void Setpagibig(double pagibig) {
           Pagibig = pagibig;
    }
       
        public void SetTotalDeduct(double totalDeduct) {
        totaldeduct = totalDeduct;
    }
        
        public void SetDeductSSS(double deductsss) {
        DeductSSS = deductsss;
    }
         public void SetDeductPf(double deductpf) {
        DeductPf = deductpf;
    }
        public void SetDeductPh(double deductph) {
        DeductPh = deductph;
    }
        public void SetTotalSalary(double totalSalary) {
        totalsalary = totalSalary;
    }
      
     
     
    
  
   
    
    
    public DefaultTableModel GetSalaryCalculation(String EmployeeNo, int month) throws FileNotFoundException, IOException, CsvValidationException {
     
        DefaultTableModel _tblSalary;
        String CSVFilename = "Salary.csv";
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] header = reader.readNext();
        _tblSalary = new DefaultTableModel(header, 0);
        String[] line;
        double GrossSalary = 0;
        double Allowances = 0;  //Gross Salary with allowances
       
        
        
        while((line = reader.readNext()) != null) {
        if (line[0].equals(EmployeeNo) && Integer.parseInt(line [4])== month) {
            _tblSalary.addRow(line);
            
            GrossSalary += Double.parseDouble(line[8]) * Double.parseDouble(line[4]); // Hours worked* Hourly Rate = Gross Salary
            
            
            Allowances +=  Double.parseDouble(line[5]) + Double.parseDouble(line[6]) + Double.parseDouble(line[7]); // Gross Salary + Clothing Allowance + Phone Allowance + rice subsidy
            
        }
    }
        totaldeduct = DeductSSS + DeductPh + DeductPf; //Contributions
        netSalary = GrossSalary - totaldeduct;
        _finalSalary = netSalary + Allowances;
        
        
        return _tblSalary;
    }
    
    
    
     public void ShowSalary(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException {
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
}
