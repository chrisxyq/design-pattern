package com.chrisxyq.observerpattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LotteryResult {

    private String uId;    // 用户ID
    private String msg;    // 摇号信息
    private Date   dateTime; // 业务时间

}
