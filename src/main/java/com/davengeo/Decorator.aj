/*
 * Copyright (c) 2016.
 * me@davengeo.com
 */
package com.davengeo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

import static org.springframework.util.ReflectionUtils.findField;

public aspect Decorator {

    private static final Logger LOG = LoggerFactory.getLogger(Decorator.class);

    public pointcut inRunner(): execution(Runner.new(..));

    after(): inRunner() {
        LOG.info("New Runner:{} " +  thisJoinPoint.getThis());
        final Field toDecorate = findField(thisJoinPoint.getTarget().getClass(), "decoration");
        try {
            toDecorate.setAccessible(true);
            toDecorate.set(thisJoinPoint.getTarget(), new ConcreteDecoration());
            toDecorate.setAccessible(false);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
