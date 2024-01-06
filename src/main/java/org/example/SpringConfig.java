package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
