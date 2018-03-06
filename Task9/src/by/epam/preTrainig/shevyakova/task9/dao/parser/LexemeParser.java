package by.epam.preTrainig.shevyakova.task9.dao.parser;

import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;
import by.epam.preTrainig.shevyakova.task9.entities.TextComposite;
import by.epam.preTrainig.shevyakova.task9.entities.TextCompositeType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser extends AbstractParser {
	private static final String ANY_SYMBOL_DIVIDER = ".";

	public LexemeParser() {
	}

	public LexemeParser(AbstractParser nextParser) {
		super(nextParser);
	}

	@Override
	public TextComponent parse(String textForParse) {
		TextComposite lexeme = new TextComposite(TextCompositeType.LEXEME);
		Pattern patternSymbol = Pattern.compile(ANY_SYMBOL_DIVIDER);
		Matcher matcherSymbol = patternSymbol.matcher(textForParse);

		while (matcherSymbol.find()) {
			String symbol = matcherSymbol.group();
			lexeme.addChild(getNextParser().parse(symbol));
		}
		return lexeme;
	}
}
