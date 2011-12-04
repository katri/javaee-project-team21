package ee.itcollege.example.web;

import java.util.Collection;

import ee.itcollege.example.entities.AdminUnit;
import ee.itcollege.example.entities.Regiment;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "regiments", formBackingObject = Regiment.class)
@RequestMapping("/regiments")
@Controller
public class RegimentController {
	
	   @ModelAttribute("adminunits")
	    public Collection<AdminUnit> populateAdminUnits() {
	        return AdminUnit.findAllAdminUnits();
	    }
	    
}
