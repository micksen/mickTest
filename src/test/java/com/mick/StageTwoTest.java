package com.mick;

import org.junit.Test;

import java.util.List;

public class StageTwoTest {


	@Test
	public void test1() {
		StageTwo stageTwo = new StageTwo();

		int[] number = { 2, 3 };
		List<String> list = null;
		try {
			list = stageTwo.convertNumberToLetters(number);
		} catch (Exception e) {
			System.out.println("-->"+e.getMessage());
		}
		for (String str : list) {
			System.out.println("---->"+str);
		}

	}


	@Test
	public void test2() {

		StageTwo stageTwo = new StageTwo();

		int[] number = { 14, 51 };
		List<String> list = null;
		try {
			list = stageTwo.convertNumberToLetters(number);
		} catch (Exception e) {
			System.out.println("-->"+e.getMessage());
		}
		for (String str : list) {
			System.out.println("---->"+str);
		}
	}


	@Test
	public void test3() {
		StageTwo stageTwo = new StageTwo();

		int[] number = { 0, 1, 9, 100 };
		List<String> list = null;
		try {
			list = stageTwo.convertNumberToLetters(number);
		} catch (Exception e) {
			System.out.println("-->"+e.getMessage());
		}
		for (String str : list) {
			System.out.println("---->"+str);
		}
	}

}
