package ee.itcollege.example.web;

import ee.itcollege.example.entities.AdminUnitTypeHierarchy;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "adminunittypehierarchys", formBackingObject = AdminUnitTypeHierarchy.class)
@RequestMapping("/adminunittypehierarchys")
@Controller
public class AdminUnitTypeHierarchyController {
}
