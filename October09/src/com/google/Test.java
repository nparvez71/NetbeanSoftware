/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

/**
 *
 * @author J2EE-33
 */
class Test {//question 04

    private Demo d;

    void start() {
        d = new Demo();
        this.takeDemo(d);
    }

    void takeDemo(Demo demo) {
        demo = null;
        demo = new Demo();
    }
}
