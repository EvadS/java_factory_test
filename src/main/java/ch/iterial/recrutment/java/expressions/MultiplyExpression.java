package ch.iterial.recrutment.java.expressions;

import ch.iterial.recrutment.java.expressions.base.Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Evgeniy Skiba on 30.03.21
 */
public class MultiplyExpression implements Expression {
    private final List<Expression> multiplies = new ArrayList<>();


    public MultiplyExpression(Expression... expression) {
        multiplies.addAll(Arrays.stream(expression).collect(Collectors.toList()));
    }

    @Override
    public int getExpressionResult() {
        return multiplies.stream()
                .map(Expression::getExpressionResult)
                .reduce(1, (a, b) -> a * b);
    }

    @Override
    public String getExpressionFormat() {
        StringBuilder expressionFormat = new StringBuilder("(*");
        for (Expression expression : multiplies) {
            expressionFormat.append(" ")
                    .append(expression.getExpressionFormat());
        }
        expressionFormat.append(")");
        return expressionFormat.toString();
    }
}