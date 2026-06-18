package com.learnGitHubActions.learnGitHubActions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnGitHubActionsApplicationTests {

	@Autowired
	private HomeController homeController;

	@Test
	void sampleTest() {

		String result = homeController.addNum(10, 20);
		String actual = "30";

		Assertions.assertTrue(result.contains(actual));
	}

	@Test
	void sampleTest2() {

		String result = homeController.diffNum(100, 20);
		String actual = "80";

		Assertions.assertTrue(result.contains(actual));
	}

}
