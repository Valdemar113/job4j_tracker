package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DiapasonFuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25.0, 36.0, 49.0);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentFunctionThenExponentResults() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(3125.0, 46656.0, 823543.0);
        assertThat(result, is(expected));
    }

}