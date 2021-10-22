package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Repository.EmployeeDao;
@Configuration
    public class RepoConfig {
    
      @Bean
      public EmployeeDao employeeDao() {
        return new EmployeeDao("employee_data.csv");
      }
    
       
}
