package com.design.decorator;

import com.sun.jndi.ldap.Ber;
import org.junit.Test;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 23:13
 */
public class DecoratorTest
{
    @Test
    public void test()
    {
        //����һ������
        Beverage beverage=new HoseBlend();
        System.out.println(beverage.getDescription()+"$"+beverage.getCost());

        //����
        beverage=new Milk(beverage);
        System.out.println(beverage.getDescription()+"$"+beverage.getCost());

        //Ħ��
        beverage=new Mocha(beverage);

        System.out.println(beverage.getDescription()+" $"+beverage.getCost());
    }
}
