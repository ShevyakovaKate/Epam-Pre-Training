package by.epam.preTrainig.shevyakova.task9.dao.chain;

import by.epam.preTrainig.shevyakova.task9.dao.parser.*;

public class ChainLinker {

	public ChainLinker() {

	}

	public TextParser init() {
		SymbolParser symbolParser = new SymbolParser();
		LexemeParser lexemeParser = new LexemeParser(symbolParser);
		SentenceParser sentenceParser = new SentenceParser(lexemeParser);
		ParagraphParser paragraphParser = new ParagraphParser(sentenceParser);
		TextParser textParser = new TextParser(paragraphParser);

		return textParser;
	}
}
