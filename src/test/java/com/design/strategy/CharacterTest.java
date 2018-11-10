package com.design.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:56
 */
public class CharacterTest
{
    @Test
    public void test()
    {
        //1.ѡ��һ����ɫKing
        Character character=new King();
        //2.ʹ�ã�Ĭ��ذ�״�ɱ
        character.performUserWeapon();

        //3.��������ΪSword
        character.setWeaponBehavior(new SwordBehavior());
        //4.ʹ��
        character.performUserWeapon();
    }


    //output:
    //use knife to kill
    //use sword to kill
}