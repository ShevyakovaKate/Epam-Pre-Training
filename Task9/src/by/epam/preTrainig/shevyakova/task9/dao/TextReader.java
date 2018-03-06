package by.epam.preTrainig.shevyakova.task9.dao;

import by.epam.preTrainig.shevyakova.task9.exceptions.DAOException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static by.epam.preTrainig.shevyakova.task9.controller.Constant.NEW_LINE;

public class TextReader {

	public TextReader() {

	}

	public String readTextFromFile(String filePath) throws DAOException {

		StringBuilder result = new StringBuilder();
		try (Scanner scanner = new Scanner(new FileReader(filePath))) {
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine().trim() + NEW_LINE;
				result = result.append(nextLine);
			}
		} catch (FileNotFoundException e) {
			throw new DAOException("Do not find the file", e);
		}
		return result.toString().trim();
	}
}
