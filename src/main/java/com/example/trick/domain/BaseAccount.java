package com.example.trick.domain;

public class BaseAccount {

    protected int sum = 0;

    @Override
    public boolean equals(Object object) {
        if (object instanceof BaseAccount) {
            BaseAccount baseAccount = (BaseAccount) object;
            return sum == baseAccount.sum;
        }
        return false;
    }
}
