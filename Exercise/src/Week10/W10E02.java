/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week10;

/**
 *
 * @author Badrul
 */
public class W10E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student studentNameOnly = new student("Badrul");
        
        
        student studentwithAge = new student("Anuar",20);
        
        studentNameOnly.printInfo();
        studentwithAge.printInfo();
        
        studentNameOnly.setAge(10);
        studentNameOnly.setName("Ahmad");
        studentNameOnly.printInfo();
        
        System.out.println(studentNameOnly.getName());
                
    }
    
}
