package com.yuxin.fm.Admin.Model;

public class Paytype {
    private int id;
    private String paytypeName;
    private int inout;
    private Boolean deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaytypeName() {
        return paytypeName;
    }

    public void setPaytypeName(String paytypeName) {
        this.paytypeName = paytypeName;
    }

    public int getInout() {
        return inout;
    }

    public void setInout(int inout) {
        this.inout = inout;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
