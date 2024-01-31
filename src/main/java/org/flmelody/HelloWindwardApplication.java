package org.flmelody;

import org.flmelody.core.Windward;

/**
 * @author esotericman
 */
public class HelloWindwardApplication {
    public static void main(String[] args) {
        Windward.setup()
                .get("/", simpleWindwardContext -> {
                    simpleWindwardContext.writeString("Hello ! windward !");
                }).get("/json", simpleWindwardContext -> {
                    simpleWindwardContext.writeJson("""
                            {        \s
                            "server": "windward"
                            }
                            """);
                })
                .get("/inner", simpleWindwardContext -> {
                    simpleWindwardContext.html("inner.html", null);
                })
                .resource("/**.html", "/**.js", "/**.css")
                .run();
    }
}
