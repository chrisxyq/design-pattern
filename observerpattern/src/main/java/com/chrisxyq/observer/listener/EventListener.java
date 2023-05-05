package com.chrisxyq.observer.listener;

import com.chrisxyq.observer.LotteryResult;

public interface EventListener {

    void doEvent(LotteryResult result);

}
