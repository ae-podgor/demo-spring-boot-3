"C:\Program Files\Java\jdk-17\bin\java.exe" -Dmaven.multiModuleProjectDirectory=D:\git\Presentations\demo-spring-boot-3 "-Dmaven.home=C:\Program Files\JetBrains\IntelliJ IDEA 2021.2\plugins\maven\lib\maven3" "-Dclassworlds.conf=C:\Program Files\JetBrains\IntelliJ IDEA 2021.2\plugins\maven\lib\maven3\bin\m2.conf" "-Dmaven.ext.class.path=C:\Program Files\JetBrains\IntelliJ IDEA 2021.2\plugins\maven\lib\maven-event-listener.jar" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2\lib\idea_rt.jar=58736:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2021.2\plugins\maven\lib\maven3\boot\plexus-classworlds-2.6.0.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2021.2\plugins\maven\lib\maven3\boot\plexus-classworlds.license" org.codehaus.classworlds.Launcher -Didea.version=2021.2 org.graalvm.buildtools:native-maven-plugin:0.9.19:compile
[INFO] Scanning for projects...
[INFO]
[INFO] -------------------< com.example:demo-spring-boot-3 >-------------------
[INFO] Building demo-spring-boot-3 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> native-maven-plugin:0.9.19:compile (default-cli) > package @ demo-spring-boot-3 >>>
[INFO]
[INFO] --- maven-resources-plugin:3.3.0:resources (default-resources) @ demo-spring-boot-3 ---
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ demo-spring-boot-3 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to D:\git\Presentations\demo-spring-boot-3\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.3.0:testResources (default-testResources) @ demo-spring-boot-3 ---
[INFO] skip non existing resourceDirectory D:\git\Presentations\demo-spring-boot-3\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.10.1:testCompile (default-testCompile) @ demo-spring-boot-3 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to D:\git\Presentations\demo-spring-boot-3\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ demo-spring-boot-3 ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.observation.DemoSpringBoot3ApplicationTests
01:06:49.006 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [DemoSpringBoot3ApplicationTests]: using SpringBootContextLoader
01:06:49.013 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.example.observation.DemoSpringBoot3ApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.
01:06:49.015 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.example.observation.DemoSpringBoot3ApplicationTests]: DemoSpringBoot3ApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
01:06:49.058 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using ContextCustomizers for test class [DemoSpringBoot3ApplicationTests]: [ExcludeFilterContextCustomizer, DuplicateJsonObjectContextCustomizer, MockitoContextCustomizer, TestRestTemplateContextCustomizer, DisableObservabilityContextCustomizer, PropertyMappingContextCustomizer, Customizer]
01:06:49.150 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [D:\git\Presentations\demo-spring-boot-3\target\classes\com\example\demospringboot3\DemoSpringBoot3Application.class]
01:06:49.152 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.example.observation.DemoSpringBoot3Application for test class com.example.observation.DemoSpringBoot3ApplicationTests
01:06:49.314 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners for test class [DemoSpringBoot3ApplicationTests]: [ServletTestExecutionListener, DirtiesContextBeforeModesTestExecutionListener, ApplicationEventsTestExecutionListener, MockitoTestExecutionListener, DependencyInjectionTestExecutionListener, DirtiesContextTestExecutionListener, TransactionalTestExecutionListener, SqlScriptsTestExecutionListener, EventPublishingTestExecutionListener, ResetMocksTestExecutionListener, RestDocsTestExecutionListener, MockRestServiceServerResetTestExecutionListener, MockMvcPrintOnlyOnFailureTestExecutionListener, WebDriverTestExecutionListener, MockWebServiceServerTestExecutionListener]
01:06:49.317 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: class [DemoSpringBoot3ApplicationTests], class annotated with @DirtiesContext [false] with mode [null]

.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v3.0.2)

