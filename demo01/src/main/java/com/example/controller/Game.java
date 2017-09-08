package com.example.controller;

import java.util.List;

/**
 * Created by wuxiaodong on 2017/9/1.
 */
public class Game {
        private String id;
        private String name;
        private String gameid;
        private String groupid;
        private String px;
        private String ishot;
//    定义私有的代练类型的列表
        private List<String> dltype;
        private List<Game> list;
    public static void main ( String[] args) {
        String dl1771_gameList = "[{id:'G603',name:'英雄联盟',px:'Y',ishot:'1',dltype:['段位','等级','陪玩','匹配','晋级','金币','其他']}]";
        String dl1771_groupList = "[{id:'G603P004',name:'全区全服',gameid:'G603'},{id:'G603P001',name:'电信',gameid:'G603'},{id:'G603P002',name:'网通',gameid:'G603'},{id:'G603P003',name:'体验区',gameid:'G603'}]";
        String dl1771_serverList = "[{id:'G603P001001',name:'艾欧尼亚',gameid:'G603',groupid:'G603P001'},{id:'G603P001002',name:'祖安',gameid:'G603',groupid:'G603P001'},{id:'G603P001003',name:'诺克萨斯',gameid:'G603',groupid:'G603P001'},{id:'G603P001004',name:'班德尔城',gameid:'G603',groupid:'G603P001'},{id:'G603P001005',name:'皮尔特沃夫',gameid:'G603',groupid:'G603P001'},{id:'G603P001006',name:'战争学院',gameid:'G603',groupid:'G603P001'},{id:'G603P001007',name:'巨神峰',gameid:'G603',groupid:'G603P001'},{id:'G603P001008',name:'雷瑟守备',gameid:'G603',groupid:'G603P001'},{id:'G603P001009',name:'裁决之地',gameid:'G603',groupid:'G603P001'},{id:'G603P001010',name:'黑色玫瑰',gameid:'G603',groupid:'G603P001'},{id:'G603P001011',name:'暗影岛',gameid:'G603',groupid:'G603P001'},{id:'G603P001012',name:'钢铁烈阳',gameid:'G603',groupid:'G603P001'},{id:'G603P001013',name:'均衡教派',gameid:'G603',groupid:'G603P001'},{id:'G603P001014',name:'水晶之痕',gameid:'G603',groupid:'G603P001'},{id:'G603P001015',name:'教育网专区',gameid:'G603',groupid:'G603P001'},{id:'G603P001016',name:'影流',gameid:'G603',groupid:'G603P001'},{id:'G603P001017',name:'守望之海',gameid:'G603',groupid:'G603P001'},{id:'G603P001018',name:'征服之海',gameid:'G603',groupid:'G603P001'},{id:'G603P001019',name:'卡拉曼达',gameid:'G603',groupid:'G603P001'},{id:'G603P001020',name:'皮城警备',gameid:'G603',groupid:'G603P001'},{id:'G603P002001',name:'比尔吉沃特',gameid:'G603',groupid:'G603P002'},{id:'G603P002002',name:'德玛西亚',gameid:'G603',groupid:'G603P002'},{id:'G603P002003',name:'弗雷尔卓德',gameid:'G603',groupid:'G603P002'},{id:'G603P002004',name:'无畏先锋',gameid:'G603',groupid:'G603P002'},{id:'G603P002005',name:'恕瑞玛',gameid:'G603',groupid:'G603P002'},{id:'G603P002006',name:'扭曲丛林',gameid:'G603',groupid:'G603P002'},{id:'G603P002007',name:'巨龙之巢',gameid:'G603',groupid:'G603P002'},{id:'G603P003001',name:'试炼之地',gameid:'G603',groupid:'G603P003'}]";
//        List<Game> game = JSONArray.toList(JSONArray.fromObject(dl1771_gameList), Game.class);
//        List<Game> group = JSONArray.toList(JSONArray.fromObject(dl1771_groupList), Game.class);
//        List<Game> server = JSONArray.toList(JSONArray.fromObject(dl1771_serverList), Game.class);
        System.out.println(dl1771_gameList);
        System.out.println(dl1771_groupList);
        System.out.println(dl1771_serverList);
//        System.out.println(group.size());

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPx() {
        return px;
    }

    public void setPx(String px) {
        this.px = px;
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot;
    }

    public List<String> getDltype() {
        return dltype;
    }

    public void setDltype(List<String> dltype) {
        this.dltype = dltype;
    }

    public List<Game> getList() {
        return list;
    }

    public void setList(List<Game> list) {
        this.list = list;
    }

    public String getGameid() {
        return gameid;
    }

    public void setGameid(String gameid) {
        this.gameid = gameid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

}
