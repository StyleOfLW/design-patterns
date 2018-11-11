package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 22:45
 * ��װ���߳����࣬�����һ���ӿڣ������漰�����ڱ�װ�ε���������ǰ�����������ģ������ǽӿڵĿ����Խ�С�����Դ˴��ó�����
 * ���ã�Ϊ��ͳһװ������,�Կ���Ϊ�����������ϡ�
 *
 * ��װ����ģʽ�д�������ֿ���ͳһд�� [Component]
 */
public abstract class Beverage
{
    //����
    protected String description="Unknown Beverage";

    //���ϼ۸�
    private float cost;

    public String getDescription()
    {
        return description;
    }

    protected abstract float getCost();
}
