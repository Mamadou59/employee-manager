package tech.getarrays.employeemanager.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistanceConfiguration {
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/plagiat");
        // Don't do that
        builder.username("plagiatuser");
        builder.password("plagiat");
        System.out.println("datasource set");
        return builder.build();
    }
}
