package ee.itcollege.example.web;

import ee.itcollege.example.entities.RegimentHierarchy;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "regimenthierarchys", formBackingObject = RegimentHierarchy.class)
@RequestMapping("/regimenthierarchys")
@Controller
public class RegimentHierarchyController {
}
