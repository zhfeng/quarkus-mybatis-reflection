package org.acme.getting.started;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Test {
    private String test;

    public Test() {
        this.test = "test";
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest() {
        return  test;
    }
}
