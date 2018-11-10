package com.design.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:40
 */
public class CharacterTest
{
    @Test
    public void test()
    {
        //ѡ��һ����ɫKing
        Character character=new King();
        //ѡ��һ������Knife
        character.setWeaponBehavior(new KnifeBehavior());

        //ʹ��
        character.performUserWeapon();

        //��������ΪSword
        character.setWeaponBehavior(new SwordBehavior());
        //ʹ��
        character.performUserWeapon();
    }


    //output:
    //use knife to kill
    //use sword to kill

}