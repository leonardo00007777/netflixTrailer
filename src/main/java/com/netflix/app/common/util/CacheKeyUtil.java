package com.netflix.app.common.util;

import org.apache.commons.codec.digest.DigestUtils;

public class CacheKeyUtil {

  public static String getCacheKey(Class<?> clazz, String method, String version, Object params) {
    String hash = DigestUtils.md5Hex(params.toString());
    StringBuffer sb = new StringBuffer();
    return sb.append("OM.").append(clazz.getCanonicalName()).append(".").append(method)
      .append(".").append(version).append("@").append(hash).toString();
  }
}
