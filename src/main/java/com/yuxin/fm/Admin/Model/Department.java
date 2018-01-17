package com.yuxin.fm.Admin.Model;

public class Department {
    private Long id;
    private String depname;
    private String depdrief;
    private int cid;
    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getDepdrief() {
        return depdrief;
    }

    public void setDepdrief(String depdrief) {
        this.depdrief = depdrief;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public static interface MemberServiceDao {
    }
}
