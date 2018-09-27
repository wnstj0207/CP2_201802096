package ����.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ����.ChocolateJar;

class ChocolateJarTest {

	@Test
	void testChocolateJar() { // ������ �׽�Ʈ
		ChocolateJar jar = new ChocolateJar();
		assertEquals(13, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testChocolateJarInt() { // ���ݸ� ���� �Է¹޴� ������ �׽�Ʈ
		ChocolateJar jar = new ChocolateJar(11);
		assertEquals(11, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testGetItem() { // ������ �� ��ȯ �׽�Ʈ
		ChocolateJar jar = new ChocolateJar();
		assertEquals(14, jar.getItem());
	}

	@Test
	void testGetChocolate() { // ���ݸ� �� ��ȯ �׽�Ʈ
		ChocolateJar jar = new ChocolateJar();
		assertEquals(13, jar.getChocolate());
	}

	@Test
	void testGetChilli() { // ĥ�� �� ��ȯ �׽�Ʈ
		ChocolateJar jar = new ChocolateJar();
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testTakeItem() { // ������ �̱� ��ȯ �׽�Ʈ
		ChocolateJar jar = new ChocolateJar();
		assertEquals(14, jar.getItem());
		jar.takeItem(3);
		assertEquals(11, jar.getItem());
		jar.takeItem(2);
		assertEquals(9, jar.getItem());
		jar.takeItem(1);
		assertEquals(8, jar.getItem());
		jar.takeItem(8);
		assertEquals(8, jar.getItem());
	}

	@Test
	void testStatus() { // �׾Ƹ� ���� ��� �׽�Ʈ
		ChocolateJar jar = new ChocolateJar();
		assertEquals("[ �� �� �� �� �� �� �� �� �� �� �� �� �� �� ]", jar.status());
		jar.takeItem(3);
		assertEquals("[ �� �� �� �� �� �� �� �� �� �� �� ]", jar.status());
	}

	@Test
	void testIsEmpty() { // �׾Ƹ��� ������� �Ǵ� �׽�Ʈ
		ChocolateJar jar = new ChocolateJar();
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(2);
		assertFalse(jar.isEmpty());
		jar.takeItem(1);
		assertTrue(jar.isEmpty());
	}

}