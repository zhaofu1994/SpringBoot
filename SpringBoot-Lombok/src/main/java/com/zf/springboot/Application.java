package com.zf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;

import java.util.List;
/**
 * @author : zf
 * @描述:
 * @创建: 2018/4/13-17:57;
 * @版本: V1.0
 **/
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Binder binder = Binder.get(context.getEnvironment());
		// 绑定简单配置
		FooProperties foo = binder.bind("com.didispace", Bindable.of(FooProperties.class)).get();
		System.out.println(foo.getFoo());
		// 绑定List配置
		List<String> post = binder.bind("com.didispace.post", Bindable.listOf(String.class)).get();
		System.out.println(post);
		List<PostInfo> posts = binder.bind("com.didispace.posts", Bindable.listOf(PostInfo.class)).get();
		System.out.println(posts);
		// 读取配置
		System.out.println(context.getEnvironment().containsProperty("com.didispace.database-platform"));
		System.out.println(context.getEnvironment().containsProperty("com.didispace.databasePlatform"));

	}
}
