class BootStrap {
    def testDestroyService

    def init = { servletContext ->
    }
    def destroy = {
        testDestroyService.destroyFromBootstrap()
    }
}
