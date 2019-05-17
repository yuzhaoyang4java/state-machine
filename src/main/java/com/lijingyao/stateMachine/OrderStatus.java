package com.lijingyao.stateMachine;

/**
 * Created by lijingyao on 2017/11/24 11:42.
 */
public enum OrderStatus {

    // 待支付，待发货，待收货，订单结束（确认收货触发）,订单退款（退货事件触发）
    WAIT_PAYMENT, WAIT_DELIVER, WAIT_RECEIVE, FINISH, CLOSED;
}
