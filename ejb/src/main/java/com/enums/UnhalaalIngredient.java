/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.enums;

/**
 * @author T.Menad
 */
public enum UnhalaalIngredient {

    PROC("porc"), ALCOHOL("rhum");

    private String name;

    private UnhalaalIngredient(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
