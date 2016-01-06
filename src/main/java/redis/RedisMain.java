package redis;

import redis.clients.jedis.Jedis;


/**
 * Describe: ����redis�ͻ��ˣ������������Ƿ�����
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
public class RedisMain {
    public static void main(String[] args) {
        //����redis�ͻ���
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //����redis ping�����������pong
        String response = jedis.ping();
        //��ӡ������������Ϊpong
        System.out.println(response);
    }
}
