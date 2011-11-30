package ee.itcollege.example.web;

import ee.itcollege.example.entities.AdminUnitHierarchy;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "adminunithierarchys", formBackingObject = AdminUnitHierarchy.class)
@RequestMapping("/adminunithierarchys")
@Controller
public class AdminUnitHierarchyController {
}
