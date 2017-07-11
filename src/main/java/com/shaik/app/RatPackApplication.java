package com.shaik.app;

import ratpack.server.RatpackServer;

/**
 * Created by jabbars on 11/07/17.
 */
public class RatPackApplication {
    public static void main(String[] args) throws Exception{

        RatpackServer.start(serverSpec -> serverSpec
                .handlers(chain -> chain
                        .get(ctx -> ctx.render("Hello, World!"))

                )
        );
    }
}
