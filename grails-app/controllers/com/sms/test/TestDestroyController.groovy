package com.sms.test

/**
 * Created by tbartalos on 8/22/16.
 */
class TestDestroyController {
    def testDestroyService

    def destroy = {
        testDestroyService.destroy()
        render "OK"
    }
}
