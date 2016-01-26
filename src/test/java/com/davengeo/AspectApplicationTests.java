package com.davengeo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AspectApplication.class)
@EnableAspectJAutoProxy
public class AspectApplicationTests {

    @Autowired
    Runner runner;

	@Test
	public void contextLoads() {
        assertThat(runner.getDecoration()).isNotNull();
        runner.receive();
	}

}
