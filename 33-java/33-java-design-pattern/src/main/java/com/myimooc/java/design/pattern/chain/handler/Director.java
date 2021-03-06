package com.myimooc.java.design.pattern.chain.handler;

/**
 * @author zc
 * @version 1.0 2017-08-30
 * @title 责任链模式
 * @describe 销售总监， 可以批准40%以内的折扣
 */
public class Director extends AbstractPriceHandler {
    private static final float DISCOUNT = 0.4f;

    @Override
    public void processDiscount(float discount) {
        if (discount <= DISCOUNT) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }

    }

}
