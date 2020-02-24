package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalcDiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        CalcDiapason function = new CalcDiapason();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        CalcDiapason function = new CalcDiapason();
        List<Double> result = function.diapason(3, 6, x -> x * x + x + 1);
        List<Double> expected = Arrays.asList(13D, 21D, 31D, 43D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        CalcDiapason function = new CalcDiapason();
        List<Double> result = function.diapason(1, 4, Math::log);
        List<Double> expected = Arrays.asList(0D, Math.log(2.0), Math.log(3.0), Math.log(4.0));
        assertThat(result, is(expected));
    }
}
