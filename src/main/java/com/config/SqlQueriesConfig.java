package com.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:sqlQueries.properties")
public class SqlQueriesConfig {

    @Value("${getCarInfo}")
    public String getCarInfo;
}
