package com.mastermind.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class MastermindTest {

	@Test
	void shouldMatchCombinationForOneColorWellPlaced() {
		// Given
		List<Color> combinationToFind = Collections.singletonList(Color.BLUE);
		Mastermind mastermind = new Mastermind(combinationToFind);
		List<Color> combination = Collections.singletonList(Color.BLUE);
		
		// When
		int wellPlacedColorCount = mastermind.countWellPlacedColors(combination);

		// Then
		assertEquals(1, wellPlacedColorCount);
	}

	@Test
	void shouldNotMatchCombinationForOneColorWellPlaced() {
		List<Color> combinationToFind = Collections.singletonList(Color.BLUE);
		Mastermind mastermind = new Mastermind(combinationToFind);
		List<Color> combination = Collections.singletonList(Color.RED);
		
		int wellPlacedColorCount = mastermind.countWellPlacedColors(combination);

		assertEquals(0, wellPlacedColorCount);
	}

	@Test
	void shouldMatchCombinationForTwoColorsWellPlaced() {
		List<Color> combinationToFind = Arrays.asList(Color.BLUE, Color.RED);
		Mastermind mastermind = new Mastermind(combinationToFind);
		List<Color> combination = Arrays.asList(Color.BLUE, Color.RED);
		
		int wellPlacedColorCount = mastermind.countWellPlacedColors(combination);

		assertEquals(2, wellPlacedColorCount);
	}

	@Test
	void shouldMatchOnlyOneColorForTwoColorsWellPlaced() {
		List<Color> combinationToFind = Arrays.asList(Color.RED, Color.RED);
		Mastermind mastermind = new Mastermind(combinationToFind);
		List<Color> combination = Arrays.asList(Color.BLUE, Color.RED);
		
		int wellPlacedColorCount = mastermind.countWellPlacedColors(combination);

		assertEquals(1, wellPlacedColorCount);
	}

	@Test
	void shouldMatchCombinationForFiveColorsWellPlaced() {
		List<Color> combinationToFind = Arrays.asList(Color.RED, Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE);
		Mastermind mastermind = new Mastermind(combinationToFind);
		List<Color> combination = Arrays.asList(Color.RED, Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE);
		
		int wellPlacedColorCount = mastermind.countWellPlacedColors(combination);

		assertEquals(5, wellPlacedColorCount);
	}
	
	@Test
	void shouldMatchCombinationForTwoColorsIllPlaced() {
		List<Color> combinationToFind = Arrays.asList(Color.RED, Color.BLUE);
		Mastermind mastermind = new Mastermind(combinationToFind);
		List<Color> combination = Arrays.asList(Color.BLUE, Color.RED);
		
		int illPlacedColorCount = mastermind.countIllPlacedColors();
		
		assertEquals(2, illPlacedColorCount);
	}
}
