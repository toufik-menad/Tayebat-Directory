/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.pojo;

import com.opencsv.bean.CsvBindByName;

/**
 * @author T.Menad
 */
public class CodePojo {
    
    @CsvBindByName(column="_id")
    private String code;

    /**
     * Getter for code.
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter for code.
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
}
