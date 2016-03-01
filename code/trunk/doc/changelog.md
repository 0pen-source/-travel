# 修改日志
* 2016-01-04 --v1.0
    * 初始化工程 git clone https://github.com/ichenkaihua/ssm-easy-template.git
    * 更新 mybatis通用插件(`tk.mybatis:mapper:3.3.1`)到`3.3.4` 版本
    * 集成 Amazeui.  http://amazeui.org/examples/admin-index.html
    * 发布信息页面参考.  https://www.leangoo.com
* 2016-01-13 --v1.0
    * 取消集成 Apache Shiro.
    * 在gradle中定义task initDB，用于执行sql初始化数据库.
* 2016-01-21 --v1.0
    * staff表新增微信二维码,头像字段,自我介绍.
* 2016-01-28
    * 发布时候,为了兼容部署环境JDK版本,可以指定编译JDK版本.
    * 简单的测试部署
    ** scp ./build/libs/enterprise-easy-1.0.war root@120.25.223.132:/home/noah/apache-tomcat-7.0.61/webapps
    *
* 2016-02-05
    * 新增多数据源配置
* 2016-02-26 --v1.0发布
    *