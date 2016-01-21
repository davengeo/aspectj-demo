/*
 * Copyright (c) 2016.
 * me@davengeo.com
 */
package com.davengeo;

public aspect BlameMe {

    public pointcut inBlameMethod(): execution(public void Runner.run(..));

    before(): inBlameMethod() {
        System.out.println("**********");
    }
}
