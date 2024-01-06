package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public List<String> getSongs() {
        return new ArrayList<>(Arrays.asList("rock1", "rock2", "rock3"));
    }
}
