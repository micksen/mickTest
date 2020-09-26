package com.mick;

import org.junit.Test;

import java.util.List;

public class StageOneTest {

	@Test
	public void test1() {

		StageOne stageOne = new StageOne();
		int[] number = { 3, 5 };
		List<String> list = null;
		try {
			list = stageOne.convertNumberToLetters(number);
		} catch (Exception e) {
			System.out.println("-->"+e.getMessage());
		}

		for (String str : list) {
			System.out.println("---->"+str);
		}
	}

	@Test
	public void test2() {

		StageOne stageOne = new StageOne();
		int[] number = { 8 };
		List<String> list = null;
		try {
			list = stageOne.convertNumberToLetters(number);
		} catch (Exception e) {
			System.out.println("-->"+e.getMessage());
		}

		for (String str : list) {
			System.out.println("---->"+str);
		}
	}

	@Test
	public void test3() {

		StageOne stageOne = new StageOne();
		int[] number = { -1, 0, 3 };
		List<String> list = null;
		try {
			list = stageOne.convertNumberToLetters(number);
		} catch (Exception e) {
			System.out.println("-->"+e.getMessage());
		}

		for (String str : list) {
			System.out.println("---->"+str);
		}
	}

	@Test
	public void test4() {

		StageOne stageOne = new StageOne();
		int[] number = { 0, 3 };
		List<String> list = null;
		try {
			list = stageOne.convertNumberToLetters(number);
		} catch (Exception e) {
			System.out.println("-->"+e.getMessage());
		}

		for (String str : list) {
			System.out.println("---->"+str);
		}
	}

}
