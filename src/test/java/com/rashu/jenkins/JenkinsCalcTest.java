package com.rashu.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc =  new JenkinsCalculator();
		assertEquals(50,myCalc.addNumbers(25,25));
		}
	@Test
	public void subtractTest() {
		JenkinsCalculator myCalc =  new JenkinsCalculator();
		assertEquals(25,myCalc.subtractNumbers(50,25));
		}

}
