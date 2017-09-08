package com.example.model;

/**
 * Created by wuxiaodong on 2017/8/30.
 */
public class PriceCalculateBean {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private Integer ratio;//比例
    private Integer beginIndex;//起始段位的索引
    private Integer endIndex;//目标段位的索引

    private Integer runeslevel;//符文等级,王者荣耀用
    private Integer beginstar;//起始段位的星值,王者荣耀用
    private Integer endstar;//目标段位的星值,王者荣耀用

    private Integer beginpoint;//起始段位胜点数,英雄联盟用
    private Integer endpoint;//目标段位胜点数,英雄联盟用
    private Integer final_win;//晋级赛胜利场数,英雄联盟用
    private Integer final_fail;//晋级赛失败场数,英雄联盟用
    private Integer locate_number;//定位赛场数,英雄联盟用
    private Integer lastlocateIndex;//上赛季大段位的索引,英雄联盟用

//    private GameGradeBean beginGradeBean;//起始段位系统信息
//    private GameGradeBean endGradeBean;//末尾段位的系统信息
//    private PriceTemplateBean priceTemplateBean;//模板信息
//    private PriceGroupBean priceGroupBean;//价格分组信息
    public Integer getRuneslevel() {
        return runeslevel;
    }
    public void setRuneslevel(Integer runeslevel) {
        this.runeslevel = runeslevel;
    }
    public Integer getBeginstar() {
        return beginstar;
    }
    public void setBeginstar(Integer beginstar) {
        this.beginstar = beginstar;
    }
    public Integer getEndstar() {
        return endstar;
    }
    public void setEndstar(Integer endstar) {
        this.endstar = endstar;
    }

//    public GameGradeBean getBeginGradeBean() {
//        return beginGradeBean;
//    }
//    public void setBeginGradeBean(GameGradeBean beginGradeBean) {
//        this.beginGradeBean = beginGradeBean;
//    }
//    public GameGradeBean getEndGradeBean() {
//        return endGradeBean;
//    }
//    public void setEndGradeBean(GameGradeBean endGradeBean) {
//        this.endGradeBean = endGradeBean;
//    }
//    public PriceTemplateBean getPriceTemplateBean() {
//        return priceTemplateBean;
//    }
//    public void setPriceTemplateBean(PriceTemplateBean priceTemplateBean) {
//        this.priceTemplateBean = priceTemplateBean;
//    }
//    public PriceGroupBean getPriceGroupBean() {
//        return priceGroupBean;
//    }
//    public void setPriceGroupBean(PriceGroupBean priceGroupBean) {
//        this.priceGroupBean = priceGroupBean;
//    }
    public Integer getRatio() {
        return ratio;
    }
    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }
    public Integer getBeginIndex() {
        return beginIndex;
    }
    public void setBeginIndex(Integer beginIndex) {
        this.beginIndex = beginIndex;
    }
    public Integer getEndIndex() {
        return endIndex;
    }
    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }
    public Integer getBeginpoint() {
        return beginpoint;
    }
    public void setBeginpoint(Integer beginpoint) {
        this.beginpoint = beginpoint;
    }
    public Integer getEndpoint() {
        return endpoint;
    }
    public void setEndpoint(Integer endpoint) {
        this.endpoint = endpoint;
    }
    public Integer getFinal_win() {
        return final_win;
    }
    public void setFinal_win(Integer final_win) {
        this.final_win = final_win;
    }
    public Integer getFinal_fail() {
        return final_fail;
    }
    public void setFinal_fail(Integer final_fail) {
        this.final_fail = final_fail;
    }
    public Integer getLocate_number() {
        return locate_number;
    }
    public void setLocate_number(Integer locate_number) {
        this.locate_number = locate_number;
    }
    public Integer getLastlocateIndex() {
        return lastlocateIndex;
    }
    public void setLastlocateIndex(Integer lastlocateIndex) {
        this.lastlocateIndex = lastlocateIndex;
    }

}
