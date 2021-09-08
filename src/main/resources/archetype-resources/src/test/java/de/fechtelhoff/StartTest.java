package de.fechtelhoff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StartTest {

	@Test
	void test() {
		Assertions.assertDoesNotThrow(() -> Start.main(null));
	}
}
