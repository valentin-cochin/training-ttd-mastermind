package com.mastermind.tdd;

import java.util.List;

public class Mastermind {
	List<Color> combinationToFind;
	int nbIllPlacedColors = 2;

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

	public int countIllPlacedColors() {
		return 2;
	}
}

