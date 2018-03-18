package net.wonlee.sevenwonders.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.wonlee.sevenwonders.service.CardService;

@Controller
public class CardController {
	
	private CardService cardSerivce;
	
	@Autowired
	public void setCardService(CardService cardService) {
		this.cardSerivce = cardService;
	}
	
    @RequestMapping("/")
    public String redirToList(){
    	System.out.println("root directory");
        return "redirect:/cards"; 
    }
	
    @RequestMapping({"/card/list", "/card"})
    public String listProducts(Model model){
    	System.out.println("Card Controller List All");
        model.addAttribute("cards", cardSerivce.listAll());
        return "card/list";
    }
}
