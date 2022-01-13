/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week12T09;

/**
 *
 * @author pensyarah
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean compare(Student s, Student t) {
    
        return s.getClass() == t.getClass();
    
    }
    
    public static boolean isClass(Student s){
         return (s instanceof Person);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student();
        Teacher t = new Teacher();
        Person p = new Person();
                
        System.out.println(compare(s,s));
        System.out.println(isClass(s));
        
        
    }
    
}
