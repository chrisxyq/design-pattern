package com.chrisxyq.design.listener;

import com.chrisxyq.design.LotteryResult;

/**
 * 事件监听接口定义
 */
public interface EventListener {

    void doEvent(LotteryResult result);

}
