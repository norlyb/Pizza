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
public class diezPizzas {
    Scanner lectura = new Scanner(System.in);
    Pizza [] pizzas = new Pizza[10];
    for (int i = 0; i<10; i++){
        pizzas[i] = new Pizza();
        System.out.println("sabor" + i);
        pizzas[i].setToppings(lectura.next());
        
        
        
}
    
}
