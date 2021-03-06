/*
 * Copyright 2010 the original author or authors
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package com.joshlong.activiti.coordinator.registration1.distribution.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * We want to handle jobs dished out by the workflow engine on different nodes, avoiding blocking on the main workflow engine.
 * @author Josh Long
 */
public class RegistrationConsumerMain {
	public static void main(String [] args) throws Throwable {
		ClassPathXmlApplicationContext cax = new ClassPathXmlApplicationContext("consumer.xml") ;

		Thread.sleep(1000 * 30 );

	}
}
