package kr.co.itsmart.demo.controller;

import kr.co.itsmart.demo.service.SampleService;
import kr.co.itsmart.demo.vo.SampleVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final SampleService sampleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String selectInfo(Model model){
        SampleVO sample = sampleService.selectInfo();
        model.addAttribute("model", sample);
        return "main";
    }
}
