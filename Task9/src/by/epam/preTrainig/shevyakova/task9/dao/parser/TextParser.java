package by.epam.preTrainig.shevyakova.task9.dao.parser;

import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;
import by.epam.preTrainig.shevyakova.task9.entities.TextComposite;
import by.epam.preTrainig.shevyakova.task9.entities.TextCompositeType;

import java.util.regex.Pattern;

import static by.epam.preTrainig.shevyakova.task9.controller.Constant.NEW_LINE;

public class TextParser extends AbstractParser {

    public TextParser() {
	}

	public TextParser(AbstractParser nextParser) {
		super(nextParser);
	}

	@Override
	public TextComponent parse(String textForParse) {
		Pattern patternParagraph = Pattern.compile(NEW_LINE);
		String[] paragraphs = patternParagraph.split(textForParse.trim());
		TextComposite text = new TextComposite(TextCompositeType.TEXT);
		for (String sourceParagraph : paragraphs) {
			TextComponent paragraph = new TextComposite(TextCompositeType.PARAGRAPH);
			if(getNextParser()!= null) {
				String paragraphContent = sourceParagraph.trim();
				paragraph = getNextParser().parse(paragraphContent);
			}
			text.addChild(paragraph);
		}
		return text;
	}
}
