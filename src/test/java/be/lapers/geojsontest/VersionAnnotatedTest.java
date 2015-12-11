package be.lapers.geojsontest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { Application.class })
public class VersionAnnotatedTest {
	
	@Autowired UserRepository repository;
	
	
	@Test
	public void createUserWithGeoJsonPoint(){
		User user = new User();
		user.setLocation(new GeoJsonPoint(5.0, 6.0));
				
		repository.save(user);
		assertNotNull(user.getId());
		assertNotNull(user.getLocation());
		assertEquals(user.getLocation().getX(), 5.0, 0);
		assertEquals(user.getLocation().getY(), 6.0, 0);
	}
	
	
	@Test
	public void updateUserWithGeoJsonPoint(){
		User user = new User();
		user.setLocation(new GeoJsonPoint(5.0, 6.0));
				
		repository.save(user);
		assertNotNull(user.getId());
		
		user.setLocation(new GeoJsonPoint(1.0, 2.0));
		repository.save(user);
		
		assertNotNull(user.getId()); // never reached on my machine, causes:
		
		/*		 
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
			at be.lapers.geojsontest.VersionAnnotatedTest.updateUserWithGeoJsonPoint(VersionAnnotatedTest.java:42)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
			at java.lang.reflect.Method.invoke(Method.java:483)
			at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
			at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
			at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
			at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
			at org.springframework.test.context.junit4.statements.RunBeforeTestMethodCallbacks.evaluate(RunBeforeTestMethodCallbacks.java:75)
			at org.springframework.test.context.junit4.statements.RunAfterTestMethodCallbacks.evaluate(RunAfterTestMethodCallbacks.java:86)
			at org.springframework.test.context.junit4.statements.SpringRepeat.evaluate(SpringRepeat.java:84)
			at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
			at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:254)
			at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:89)
			at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
			at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
			at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
			at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
			at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
			at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
			at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70)
			at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
			at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:193)
			at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)
			at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)		 
		 */		
	}
}
