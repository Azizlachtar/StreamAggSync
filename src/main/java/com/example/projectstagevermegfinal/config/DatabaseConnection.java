package com.example.projectstagevermegfinal.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.util.Properties;

/**
 * Configuration class that holds database connection properties.
 */
@Data
public class DatabaseConnection implements Serializable {
    @Value("${spring.datasource.url}")
    private  String url ;
    @Value("${spring.datasource.username}")
    private  String username ;
    @Value("${spring.datasource.password}")
    private  String password ;

    /**
     * Creates and returns properties for database connection.
     *
     * @return Properties containing database connection settings.
     */
    public Properties getProperties() {
        Properties properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
        properties.setProperty("useSSL", "false");
        return properties;
    }
}
