/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza_test;

/**
 *
 * @author sanjeev
 */
public class PizzaStore {
    SimplePizzaFactory factory=new SimplePizzaFactory();
	

	Pizza orderPizza(String type){
		Pizza pizza;
		pizza=factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
