package com.design.observer;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 15:36
 */
public interface Observer
{
    /**
     * ��Ҫ���µ����ݣ��˴���������ʵ���Է�װ��һ���ࣩ
     * @param temp �¶�
     * @param humdity ʪ��
     * @param pressure ��ѹ
     */
    void update(float temp,float humdity,float pressure);
}
