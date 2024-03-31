package org.logger.tools;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * mq工具
 */
public class RabbitMQUtil {
    public static Connection getConnection()
    {
        try
        {
            Connection connection = null;
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("129.28.14.204");
            factory.setPort(5672);
            factory.setVirtualHost("/");
            factory.setUsername("log");
            factory.setPassword("abc123");
            connection = factory.newConnection();
            return connection;
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
