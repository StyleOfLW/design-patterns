package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 23:04
 * �ڶ��־��屻װ���ߣ��ۺϿ���
 */
public class HoseBlend extends Beverage
{
    //Ϊ��֤�������֣��˴��ڹ��췽���и��½���
    public HoseBlend()
    {
        description="House Blend coffee";
    }

    @Override
    protected float getCost()
    {
        return 1.22f;
    }
}
