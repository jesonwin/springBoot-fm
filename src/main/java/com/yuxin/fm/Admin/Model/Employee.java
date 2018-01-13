package com.yuxin.fm.Admin.Model;

public class Employee {
    private Integer id;//管理员账号主键
    private String userName;//用户名
    private String nickName;//别名
    private String password;//密码
    private String phone;//电话
    private String email;//邮箱号
    private String icon;//头像
    private Boolean sex;//性别
    private String birthday;//生日
    private Double account;//账户余额
    private String roleNo;//角色id
    private String roleName;//角色名字
    private String depBriefId;//职位id
    private String depBriefName;//职位名
    private Boolean state;//是否禁用；1正常，0禁用
    private String createTime;//账号创建时间
    private Boolean deleted;//是否删除；1是，0否

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDepBriefId() {
        return depBriefId;
    }

    public void setDepBriefId(String depBriefId) {
        this.depBriefId = depBriefId;
    }

    public String getDepBriefName() {
        return depBriefName;
    }

    public void setDepBriefName(String depBriefName) {
        this.depBriefName = depBriefName;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
