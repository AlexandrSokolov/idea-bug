#### Usage:

1. Share the test configuration in your tests:

    ```
    Configuration testConfiguration = testConfig();
    ```

   Or you can use custom config file:
   ```
    Configuration testConfiguration = Configs.fileConfig(
        testInputStream("shared.test.properties"))
        .proxy(Configuration.class);
   ```

#### Requirements to use the `test_app` module:
 
1. add `test` scope dependency on `test_app` in your module `pom.xml`:

    ```
    <dependency>
      <groupId>com.a.b</groupId>
      <artifactId>idea-bug-test-app</artifactId>
      <version>${project.version}</version>
      <scope>test</scope>
    </dependency>
    ```

2. Extend your test with `BaseTest`:

```
import com.a.b.test.AppBaseTest;

public class MyTest extends AppBaseTest { ...
```

3. The parent module includes the following configuration:

  3.1 If you use the same property file for test and live environments:
  
  ```
    <build>
  
      <testResources>
        <testResource>
          <directory>${project.basedir}/src/test/resources</directory>
        </testResource>
        <testResource>
          <directory>${project.basedir}/../test_app/src/test/resources</directory>
        </testResource>
        <testResource>
          <directory>${project.basedir}/../config</directory>
          <includes>
            <include>app.properties</include>
          </includes>
        </testResource>
      </testResources>
   ```
  3.2 If you use different property files for test and live environments:
   
   The `test_app/src/test/resources/test.app.properties` property file is used for tests.

   Uncomment in `AppBaseTest.java`:

  ```
  //private static final String CONF_PROP = "test.app.properties";
  ```

   Maven parent module configuration changes:

  ```
    <build>
  
      <testResources>
        <testResource>
          <directory>${project.basedir}/src/test/resources</directory>
        </testResource>
        <testResource>
          <directory>${project.basedir}/../test_app/src/test/resources</directory>
        </testResource>
      </testResources>
   ```   

**Note**: ~~build-helper-maven-plugin~~ is **NOT USED** for test sources.