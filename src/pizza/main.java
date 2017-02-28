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
public class main {
    public static void main(String[]args){
        Pizza Pizza = new Pizza();
            Pizza.setToppings("pollo");
            Pizza.setSize(10);
            Pizza.setPrice(12890);
            
    System.out.println("El sabor de la pizza es "+Pizza.getToppings()+ " el diametro es "+ Pizza.getSize() + " y el precio es "+ Pizza.getPrice());
    }
   
   
            
    
}
