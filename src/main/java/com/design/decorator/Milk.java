package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 23:10
 * �ڶ��ֵ�ζƷ������
 */
public class Milk extends CondimentDecorator
{
    //���ڱ�װ�ε�ʵ��
    private Beverage beverage;

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;

    }

    @Override
    public String getDecription()
    {
        return beverage.getDescription()+",Milk";
    }

    @Override
    protected float getCost()
    {
        return beverage.getCost()+0.30f;
    }
}
