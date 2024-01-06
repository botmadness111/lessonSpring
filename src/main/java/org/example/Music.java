package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

public interface Music {
    String getSong();

    List<String> getSongs();

}
