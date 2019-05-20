/*
 * Copyright 2015-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.routing;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Gary Russell
 * @author Scott Deeg
 * @author Wayne Lund
 */
@Profile("routing")
@Configuration
public class RoutingConfig {
	@Bean
	public DirectExchange directExchange() {
		return new DirectExchange("routing.direct");
	}

	@Bean
	public Queue autoDeleteQueue1() {
		return new AnonymousQueue();
	}

	@Bean
	public Queue autoDeleteQueue2() {
		return new AnonymousQueue();
	}

	@Bean
	public Binding binding1a(DirectExchange direct, Queue autoDeleteQueue1) {
		return BindingBuilder.bind(autoDeleteQueue1).to(direct).with("orange");
	}

	@Bean
	public Binding binding1b(DirectExchange direct, Queue autoDeleteQueue1) {
		return BindingBuilder.bind(autoDeleteQueue1).to(direct).with("black");
	}

	@Bean
	public Binding binding2a(DirectExchange direct, Queue autoDeleteQueue2) {
		return BindingBuilder.bind(autoDeleteQueue2).to(direct).with("green");
	}

	@Bean
	public Binding binding2b(DirectExchange direct, Queue autoDeleteQueue2) {
		return BindingBuilder.bind(autoDeleteQueue2).to(direct).with("black");
	}

	@Bean
	public RoutingSender sender() {
		return new RoutingSender();
	}

	@Bean
	public RoutingReceiver receiver() {
		return new RoutingReceiver();
	}

}
