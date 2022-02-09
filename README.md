[theory-study]: https://github.com/ohchangyeol/bitcamp-theory-study "theory study"
[aiacademy]: https://goai.co.kr "AIA aiacademy"

# 📄 Model1 -> Model2 Architecture ! 

[자바기반 Web Platform Service(RestFul Server) 구축 Web, App 개발자 양성과정][aiacademy]를 들으며  
MVC패턴의 개발 방식을 알아보았다.

[강의 정리][theory-study]에 해당되는 source.

## Overview
- ### MVC Pattern
    MVC 패턴은 **Model, View, Controller**의 앞글자를 따서 붙인 소프트웨어 디자인 패턴이다.   

    **Model** : 백그라운드에서 동작하는 로직 처리  
    **View** : 사용자가 보게 될 결과 화면을 출력  
    **Controller** : 사용자의 입력처리와 흐름제어 담당  

    MVC패턴에는 **Model1**방식과 **Model2** 방식이 있으며 이는 JSP로 구성할 수 있는 웹 어플리케이션의 아키텍처에서 로직과 출력을 모두처리하는지(Model1), JSP에서는 출력만 처리하는지(Model2)에 따라 분류된다.
- ### Model1 Pattern
    Client한테 요청을 받게 되면 Java Bean(DAO)을 호출하여 동적인 페이지를 구현하는 구조.  

    ![011Model1](https://user-images.githubusercontent.com/48302622/153268123-b247e2d4-701f-4931-84c6-c61725bd063e.jpg)

    #### 특징
    - 개발 속도가 빠르다.
    - presentation logic과 business logic이 혼재되어 있다.
    - JSP가 복잡해져 있어 유지보수가 어렵다 (front-end와 back-end의 역활 분담이 어렵다.)

    #### 개선 방향 
    2layer architecture를 활용해 presentation logic과 business logic을 분리 한다.
    
- ### Model2 Pattern Refactoring01
        
    Servlet을 활용하여 presentation logic과 business logic을 분리 하는 구조

    ![012Model2](https://user-images.githubusercontent.com/48302622/153270080-eddf3d6c-5067-41a3-b93a-a9c5f887ae70.png)

    #### 특징
    - 개발 확장이 비교적 용이하다.
    - 유지보수가 편하다. 
    - 의존성이 높다.
    - Controller의 역활이 많다.
    
- ### Model2 Pattern Refactoring02

    계층 구조를 나눠 Client의 요청에 따라 매핑되는 Controller에 작업을 전달 하는 구조

    ![013Model2](https://user-images.githubusercontent.com/48302622/153270101-c0cecb3c-efb5-4b3e-a2c2-db133342de99.png)

    #### 특징
    - Mapping을 통해 controller의 역활이 명확해져 유지보수가 편하다.
    - View와의 의존성

- ### Model2 Pattern Refactoring03

    **Spring MVC pattern의 중심**  
    DispatcherServlet의 역활이 단일 인입점이 되며 요청에 따라 적합한 controller로 mapping하고 resolver를 통해 View와의 의존성 관계를 낮춘다.

    ![014Model2](https://user-images.githubusercontent.com/48302622/153270103-5341a856-9e23-4bc8-a3c0-86dc45dbcc12.png)

        

    
## Tech Stack

 - <img src="https://img.shields.io/badge/Java-8-007396?style=flat&logo=java&logoColor=white"/></a>&nbsp;
 - <img src="https://img.shields.io/badge/Tomcat-7.0.55-F8DC75?style=flat&logo=Apache Tomcat&logoColor=F8DC75"/></a>&nbsp;

## review
Model1부터 Model2 까지의 문제점을 확인 하여 그 문제를 개선하는 방향과 의존성에 대해 공부하게 되어 보람있는 시간이였던 같다.  
Spring MVC Pattern을 공부 하기전에 개발의 역사?를 공부하는 시간같아서 너무 좋았고 어떤방식으로 구현이 되고 계층 구조를 파악하여 개발 방향성을 잡게 되었다.