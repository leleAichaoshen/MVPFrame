package com.king.mvpframe.entity;

/**
 * 
 * 
 * @author 
 * @email 
 * @version 2019-10-01 23:30:55
 */
public class VipUser extends BaseEntity {

    //
    private String loginName;
    private String password;
    private String name;
    private String weChat;
    //
    private Boolean isFirstLogin;
    //
    private Integer pid;
    //
    private Boolean isAdmin;
    //
    private Integer groupId;

    private Boolean isLocked;

    private String token;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public Boolean getFirstLogin() {
        return isFirstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        isFirstLogin = firstLogin;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
