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
package com.example.hello;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;

/**
 * @author Gary Russell
 * @author Scott Deeg
 */
public class HelloSender {

	@Autowired
	private RabbitTemplate template;

	@Autowired
	private Queue queue;

	public void send(String message) {
		message = !StringUtils.isEmpty(message)?message:"Hello World!";
		this.template.convertAndSend(queue.getName(), message);
		System.out.println("sender:"+Thread.currentThread().getId());
	}

}
