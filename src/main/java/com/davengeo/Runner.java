/*
 * Copyright (c) 2016.
 * me@davengeo.com
 */
package com.davengeo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner, Decoration{

    Logger LOG = LoggerFactory.getLogger(Runner.class);

    @SuppressWarnings("unused")
    private Decoration decoration;

    @Blame
    @Override
    public void run(String... strings) throws Exception {
        LOG.info("daven here");
    }

    @Override
    public void receive() {
        decoration.receive();
    }

    public Decoration getDecoration() {
        return decoration;
    }

}
