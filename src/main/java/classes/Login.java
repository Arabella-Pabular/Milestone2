/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ajbab
 */
public class Login {
    private String _username;
    private String _password;
    
    public void SetUsername(String Username){
        _username = Username;
    }
    
    public void SetPassword(char[] Password){
        _password = new String(Password);
    }
    
    public boolean IsAuthenticated() throws FileNotFoundException, IOException, CsvValidationException {
        String csvFilename = "Accounts.csv";
        try(CSVReader reader = new CSVReader(new FileReader(csvFilename))){
            String[] line;
           
            while((line = reader.readNext()) != null){
                if(line[0].equals(_username)){
                    return line[1].equals(_password);
                }
            }
        }
        return false;
    }
}
