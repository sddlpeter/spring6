package com.powernode.biz;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.powernode.biz")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Config {
}
