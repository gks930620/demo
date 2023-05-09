package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

@Controller
@RequiredArgsConstructor
public class HomeController {


    private  final  UserInfoRepository userInfoRepository;
    @PostConstruct
    public void init(){
        UserInfo userInfo=new UserInfo("id1","한창희");
        userInfoRepository.save(userInfo);
    }

    @RequestMapping("/")
    public String home(Model model){
        UserInfo userInfo=userInfoRepository.findById("id1").get();
        model.addAttribute("userInfo",userInfo);
        System.out.println(userInfo.getId());
        return "home";
    }

}
