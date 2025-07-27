package com.Repository;


import com.config.SqlQueriesConfig;
import com.models.car;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
@RequiredArgsConstructor
public class GetCarInfo {

    private DatabaseClient databaseClient;

    @Autowired
    SqlQueriesConfig sqlQueriesConfig;

    public List<car> getCarInfo() {
        String query = sqlQueriesConfig.getCarInfo;
        return databaseClient.sql(query)
                .mapProperties(car.class).all().collectList().block();
    }

}
