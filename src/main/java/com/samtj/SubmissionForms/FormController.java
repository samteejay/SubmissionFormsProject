package com.samtj.SubmissionForms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("form")
    public String index() {
        return "form";
    }

    @PostMapping("/view")
    public String viewdetails(@RequestParam("cid") String cid,
                              @RequestParam("cname") String cname,
                              @RequestParam("cemail") String cemail,
                              ModelMap mp)
    {
        mp.put("cid", cid);
        mp.put("cname", cname);
        mp.put("cemail", cemail);
        return "view";
    }
}
