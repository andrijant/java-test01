package javaapplication1;

public class Test1 {
    public static void main(String[] args) {
        
        int birthYearOfStudent; // declaration statement always ends with ';'
        int birthYearOfTeacher; // int stores whole numbers
        
        birthYearOfStudent = 1988; // definition
        birthYearOfTeacher = 1981;
        
        int ageDifference = birthYearOfStudent - birthYearOfTeacher;
        
        String message = "Age defference is " + ageDifference + ".";
        
        System.out.println(message);
        


    }
    
}
