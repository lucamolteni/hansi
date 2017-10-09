package com.volothamp.hansi.example1;

public class BinaryExpressionMultiply {

    private int leftOperand;

    public BinaryExpressionMultiply(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int multiply(int rightOperand) {
        return leftOperand * rightOperand;
    }
}
