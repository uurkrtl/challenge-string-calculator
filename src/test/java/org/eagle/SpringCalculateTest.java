package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpringCalculateTest {
    @Test
    public void testAdd(){
        Assertions.assertEquals(16, SpringCalculate.add("1,3,5,7"));
        Assertions.assertEquals(1, SpringCalculate.add("1"));
        Assertions.assertEquals(0, SpringCalculate.add(""));
    }
}