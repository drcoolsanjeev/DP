/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeev
 */
public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;
    public SteamedMilk(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription(){
        return beverage.getDescription()+",SteamedMilk";
    }
    public double cost(){
        return .20 + beverage.cost();
    }
}