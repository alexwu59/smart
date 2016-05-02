package com.ws.smart.util;

/**
 * Created by wushuai on 16/4/28.
 */
public class CastUtil {

    /**
     * 转化为字符串
     * @param obj
     * @return
     */
    public static String castString(Object obj){
        return obj != null ? String.valueOf(obj):"";
    }

    /**
     * 判断是否是空字符串
     * @param string
     * @return
     */
    public static boolean isEmpteyString(String string){

        if (string ==null || string.trim().length()==0){
            return true;
        }
        return false;

    }

    /**
     * 将字符串转化为int
     * @param intString
     * @return
     */
    public static int castInt(String intString){

        if (!isEmpteyString(intString)){
            return Integer.parseInt(intString);
        }else{
            return 0;
        }

    }

    /**
     * 将字符串转为double
     * @param doubleString
     * @return
     */
    public static double castDouble(String doubleString){
        if (!isEmpteyString(doubleString)){
            return Double.parseDouble(doubleString);
        }else {
            return 0;
        }
    }

}
