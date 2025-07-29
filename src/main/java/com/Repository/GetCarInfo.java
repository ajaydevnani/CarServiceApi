package com.Repository;

import com.config.SqlQueriesConfig;
import com.models.Car;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class GetCarInfo {


    private final JdbcTemplate jdbcTemplate;
    private final SqlQueriesConfig sqlQueriesConfig;

    public List<Car> getCarInfo() {
        String query = sqlQueriesConfig.getCarInfo();
        return jdbcTemplate.query(query, (result, index) ->
                Car.builder()
                        .make(result.getString("make"))
                        .model(result.getString("model"))
                        .year(result.getInt("year"))
                        .trim(result.getString("trim"))
                        .build()
        );
    }
}
