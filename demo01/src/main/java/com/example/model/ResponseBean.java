package com.example.model;

/**
 * Created by wuxiaodong on 2017/4/9.
 */
public class ResponseBean {
    private String retCode;

    private String retMsg;

    private Object result;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
