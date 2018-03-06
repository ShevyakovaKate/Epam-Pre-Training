package by.epam.preTrainig.shevyakova.task9.entities;

import java.util.List;

public interface TextComponent extends Comparable {
	String toString();

	List<TextComponent> getChilds();

	void addChild(TextComponent textComponent);

	void removeChild(TextComponent textComponent);

	void addAll(List<TextComponent> textComponents);
}
