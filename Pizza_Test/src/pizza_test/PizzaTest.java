/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza_test;
import java.util.*;
import java.io.*;
/**
 *
 * @author sanjeev
 */
public class PizzaTest {
    	public static void main(String[] args)throws IOException{
		PizzaStore ps=new PizzaStore();
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String pizzatype = br.readLine();
		Pizza p1=ps.orderPizza(pizzatype);
		System.out.println("A ordered"+p1.getName());

	}
}
