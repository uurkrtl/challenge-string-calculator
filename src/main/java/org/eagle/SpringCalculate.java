package org.eagle;

import java.util.Arrays;
import java.util.List;

public class SpringCalculate {
    static int add(String number){
        if (number.isEmpty()) return 0;
        List<String> numbers = List.of(number.split(","));
        int sum = 0;
        for (String num : numbers) sum += Integer.valueOf(num);
        return sum;
    }
}