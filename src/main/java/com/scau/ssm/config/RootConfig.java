package com.scau.ssm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * RootConfig:根配置，配置数据库
 *
 * @author chen
 * @date 2019/02/14
 */
@Configuration
@MapperScan(basePackages = "com.scau.ssm.mapper")
@ComponentScan(basePackages = "com.scau.ssm",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
})
@EnableTransactionManagement
@EnableAspectJAutoProxy
@Import(DbProperties.class)
public class RootConfig {

    @Bean
    public DataSource dataSource(DbProperties dbProperties) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dbProperties.getUrl());
        dataSource.setDriverClassName(dbProperties.getDriver());
        dataSource.setUsername(dbProperties.getUsername());
        dataSource.setPassword(dbProperties.getPassword());
        dataSource.setMaxActive(20);
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        return sqlSessionFactory;
    }
}
