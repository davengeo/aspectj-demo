/*
 * Copyright (c) 2016.
 * me@davengeo.com
 */
package com.davengeo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteDecoration implements Decoration{

    public final static Logger LOG = LoggerFactory.getLogger(ConcreteDecoration.class);
    @Override
    public void receive() {
        LOG.info("...");
        LOG.info("RECEIVING");
    }
}
