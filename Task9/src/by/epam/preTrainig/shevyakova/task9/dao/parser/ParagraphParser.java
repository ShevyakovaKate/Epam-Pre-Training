package by.epam.preTrainig.shevyakova.task9.dao.parser;

import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;
import by.epam.preTrainig.shevyakova.task9.entities.TextComposite;
import by.epam.preTrainig.shevyakova.task9.entities.TextCompositeType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser extends AbstractParser {
	private static final String SENTENCE_DIVIDER = "([^.!?]+[.!?]+)";

	public ParagraphParser() {
	}

	public ParagraphParser(AbstractParser nextParser) {
		super(nextParser);
	}

	@Override
	public TextComponent parse(String textForParse) {
		TextComposite paragraph = new TextComposite(TextCompositeType.PARAGRAPH);
		Pattern patternSentence = Pattern.compile(SENTENCE_DIVIDER);
		Matcher matcherSentence = patternSentence.matcher(textForParse);

		while (matcherSentence.find()) {
			String sentenceText = matcherSentence.group().trim();
			TextComposite sentence = new TextComposite(TextCompositeType.SENTENCE);
			TextComponent lexeme = getNextParser().parse(sentenceText);
			sentence.addChild(lexeme);
			paragraph.addChild(sentence);
		}
		return paragraph;
	}
}
