//package com.Privacy.Policy.language_Api;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class LanguageApiApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//}
package com.Privacy.Policy.language_Api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "HF_API_TOKEN=dummy")
class LanguageApiApplicationTests {

	@Test
	void contextLoads() {
	}
}
