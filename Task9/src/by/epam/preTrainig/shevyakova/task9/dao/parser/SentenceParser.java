package by.epam.preTrainig.shevyakova.task9.dao.parser;

import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;
import by.epam.preTrainig.shevyakova.task9.entities.TextComposite;
import by.epam.preTrainig.shevyakova.task9.entities.TextCompositeType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser extends AbstractParser {
	private static final String SPACE_DIVIDER = "\\s";
	private static final String PUNCTUATION_DIVIDER = "([.,:;\"!?']+)";
	private static final String ANY_SYMBOL_DIVIDER = ".";
	private static final String BEGIN = "^";
	private static final String END = "$";

	public SentenceParser() {
	}

	public SentenceParser(AbstractParser nextParser) {
		super(nextParser);
	}

	@Override
	public TextComponent parse(String textForParse) {
		TextComposite sentence = new TextComposite(TextCompositeType.SENTENCE);
		Pattern spacePattern = Pattern.compile(SPACE_DIVIDER);
		String[] lexemes = spacePattern.split(textForParse);

		TextComposite lexeme;
		for (String tmpLexeme : lexemes) {
			lexeme = new TextComposite(TextCompositeType.LEXEME);
			Pattern patternBegin = Pattern.compile(BEGIN + PUNCTUATION_DIVIDER);
			Matcher matcherBegin = patternBegin.matcher(tmpLexeme);
			String punctuation = null;

			//if the punctuation before the lexeme
			if (matcherBegin.find()) {
				punctuation = tmpLexeme.substring(0, matcherBegin.end());
				tmpLexeme = tmpLexeme.substring(matcherBegin.end());
				addPunctuation(punctuation, lexeme);
				punctuation = null;
			}
			Pattern patternEnd = Pattern.compile(PUNCTUATION_DIVIDER + END);
			Matcher matcherEnd = patternEnd.matcher(tmpLexeme);

			//if the punctuation after the lexeme
			if (matcherEnd.find()) {
				punctuation = tmpLexeme.substring(matcherEnd.start());
				tmpLexeme = tmpLexeme.substring(0, matcherEnd.start());
			}
			TextComponent lexemeSymbol = getNextParser().parse(tmpLexeme);
			lexeme.addChild(lexemeSymbol);
			if (punctuation != null) {
				addPunctuation(punctuation, lexeme);
			}
			sentence.addChild(lexeme);
		}
		return sentence;
	}

	private void addPunctuation(String punctuation, TextComposite lexeme) {
		Pattern patternSymbol = Pattern.compile(ANY_SYMBOL_DIVIDER);
		Matcher matcherSymbol = patternSymbol.matcher(punctuation);
		while (matcherSymbol.find()) {
			String punct = matcherSymbol.group();
			TextComponent punctuationSymbol = getNextParser().parse(punct);
			lexeme.addChild(punctuationSymbol);
		}
	}
}
