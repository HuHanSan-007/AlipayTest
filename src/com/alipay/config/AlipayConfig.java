package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092700610702";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDnwsffCbbVkcNTa9EQJ4JgDFZaZhzf+SQUCb+v+xLVGKh8A99uVDbkqMcG6HsGtDHjYbPUNC33ad/kbzEhWgvC1HtLmJtB2xlUvcqdXD/qfl3zyzubSBegk/injG4bju3qmd/6oQu5A+nGIjJXs+W+E9+mGY/d1GnRY0gvIa9fM3kiNnGhnsKkGTpbuS43eNm8r7Haz8j7RQav1hZxrgwjooFXFnB/dYBeHqRHKkZ+xC+HhkCTFPIuSg6060VpUqEtYVD15AK5pQzngYDz3dgQiNEGWNmGk0a9dec3PFbWxtOH20pC5ZmqFLRe96MtVbdgT3/xzVYfFhhVm5kVUlvJAgMBAAECggEBAKkkmOaImm1oAlvhtiTKEPa0SlmTaMN1ewU80C9JWEc5xc0srmZBBAcBvq+mABO2cyp15d6bbmjBVmvLUtn6c9bvaESVzcnUc7pLAZKy/trO+xawXoJHrSa+l50AemOWfsDXKIYr/vg6iOTXlFI5sxR0QKdixIKrQcdVZBsxxGH/NUNLDNvVb6GoMFxYfb2w89BkHFtu0iQDM1a9HbF7ES9DV8SLcvQQJpmO0CI11McD6w58bOnMOSJ/b/O6AFNWDJwcco54e5VitkKSFk3vr/z/mpsvkt2LMKkN32ZCWeR9n/wXjP/xMIxpomnblvZcIjet/6RYsIUMg6/3IUu/pdkCgYEA/KiAA93Yeoiixd6WiSCLU6ckkJrqrz+NJC9izqVjKuOpB/khU4Qck/kUN3GdxbcD5rajZF0zi6tPYTfuSxbc183XgQqAfCk6xyrqDvyhnTPZ0TFcDHqNj5QWhd4QYwVrtk8fjl0AOUeOY5lQ1XPZFDRhK5C8COffc0th/zxjBgsCgYEA6tOFuN0DrN/UFn/vdILefIoH9nHFnuIQzOvxeXQPsNIUF0KZy44BP9akDxP3qUrmXvYpi7X54HcNHoh2uIDR0yrCVCttv4uYszdcTDXpHrdOLbUj8oSIv8cJl2JjwSuAcvz7nPFvPPctnOqdTeQIHW36ITLgJD1tYktY57UyrfsCgYEArLtyEbKonlUtm0Nq/ULvnfhGSkpvKfKzxspSrd5qJtdQJ3BONW+7rfp6tNELQTG3DBNPL318kP9EnL2FP3bY8vz6WXFZmAkD80hGjopu3y+kuZ0aRjm+8CsZHtpLr7b0BcagV08DqSVfln4pwlSaU3Lf/83Kj/geTw95Zurc9DMCgYEAt28IFEJBbrdhuzmw2bipB2vjkHWLQ/Of4BOnC5LH9v4Dx6+057dD7pRCj6yvV8U0c5WjGonKabdVvjYnVzT5sxTBvHI4RtpLLCPgq3+pXN8f6MCJFhbFo9lc+q5W8jyDGE/aVNycYmlLbjovKvsoA6U3MNvHD0gUvCXTixyWPCUCgYB+4RJh1L8WbDpdNU2WFF8+Ea727VT66+ajMrYtwU28kkYHpOzRlO4GV8PquKFqh7HInqyDyoVVP5cW6v0fGvuBrAK0l7rsT4ltpyCv/sivrf6bG3LZQyxnumrHFkJu/l06s/NSCsJy3MHFUQFiYIQg6AIubWsNNe0XrTryYa9NhA==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgimdNsrjok1pKjsdEEFUead+GRITP6Wb9nzOQjwnUegp+oMb1ZU4HSKp5tcA1BXWJhqwKsaSB/5YTAtBeemW8Yp9zDoTUknlDPbfquT4MU0ds4LEAq/2k2n73RpBkdfK814ZMs+EzZ9N/HymkkJa7Ax7Su3VkIOVbSOS+1hzcFEmXhusncIkx0Am5zOQEwZyQkPwbcEEF1hpiLm5yAii+taK6ENBeC01brY0EynL6LsWJBQRVT8S9EAlMntpaYKDL3TpT2DIt2H591ENrGsUHlbZ7NrVJTvjTjZhNEB130djL07+D8hJp5ql3mvma+F+0BUVTx9kA5L2sX4G1/8dhQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://120.27.241.260:8080/AlipayTest/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://120.27.241.260:8080/AlipayTest/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";		//测试网关
//	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";			//正式网关
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

