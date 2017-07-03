## springcloud组件的学习

### 一、Euraka的使用

 <span>Euraka是Netflix开源发现组件，包含Server和Client</span>  <span>启动eureka与provider模块项目</span>

##### 1、eureka服务端（eureka模块）

###### a、pom.xml中引入
![image](https://github.com/caov/springcloud/blob/master/img/eureka_pom.png)
###### b、启动类添加
![image](https://github.com/caov/springcloud/blob/master/img/eureka_app.png)
###### c、配置文件application.xml中添加以下内容>
![image](https://github.com/caov/springcloud/blob/master/img/eureka_yml.png)
###### d、浏览器访问http://localhost:5000/ ，显示结果如下，表示Euraka安装成功。
![image](https://github.com/caov/springcloud/blob/master/img/eureka_pic.png)

##### 2、Euraka客户端使用（provider模块）

###### a、pom.xml中引入
![image](https://github.com/caov/springcloud/blob/master/img/provider_pom.png)
###### b、启动类添加
![image](https://github.com/caov/springcloud/blob/master/img/provider_app.png)
###### c、配置文件application.xml中添加以下内容
![image](https://github.com/caov/springcloud/blob/master/img/provider_yml.png)
###### d、.浏览器访问http://localhost:5000/ ，显示结果如下，表示PROVIDER服务在eureka注册成功。
![image](https://github.com/caov/springcloud/blob/master/img/provider_pic.png)

### 二、Zuul的使用

### 一、Ribbon的使用
