package ch.iterial.recrutment.java.expressions;

import ch.iterial.recrutment.java.expressions.base.Expression;

/**
 * Created by Evgeniy Skiba on 30.03.21
 */
public class LiteralExpression implements Expression {
    private final int literal;

    private final String expresionResult;

    public LiteralExpression(int literal, String expresionResult) {
        this.literal = literal;
        this.expresionResult = expresionResult;
    }

    @Override
    public int getExpressionResult() {
        return literal;
    }

    @Override
    public String getExpressionFormat() {
        return expresionResult;
    }
}
