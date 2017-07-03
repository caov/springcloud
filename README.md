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

### 二、Zuul(路由转发)的使用

###### a、pom.xml中引入
![image](https://github.com/caov/springcloud/blob/master/img/zuul_pom.png)
###### b、启动类添加注解@EnableZuulProxy
![image](https://github.com/caov/springcloud/blob/master/img/zuul_app.png)
###### c、配置文件application.xml中添加以下内容>
![image](https://github.com/caov/springcloud/blob/master/img/zuul_yml.png)
###### d、启动zuul，customer,provider模块。通过zuul访问provider模块。http://localhost:5005/provider/1 通过链接provider转发到provider模块
![image](https://github.com/caov/springcloud/blob/master/img/zuul_pro.png)
###### e、通过zuul访问customer模块。http://localhost:5005/customer/customer  通过链接customer转发到customer模块
![image](https://github.com/caov/springcloud/blob/master/img/zuul_cus.png)

### 三、Ribbon（负载均衡）的使用

###### a、pom.xml中引入
![image](https://github.com/caov/springcloud/blob/master/img/ribbon_pom.png)
###### b、@EnableEurekaClient注解注册为euraka子服务。启动类添加实例化RestTemplate。并对方法注解@LoadBalanced。实现负载均衡
![image](https://github.com/caov/springcloud/blob/master/img/ribbon_app.png)
###### c、Controller中访问。注入restTemplate。通过restTemplate的getForObject方法访问provider模块
![image](https://github.com/caov/springcloud/blob/master/img/ribbon_control.png)
###### d、配置文件application.xml中添加以下内容>
![image](https://github.com/caov/springcloud/blob/master/img/ribbon_yml.png)
###### d、.启动ribbon，provider2，provider模块。通过ribbon访问provider服务。http://localhost:5004/provider/1 通过链接provider转发到provider服务。而提供provider服务的有provider，provider2两个模块，ribbon将会默认轮询依次访问两个模块
![image](https://github.com/caov/springcloud/blob/master/img/ribbon_get.png)
