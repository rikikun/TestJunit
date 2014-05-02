public class RangeClass {
	private int last, first;
	public static final char OPEN_RIGHT = ')';
	public static final char OPEN_LEFT = '(';
	public static final String COMMA = ",";
	public static final String BRACLET_RIGHT = "}";
	public static final String BRACLET_LEFT = "{";

	public String getInput(String inputRange) throws InvalidRangeException {
		validate(splitComma(inputRange));
		checkSymbol(inputRange);
		return buildResult();
	}

	private void checkSymbol(String string) {
		if (string.charAt(0) == OPEN_LEFT) {
			first++;
		}
		if (string.charAt(string.length() - 1) == OPEN_RIGHT) {
			last--;
		}
	}

	private String buildResult() {
		String result = "";
		for (int current = first; current <= last; current++) {
			result += current;
			if (current != last) {
				result += COMMA;
			}
		}
		return BRACLET_LEFT+result+BRACLET_RIGHT;
	}

	private void validate(String[] arrString) throws InvalidRangeException {
		try {
			first = Integer.parseInt(arrString[0]);
			last = Integer.parseInt(arrString[1]);
		} catch (Exception e) {
			throw new InvalidRangeException("Invalid Range Exception");
		}
		if (last < first) {
			throw new InvalidRangeException("Invalid Range Exception");
		}
	}

	private String[] splitComma(String string) throws InvalidRangeException {
		return string.substring(1, string.length() - 1).split(COMMA);
	}

}
