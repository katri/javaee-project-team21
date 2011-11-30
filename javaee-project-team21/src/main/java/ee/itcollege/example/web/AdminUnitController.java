package ee.itcollege.example.web;

import ee.itcollege.example.entities.AdminUnit;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "adminunits", formBackingObject = AdminUnit.class)
@RequestMapping("/adminunits")
@Controller
public class AdminUnitController {
}
