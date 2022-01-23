package com.kosmos.dubhe.underscore.w3;

import com.github.underscore.lodash.U;
import lombok.val;

/**
 * @author xiaji
 * @date 1/23/22 6:10 PM
 * @description: ` # 函数 `parseDevConfig( str, host)`
 * ---
 * ### 输入 `str = PLATFORM=null:28801;DECISION=172.32.4.65:28803, host : '172.32.4.65'`
 * ### 输出Map对象 `{PLATFORM:  {ip: "172.32.4.65", port: "28801"}, DECISION:  {ip: "172.32.4.65", port: "28803"}}`
 **/

public class Xiaruji {

    public static void main(String[] args) {
        val str ="PLATFORM=null:28801;DECISION=172.32.4.65:28803";
        val host ="172.32.4.65";
        parseDevConfig(str ,host);

    }

    public static void parseDevConfig(String str ,String host) {
//        U.chain(listMap).map();


    }
}
