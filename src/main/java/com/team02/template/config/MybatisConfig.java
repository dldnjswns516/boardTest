package com.team02.template.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration
@MapperScan(value = "com.team02.template.mapper", sqlSessionFactoryRef = "mybatisSqlSessionFactory")*/
public class MybatisConfig {
	
	//@Bean(name = "mybatisSqlSessionFactory")
	public SqlSessionFactory mybatisSqlSessionFactory(DataSource dataSource, ApplicationContext context) throws Exception {
		
		SqlSessionFactoryBean sqlSessionBean = new SqlSessionFactoryBean();
		
		sqlSessionBean.setMapperLocations(context.getResources("classpath:mapper/**/*.xml"));
		sqlSessionBean.setDataSource(dataSource);
		
		return sqlSessionBean.getObject();
	}	
}
