package com.volothamp.hansi.example1;

public class BinaryExpression {

    private int leftOperand;

    public BinaryExpression(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int add(int rightOperand) {
        return leftOperand + rightOperand;
    }

    public int mulitply(int rightOperand) {
        return leftOperand * rightOperand;
    }
}
