package com.awareqwx.Code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController
{
    
    @RequestMapping("/")
    public String index()
    {
        return "index.jsp";
    }
    
    @RequestMapping(path="code", method=RequestMethod.POST)
    public String code(@RequestParam(value="code") String code, RedirectAttributes ra)
    {
        if(code.equals("bushido"))
        {
            return "code.jsp";
        }
        else
        {
            ra.addFlashAttribute("note", "<h4 style='color: red;'>You must train harder!</h4>");
            return "redirect:/";
        }
    }

}
