package com.example.pubInter;

import com.example.model.PriceCalculateBean;
import com.example.model.PriceCalculateParamBean;
import com.example.model.PriceGroupBean;
import org.springframework.util.StringUtils;

/**
 * Created by wuxiaodong on 2017/8/30.
 */
public class PriceCalculateAction {
    public String priceCalculate(PriceCalculateParamBean param)throws Exception{
        if(StringUtils.isEmpty(param.getGamename())){
            return "游戏名称不能为空";
        }
        if(StringUtils.isEmpty(param.getAreaname())){
            return "游戏区名称不能为空";
        }
        if(StringUtils.isEmpty(param.getServername())){
            return "游戏服务器名称不能为空";
        }

        if(StringUtils.isEmpty(param.getUserid())){
            return "用户id不存在";
        }
          return  "aa";
    }
    /**
     * 王者荣耀价格计算
     * @param bean
     * @return
     */
    public String priceCalculate(PriceCalculateParamBean param,PriceCalculateBean bean) throws Exception{
        PriceGroupBean groupBean;
//        groupBean = bean.getPriceGroupBean();
        Integer beginIndex = bean.getBeginIndex();
        Integer endIndex = bean.getEndIndex();
        Integer beginStar = bean.getBeginstar();
        Integer endStar = bean.getEndstar();
        Integer sumStar = 0;//总星数
        Long price_l = 0L;//总价格，用于精确计算的长整形
        String deposit = "";//保证金
        Double requiretime = 0.0D;//要求时间
        boolean flag = false;//标志，用于跳出循环
        for(int i=0;i<2;i++){
            String levelname ="11";
            //当前大段位的金额总和，用于计算符文折扣
            Long levelprice_l = 0L;
            for(int j=0;j<2;j++){
               Integer index = 2;
                Integer starnumber=2;
//                Integer starnumber = Integer.parseInt(detail.getStarnumber());
//                Double gradeprice = Double.parseDouble(detail.getPrice());
//                Double graderequiretime = Double.parseDouble(detail.getRequiretime());
//                String gradeName = detail.getGradename();
                if(index == beginIndex && index == endIndex){
                    //查找到起始段位且和目标段位相同
                    Integer startemp = endStar - beginStar;
                    sumStar += startemp;
//                    levelprice_l += getGradePrice(gradeprice,starnumber,startemp,gradeName);
                    flag = true;
//                    deposit = detail.getDeposit();
//                    requiretime += getGradeRequireTime(graderequiretime,starnumber,startemp,gradeName);
                    break;
                }else if(index == beginIndex){
                    //查找到起始段位且和目标段位不同
                    Integer startemp = starnumber - beginStar + 1;
                    sumStar += startemp;
//                    deposit = detail.getDeposit();
//                    levelprice_l += getGradePrice(gradeprice,starnumber,startemp,gradeName);
//                    requiretime += getGradeRequireTime(graderequiretime,starnumber,startemp,gradeName);
                }else if(index > beginIndex && index < endIndex){
                    //查找到中间段位
                    Integer startemp = starnumber;
                    sumStar += startemp;
//                    levelprice_l += getGradePrice(gradeprice,starnumber,startemp,gradeName);
//                    requiretime += getGradeRequireTime(graderequiretime,starnumber,startemp,gradeName);
                }else if(index == endIndex){
                    //查找到目标段位
                    Integer	startemp = endStar-1;
                    sumStar += startemp;
//                    levelprice_l += getGradePrice(gradeprice,starnumber,startemp,gradeName);
                    if(startemp > 0){
//                        requiretime += getGradeRequireTime(graderequiretime,starnumber,startemp,gradeName);
                    }
                    flag = true;
                    break;
                }
            }
            //符文打折
            if(levelprice_l > 0){
                //查询当前段位符文打折信息
                price_l += levelprice_l;
            }

            if(flag){
                break;
            }
        }

        if(price_l != null && price_l > 0){

            //铭文折扣计算按照初始的折扣算
//            PriceRunesRatioBean runesQuery = new PriceRunesRatioBean();
//            runesQuery.setTemplateid(bean.getPriceTemplateBean().getTemplateid());
//            runesQuery.setLevelname(getLevelNameByBegingrade(param.getBegingrade()));
//            List<PriceRunesRatioBean> runesList = priceQueryService.queryPriceRunesRatioList(runesQuery);
            try{
                if(true){
                   for(int i=0;i<1;i++){
                        //判断如果没有设置铭文折扣,那么就不打折
                        String bb=null;
                        if(bb==null){
                            continue;
                        }
//                        Integer beginRunes = Integer.parseInt(priceRunesRatioBean.getBeginrunes());
//                        Integer endRunes = Integer.parseInt(priceRunesRatioBean.getEndrunes());
                        Integer runesLevel = bean.getRuneslevel();
//						if(bean.getRuneslevel() == 0){
//							bean.setRuneslevel(beginRunes);
//							param.setRuneslevel(beginRunes.toString());
//						}
                        //找到符合的符文区间
                        if(runesLevel >= 1 && runesLevel <= 2){
//                            Double ratio = Double.parseDouble(priceRunesRatioBean.getRatio());
                            if(12 > 100D || 12 < 100D){
                                price_l = (long)((price_l * 12)/100);
                            }
                            break;
                        }

//						if(bean.getRuneslevel() <= beginRunes){
//							ratio = Double.parseDouble(runesQuery.getLowratio());
//						}
//						if(bean.getRuneslevel() >= endRunes){
//							ratio = Double.parseDouble(runesQuery.getHighratio());
//						}
                    }
                }
            }catch (Exception e) {
//                log.error("符文打折出错;info="+JSONObject.fromObject(runesQuery));
            }

            //多段打折
//            PriceMoreRatioBean moreQuery = new PriceMoreRatioBean();
//            moreQuery.setTemplateid(bean.getPriceTemplateBean().getTemplateid());
//            moreQuery.setStarnumber(sumStar.toString());
//            moreQuery.setUserid(param.getUserid());
//            List<PriceMoreRatioBean> moreList = priceQueryService.queryPriceMoreRatioList(moreQuery);
            try{
                //新增整段打折比例，如果多段星级与整段同时存在，以多段为主
                if(true){
                   double  moreQuery = 1.2;
                    Double ratio = 2.3;
                    if(ratio > 100D || ratio < 100D){
                        price_l = (long)((price_l * ratio)/100);
                    }
                    //不存在多段，查询是否有整段折扣
                }else{
//                    LevelPriceDiscountDetailBean  levelPriceDiscountDetailBean = new LevelPriceDiscountDetailBean();
                    //段位差
                    Integer levels = bean.getEndIndex() - bean.getBeginIndex();
//                    levelPriceDiscountDetailBean.setLevels(levels);
//                    levelPriceDiscountDetailBean.setTemplateid(bean.getPriceTemplateBean().getTemplateid());
//                    LevelPriceDiscountDetailBean detailBean = priceQueryService.queryLevelPriceDiscountDetail(levelPriceDiscountDetailBean);
                    //有整段折扣
                    String aa="";
                    if( aa!= null){
                        Double ratio = Double.parseDouble(aa);
                        if(ratio > 100D || ratio < 100D){
                            price_l = (long)((price_l * ratio)/100);
                        }
                    }
                }
            }catch (Exception e) {
//                log.error("多段打折出错;info="+ JSONObject.fromObject(moreQuery));
            }
        }
        //用户设置的比例打折
        if(bean.getRatio() != null && bean.getRatio() != 100){
            price_l = (long)((price_l * bean.getRatio())/100);
        }

        //最终价格
        Double price = 11.2;
        param.setPrice(price.toString());
        param.setDeposit(deposit);
        param.setRequiretime(String.valueOf(Math.round(requiretime)));
        return "success";
    }

}
