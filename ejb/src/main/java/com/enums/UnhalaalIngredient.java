/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.enums;

/**
 * @author T.Menad
 */
public enum UnhalaalIngredient {

    PROC("porc"), 
    ALCOHOL("rhum"),
    BACON("Bacon"),
    CHOLESTSOROL("Choletsorol"),
    DIGLYCERIDE("Diglyceride"),
    GELATIN("Gelatin"),
    GLYCEROL("Glycerol--suspected"),
    LARD("Lard"),
    MAGNESIUM_STEARATE (""),
    MONO_GLYCERIDES("Mono Glycerides"),
    PEPSIN("Pepsin"),
    RENNIN("Rennin"),
    RENNET("Rennet"),
    SHORTENING("Shortening"),
    VANILLA("Vanilla"),
    WHEY("Whey"),
    TARTRAZINE("Tartrazine--doubt"),
    E120("E120"),
    E_120("E-120"),
    E441("E441"),
    E542("E542"),
    E904("E904");
    
    
    
    

    private String name;

    private UnhalaalIngredient(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
