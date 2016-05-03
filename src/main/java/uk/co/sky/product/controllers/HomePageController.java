package uk.co.sky.product.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.sky.ProductSelection;

/**
 * Home Page Controller
 */
@Controller
@RequestMapping(value = "/")
public class HomePageController
{
    @RequestMapping(value = "home")
    public String homepage(final Model model)
    {
        return ProductSelection.PageView.HOME_PAGE;
    }
}
