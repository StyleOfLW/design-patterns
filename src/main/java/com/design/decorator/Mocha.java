package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 23:10
 * ��һ�ֵ�ζƷ��Ħ��
 */
public class Mocha extends CondimentDecorator
{
    //���ڱ�װ�ε�ʵ��
    private Beverage beverage;

    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    protected String getDecription()
    {
        return this.beverage.getDescription()+",Mocha";
    }

    @Override
    protected float getCost()
    {
        return beverage.getCost()+0.20f;
    }
}
