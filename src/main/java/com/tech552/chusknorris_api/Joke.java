package com.tech552.chusknorris_api;
//POJO = Plain old java object
public class Joke {
    private String value;

    public Joke() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value ;
    }


}
