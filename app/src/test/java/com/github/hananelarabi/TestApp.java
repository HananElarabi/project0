package com.github.hananelarabi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TestApp {
    @Test
    public void checkApprunning(){

        App app = new App();
        assertNotNull(app);

    }


}
