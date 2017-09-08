package com.example.model;

/**
 * Created by wuxiaodong on 2017/8/30.
 */
public class PriceGroupBean {
    /**
     *
     */
    private static final long serialVersionUID = -9195196064507730027L;

    private String groupid;
    private String groupname;
    private String templateid;
    private String templatename;

    private String isdelete;
    //是否是所有区服的分组，0否，1是
    private String isallserver;
    private String ct;
    private String lt;
    private String gamename;
    private String userid;
//    private List<PriceGroupServerBean> groupserverlist;
    private String groupservers;
//    private List<GameLevelBean> gameLevelBeans;
    private String notgroupid;
    private String serverid;
    public String getGroupid() {
        return groupid;
    }
    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }
    public String getGroupname() {
        return groupname;
    }
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    public String getTemplateid() {
        return templateid;
    }
    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }
    public String getIsdelete() {
        return isdelete;
    }
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }
    public String getCt() {
        return ct;
    }
    public void setCt(String ct) {
        this.ct = ct;
    }
    public String getLt() {
        return lt;
    }
    public void setLt(String lt) {
        this.lt = lt;
    }
    public String getGamename() {
        return gamename;
    }
    public void setGamename(String gamename) {
        this.gamename = gamename;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
//    public List<PriceGroupServerBean> getGroupserverlist() {
//        return groupserverlist;
//    }
//    public void setGroupserverlist(List<PriceGroupServerBean> groupserverlist) {
//        this.groupserverlist = groupserverlist;
//    }
    public String getGroupservers() {
        return groupservers;
    }
    public void setGroupservers(String groupservers) {
        this.groupservers = groupservers;
    }
    public String getIsallserver() {
        return isallserver;
    }
    public void setIsallserver(String isallserver) {
        this.isallserver = isallserver;
    }
//    public List<GameLevelBean> getGameLevelBeans() {
//        return gameLevelBeans;
//    }
//    public void setGameLevelBeans(List<GameLevelBean> gameLevelBeans) {
//        this.gameLevelBeans = gameLevelBeans;
//    }
    public String getNotgroupid() {
        return notgroupid;
    }
    public void setNotgroupid(String notgroupid) {
        this.notgroupid = notgroupid;
    }
    public String getTemplatename() {
        return templatename;
    }
    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }
    public String getServerid() {
        return serverid;
    }
    public void setServerid(String serverid) {
        this.serverid = serverid;
    }
}
