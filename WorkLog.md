# React Spring Work Log

## 2008-09-13

O'Reilly Book https://learning.oreilly.com/library/view/hands-on-full-stack/9781838822361/d31048b0-730b-4169-a3a9-53428b856784.xhtml

Install Eclipse https://www.eclipse.org/downloads

Use Spring Initializr to create new back end project https://start.spring.io/

Include Spring Web and Spring Boot DevTools dependencies and click "Generate"

Unzip project into repo folder cand import project into Eclipse

Fix unbound classpath container issue https://sites.miis.edu/dreadkingrathalos/2017/06/05/unbound-classpath-container-jre-system-library-resolved/

Configure logging and port in the src/main/resources/application.resources file
logging.level.root=INFO
server.port=8081
spring.jpa.show-sql=true

Install MariaDB https://downloads.mariadb.org/

Add Hibernate JPA and H2 in-memory database dependencies to pom.xml

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
