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
public abstract class Pizza {
    private String name;
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	void prepare(){
		System.out.println("Preparing "+name+"pizza");
	}
	void bake(){
		System.out.println("bake pizza for 15 minutes");
	}
	void cut(){
		System.out.println("Cutting the pizza");
	}
	void box(){
		System.out.println("putting in box");
	}
}
