package date.pm25.controller;

import date.pm25.model.AqiChina;
import date.pm25.service.AqiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by toy on 26/04/2017.
 */

@Controller
@RequestMapping("/aqi")
public class AqiController {

    @Autowired
    AqiService aqiService;

    @RequestMapping("/{d1}")
    public ModelAndView showCity(@PathVariable String d1) {
        ModelAndView view = new ModelAndView("city");
        AqiChina aqiChina = aqiService.selectByD1(d1);
        if (aqiChina != null) {
            view.addObject("sb", aqiChina.getArea());
        }
        return view;

    }
}
