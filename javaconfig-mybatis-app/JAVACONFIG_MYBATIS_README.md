#  JAVA_CONFIG_MYBATIS 配置说明

##  建立配置类文件类,这里需要三个类文件： 
* DataSourceConfig —>datasource源配置 

* MyBatisConfig —> 配置sqlSessionFactory 

* MyBatisMapperScannerConfig —> 配置mapperScannerConfigurer 

* 这里需要说明一下：最后一个配置因为依赖前两个，需要最后一个加载，否则会报错