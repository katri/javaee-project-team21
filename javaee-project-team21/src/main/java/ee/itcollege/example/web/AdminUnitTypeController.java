package ee.itcollege.example.web;

import ee.itcollege.example.entities.AdminUnitType;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "adminunittypes", formBackingObject = AdminUnitType.class)
@RequestMapping("/adminunittypes")
@Controller
public class AdminUnitTypeController {
}
