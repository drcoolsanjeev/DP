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
public class SimplePizzaFactory {
    public Pizza createPizza(String type){

		Pizza pizza=null;

		if(type.equals("cheese"))
			pizza=new CheesePizza();
		else if(type.equals("veggie"))
			pizza=new VeggiePizza();
		else if(type.equals("pepricorn"))
			pizza=new PepricornPizza();
		return pizza;

	}
}
