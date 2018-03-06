package by.epam.preTrainig.shevyakova.task9.controller;

import by.epam.preTrainig.shevyakova.task9.dao.ResultPrinter;
import by.epam.preTrainig.shevyakova.task9.dao.TextReader;
import by.epam.preTrainig.shevyakova.task9.dao.chain.ChainLinker;
import by.epam.preTrainig.shevyakova.task9.dao.parser.TextParser;
import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;
import by.epam.preTrainig.shevyakova.task9.exceptions.DAOException;
import by.epam.preTrainig.shevyakova.task9.model.SentenceLexemeChanger;
import by.epam.preTrainig.shevyakova.task9.model.SentenceIncreasingSorter;

public class Main {

    public static void main(String[] args) {
        try {
            TextReader textReader = new TextReader();
            String initialFilePath = "D:\\Epam-Pre-Training\\Task9\\src\\by\\epam\\preTrainig\\shevyakova\\task9\\resources\\initialText";

            String textForParsing = textReader.readTextFromFile(initialFilePath);

            ChainLinker chain = new ChainLinker();
            TextParser textParser = chain.init();
            TextComponent text = textParser.parse(textForParsing);
            ResultPrinter.print(text.toString());

            /**
             * interchange the first and last lexemes in the sentences. Variant 5
             */
            SentenceLexemeChanger sentenceLexemeChanger = new SentenceLexemeChanger();
            TextComponent textChangedLexemes = sentenceLexemeChanger.changeSentenceFirstAndLastLexeme(text);
            ResultPrinter.print("\n" + "\n" +textChangedLexemes.toString());

            /**
             * text sorted by increasing number of lexemes in sentences
             */
            SentenceIncreasingSorter sentenceIncreasingSorter = new SentenceIncreasingSorter();
            TextComponent sortedText = sentenceIncreasingSorter.sort(textParser.parse(textForParsing));
            ResultPrinter.print("\n" + "\n" + sortedText.toString());

        } catch (DAOException e) {
            e.printStackTrace();
        }

    }
}
