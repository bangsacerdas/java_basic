/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial2;

/**
 *
 * @author jupiterzhuo
 */
public abstract class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name =name;
        this.gender=gender;
    }
    //Abstract Method
    public abstract void work();

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + '}';
    }
    public void changeName(String newName){
        this.name=newName;
    }
}
