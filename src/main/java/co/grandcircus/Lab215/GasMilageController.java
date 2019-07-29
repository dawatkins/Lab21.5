package co.grandcircus.Lab215;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GasMilageController {

	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
	}
	           
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}

	@RequestMapping("/mileage-results")
	public ModelAndView ShowCalculation(
			@RequestParam("mpg") double mpg,
			@RequestParam("gallonsLeft") double gallonsLeft) {
		double result = (mpg * gallonsLeft);

		ModelAndView mav = new ModelAndView("mileage-calculated");
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping("/gas-price")
	public ModelAndView showGasPrice() {
		return new ModelAndView("gas-price");
	}
	
	@RequestMapping("/gas-cost")
	public ModelAndView showGasCost(
			@RequestParam("gasCost") double gasCost,
			@RequestParam("emptyGallons") double emptyGallons) {
		double gasResult = (gasCost * emptyGallons);

		ModelAndView mav = new ModelAndView("gas-cost");
		mav.addObject("gasResult", gasResult);
		return mav;
	}
}
