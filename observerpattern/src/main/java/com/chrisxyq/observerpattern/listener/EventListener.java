package com.chrisxyq.observerpattern.listener;

import com.chrisxyq.observerpattern.LotteryResult;

/**
 * 事件监听接口定义
 */
public interface EventListener {

    void doEvent(LotteryResult result);

}
