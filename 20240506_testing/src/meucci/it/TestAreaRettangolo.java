package meucci.it;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAreaRettangolo {

	@Test
	void test() {
		Rettangolo r = new Rettangolo();
	assertEquals(r.calcoloArea(2, 3),6);
	}

}
