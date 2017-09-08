package com.example.controller;

/**
 * Created by wuxiaodong on 2017/5/9.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*public class qianming {

	public static void main(String[] args){

		String[] ary = {"etime","key","pageNum","timestamp","userId","pageSize","stime"};

		Arrays.sort(ary);

		System.out.println("排序后的字符串为" + Arrays.toString(ary) );

		qianming m = new qianming();
		String ss = "111111";
		m.EncoderByMd5(ss);
	}


	 public String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
	        //确定计算方法
	        MessageDigest md5 = MessageDigest.getInstance("MD5");
	        byte[] encodeMd5Digest = md5.digest(message.getBytes());
	        BASE64Encoder base64en = new BASE64Encoder();
	        //加密后的字符串
	        String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
	        return newstr;
	    }

}*/


public class bulingbulingbuling {

    public static void main(String[] args) {
//		paiXu();
        //System.out.println("sig:" + MessageDigestUtil.getMD5(paiXu()));
      String p2 = "E://代练定价设置接口//data//18新增整段价格比例.txt";

        bulingbulingbuling dd = new bulingbulingbuling();
       //Long timeStamp1 = System.currentTimeMillis();
        String timestamp="1500946242467";
     String details="[{\"levels\":\"2\",\"discount_ratio\":\"95.00\"},{\"levels\":\"3\",\"discount_ratio\":\"90.00\"},{\"levels\":\"4\",\"discount_ratio\":\"85.00\"},{\"levels\":\"5\",\"discount_ratio\":\"85.00\"},{\"levels\":\"6\",\"discount_ratio\":\"85.00\"},{\"levels\":\"7\",\"discount_ratio\":\"85.00\"},{\"levels\":\"8\",\"discount_ratio\":\"85.00\"},{\"levels\":\"9\",\"discount_ratio\":\"85.00\"}]";
       System.out.println("传3个参数时sig:" + MessageDigestUtil.getMD5(paiXu(p2,timestamp,details)));//传3个参数
//        System.out.println("传2个参数时sig:" + MessageDigestUtil.getMD5(paiXu1(p2,timestamp)));//传2个参数
//        System.out.print(timestamp);

    }
    //传3个参数
    public String mm3(String p1, String timestamp,String details){
        String sig = MessageDigestUtil.getMD5(paiXu(p1,timestamp,details));
        System.out.println("sig=" + sig);
        return sig;
    }
    //传2个参数
    public String mm2(String p1, String timestamp){
        String sig = MessageDigestUtil.getMD5(paiXu1(p1, timestamp));

        System.out.println("sig=" + sig);
        return sig;
    }
    //传3个参数
    private static String paiXu(String path,String timestamp,String details) {


        System.out.println("排序后：" + getSignData(readTxtFile(path, timestamp,details)));

        String key = "d14e6fbe3be2ad7f96275a72d0c39122";

      String chuanCanKey = getSignData(readTxtFile(path,timestamp,details)) + "&signpassword=" + key;
       //String chuanCanKey = getSignData(readTxtFile(path, timestamp)) + "&signCode=" + key;
        System.out.println("chuanCanKey：" + chuanCanKey);

        return chuanCanKey;


    }
    //传2个参数
    private static String paiXu1(String path, String timestamp) {


        System.out.println("排序后：" + getSignData(readTxtFile1(path,timestamp)));

        String key = "d14e6fbe3be2ad7f96275a72d0c39122";

        String chuanCanKey = getSignData(readTxtFile1(path,timestamp)) + "&signpassword=" + key;
        //String chuanCanKey = getSignData(readTxtFile(path, timestamp)) + "&signCode=" + key;
        System.out.println("chuanCanKey：" + chuanCanKey);

        return chuanCanKey;


    }
    //传3个
    public static Map<String, String> readTxtFile(String filePath, String timestamp,String details){
        Map<String, String> map = new HashMap<>();
        try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine())!= null){
//                        System.out.println(lineTxt);
                    String[] split = lineTxt.split(",");
                    if ("details".equals(split[0]))
                    {
                        map.put(split[0],details);
                    }
                    else if ("timestamp".equals(split[0]))
                    {
                        map.put(split[0],details);
                    }
                    else
                    {
                        map.put(split[0],split[1]);
                    }
                }
//                    String a=list.toString();
//                    System.out.println(a);
//                    String[] strings = a.split(",");
//                    System.out.println(strings[1]);
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }

        System.out.println("map值" + map);

        return map;
    }
    //传2个
    public static Map<String, String> readTxtFile1(String filePath, String timestamp){
        Map<String, String> map = new HashMap<>();
        try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
//                        System.out.println(lineTxt);
                    String[] split = lineTxt.split(",");

                    if ("timestamp".equals(split[0]))
                    {
                        map.put(split[0],timestamp);
                    }
                    else
                    {
                        map.put(split[0],split[1]);
                    }
                }
//                    String a=list.toString();
//                    System.out.println(a);
//                    String[] strings = a.split(",");
//                    System.out.println(strings[1]);
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }

        System.out.println("map值" + map);

        return map;
    }
    public static String getSignData(Map<String, String> params) {
        StringBuilder content=new StringBuilder();
        // 按照key做排序
        List<String> keys=new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        for(int i=0; i < keys.size(); i++) {
            String key=keys.get(i);
            if("sign".equals(key)) {
                continue;
            }
            String value=params.get(key);
            if(value != null) {
//                try {
//					content.append((i == 0 ? "" : "&") + key + "=" + URLEncoder.encode(value, "utf-8"));
                content.append((i == 0 ? "" : "&") + key + "=" + value);
//				} catch (UnsupportedEncodingException e) {
//					e.printStackTrace();
//				}
            } else {
                content.append((i == 0 ? "" : "&") + key + "=");
            }
        }

        return content.toString();
    }
}