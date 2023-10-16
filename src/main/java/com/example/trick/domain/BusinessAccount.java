package com.example.trick.domain;

public class BusinessAccount extends BaseAccount {

    protected int vipSum = 0;

    @Override
    public boolean equals(Object object) {
        if (object instanceof BusinessAccount) {
            BusinessAccount businessAccount = (BusinessAccount) object;
            return sum == businessAccount.sum && vipSum == businessAccount.vipSum;
        }
        return false;
    }

    public int hashCode() {
        return 125;
    }
}
