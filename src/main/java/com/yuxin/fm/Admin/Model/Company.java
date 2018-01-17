package com.yuxin.fm.Admin.Model;

public class Company {
    private Long id;
    private String comname;
    private String comdrief;
    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getComdrief() {
        return comdrief;
    }

    public void setComdrief(String comdrief) {
        this.comdrief = comdrief;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
