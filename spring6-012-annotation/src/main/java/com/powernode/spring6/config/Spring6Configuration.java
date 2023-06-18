package com.powernode.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.powernode.dao", "com.powernode.service"})
public class Spring6Configuration {
}
