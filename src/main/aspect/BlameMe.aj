/*
 * Copyright (c) 2016.
 * me@davengeo.com
 */
package com.davengeo.aspect;

public aspect BlameMe {

    public pointcut inBlameMethod() : @this(com.davengeo.Blame);

    before(): inBlameMethod() {
        System.out.println("**********");
    }
}
