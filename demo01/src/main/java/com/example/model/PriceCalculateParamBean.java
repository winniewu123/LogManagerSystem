package com.example.model;

/**
 * Created by wuxiaodong on 2017/8/30.
 */
public class PriceCalculateParamBean {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private String gamename;
    private String areaname;
    private String servername;
    private String begingrade;
    private String endgrade;
    private String userid;
    private String templateid;
    private String ratio;//比例，最终结果与比例相乘，100表示100%，默认100
    private String decimal;//价格小数位，0表示返回整数价格，1保留1位小数，2保留两位小数。最后一位四舍五入

    //王者荣耀特有
    private String runeslevel;//符文等级，王者荣耀特有
    private String beginstar;//起始段位的星数，王者荣耀特有
    private String endstar;//目标段位的星数，王者荣耀特有

    //英雄联盟特有
    private String beginpoint;//起始胜点
    private String endpoint;//末尾胜点
    private String finalWin;//晋级赛胜利场数
    private String finalFail;//晋级赛失败场数
    private String locateNumber;//定位赛场次
    private String lastlocateLevel;//上赛季定位级别

    //当前胜点
    private String point;



    //代练类型 排位 晋级 定位
    private String dlType;

    //定位赛需打场数
    private String dwNumber;

    //

    private String price;//价格
    private String requiretime;//代练要求时间
    private String deposit;//保证金

    private String type;//类型：单双排,组排,定位,晋级,净胜,赏金,成就

    private String msg;//提示信息

    public String getBegingrade() {
        return begingrade;
    }
    public void setBegingrade(String begingrade) {
        this.begingrade = begingrade;
    }
    public String getEndgrade() {
        return endgrade;
    }
    public void setEndgrade(String endgrade) {
        this.endgrade = endgrade;
    }
    public String getRuneslevel() {
        return runeslevel;
    }
    public void setRuneslevel(String runeslevel) {
        this.runeslevel = runeslevel;
    }
    public String getBeginstar() {
        return beginstar;
    }
    public void setBeginstar(String beginstar) {
        this.beginstar = beginstar;
    }
    public String getEndstar() {
        return endstar;
    }
    public void setEndstar(String endstar) {
        this.endstar = endstar;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getTemplateid() {
        return templateid;
    }
    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }
    public String getRatio() {
        return ratio;
    }
    public void setRatio(String ratio) {
        this.ratio = ratio;
    }
    public String getGamename() {
        return gamename;
    }
    public void setGamename(String gamename) {
        this.gamename = gamename;
    }
    public String getAreaname() {
        return areaname;
    }
    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }
    public String getServername() {
        return servername;
    }
    public void setServername(String servername) {
        this.servername = servername;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getDecimal() {
        return decimal;
    }
    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }
    public String getRequiretime() {
        return requiretime;
    }
    public void setRequiretime(String requiretime) {
        this.requiretime = requiretime;
    }
    public String getDeposit() {
        return deposit;
    }
    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBeginpoint() {
        return beginpoint;
    }
    public void setBeginpoint(String beginpoint) {
        this.beginpoint = beginpoint;
    }
    public String getEndpoint() {
        return endpoint;
    }
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getLocateNumber() {
        return locateNumber;
    }
    public void setLocateNumber(String locateNumber) {
        this.locateNumber = locateNumber;
    }
    public String getLastlocateLevel() {
        return lastlocateLevel;
    }
    public void setLastlocateLevel(String lastlocateLevel) {
        this.lastlocateLevel = lastlocateLevel;
    }
    public String getPoint() {
        return point;
    }
    public void setPoint(String point) {
        this.point = point;
    }
    public String getDlType() {
        return dlType;
    }
    public void setDlType(String dlType) {
        this.dlType = dlType;
    }
    public String getDwNumber() {
        return dwNumber;
    }
    public void setDwNumber(String dwNumber) {
        this.dwNumber = dwNumber;
    }
    public String getFinalWin() {
        return finalWin;
    }
    public void setFinalWin(String finalWin) {
        this.finalWin = finalWin;
    }
    public String getFinalFail() {
        return finalFail;
    }
    public void setFinalFail(String finalFail) {
        this.finalFail = finalFail;
    }
}
