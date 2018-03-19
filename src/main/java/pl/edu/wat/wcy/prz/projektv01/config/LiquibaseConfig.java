package pl.edu.wat.wcy.prz.projektv01.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class LiquibaseConfig {

    @Value("${liquibase.enabled}")
    private String isEnabled;

    @Bean(name = "liquibase")
    public SpringLiquibase configure(@Qualifier("dataSource") DataSource dataSource) {
        SpringLiquibase springLiquibase = new SpringLiquibase();
        springLiquibase.setDataSource(dataSource);
        springLiquibase.setShouldRun(Boolean.parseBoolean(isEnabled));
        springLiquibase.setDropFirst(false);
        springLiquibase.setChangeLog("classpath:/liquibase/changelog.xml");
        return springLiquibase;
    }
}