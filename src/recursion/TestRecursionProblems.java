package recursion;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class TestRecursionProblems {

	@Test
	void test1() {
		assertEquals(RecursionProblems.count8(8818), 4);
	}
	
	@Test
	void test2() {
		assertEquals(RecursionProblems.count8(88188), 6);
	} 
	
	@Test
	void test3() {
		assertEquals(RecursionProblems.count8(44579230), 0);
	}
	
	@Test
	void test4() {
		assertEquals(RecursionProblems.count8(81188), 4);
	}
	
	@Test
	void test5() {
		assertEquals(RecursionProblems.count8(88888), 9);
	}
	
	@Test
	void test6() {
		assertEquals(RecursionProblems.strCount("catcowccat", "cat"), 2);
	}
	
	@Test
	void test7() {
		assertEquals(RecursionProblems.strCount("catttcowccatcat", "cat"), 3);
	}
	
	@Test
	void test8() {
		assertEquals(RecursionProblems.strCount("", "cat"), 0);
	}
	
	@Test
	void test9() {
		assertEquals(RecursionProblems.strCount("dogcatdogdog dogs", null), 0);
	}
	
	@Test
	void test10() {
		assertEquals(RecursionProblems.strCount("catcowccat", ""), 0);
	}
	
	@Test
	void test11() {
		assertEquals(RecursionProblems.stringClean("a"), "a");
	}
	
	@Test
	void test12() {
		assertEquals(RecursionProblems.stringClean(""), "");
	}
	
	@Test
	void test13() {
		assertEquals(RecursionProblems.stringClean(null), null);
	}
	
	@Test
	void test14() {
		assertEquals(RecursionProblems.stringClean("aaabbbbcc"), "abc");
	}
	
	@Test
	void test15() {
		assertEquals(RecursionProblems.stringClean("yyzzza"), "yza");
	}

}// end class
