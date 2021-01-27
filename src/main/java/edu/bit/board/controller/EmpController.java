package edu.bit.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.service.EmpService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */

//@Log4j
@AllArgsConstructor
@Controller
public class EmpController{
	
	private EmpService empService;

	@GetMapping("/emplist")
	public void emplist(Model model){
 	//log.info("list");
	model.addAttribute("list", empService.getList());
	}
}

