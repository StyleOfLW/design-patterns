package com.design.strategy;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:34
 */
public class King extends Character
{
    //����Ĭ����ذ�״�ɱ
    public King()
    {
        weaponBehavior=new KnifeBehavior();
    }
    @Override
    void fight()
    {
        System.out.println("King fight");
    }


}
