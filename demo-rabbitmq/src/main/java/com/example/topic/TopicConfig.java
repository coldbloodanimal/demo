/*
 * Copyright 2015 the original author or authors.
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
package com.example.topic;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Gary Russell
 * @author Scott Deeg
 */
@Profile({"topic"})
@Configuration
public class TopicConfig {

	@Bean
	public TopicExchange topic() {
		return new TopicExchange("topic");
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
	public Binding binding1a(TopicExchange topic, Queue autoDeleteQueue1) {
		return BindingBuilder.bind(autoDeleteQueue1).to(topic).with("*.orange.*");
	}

	@Bean
	public Binding binding1b(TopicExchange topic, Queue autoDeleteQueue2) {
		return BindingBuilder.bind(autoDeleteQueue2).to(topic).with("*.*.rabbit");
	}

	@Bean
	public Binding binding2a(TopicExchange topic, Queue autoDeleteQueue2) {
		return BindingBuilder.bind(autoDeleteQueue2).to(topic).with("lazy.#");
	}

	@Bean
	public TopicSender sender() {
		return new TopicSender();
	}

	@Bean
	public TopicReceiver receiver() {
		return new TopicReceiver();
	}

}