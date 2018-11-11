package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 23:04
 * ��һ�־��屻װ���ߣ�Ũ������
 */
public class Espresso extends Beverage
{
    //Ϊ��֤�������֣��˴��ڹ��췽���и��½���
    public Espresso()
    {
        description="Espresso";
    }

    @Override
    protected float getCost()
    {
        return 1.99f;
    }
}
