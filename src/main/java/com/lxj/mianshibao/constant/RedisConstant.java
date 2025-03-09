package com.lxj.mianshibao.constant;

/**
 * Redis常量类
 */
public interface RedisConstant {
    /**
     * 用户签到记录的Redis key前缀
     *
     */
    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins";

    /**
     * 获取用户签到记录的Redis key
     * @param year 年份
     * @param userId
     * @return 凭借好的Redis key
     */
    static String getUserSignInRedisKey(int year, long userId) {
        return String.format(("%s:%s:%S"),USER_SIGN_IN_REDIS_KEY_PREFIX,year,userId);
    }
}
