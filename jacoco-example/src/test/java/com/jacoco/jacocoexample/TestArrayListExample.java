package com.jacoco.jacocoexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestArrayListExample {

    @Test
    public void testListSize(){
        ArrayListExamples examples = new ArrayListExamples();

        Assertions.assertEquals(10,examples.getList().size());
    }

    @Test
    public void testAddElements(){
        ArrayListExamples examples = new ArrayListExamples();

        assertThat(Arrays.asList(1L, 3L, 2L), equalTo(examples.addElements()));
    }
}
