package oop;

import java.io.IOException;

public class TesterView {

	public static void main(String[] args) {
		try {
            DatabaseSingleton.initialize();  // Инициализация DatabaseSingleton перед использованиемя
            Admin admin = new Admin();
            admin.run();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}

