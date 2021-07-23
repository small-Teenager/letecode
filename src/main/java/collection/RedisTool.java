//package collection;
//
//import java.util.Collections;
//
///**
// * @Description TODO
// * @Author quancong
// * @Email quancong@ixiappu.com
// * @Date 2020/10/26
// */
//public class RedisTool {
//
//
//    private static final Long RELEASE_SUCCESS = 1L;
//
//    /**
//     * 释放分布式锁
//     * @param jedis Redis客户端
//     * @param lockKey 锁
//     * @param requestId 请求标识
//     * @return 是否释放成功
//     */
//    public static boolean releaseDistributedLock(Jedis jedis, String lockKey, String requestId) {
//
//        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
//        Object result = jedis.eval(script, Collections.singletonList(lockKey), Collections.singletonList(requestId));
//
//        if (RELEASE_SUCCESS.equals(result)) {
//            return true;
//        }
//        return false;
//
//    }
//
//    public static void lock(){
//
//    }
//
//}
