package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 22:57
 * ����װ������Ϊ��֤װ�����ͣ��̳���ͳһ�齨Component
 * �˴���װ����Ϊ��ζƷ
 *
 * ��װ����ģʽ�У���������ֿ���ͳһд�� [Decorator]
 */
public abstract class CondimentDecorator extends Beverage
{
    //��Ϊÿ����ζƷ�Ľ����Ǳ���ģ����Դ˴���Ҫ�޸��£�ʹ��ÿ�������װ���������޸������
    abstract protected String getDecription();
}
