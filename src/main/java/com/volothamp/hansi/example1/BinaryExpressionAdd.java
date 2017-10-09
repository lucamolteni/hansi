package com.volothamp.hansi.example1;

public class BinaryExpressionAdd {

    private int leftOperand;

    public BinaryExpressionAdd(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int add(int rightOperand) {
        return leftOperand + rightOperand;
    }
}
