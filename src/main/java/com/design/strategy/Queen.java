package com.design.strategy;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:36
 */
public class Queen extends Character
{
    //����Ĭ���ý���ɱ
    public Queen()
    {
        weaponBehavior=new SwordBehavior();
    }

    @Override
    void fight()
    {
        System.out.println("Queen fight");
    }
}
