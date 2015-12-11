# spring-mongo-geojsonpoint-version
Test for https://jira.spring.io/browse/DATAMONGO-1350

When run :

```
➜  mongotest  mvn clean test
```

```
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building geojsonpoint-version-annotation 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ geojsonpoint-version-annotation ---
[INFO] Deleting /Users/slapers/Documents/mongotest/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ geojsonpoint-version-annotation ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ geojsonpoint-version-annotation ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /Users/slapers/Documents/mongotest/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ geojsonpoint-version-annotation ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ geojsonpoint-version-annotation ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/slapers/Documents/mongotest/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ geojsonpoint-version-annotation ---
[INFO] Surefire report directory: /Users/slapers/Documents/mongotest/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
14:51:49.342 [main] DEBUG o.s.t.c.j.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.348 [main] DEBUG o.s.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
14:51:49.354 [main] DEBUG o.s.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
14:51:49.365 [main] DEBUG o.s.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [be.lapers.geojsontest.VersionAnnotatedTest] from class [org.springframework.test.context.support.DefaultTestContextBootstrapper]
14:51:49.386 [main] DEBUG o.s.t.c.s.DefaultTestContextBootstrapper - Found explicit ContextLoader class [org.springframework.boot.test.SpringApplicationContextLoader] for context configuration attributes [ContextConfigurationAttributes@6fd02e5 declaringClass = 'be.lapers.geojsontest.VersionAnnotatedTest', classes = '{class be.lapers.geojsontest.Application}', locations = '{}', inheritLocations = true, initializers = '{}', inheritInitializers = true, name = [null], contextLoaderClass = 'org.springframework.boot.test.SpringApplicationContextLoader']
14:51:49.396 [main] DEBUG o.s.t.c.s.AbstractContextLoader - Did not detect default resource location for test class [be.lapers.geojsontest.VersionAnnotatedTest]: class path resource [be/lapers/geojsontest/VersionAnnotatedTest-context.xml] does not exist
14:51:49.396 [main] DEBUG o.s.t.c.s.AbstractContextLoader - Did not detect default resource location for test class [be.lapers.geojsontest.VersionAnnotatedTest]: class path resource [be/lapers/geojsontest/VersionAnnotatedTestContext.groovy] does not exist
14:51:49.397 [main] INFO  o.s.t.c.s.AbstractContextLoader - Could not detect default resource locations for test class [be.lapers.geojsontest.VersionAnnotatedTest]: no resource found for suffixes {-context.xml, Context.groovy}.
14:51:49.399 [main] DEBUG o.s.t.c.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.402 [main] DEBUG o.s.t.c.s.DefaultTestContextBootstrapper - @TestExecutionListeners is not present for class [be.lapers.geojsontest.VersionAnnotatedTest]: using defaults.
14:51:49.410 [main] INFO  o.s.t.c.s.DefaultTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]
14:51:49.423 [main] INFO  o.s.t.c.s.DefaultTestContextBootstrapper - Could not instantiate TestExecutionListener [org.springframework.test.context.web.ServletTestExecutionListener]. Specify custom listener classes or make the default listener classes (and their required dependencies) available. Offending class: [javax/servlet/ServletContext]
14:51:49.428 [main] INFO  o.s.t.c.s.DefaultTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@5d76b067, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@2a17b7b6, org.springframework.test.context.support.DirtiesContextTestExecutionListener@4f063c0a, org.springframework.test.context.transaction.TransactionalTestExecutionListener@1e6d1014, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@76707e36]
14:51:49.431 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.432 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [be.lapers.geojsontest.VersionAnnotatedTest]
Running be.lapers.geojsontest.VersionAnnotatedTest
14:51:49.436 [main] DEBUG o.s.t.c.j.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.436 [main] DEBUG o.s.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
14:51:49.436 [main] DEBUG o.s.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
14:51:49.437 [main] DEBUG o.s.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [be.lapers.geojsontest.VersionAnnotatedTest] from class [org.springframework.test.context.support.DefaultTestContextBootstrapper]
14:51:49.439 [main] DEBUG o.s.t.c.s.DefaultTestContextBootstrapper - Found explicit ContextLoader class [org.springframework.boot.test.SpringApplicationContextLoader] for context configuration attributes [ContextConfigurationAttributes@1f7030a6 declaringClass = 'be.lapers.geojsontest.VersionAnnotatedTest', classes = '{class be.lapers.geojsontest.Application}', locations = '{}', inheritLocations = true, initializers = '{}', inheritInitializers = true, name = [null], contextLoaderClass = 'org.springframework.boot.test.SpringApplicationContextLoader']
14:51:49.440 [main] DEBUG o.s.t.c.s.AbstractContextLoader - Did not detect default resource location for test class [be.lapers.geojsontest.VersionAnnotatedTest]: class path resource [be/lapers/geojsontest/VersionAnnotatedTest-context.xml] does not exist
14:51:49.440 [main] DEBUG o.s.t.c.s.AbstractContextLoader - Did not detect default resource location for test class [be.lapers.geojsontest.VersionAnnotatedTest]: class path resource [be/lapers/geojsontest/VersionAnnotatedTestContext.groovy] does not exist
14:51:49.440 [main] INFO  o.s.t.c.s.AbstractContextLoader - Could not detect default resource locations for test class [be.lapers.geojsontest.VersionAnnotatedTest]: no resource found for suffixes {-context.xml, Context.groovy}.
14:51:49.441 [main] DEBUG o.s.t.c.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.441 [main] DEBUG o.s.t.c.s.DefaultTestContextBootstrapper - @TestExecutionListeners is not present for class [be.lapers.geojsontest.VersionAnnotatedTest]: using defaults.
14:51:49.444 [main] INFO  o.s.t.c.s.DefaultTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]
14:51:49.445 [main] INFO  o.s.t.c.s.DefaultTestContextBootstrapper - Could not instantiate TestExecutionListener [org.springframework.test.context.web.ServletTestExecutionListener]. Specify custom listener classes or make the default listener classes (and their required dependencies) available. Offending class: [javax/servlet/ServletContext]
14:51:49.445 [main] INFO  o.s.t.c.s.DefaultTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@74650e52, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@15d0c81b, org.springframework.test.context.support.DirtiesContextTestExecutionListener@6acdbdf5, org.springframework.test.context.transaction.TransactionalTestExecutionListener@4b1c1ea0, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@17579e0f]
14:51:49.446 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.446 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.446 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.447 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.449 [main] DEBUG o.s.t.c.s.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@59e5ddf testClass = VersionAnnotatedTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [MergedContextConfiguration@536aaa8d testClass = VersionAnnotatedTest, locations = '{}', classes = '{class be.lapers.geojsontest.Application}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{}', contextLoader = 'org.springframework.boot.test.SpringApplicationContextLoader', parent = [null]]], class annotated with @DirtiesContext [false] with mode [null].
14:51:49.450 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.450 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [be.lapers.geojsontest.VersionAnnotatedTest]
14:51:49.452 [main] DEBUG o.s.t.c.s.DependencyInjectionTestExecutionListener - Performing dependency injection for test context [[DefaultTestContext@59e5ddf testClass = VersionAnnotatedTest, testInstance = be.lapers.geojsontest.VersionAnnotatedTest@1877ab81, testMethod = [null], testException = [null], mergedContextConfiguration = [MergedContextConfiguration@536aaa8d testClass = VersionAnnotatedTest, locations = '{}', classes = '{class be.lapers.geojsontest.Application}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{}', contextLoader = 'org.springframework.boot.test.SpringApplicationContextLoader', parent = [null]]]].
14:51:49.525 [main] DEBUG o.s.core.env.StandardEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
14:51:49.527 [main] DEBUG o.s.core.env.StandardEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
14:51:49.527 [main] DEBUG o.s.core.env.StandardEnvironment - Initialized StandardEnvironment with PropertySources [systemProperties,systemEnvironment]
14:51:49.528 [main] DEBUG o.s.core.env.StandardEnvironment - Adding [integrationTest] PropertySource with search precedence immediately lower than [systemEnvironment]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::  (v1.3.1.BUILD-SNAPSHOT)

2015-12-11 14:51:49.770  INFO 41021 --- [           main] b.l.geojsontest.VersionAnnotatedTest     : Starting VersionAnnotatedTest on goblix-2.local with PID 41021 (/Users/slapers/Documents/mongotest/target/test-classes started by slapers in /Users/slapers/Documents/mongotest)
2015-12-11 14:51:49.770  INFO 41021 --- [           main] b.l.geojsontest.VersionAnnotatedTest     : No active profile set, falling back to default profiles: default
2015-12-11 14:51:49.828  INFO 41021 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@4ac3c60d: startup date [Fri Dec 11 14:51:49 CET 2015]; root of context hierarchy
2015-12-11 14:51:50.803  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : note: noprealloc may hurt performance in many applications
2015-12-11 14:51:50.807  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.807+0100 [DataFileSync] warning: --syncdelay 0 is not recommended and can have strange performance
2015-12-11 14:51:50.807  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.807+0100 [initandlisten] MongoDB starting : pid=41022 port=54152 dbpath=/var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822 64-bit host=goblix-2.local
2015-12-11 14:51:50.807  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.807+0100 [initandlisten] db version v2.6.10
2015-12-11 14:51:50.808  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.807+0100 [initandlisten] git version: 5901dbfb49d16eaef6f2c2c50fba534d23ac7f6c
2015-12-11 14:51:50.808  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.807+0100 [initandlisten] build info: Darwin bs-osx-108-x86-64-2.10gen.cc 12.3.0 Darwin Kernel Version 12.3.0: Sun Jan  6 22:37:10 PST 2013; root:xnu-2050.22.13~1/RELEASE_X86_64 x86_64 BOOST_LIB_VERSION=1_49
2015-12-11 14:51:50.808  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.807+0100 [initandlisten] allocator: system
2015-12-11 14:51:50.808  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.807+0100 [initandlisten] options: { net: { bindIp: "127.0.0.1", http: { enabled: false }, port: 54152 }, security: { authorization: "disabled" }, storage: { dbPath: "/var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822", journal: { enabled: false }, preallocDataFiles: false, smallFiles: true, syncPeriodSecs: 0.0 } }
2015-12-11 14:51:50.809  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.809+0100 [initandlisten] allocating new ns file /var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822/local.ns, filling with zeroes...
2015-12-11 14:51:50.846  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.846+0100 [FileAllocator] allocating new datafile /var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822/local.0, filling with zeroes...
2015-12-11 14:51:50.847  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.846+0100 [FileAllocator] creating directory /var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822/_tmp
2015-12-11 14:51:50.866  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.865+0100 [FileAllocator] done allocating datafile /var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822/local.0, size: 16MB,  took 0.019 secs
2015-12-11 14:51:50.881  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.880+0100 [initandlisten] build index on: local.startup_log properties: { v: 1, key: { _id: 1 }, name: "_id_", ns: "local.startup_log" }
2015-12-11 14:51:50.881  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.881+0100 [initandlisten] 	 added index to empty collection
2015-12-11 14:51:50.881  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:50.881+0100 [initandlisten] waiting for connections on port 54152
2015-12-11 14:51:50.882  INFO 41021 --- [           main] d.f.embed.process.runtime.Executable     : start de.flapdoodle.embed.mongo.config.MongodConfigBuilder$ImmutableMongodConfig@73dce0e6
2015-12-11 14:51:51.036  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.036+0100 [initandlisten] connection accepted from 127.0.0.1:54153 #1 (1 connection now open)
2015-12-11 14:51:51.256  INFO 41021 --- [           main] b.l.geojsontest.VersionAnnotatedTest     : Started VersionAnnotatedTest in 1.725 seconds (JVM running for 2.289)
2015-12-11 14:51:51.293  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.293+0100 [initandlisten] connection accepted from 127.0.0.1:54154 #2 (2 connections now open)
2015-12-11 14:51:51.311  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.311+0100 [conn2] allocating new ns file /var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822/test.ns, filling with zeroes...
2015-12-11 14:51:51.338  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.337+0100 [FileAllocator] allocating new datafile /var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822/test.0, filling with zeroes...
2015-12-11 14:51:51.354  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.354+0100 [FileAllocator] done allocating datafile /var/folders/_c/bp0rg4bs34j_949x5l8qcgrm0000gn/T/embedmongo-db-e35597bc-d931-436c-bc4c-34e9c72b5822/test.0, size: 16MB,  took 0.016 secs
2015-12-11 14:51:51.365  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.365+0100 [conn2] build index on: test.user properties: { v: 1, key: { _id: 1 }, name: "_id_", ns: "test.user" }
2015-12-11 14:51:51.366  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.366+0100 [conn2] 	 added index to empty collection
Tests run: 2, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 1.961 sec <<< FAILURE! - in be.lapers.geojsontest.VersionAnnotatedTest
updateUserWithGeoJsonPoint(be.lapers.geojsontest.VersionAnnotatedTest)  Time elapsed: 0.024 sec  <<< ERROR!
org.springframework.data.mapping.context.InvalidPersistentPropertyPath: No property type found on org.springframework.data.mongodb.core.geo.GeoJsonPoint!
	at org.springframework.data.mapping.context.AbstractMappingContext.getPersistentPropertyPath(AbstractMappingContext.java:256)
	at org.springframework.data.mapping.context.AbstractMappingContext.getPersistentPropertyPath(AbstractMappingContext.java:229)
	at org.springframework.data.mapping.context.AbstractMappingContext.getPersistentPropertyPath(AbstractMappingContext.java:204)
	at org.springframework.data.mongodb.core.convert.QueryMapper$MetadataBackedField.getPath(QueryMapper.java:838)
	at org.springframework.data.mongodb.core.convert.QueryMapper$MetadataBackedField.<init>(QueryMapper.java:729)
	at org.springframework.data.mongodb.core.convert.QueryMapper$MetadataBackedField.<init>(QueryMapper.java:706)
	at org.springframework.data.mongodb.core.convert.UpdateMapper$MetadataBackedUpdateField.<init>(UpdateMapper.java:193)
	at org.springframework.data.mongodb.core.convert.UpdateMapper.createPropertyField(UpdateMapper.java:164)
	at org.springframework.data.mongodb.core.convert.QueryMapper.getMappedObject(QueryMapper.java:122)
	at org.springframework.data.mongodb.core.convert.QueryMapper.convertSimpleOrDBObject(QueryMapper.java:359)
	at org.springframework.data.mongodb.core.convert.UpdateMapper.getMappedObjectForField(UpdateMapper.java:77)
	at org.springframework.data.mongodb.core.convert.QueryMapper.getMappedObject(QueryMapper.java:123)
	at org.springframework.data.mongodb.core.MongoTemplate$12.doInCollection(MongoTemplate.java:1096)
	at org.springframework.data.mongodb.core.MongoTemplate$12.doInCollection(MongoTemplate.java:1087)
	at org.springframework.data.mongodb.core.MongoTemplate.execute(MongoTemplate.java:462)
	at org.springframework.data.mongodb.core.MongoTemplate.doUpdate(MongoTemplate.java:1087)
	at org.springframework.data.mongodb.core.MongoTemplate.doSaveVersioned(MongoTemplate.java:961)
	at org.springframework.data.mongodb.core.MongoTemplate.save(MongoTemplate.java:925)
	at org.springframework.data.mongodb.repository.support.SimpleMongoRepository.save(SimpleMongoRepository.java:78)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:483)
	at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.executeMethodOn(RepositoryFactorySupport.java:483)
	at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.doInvoke(RepositoryFactorySupport.java:468)
	at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.invoke(RepositoryFactorySupport.java:440)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
	at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:61)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
	at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:92)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:208)
	at com.sun.proxy.$Proxy48.save(Unknown Source)
	at be.lapers.geojsontest.VersionAnnotatedTest.updateUserWithGeoJsonPoint(VersionAnnotatedTest.java:43)

2015-12-11 14:51:51.398  INFO 41021 --- [       Thread-6] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@4ac3c60d: startup date [Fri Dec 11 14:51:49 CET 2015]; root of context hierarchy
2015-12-11 14:51:51.399  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.399+0100 [initandlisten] connection accepted from 127.0.0.1:54155 #3 (3 connections now open)
2015-12-11 14:51:51.399  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.399+0100 [conn3] terminating, shutdown command received
2015-12-11 14:51:51.399  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.399+0100 [conn3] dbexit: shutdown called
2015-12-11 14:51:51.400  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.399+0100 [conn3] shutdown: going to close listening sockets...
2015-12-11 14:51:51.400  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.399+0100 [conn3] closing listening socket: 5
2015-12-11 14:51:51.400  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.400+0100 [conn3] closing listening socket: 6
2015-12-11 14:51:51.400  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.400+0100 [conn3] removing socket file: /tmp/mongodb-54152.sock
2015-12-11 14:51:51.400  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.400+0100 [conn3] shutdown: going to flush diaglog...
2015-12-11 14:51:51.400  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.400+0100 [conn3] shutdown: going to close sockets...
2015-12-11 14:51:51.400  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.400+0100 [conn3] shutdown: waiting for fs preallocator...
2015-12-11 14:51:51.401  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.400+0100 [conn3] shutdown: closing all files...
2015-12-11 14:51:51.401  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.401+0100 [conn3] closeAllFiles() finished
2015-12-11 14:51:51.401  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.401+0100 [conn3] shutdown: removing fs lock...
2015-12-11 14:51:51.403  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.402+0100 [conn1] end connection 127.0.0.1:54153 (2 connections now open)
2015-12-11 14:51:51.403  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.402+0100 [conn2] end connection 127.0.0.1:54154 (2 connections now open)
2015-12-11 14:51:51.403  INFO 41021 --- [       Thread-3] o.s.b.a.mongo.embedded.EmbeddedMongo     : 2015-12-11T14:51:51.403+0100 [conn3] dbexit: really exiting now

Results :

Tests in error: 
  VersionAnnotatedTest.updateUserWithGeoJsonPoint:43 » InvalidPersistentPropertyPath

Tests run: 2, Failures: 0, Errors: 1, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 4.786 s
[INFO] Finished at: 2015-12-11T14:51:51+01:00
[INFO] Final Memory: 23M/266M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.18.1:test (default-test) on project geojsonpoint-version-annotation: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/slapers/Documents/mongotest/target/surefire-reports for the individual test results.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```
