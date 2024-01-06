package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz Music";
    }

    @Override
    public List<String> getSongs() {
        return null;
    }
}
