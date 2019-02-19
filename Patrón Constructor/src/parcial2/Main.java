/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author diegoalejo
 */
public class Main {
   
    private static void CrearMeal(){
        
       ConstructorMeal constructormeal = new ConstructorMeal();

      Meal vegetarianMeal = constructormeal.prepareVegMeal();
      System.out.println("Vegetarian Meal");
      vegetarianMeal.showItems();
      System.out.println("Total Cost: " + vegetarianMeal.getCost());

      Meal nonVegMeal = constructormeal.prepareNonVegMeal();
      System.out.println("\n\n Non Vegetarian Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
    public static void main(String[] args) {
        CrearMeal();
    }
}
