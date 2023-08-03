package com.mab.data_structures;

import org.junit.jupiter.api.Test;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class StackTest {

    @Test
    void shouldPerformAllOperationsSuccessfully() {
        Stack stack = new Stack();
        System.out.println(format("Is stack empty: %1$s ", stack.isEmpty()));

        System.out.println(format("Element: %1$d added to stack.", stack.push(66)));
        System.out.println(format("Element: %1$d added to stack.", stack.push(69)));
        System.out.println(format("Element: %1$d added to stack.", stack.push(96)));
        System.out.println(format("Element: %1$d added to stack.", stack.push(169)));

        System.out.println(format("Is stack empty: %1$s ", stack.isEmpty()));

        System.out.println(format("Latest element in stack is: %1$d", stack.peek()));

        System.out.println(format("Element: %1$d deleted from stack.", stack.pop()));

        System.out.println(format("Latest element in stack is: %1$d", stack.peek()));

        System.out.println(format("Element: %1$d deleted from stack.", stack.pop()));
        System.out.println(format("Element: %1$d deleted from stack.", stack.pop()));
        System.out.println(format("Element: %1$d deleted from stack.", stack.pop()));

        System.out.println(format("Is stack empty: %1$s ", stack.isEmpty()));
    }

    @Test
    void shouldThrowNullPointerExceptionWhenStackIsEmptyAndTryingToGetItsPeek() {
        Stack stack = new Stack();
        System.out.println(format("Is stack empty: %1$s ", stack.isEmpty()));

        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> stack.peek())
                .withMessage("Stack doesn't contain any element");

    }

    @Test
    void shouldThrowNullPointerExceptionWhenStackIsEmptyAndTryingToDeleteAnElement() {
        Stack stack = new Stack();
        System.out.println(format("Is stack empty: %1$s ", stack.isEmpty()));

        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> stack.pop())
                .withMessage("Stack doesn't contain any element");

    }
}
