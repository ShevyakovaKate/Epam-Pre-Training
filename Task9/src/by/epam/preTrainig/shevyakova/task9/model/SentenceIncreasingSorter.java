package by.epam.preTrainig.shevyakova.task9.model;

import by.epam.preTrainig.shevyakova.task9.entities.TextComponent;
import by.epam.preTrainig.shevyakova.task9.entities.TextComposite;
import by.epam.preTrainig.shevyakova.task9.entities.TextCompositeType;
import by.epam.preTrainig.shevyakova.task8.model.sort.sorters.Sorter;

import java.util.ArrayList;
import java.util.List;

public class SentenceIncreasingSorter {

    public TextComponent sort(TextComponent text) {
        if (!(text instanceof TextComposite) || ((TextComposite) text).getType() != TextCompositeType.TEXT) {
            throw new RuntimeException("Wrong type of the component");
        }
        TextComposite resultText = new TextComposite(TextCompositeType.TEXT);
        List<TextComponent> paragraphList = text.getChilds();
        ArrayList<TextComponent> sentences = new ArrayList<>();

        for (TextComponent paragraphElement : paragraphList) {
            List<TextComponent> sentenceList = paragraphElement.getChilds();
            TextComposite resultParagraph = new TextComposite(TextCompositeType.PARAGRAPH);

            for (TextComponent sentence : sentenceList) {
                sentences.add(sentence);
            }
        }
        Sorter<TextComponent> sorter = new Sorter<TextComponent>();
        List<TextComponent> resultSentences = sorter.sort(sentences);

        resultText.addAll(resultSentences);
        return resultText;
    }
}
