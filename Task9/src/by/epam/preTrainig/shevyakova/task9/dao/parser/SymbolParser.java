package by.epam.preTrainig.shevyakova.task9.dao.parser;

import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;
import by.epam.preTrainig.shevyakova.task9.entities.TextSymbol;

public class SymbolParser extends AbstractParser {
	@Override
	public TextComponent parse(String textForParse) {
		TextComponent symbol = new TextSymbol(textForParse.charAt(0));
		return symbol;
	}
}
