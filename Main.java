import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	static Random random = new Random();

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		List<Boolean> sixty = List.of(true, true, true, true, true, true, false, false, false, false);
		List<Boolean> fifty = List.of(true, true, true, true, true, false, false, false, false, false);
		List<Boolean> fourty = List.of(true, true, true, true, false, false, false, false, false, false);
		List<Boolean> thirty = List.of(true, true, true, false, false, false, false, false, false, false);
		List<Boolean> twenty = List.of(true, true, false, false, false, false, false, false, false, false);
		List<Boolean> ten = List.of(true, false, false, false, false, false, false, false, false, false);

		String name;
		for (int i = 0; i < 10; i++) {
			name = getConsonant() + getVowels();

			name += getConsonant() + getVowels();

			if (sixty.get(random.nextInt(9))) {
				name += getConsonant() + getVowels();
				if (fifty.get(random.nextInt(9))) {
					name += getConsonant() + getVowels();
					if (fourty.get(random.nextInt(9))) {
						name += getConsonant() + getVowels();
						if (thirty.get(random.nextInt(9))) {
							name += getConsonant() + getVowels();
							if (twenty.get(random.nextInt(9))) {
								name += getConsonant() + getVowels();
								if (ten.get(random.nextInt(9))) {
									name += getConsonant() + getVowels();
								}
							}
						}
					}
				}
			}

			String firstChar = name.substring(0, 1).toUpperCase();
			String removeLastVowel = name.substring(1, name.length() - 1);
			name = firstChar + removeLastVowel;

			names.add(name);
		}

		names.forEach(System.out::println);
	}

	public static String getConsonant() {
		String[] consonants = {"b", "d", "f", "g", "l", "m", "n", "p", "s", "s", "t", "t", "v", "z", "z", "th"};

		String consonant = consonants[random.nextInt(consonants.length - 1)];
		if (consonant.equals("s")) {
			consonant += consonant;
		}

		return consonant;
	}

	public static String getVowels() {
		String[] vowels = {"a", "e", "i", "o", "u"};

		return vowels[random.nextInt(vowels.length - 1)];
	}
}