package eCommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	/*@RequestMapping(value= {"index"})
	public ModelAndView indexNew(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("indexVariable","Welcome to Index Spring MVC");
		return mv;
	}	*/
	
	@RequestMapping(value= {"/","/home","index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring MVC");
		return mv;
	}
	
}
