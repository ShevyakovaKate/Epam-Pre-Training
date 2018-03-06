package by.epam.preTrainig.shevyakova.task9.model;

import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;
import by.epam.preTrainig.shevyakova.task9.entities.TextComposite;
import by.epam.preTrainig.shevyakova.task9.entities.TextCompositeType;
import by.epam.preTrainig.shevyakova.task9.entities.TextSymbol;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceLexemeChanger {
	private static final String PUNCTUATION_SYMBOL = "([.,:;\"!?']+)";

	public TextComponent changeSentenceFirstAndLastLexeme(TextComponent text) {
		if (!(text instanceof TextComposite) || ((TextComposite) text).getType() != TextCompositeType.TEXT) {
			throw new RuntimeException("Wrong type of the component");
		}

		TextComposite resultText = new TextComposite(TextCompositeType.TEXT);
		List<TextComponent> paragraphList = text.getChilds();

		for (TextComponent paragraphElement : paragraphList) {
			List<TextComponent> sentenceList = paragraphElement.getChilds();
			TextComposite resultParagraph = new TextComposite(TextCompositeType.PARAGRAPH);

			for (TextComponent sentence : sentenceList) {
				List<TextComponent> lexemeList = sentence.getChilds();

				if (lexemeList.size() > 1) {
					TextComponent firstLexeme = lexemeList.get(0);
					List<TextComponent> firstLexemeSymbols = firstLexeme.getChilds();

					TextComponent lastLexeme = lexemeList.get(lexemeList.size() - 1);
					List<TextComponent> lastLexemeSymbols = lastLexeme.getChilds();

					String endSymbolOfLastLexeme = lastLexemeSymbols.get(lastLexemeSymbols.size() - 1).toString();
					String endSymbolOfFirstLexeme = firstLexemeSymbols.get(firstLexemeSymbols.size() - 1).toString();

					Pattern punctuationPattern = Pattern.compile(PUNCTUATION_SYMBOL);
					Matcher punctuationMatcher = punctuationPattern.matcher(endSymbolOfFirstLexeme);

					/**
					 * if first lexeme is ending by punctuation symbol,
					 * then set this punctuation symbol to the end of the last lexeme
					 */
					if(punctuationMatcher.find()) {
						TextSymbol punctuationSymbolOfFirstLexeme = new TextSymbol(endSymbolOfFirstLexeme.charAt(0));
						int endSymbolIndexOfLastLexeme = lastLexeme.getChilds().size() - 1;
						lastLexeme.getChilds().set(endSymbolIndexOfLastLexeme, punctuationSymbolOfFirstLexeme);
					}
					/**
					 * set last lexeme punctuation symbol to the end of the first lexeme
					 */
					int endSymbolIndexOfFirstLexeme = firstLexeme.getChilds().size() - 1;
					TextSymbol punctuationSymbolOfLastLexeme = new TextSymbol(endSymbolOfLastLexeme.charAt(0));
					firstLexeme.getChilds().set(endSymbolIndexOfFirstLexeme,punctuationSymbolOfLastLexeme );

					/**
					 * swap lexemes
					 */
					lexemeList.set(0, lexemeList.get(lexemeList.size() - 1));
					lexemeList.set(lexemeList.size() - 1, firstLexeme);
				}

				TextComposite resultSentence = new TextComposite(TextCompositeType.SENTENCE);
				resultSentence.addAll(lexemeList);
				resultParagraph.addChild(resultSentence);
			}
			resultText.addChild(resultParagraph);
		}
		return resultText;
	}
}
