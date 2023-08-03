package com.mab.algorithms.misc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Java6Assertions.assertThat;

//TODO: delete spring
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ReverseStringTest {

    @Autowired
    private ReverseString service;

    @Test
    void shouldReverseAGivenString() {
        //given
        String input = "whatever";

        //when
        String output = service.reverseString(input);

        //then
        assertThat(output).isEqualTo("revetahw");
    }

}
