package org.flmelody;

import org.flmelody.core.Windward;

/**
 * @author esotericman
 */
public class HelloWindwardApplication {
    public static void main(String[] args) {
        Windward.setup().get("/", simpleWindwardContext -> {
            simpleWindwardContext.writeString("Hello ! windward !");
        }).run();
    }
}
