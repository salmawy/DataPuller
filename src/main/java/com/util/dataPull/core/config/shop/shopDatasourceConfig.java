package com.util.dataPull.core.config.shop;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "shopEntityManager",
        transactionManagerRef = "shopTransactionManager",
        basePackages = "com.util.dataPull.core.config.shop"
)
public class shopDatasourceConfig
{

	/*
	 * @Autowired EntityManagerFactoryBuilder builder;
	 */
	@Primary
    @Bean(name="shopDataSource")
  //  @ConfigurationProperties(prefix = "spring.shop.datasource")
    public DataSource shopDatasource() {


        return DataSourceBuilder
                .create().url("jdbc:oracle:thin:@localhost:1521:xe")
                .username("SHOP")
                .password("SHOP")
                .driverClassName("oracle.jdbc.driver.OracleDriver")
                .build();
    }

	@Primary
    @Bean(name = "shopEntityManager")
    public LocalContainerEntityManagerFactoryBean shopEntityManagerFactory(            EntityManagerFactoryBuilder builder,
            @Qualifier("shopDataSource") DataSource dataSource) {

       

        return builder
                .dataSource(dataSource)
                .properties(hibernateProperties())
                .packages("com.util.dataPull.core.config.shop.entities")
                .persistenceUnit("shopPU")
                .build();
    }
	
	@Primary
    @Bean(name = "shopTransactionManager")
    public PlatformTransactionManager shopTransactionManager(@Qualifier("shopEntityManager") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);//
    }

    private Map<String, Object> hibernateProperties() {

        Resource resource = new ClassPathResource("hibernate.properties");

        try {
            Properties properties = PropertiesLoaderUtils.loadProperties(resource);

            Map<String, Object> collect = properties.entrySet().stream()
                    .collect(Collectors.toMap(
                            e -> e.getKey().toString(),
                            Map.Entry::getValue)
                    );

            collect.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
//            collect.put("hibernate.hbm2ddl.auto", "update");
            return collect;
        } catch (IOException e) {
            return new HashMap<String, Object>();
        }
    }
}
