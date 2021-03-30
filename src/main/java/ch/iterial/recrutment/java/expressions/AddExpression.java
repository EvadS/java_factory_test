package ch.iterial.recrutment.java.expressions;


import ch.iterial.recrutment.java.expressions.base.Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Evgeniy Skiba on 30.03.21
 */
public class AddExpression implements Expression {
    private final List<Expression> additionsExpresion = new ArrayList<>();


    public AddExpression(final Expression... expression) {
        additionsExpresion.addAll(Arrays.stream(expression).collect(Collectors.toList()));
    }

    @Override
    public int getExpressionResult() {
        return additionsExpresion.stream()
                .map(Expression::getExpressionResult)
                .reduce(0, Integer::sum);
    }

    @Override
    public String getExpressionFormat() {
        StringBuilder expressionFormat = new StringBuilder("(+");
        for (Expression expression : additionsExpresion) {
            expressionFormat.append(" ")
                    .append(expression.getExpressionFormat());
        }
        expressionFormat.append(")");
        return expressionFormat.toString();
    }
}
