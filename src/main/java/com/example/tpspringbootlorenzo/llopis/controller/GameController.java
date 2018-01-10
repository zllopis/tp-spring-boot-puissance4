package com.example.tpspringbootlorenzo.llopis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.tpspringbootlorenzo.llopis.model.GameModel;
import com.example.tpspringbootlorenzo.llopis.service.GameService;
import com.example.tpspringbootlorenzo.llopis.service.PartieEnCours;

@Controller
public class GameController {
	

	private GameService gameService;
	private PartieEnCours partieEnCours;

	public GameController(GameService gameService, PartieEnCours partieEnCours) {
		       this.gameService = gameService;
		       this.partieEnCours = partieEnCours;
		    }

	@RequestMapping("/game/new")
	public ModelAndView newGame() {
		 ModelAndView nav  = new ModelAndView("game");
		GameModel gameModel = gameService.newGame();
		partieEnCours.setGameModel(gameModel);
		        nav.addObject("game", gameModel);
		        return nav;
		    }

		    @RequestMapping("/game")
    public ModelAndView game() {
		        ModelAndView mv = new ModelAndView("game");
		        GameModel gameModel = partieEnCours.getGameModel();
		       nav.addObject("game", gameModel);
		return nav;
	}

	@RequestMapping("/game/drop/{i}")
    public ModelAndView drop(@PathVariable("i") Integer numColonne) {
		        ModelAndView nav = new ModelAndView("game");
		        GameModel gameModel = partieEnCours.getGameModel();
		        // -1 pour correspondre au model
				      int index = numColonne - 1;
		        gameModel.add(index);
		        nav.addObject("game", gameModel);
		        return nav;
		    }
}
