package by.epam.preTrainig.shevyakova.task9.entities;

import java.util.List;

public class TextSymbol implements TextComponent {
	private Character symbol;

	public TextSymbol(Character symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol.toString();
	}

	@Override
	public List<TextComponent> getChilds() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addChild(TextComponent textComponent) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeChild(TextComponent textComponent) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addAll(List<TextComponent> textComponents) {
		throw new UnsupportedOperationException();
	}

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
