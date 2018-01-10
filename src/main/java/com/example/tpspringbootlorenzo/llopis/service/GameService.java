package com.example.tpspringbootlorenzo.llopis.service;
import org.springframework.stereotype.Service;

import com.example.tpspringbootlorenzo.llopis.model.GameModel;
@Service
public class GameService {

	public GameModel newGame() {
		GameModel a = new GameModel();
		a.setNom1("pepito");
		a.setNom2("josé");
		return a ;
	}
}



