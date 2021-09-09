package com.amazon.spapi.client;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Pair {
    private String name = "";
    private String value = "";

    public Pair(String name, String value) {
        setName(name);
        setValue(value);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (!isValidString(name)) return;
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    private void setValue(String value) {
        if (!isValidString(value)) return;
        this.value = value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) return false;
        if (arg.trim().isEmpty()) return false;
        return true;
    }
}
