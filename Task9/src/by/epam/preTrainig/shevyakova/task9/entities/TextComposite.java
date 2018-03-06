package by.epam.preTrainig.shevyakova.task9.entities;

import java.util.ArrayList;
import java.util.List;

import static by.epam.preTrainig.shevyakova.task9.controller.Constant.SPACE;
import static by.epam.preTrainig.shevyakova.task9.controller.Constant.NEW_LINE;

public class TextComposite implements TextComponent, Comparable {
	private List<TextComponent> childs;
	private TextCompositeType type;

	public TextComposite() {
		childs = new ArrayList<TextComponent>();
	}

	public TextComposite(TextCompositeType type) {
		this.childs = new ArrayList<TextComponent>();
		this.type = type;
	}

	public TextCompositeType getType() {
		return this.type;
	}

	public List<TextComponent> getChilds() {
		return childs;
	}

	public void addChild(TextComponent textComponent) {
		childs.add(textComponent);
	}

	public void removeChild(TextComponent textComponent) {
		childs.remove(textComponent);
	}

	public void addAll(List<TextComponent> textComponents) {
		this.childs = textComponents;
	}

    @Override
    public int compareTo(Object o) {
        return childs.size() - ((TextComponent)o).getChilds().size();
    }

    @Override
	public String toString() {
		StringBuilder text = new StringBuilder();
		for (TextComponent element : childs) {
			text = text.append(element.toString());
			if (type == TextCompositeType.SENTENCE) {
				text = text.append(SPACE);
			}
			if (type == TextCompositeType.TEXT) {
				text = text.append(NEW_LINE);
			}
		}
		return text.toString().trim();
	}
}
