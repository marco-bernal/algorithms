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
class PalindromeTest {

    @Autowired
    private Palindrome service;

    @Test
    void shouldCheckIfAStringIsPalindrome() {
        //given
        String value = "caleselac";

        //when
        boolean result = service.isPalindrome(value);

        //then
        assertThat(result).isTrue();
    }
}
