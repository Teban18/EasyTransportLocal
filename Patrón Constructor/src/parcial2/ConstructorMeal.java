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
public class ConstructorMeal {
  
     public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegetarianBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurguer());
      meal.addItem(new Pepsi());
      return meal;
   }
}
