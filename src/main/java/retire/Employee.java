/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package retire;

import java.util.Calendar;

/**
 *
 * @author Vitor
 */
public class Employee {
    private int employeeId;
    private int yearBirth;
    private int yearsWorked;
    
    
public Employee(){
}

public Employee(int newEmployeeId, int newYearBirth, int newYearsWorked){
    employeeId = newEmployeeId;
    yearBirth = newYearBirth;
    yearsWorked = newYearsWorked;
    
}

public void setEmployeeId(int newEmployeeId){
    employeeId = newEmployeeId;
}

public int getEmployeeId(){
    return employeeId;
}

public void setYearBirth(int newYearBirth){
    yearBirth = newYearBirth;
}

public int getYearBirth(){
    return yearBirth;
}

public void setYearsWorked(int newYearsWorked){
    yearsWorked = newYearsWorked;
}

public int getYearsWorked(){
    return yearsWorked;
}

Calendar c = Calendar.getInstance();
int year = c.get(Calendar.YEAR);


public String requestOfRetirement(String aceito, String negado){
    
    
    if(year - yearBirth >= 65){
    return aceito;
    }
    else if(year - yearBirth >= 48 && yearsWorked >= 30){
    return aceito;
    }
    else if(year - yearBirth >= 60 && yearsWorked >= 25){
    return aceito;
    }
    else{
    return negado;
    }
}
}
