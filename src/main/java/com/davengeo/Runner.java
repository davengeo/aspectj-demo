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
public class Runner implements CommandLineRunner{
    Logger LOG = LoggerFactory.getLogger(Runner.class);

    @Blame
    @Override
    public void run(String... strings) throws Exception {
        LOG.info("daven here");
    }
}
