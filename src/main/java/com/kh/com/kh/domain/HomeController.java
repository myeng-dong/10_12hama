package com.kh.com.kh.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/hama")
// ()의 경로와 컨트롤러를 이어주는 것 경로 = 키 컨트롤러 = 밸류
public class HomeController {

  @GetMapping("/index")
  public ModelAndView webAddForm(Model model){
    ModelAndView mv = new ModelAndView();
    mv.setViewName("webPage/index");
    return mv;
  }

//  @PostMapping("/add")
//  public String webAdd(@ModelAttribute SaveForm saveform){
//    Home home = new Home();
//    home.setPname(saveform.getPname());
//    home.setPcost(saveform.getPcost());
//    home.setPtext(saveform.getPtext());
//  }

}
