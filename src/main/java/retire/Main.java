/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retire;

/**
 *
 * @author Vitor
 */
import java.util.Scanner;

public class Main
{

    public static void main(String args[]){
        
        Scanner leia = new Scanner(System.in);
        
        double getEmployeeId, getYearBirth, getYearsWorked;
        
        String getAccept, getDenied;
        
        Employee employee1 = new Employee();   
        
        System.out.println("Type the employee ID: ");
        employee1.setEmployeeId( leia.nextInt()); 
        getEmployeeId = employee1.getEmployeeId();
        
        System.out.println("Type year of birth: ");
        employee1.setYearBirth( leia.nextInt()); 
        getYearBirth = employee1.getYearBirth();
        
        System.out.println("Type how much years worked: ");
        employee1.setYearsWorked( leia.nextInt()); 
        getYearsWorked = employee1.getYearsWorked();
        
        getAccept = "Require retirement";
        getDenied = "Not require";
        
          System.out.println("Employee ID: "+employee1.getEmployeeId());  
          System.out.println("Year of birth: "+employee1.getYearBirth());
          System.out.println("Years worked: "+employee1.getYearsWorked());
          System.out.println("Answer: "+employee1.requestOfRetirement(getAccept, getDenied));   
        
         
        
        
    }
    
    
}
