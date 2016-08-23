package com.sms.test

import org.springframework.beans.factory.DisposableBean

/**
 * Created by tbartalos on 8/22/16.
 */
class TestDestroyService implements DisposableBean {

    @Override
    void destroy() throws Exception {
        println("Destroying from disposable bean ....")
        TestDestroy objFromMap = new TestDestroy(x: "x")
        TestDestroy objSetter = new TestDestroy()
        objSetter.x = "x"
        TestDestroyPojo pojo = new TestDestroyPojo(x: "x")

        println("DisposableBean: Domain Map constructor has correct props: ${objFromMap.x == "x"}")
        println("DisposableBean: Domain setter has correct props: ${objSetter.x == "x"}")
        println("DisposableBean: Pojo has correct props: ${pojo.x == "x"}")
    }

    void destroyFromBootstrap() {
        println("Destroying  bootstrap....")

        TestDestroy objFromMap = new TestDestroy(x: "x")
        TestDestroy objSetter = new TestDestroy()
        objSetter.x = "x"
        TestDestroyPojo pojo = new TestDestroyPojo(x: "x")

        println("Bootstrap: Domain Map constructor has correct props: ${objFromMap.x == "x"}")
        println("Bootstrap: Domain setter has correct props: ${objSetter.x == "x"}")
        println("Bootstrap: Pojo has correct props: ${pojo.x == "x"}")
    }
}