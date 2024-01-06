package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz Music";
    }

}
