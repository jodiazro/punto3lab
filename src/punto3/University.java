/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author JOHAN DIAZ
 */
public class University {
    Student[] students;
    Module[] modules;
    
    University(int n_students,int n_modules){
        students=new Student[n_students];
        modules=new Module[n_modules];
    }
}
