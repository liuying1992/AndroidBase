package com.liuying.androidbase.http;

import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/**
 * @author liuying
 */
public class HttpParamsUtil {
  private static final String CHARSET_NAME = "UTF-8";

  /**
   * 这里使用了HttpClinet的API。只是为了方便
   */
  public static String formatParams(List<BasicNameValuePair> params) {
    return URLEncodedUtils.format(params, CHARSET_NAME);
  }

  /**
   * 为HttpGet 的 url 方便的添加多个name value 参数。
   */
  public static String attachHttpGetParams(String url, List<BasicNameValuePair> params) {
    return params.size() == 0 ? url : url + "?" + formatParams(params);
  }

  /**
   * 为HttpGet 的 url 方便的添加1个name value 参数。
   */
  public static String attachHttpGetParams(String url, String name, String value) {
    return url + "?" + name + "=" + value;
  }
}
