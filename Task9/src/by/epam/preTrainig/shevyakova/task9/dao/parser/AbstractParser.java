package by.epam.preTrainig.shevyakova.task9.dao.parser;

import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;

public abstract class AbstractParser {
	private AbstractParser nextParser;

	public AbstractParser() {

	}

	public AbstractParser(AbstractParser nextParser) {
		this.nextParser = nextParser;
	}

	public abstract TextComponent parse(String textForParse);

	public AbstractParser getNextParser() {
		return nextParser;
	}
}