2023-02-08T01:06:49.764+03:00  INFO 11612 --- [           main] c.e.d.DemoSpringBoot3ApplicationTests    : Starting DemoSpringBoot3ApplicationTests using Java 17.0.6 with PID 11612 (started by Alinka in D:\git\Presentations\demo-spring-boot-3)
2023-02-08T01:06:49.769+03:00  INFO 11612 --- [           main] c.e.d.DemoSpringBoot3ApplicationTests    : No active profile set, falling back to 1 default profile: "default"
2023-02-08T01:06:50.661+03:00  INFO 11612 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2023-02-08T01:06:50.692+03:00  INFO 11612 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 17 ms. Found 0 JPA repository interfaces.
2023-02-08T01:06:51.398+03:00  INFO 11612 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-02-08T01:06:51.662+03:00  INFO 11612 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:628b5401-5d5a-4fde-9809-1351f8fa715c user=SA
2023-02-08T01:06:51.664+03:00  INFO 11612 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-02-08T01:06:51.734+03:00  INFO 11612 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-02-08T01:06:51.807+03:00  INFO 11612 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.1.6.Final
2023-02-08T01:06:52.083+03:00  WARN 11612 --- [           main] org.hibernate.orm.deprecation            : HHH90000021: Encountered deprecated setting [javax.persistence.sharedCache.mode], use [jakarta.persistence.sharedCache.mode] instead
2023-02-08T01:06:52.328+03:00  INFO 11612 --- [           main] SQL dialect                              : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-02-08T01:06:53.339+03:00  INFO 11612 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2023-02-08T01:06:53.351+03:00  INFO 11612 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2023-02-08T01:06:53.600+03:00  WARN 11612 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2023-02-08T01:06:54.183+03:00  INFO 11612 --- [           main] c.e.d.DemoSpringBoot3ApplicationTests    : Started DemoSpringBoot3ApplicationTests in 4.802 seconds (process running for 6.197)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.657 s - in com.example.observation.DemoSpringBoot3ApplicationTests
2023-02-08T01:06:54.504+03:00  INFO 11612 --- [ionShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2023-02-08T01:06:54.506+03:00  INFO 11612 --- [ionShutdownHook] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2023-02-08T01:06:54.511+03:00  INFO 11612 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-02-08T01:06:54.517+03:00  INFO 11612 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.3.0:jar (default-jar) @ demo-spring-boot-3 ---
[INFO] Building jar: D:\git\Presentations\demo-spring-boot-3\target\demo-spring-boot-3-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:3.0.2:repackage (repackage) @ demo-spring-boot-3 ---
[INFO] Replacing main artifact with repackaged archive
[INFO]
[INFO] <<< native-maven-plugin:0.9.19:compile (default-cli) < package @ demo-spring-boot-3 <<<
[INFO]
[INFO]
[INFO] --- native-maven-plugin:0.9.19:compile (default-cli) @ demo-spring-boot-3 ---
[INFO] Obtained main class from plugin org.apache.maven.plugins:maven-jar-plugin with the following path: archive -> manifest -> mainClass
[INFO] Found GraalVM installation from GRAALVM_HOME variable.
[INFO] Executing: C:\Program Files\Java\graalvm-ce-java17-22.3.1\bin\native-image.cmd @target\tmp\native-image-4377849242410955621.args
**********************************************************************
** Visual Studio 2019 Developer Command Prompt v16.11.23
** Copyright (c) 2021 Microsoft Corporation
**********************************************************************
[vcvarsall.bat] Environment initialized for: 'x86_x64'
========================================================================================================================
GraalVM Native Image: Generating 'demo-spring-boot-3' (executable)...
========================================================================================================================
[1/7] Initializing...                                                                                   (26,1s @ 0,53GB)
Version info: 'GraalVM 22.3.1 Java 17 CE'
Java version info: '17.0.6+10-jvmci-22.3-b13'
C compiler: cl.exe (microsoft, x64, 19.29.30147)
Garbage collector: Serial GC
1 user-specific feature(s)
- org.springframework.aot.nativex.feature.PreComputeFieldFeature
  Field org.apache.commons.logging.LogAdapter#log4jSpiPresent set to true at build time
  Field org.apache.commons.logging.LogAdapter#log4jSlf4jProviderPresent set to true at build time
  Field org.apache.commons.logging.LogAdapter#slf4jSpiPresent set to true at build time
  Field org.apache.commons.logging.LogAdapter#slf4jApiPresent set to true at build time
  Field org.springframework.core.NativeDetector#imageCode set to true at build time
  Field org.springframework.format.support.DefaultFormattingConversionService#jsr354Present set to false at build time
  Field org.springframework.core.KotlinDetector#kotlinPresent set to false at build time
  Field org.springframework.core.KotlinDetector#kotlinReflectPresent set to false at build time
  Field org.springframework.cglib.core.AbstractClassGenerator#imageCode set to true at build time
  [2/7] Performing analysis...  [**********]                                                              (59,8s @ 2,72GB)
  10�203 (89,93%) of 11�345 classes reachable
  16�608 (63,39%) of 26�200 fields reachable
  48�503 (58,54%) of 82�861 methods reachable
  484 classes,   136 fields, and 2�292 methods registered for reflection
  82 classes,    75 fields, and    68 methods registered for JNI access
  5 native libraries: crypt32, ncrypt, psapi, version, winhttp
  [3/7] Building universe...                                                                               (6,2s @ 1,00GB)
  [4/7] Parsing methods...      [***]                                                                      (5,5s @ 4,20GB)
  [5/7] Inlining methods...     [***]                                                                      (3,9s @ 2,18GB)
  [6/7] Compiling methods...    [*******]                                                                 (51,7s @ 3,07GB)
  [7/7] Creating image...                                                                                  (7,7s @ 4,52GB)
  23,78MB (51,50%) for code area:    31�432 compilation units
  22,04MB (47,74%) for image heap:  272�183 objects and 93 resources
  359,91KB ( 0,76%) for other data
  46,17MB in total
------------------------------------------------------------------------------------------------------------------------
Top 10 packages in code area:                               Top 10 object types in image heap:
1,64MB sun.security.ssl                                     4,95MB byte[] for code metadata
989,64KB java.util                                            2,54MB java.lang.String
831,26KB java.lang.invoke                                     2,38MB java.lang.Class
723,41KB com.sun.crypto.provider                              2,29MB byte[] for general heap data
514,33KB org.apache.tomcat.util.net                           1,89MB byte[] for java.lang.String
473,11KB c.s.org.apache.xerces.internal.impl.xs.traversers  876,82KB com.oracle.svm.core.hub.DynamicHubCompanion
469,07KB java.lang                                          671,27KB byte[] for embedded resources
465,07KB sun.security.x509                                  617,58KB java.util.HashMap$Node
433,68KB com.sun.org.apache.xerces.internal.impl            525,61KB byte[] for reflection metadata
413,00KB sun.nio.ch                                         513,09KB int[][]
16,71MB for 388 more packages                                4,68MB for 2293 more object types
------------------------------------------------------------------------------------------------------------------------
                        7,0s (4,2% of total time) in 32 GCs | Peak RSS: 5,75GB | CPU load: 5,22
------------------------------------------------------------------------------------------------------------------------
Produced artifacts:
D:\git\Presentations\demo-spring-boot-3\target\demo-spring-boot-3.build_artifacts.txt (txt)
D:\git\Presentations\demo-spring-boot-3\target\demo-spring-boot-3.exe (executable)
========================================================================================================================
Finished generating 'demo-spring-boot-3' in 2m 47s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  03:12 min
[INFO] Finished at: 2023-02-08T01:09:52+03:00
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0
