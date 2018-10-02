package bsonin.springblog.controller;

import bsonin.springblog.dao.CountryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CountryController {

    @Autowired
    private CountryDao countryDao;

    @RequestMapping(value = {"/", "/countries"}, method = RequestMethod.GET)
    public String getCountries(Model model)
    {
        return "home";
    }

    @RequestMapping(value = {"/countries/{name}"}, method = RequestMethod.GET)
    public String getCountry(Model model, @PathVariable String name)
    {
        return "detail";
    }
}
