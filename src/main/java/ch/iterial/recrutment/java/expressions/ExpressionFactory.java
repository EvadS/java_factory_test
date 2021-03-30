package ch.iterial.recrutment.java.expressions;


import ch.iterial.recrutment.java.expressions.base.Expression;

public class ExpressionFactory {

    public static Expression literal(final int value) {
        return new LiteralExpression(value, String.valueOf(value));
    }

    public static Expression add(final Expression... expressions) {
        return new AddExpression(expressions);
    }

    public static Expression multiply(final Expression... expressions) {
        return new MultiplyExpression(expressions);
    }

}
