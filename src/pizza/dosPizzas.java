/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Estudiante
 */
public class dosPizzas {
    public static void main(String[]args){
        Pizza pizza1 = new Pizza();
        pizza1.setToppings("carne");  
        pizza1.setSize(34);
        pizza1.setPrice(2354);
    
       Pizza pizza2 = new Pizza();
       pizza2.setToppings("pollo");
       pizza2.setSize(14);
       pizza2.setPrice(45666);
       
        
    System.out.println("El sabor de la pizza es "+pizza1.getToppings()+ " el diametro es "+ pizza1.getSize() + " y el precio es "+ pizza1.getPrice()+
            ",el sabor de la pizza es " +pizza2.getToppings()+ " el diametro es "+ pizza2.getSize()+ " y el precio es "+ pizza2.getPrice());
    }
} 



