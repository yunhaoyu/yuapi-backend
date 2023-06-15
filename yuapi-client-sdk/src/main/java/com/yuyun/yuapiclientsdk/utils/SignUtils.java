package com.yuyun.yuapiclientsdk.utils;


import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 签名工具
 */
public class SignUtils {

    /**
     * 生成签名
     *
     * @param body
     * @param secreKey
     * @return
     */
    public static String genSign(String body, String secreKey) {
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body + "." + secreKey;
        return md5.digestHex(content);
    }
}
