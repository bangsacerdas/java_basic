/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/**
 *
 * @author jupiterzhuo
 */

class Animal {

	private boolean vegetarian;
	private String eats;
	private int noOfLegs;
	
        public Animal(){}
	
        public Animal(boolean veg, String food, int legs){
		this.vegetarian = veg;
		this.eats = food;
		this.noOfLegs = legs;
	}
	
        public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
        
}
        
 class Cat extends Animal{
 
        private String color;

        public Cat(boolean veg, String food, int legs) {
            super(veg, food, legs);
            this.color="White";
        }

        public Cat(boolean veg, String food, int legs,String color){
            super(veg, food, legs);
            this.color=color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
 
 }

public class JavaTutorial24 {
     public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");
 
        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
    }
}
