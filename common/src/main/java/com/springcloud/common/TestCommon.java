package com.springcloud.common;



public class TestCommon {

    private int state;
    private String mes;
    private Object data;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public TestCommon(int state,String mes,Object data){
        this.mes = mes;
        this.state = state;
        this.data = data;
    }
}
