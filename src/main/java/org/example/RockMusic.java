package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

}
