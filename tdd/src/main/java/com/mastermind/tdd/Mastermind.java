package com.mastermind.tdd;

import java.util.List;

public class Mastermind {
	List<Color> combinationToFind;

	public Mastermind(List<Color> combinationToFind) {
		this.combinationToFind = combinationToFind;
	}

	public int countWellPlacedColors(List<Color> combination) {
		int nbWellPlacedColors = 0;
		
		for (int i = 0; i < combination.size(); i++) {
			boolean isPegColorMatching = combination.get(i).equals(combinationToFind.get(i));
			if (isPegColorMatching) {
				nbWellPlacedColors++;
			}
		}
		return nbWellPlacedColors;
	}

	public int countIllPlacedColors(List<Color> combination) {
		int nbIllPlacedColors = 0;
		
		for (int i = 0; i < combination.size(); i++) {
			boolean isPegColorNotMatching = !combination.get(i).equals(combinationToFind.get(i));
			boolean isPegColorPresent = combinationToFind.contains(combination.get(i));
			if (isPegColorNotMatching && isPegColorPresent) {
				nbIllPlacedColors++;
			}
		}
		return nbIllPlacedColors;
	}
}
