# AspectsExample

Этот проект создан с целью ознакомления возможностей аспектов.

## How to use Aspects

Для использования аспектов в своем проекте необходимо:

- Добавить зависимости в pom.xml:

```dtd
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjrt</artifactId>
    <version>${aspectj.version}</version>
</dependency>
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjtools</artifactId>
    <version>${aspectj.version}</version>
</dependency>
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>${aspectj.version}</version>
</dependency>
```
- В maven-surefire-plugin добавить конфигурацию и зависимость:
```dtd
<configuration>
    <argLine>
        -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
    </argLine>
</configuration>
<dependencies>
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjweaver</artifactId>
        <version>${aspectj.version}</version>
    </dependency>
</dependencies>
```

- Создать класс с аннотацией `@Aspect`
- Добавить в ресурсы файл `META-INF/aop.xml` и прописать в нем классы-аспекты. Например:
```dtd
<aspectj>
    <aspects>
        <aspect name="com.example.aspects.Aspects"/>
    </aspects>
</aspectj>
```
- Добавить методы в класс-аспект и наслаждаться магией