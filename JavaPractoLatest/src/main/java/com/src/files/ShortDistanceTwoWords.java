package com.src.files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ShortDistanceTwoWords {
	public static void main(String[] args) throws IOException {
		List<String> words = Files.readAllLines(Paths.get("..\\JavaPractoLatest\\src\\main\\resources\\Story.txt"),
				Charset.defaultCharset());
		int i = shortest((String[]) words.toArray(), "example", "conditions");
		System.out.println("Hello " + i);
	}

	public static int shortest(String[] words, String word1, String word2) {
		int pos = 0;
		int min = Integer.MAX_VALUE / 2;
		int word1_pos = -min;
		int word2_pos = -min;
		for (int i = 0; i < words.length; i++) {
			String current_word = words[i];
			if (current_word.equals(word1)) {
				word1_pos = pos;
				// Comment following 3 lines if word order matters
				int distance = word1_pos - word2_pos;
				if (min > distance)
					min = distance;
			} else if (current_word.equals(word2)) {
				word2_pos = pos;
				int distance = word2_pos - word1_pos;
				if (min > distance)
					min = distance;
			}
			++pos;
		}
		return min;
	}
}
