package com.nenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VideoController {

    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/main")
    public String main() {
        return "main";
    }

    @GetMapping(value = "/video")
    public String video() {
        return "video";
    }

    @GetMapping(value = "/danmu")
    public String danmu() {
        return "dm";
    }

    @GetMapping(value = "/rtmp")
    public String rtmp() {
        return "rtmp";
    }

    @GetMapping(value = "/api01")
    public String api01() {
        return "API01";
    }

}
