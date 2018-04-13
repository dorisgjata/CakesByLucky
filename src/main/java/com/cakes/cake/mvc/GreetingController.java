package com.cakes.cake.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/main")
    public String main(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }
     @RequestMapping("/desserts")
    public String indedx() {
        return "desserts";
    }
    @RequestMapping("/AMainPage")
    public String main() {
        return "AMainPage";
    }
    @RequestMapping("/cir")
    public String cir() {
        return "cir";
    }

    @RequestMapping("/cir-1")
    public String cir1() {
        return "cir-1";
    }
    @RequestMapping("/cir-2")
    public String cir2() {
        return "cir-2";
    }
    @RequestMapping("/cir-3")
    public String cir3() {
        return "cir-3";
    }
    @RequestMapping("/cir-1-cho")
    public String cir1cho() {
        return "cir-1-cho";
    }
    @RequestMapping("/cir-2-cho")
    public String cir2cho() {
        return "cir-2-cho";
    }
    @RequestMapping("/cir-3-cho")
    public String cir3cho() {
        return "cir-3-cho";
    }
    @RequestMapping("/cir-1-cho-wht")
    public String cir1chowht() {
        return "cir-1-cho-wht";
    }
    @RequestMapping("/cir-2-cho-wht")
    public String cir2chowht() {
        return "cir-2-cho-wht";
    }
    @RequestMapping("/cir-3-cho-wht")
    public String cir3chowht() {
        return "cir-3-cho-wht";
    }
    @RequestMapping("/cir-1-cho-ros")
    public String cir1choros() {
        return "cir-1-cho-ros";
    }
    @RequestMapping("/cir-2-cho-ros")
    public String cir2choros() {
        return "cir-2-cho-ros";
    }
    @RequestMapping("/cir-3-cho-ros")
    public String cir3choros() {
        return "cir-3-cho-ros";
    }
    @RequestMapping("/cir-1-cho-swr")
    public String cir1choswr() {
        return "cir-1-cho-swr";
    }
    @RequestMapping("/cir-2-cho-swr")
    public String cir2chorswr() {
        return "cir-2-cho-swr";
    }
    @RequestMapping("/cir-3-cho-swr")
    public String cir3chorswr() {
        return "cir-3-cho-swr";
    }

    
    @RequestMapping("/cir-1-cho-wht-mnt")
    public String cir1chowhtmnt() {
        return "cir-1-cho-wht-mnt";
    }
    @RequestMapping("/cir-2-cho-wht-mnt")
    public String cir2chowhtmnt() {
        return "cir-2-cho-wht-mnt";
    }
    @RequestMapping("/cir-3-cho-wht-mnt")
    public String cir3chowhtmnt() {
        return "cir-3-cho-wht-mnt";
    }
    @RequestMapping("/cir-1-cho-ros-mnt")
    public String cir1chorosmnt() {
        return "cir-1-cho-ros-mnt";
    }
    @RequestMapping("/cir-2-cho-ros-mnt")
    public String cir2chorosmnt() {
        return "cir-2-cho-ros-mnt";
    }
    @RequestMapping("/cir-3-cho-ros-mnt")
    public String cir3chorosmnt() {
        return "cir-3-cho-ros-mnt";
    }
    @RequestMapping("/cir-1-cho-swr-mnt")
    public String cir1choswrmnt() {
        return "cir-1-cho-swr-mnt";
    }
    @RequestMapping("/cir-2-cho-swr-mnt")
    public String cir2chorswrmnt() {
        return "cir-2-cho-swr-mnt";
    }
    @RequestMapping("/cir-3-cho-swr-mnt")
    public String cir3chorswrmnt() {
        return "cir-3-cho-swr-mnt";
    }

    @RequestMapping("/cir-1-cho-wht-org")
    public String cir1chowhtorg() {
        return "cir-1-cho-wht-org";
    }

    @RequestMapping("/cir-2-cho-wht-org")
    public String cir2chowhtorg() {
        return "cir-2-cho-wht-org";
    }

    @RequestMapping("/cir-3-cho-wht-org")
    public String cir3chowhtorg() {
        return "cir-3-cho-wht-org";
    }

    @RequestMapping("/cir-1-cho-ros-org")
    public String cir1chorosorg() {
        return "cir-1-cho-ros-mnt";
    }

    @RequestMapping("/cir-2-cho-ros-org")
    public String cir2chorosorg() {
        return "cir-2-cho-ros-org";
    }

    @RequestMapping("/cir-3-cho-ros-org")
    public String cir3chorosorg() {
        return "cir-3-cho-ros-org";
    }

    @RequestMapping("/cir-1-cho-swr-org")
    public String cir1choswrorg() {
        return "cir-1-cho-swr-org";
    }

    @RequestMapping("/cir-2-cho-swr-org")
    public String cir2chorswrorg() {
        return "cir-2-cho-swr-org";
    }

    @RequestMapping("/cir-3-cho-swr-org")
    public String cir3chorswrorg() {
        return "cir-3-cho-swr-org";
    }


    @RequestMapping("/cir-1-crm")
    public String cir1crm() {
        return "cir-1-crm";
    }

    @RequestMapping("/cir-2-crm")
    public String cir2crm() {
        return "cir-2-crm";
    }
    @RequestMapping("/cir-3-crm")
    public String cir3crm() {
        return "cir-3-crm";
    }

    @RequestMapping("/cir-1-crm-wht")
    public String cir1crmwht() {
        return "cir-1-crm-wht";
    }

    @RequestMapping("/cir-2-crm-wht")
    public String cir2crmwht() {
        return "cir-2-crm-wht";
    }
    @RequestMapping("/cir-3-crm-wht")
    public String cir3crmwht() {
        return "cir-3-crm-wht";
    }

    @RequestMapping("/cir-1-crm-ros")
    public String cir1crmros() {
        return "cir-1-crm-ros";
    }

    @RequestMapping("/cir-2-crm-ros")
    public String cir2crmros() {
        return "cir-2-crm-ros";
    }
    @RequestMapping("/cir-3-crm-ros")
    public String cir3crmros() {
        return "cir-3-crm-ros";
    }
    @RequestMapping("/cir-1-crm-swr")
    public String cir1crmswr() {
        return "cir-1-crm-swr";
    }

    @RequestMapping("/cir-2-crm-swr")
    public String cir2crmswr() {
        return "cir-2-crm-swr";
    }
    @RequestMapping("/cir-3-crm-swr")
    public String cir3crmswr() {
        return "cir-3-crm-swr";
    }

        
    @RequestMapping("/cir-1-crm-wht-mnt")
    public String cir1crmwhtmnt() {
        return "cir-1-crm-wht-mnt";
    }
    @RequestMapping("/cir-2-crm-wht-mnt")
    public String cir2crmwhtmnt() {
        return "cir-2-crm-wht-mnt";
    }
    @RequestMapping("/cir-3-crm-wht-mnt")
    public String cir3crmwhtmnt() {
        return "cir-3-crm-wht-mnt";
    }
    @RequestMapping("/cir-1-crm-ros-mnt")
    public String cir1crmrosmnt() {
        return "cir-1-crm-ros-mnt";
    }
    @RequestMapping("/cir-2-crm-ros-mnt")
    public String cir2crmrosmnt() {
        return "cir-2-crm-ros-mnt";
    }
    @RequestMapping("/cir-3-crm-ros-mnt")
    public String cir3crmrosmnt() {
        return "cir-3-crm-ros-mnt";
    }
    @RequestMapping("/cir-1-crm-swr-mnt")
    public String cir1crmswrmnt() {
        return "cir-1-crm-swr-mnt";
    }
    @RequestMapping("/cir-2-crm-swr-mnt")
    public String cir2crmrswrmnt() {
        return "cir-2-crm-swr-mnt";
    }
    @RequestMapping("/cir-3-crm-swr-mnt")
    public String cir3crmrswrmnt() {
        return "cir-3-crm-swr-mnt";
    }

    @RequestMapping("/cir-1-crm-wht-org")
    public String cir1crmwhtorg() {
        return "cir-1-crm-wht-org";
    }

    @RequestMapping("/cir-2-crm-wht-org")
    public String cir2crmwhtorg() {
        return "cir-2-crm-wht-org";
    }

    @RequestMapping("/cir-3-crm-wht-org")
    public String cir3crmwhtorg() {
        return "cir-3-crm-wht-org";
    }

    @RequestMapping("/cir-1-crm-ros-org")
    public String cir1crmrosorg() {
        return "cir-1-crm-ros-mnt";
    }

    @RequestMapping("/cir-2-crm-ros-org")
    public String cir2crmrosorg() {
        return "cir-2-crm-ros-org";
    }

    @RequestMapping("/cir-3-crm-ros-org")
    public String cir3crmrosorg() {
        return "cir-3-crm-ros-org";
    }

    @RequestMapping("/cir-1-crm-swr-org")
    public String cir1crmswrorg() {
        return "cir-1-crm-swr-org";
    }

    @RequestMapping("/cir-2-crm-swr-org")
    public String cir2crmrswrorg() {
        return "cir-2-crm-swr-org";
    }

    @RequestMapping("/cir-3-crm-swr-org")
    public String cir3crmrswrorg() {
        return "cir-3-crm-swr-org";
    }
    @RequestMapping("/sqr")
    public String sqr() {
        return "sqr";
    }
    @RequestMapping("/sqr-1")
    public String sqr1() {
        return "sqr-1";
    }
    @RequestMapping("/sqr-2")
    public String sqr2() {
        return "sqr-2";
    }
    @RequestMapping("/sqr-3")
    public String sqr3() {
        return "sqr-3";
    }
    @RequestMapping("/sqr-1-cho")
    public String sqr1cho() {
        return "sqr-1-cho";
    }
    @RequestMapping("/sqr-2-cho")
    public String sqr2cho() {
        return "sqr-2-cho";
    }
    @RequestMapping("/sqr-3-cho")
    public String sqr3cho() {
        return "sqr-3-cho";
    }
    @RequestMapping("/sqr-1-cho-wht")
    public String sqr1chowht() {
        return "sqr-1-cho-wht";
    }

    @RequestMapping("/sqr-2-cho-wht")
    public String sqr2chowht() {
        return "sqr-2-cho-wht";
    }
    @RequestMapping("/sqr-3-cho-wht")
    public String sqr3chowht() {
        return "sqr-3-cho-wht";
    }

    @RequestMapping("/sqr-1-cho-ros")
    public String sqr1choros() {
        return "sqr-1-crm-ros";
    }

    @RequestMapping("/sqr-2-cho-ros")
    public String sqr2choros() {
        return "sqr-2-cho-ros";
    }
    @RequestMapping("/sqr-3-cho-ros")
    public String sqr3choros() {
        return "sqr-3-cho-ros";
    }
    @RequestMapping("/sqr-1-cho-swr")
    public String sqr1chowr() {
        return "sqr-1-cho-swr";
    }

    @RequestMapping("/sqr-2-cho-swr")
    public String sqr2chowr() {
        return "sqr-2-cho-swr";
    }
    @RequestMapping("/sqr-3-cho-swr")
    public String sqr3choswr() {
        return "sqr-3-cho-swr";
    }
    @RequestMapping("/sqr-1-crm")
    public String sqr1crm() {
        return "sqr-1-crm";
    }
    @RequestMapping("/sqr-2-crm")
    public String sqr2crm() {
        return "sqr-2-crm";
    }
    @RequestMapping("/sqr-3-crm")
    public String sqr3crm() {
        return "sqr-3-crm";
    }
    @RequestMapping("/sqr-1-crm-wht")
    public String sqr1crmwht() {
        return "sqr-1-crm-wht";
    }

    @RequestMapping("/sqr-2-crm-wht")
    public String sqr2crmwht() {
        return "sqr-2-crm-wht";
    }
    @RequestMapping("/sqr-3-crm-wht")
    public String sqr3crmwht() {
        return "sqr-3-crm-wht";
    }

    @RequestMapping("/sqr-1-crm-ros")
    public String sqr1crmros() {
        return "sqr-1-crm-ros";
    }

    @RequestMapping("/sqr-2-crm-ros")
    public String sqr2crmros() {
        return "sqr-2-crm-ros";
    }
    @RequestMapping("/sqr-3-crm-ros")
    public String sqr3crmros() {
        return "sqr-3-crm-ros";
    }
    @RequestMapping("/sqr-1-crm-swr")
    public String sqr1crmswr() {
        return "sqr-1-crm-swr";
    }

    @RequestMapping("/sqr-2-crm-swr")
    public String sqr2crmswr() {
        return "sqr-2-crm-swr";
    }
    @RequestMapping("/sqr-3-crm-swr")
    public String sqr3crmswr() {
        return "sqr-3-crm-swr";
    }
        
    @RequestMapping("/sqr-1-cho-wht-mnt")
    public String sqr1chowhtmnt() {
        return "sqr-1-cho-wht-mnt";
    }
    @RequestMapping("/sqr-2-cho-wht-mnt")
    public String sqr2chowhtmnt() {
        return "sqr-2-cho-wht-mnt";
    }
    @RequestMapping("/sqr-3-cho-wht-mnt")
    public String sqr3chowhtmnt() {
        return "sqr-3-cho-wht-mnt";
    }
    @RequestMapping("/sqr-1-cho-ros-mnt")
    public String sqr1chorosmnt() {
        return "sqr-1-cho-ros-mnt";
    }
    @RequestMapping("/sqr-2-cho-ros-mnt")
    public String sqr2chorosmnt() {
        return "sqr-2-cho-ros-mnt";
    }
    @RequestMapping("/sqr-3-cho-ros-mnt")
    public String sqr3chorosmnt() {
        return "sqr-3-cho-ros-mnt";
    }
    @RequestMapping("/sqr-1-cho-swr-mnt")
    public String sqr1choswrmnt() {
        return "sqr-1-cho-swr-mnt";
    }
    @RequestMapping("/sqr-2-cho-swr-mnt")
    public String sqr2chorswrmnt() {
        return "sqr-2-cho-swr-mnt";
    }
    @RequestMapping("/sqr-3-cho-swr-mnt")
    public String sqr3chorswrmnt() {
        return "sqr-3-cho-swr-mnt";
    }
    @RequestMapping("/sqr-1-crm-wht-mnt")
    public String sqr1crmwhtmnt() {
        return "sqr-1-crm-wht-mnt";
    }
    @RequestMapping("/sqr-2-crm-wht-mnt")
    public String sqr2crmwhtmnt() {
        return "sqr-2-crm-wht-mnt";
    }
    @RequestMapping("/sqr-3-crm-wht-mnt")
    public String sqr3crmwhtmnt() {
        return "sqr-3-crm-wht-mnt";
    }
    @RequestMapping("/sqr-1-crm-ros-mnt")
    public String sqr1crmrosmnt() {
        return "sqr-1-crm-ros-mnt";
    }
    @RequestMapping("/sqr-2-crm-ros-mnt")
    public String sqr2crmrosmnt() {
        return "sqr-2-crm-ros-mnt";
    }
    @RequestMapping("/sqr-3-crm-ros-mnt")
    public String sqr3crmrosmnt() {
        return "sqr-3-crm-ros-mnt";
    }
    @RequestMapping("/sqr-1-crm-swr-mnt")
    public String sqr1crmswrmnt() {
        return "sqr-1-crm-swr-mnt";
    }
    @RequestMapping("/sqr-2-crm-swr-mnt")
    public String sqr2crmrswrmnt() {
        return "sqr-2-crm-swr-mnt";
    }
    @RequestMapping("/sqr-3-crm-swr-mnt")
    public String sqr3crmrswrmnt() {
        return "sqr-3-crm-swr-mnt";
    }
    @RequestMapping("/sqr-1-cho-wht-org")
    public String sqr1chowhtorg() {
        return "sqr-1-cho-wht-org";
    }

    @RequestMapping("/sqr-2-cho-wht-org")
    public String sqr2chowhtorg() {
        return "sqr-2-cho-wht-org";
    }

    @RequestMapping("/sqr-3-cho-wht-org")
    public String sqr3chowhtorg() {
        return "sqr-3-cho-wht-org";
    }

    @RequestMapping("/sqr-1-cho-ros-org")
    public String sqr1chorosorg() {
        return "sqr-1-cho-ros-mnt";
    }

    @RequestMapping("/sqr-2-cho-ros-org")
    public String sqr2chorosorg() {
        return "sqr-2-cho-ros-org";
    }

    @RequestMapping("/sqr-3-cho-ros-org")
    public String sqr3chorosorg() {
        return "sqr-3-cho-ros-org";
    }

    @RequestMapping("/sqr-1-cho-swr-org")
    public String sqr1choswrorg() {
        return "sqr-1-cho-swr-org";
    }

    @RequestMapping("/sqr-2-cho-swr-org")
    public String sqr2chorswrorg() {
        return "sqr-2-cho-swr-org";
    }

    @RequestMapping("/sqr-3-cho-swr-org")
    public String sqr3chorswrorg() {
        return "sqr-3-cho-swr-org";
    }

    @RequestMapping("/sqr-1-crm-wht-org")
    public String sqr1crmwhtorg() {
        return "sqr-1-crm-wht-org";
    }
    @RequestMapping("/sqr-2-crm-wht-org")
    public String sqr2crmwhtorg() {
        return "sqr-2-crm-wht-org";
    }
    @RequestMapping("/sqr-3-crm-wht-org")
    public String sqr3crmwhtorg() {
        return "sqr-3-crm-wht-org";
    }
    @RequestMapping("/sqr-1-crm-ros-org")
    public String sqr1crmrosorg() {
        return "sqr-1-crm-ros-org";
    }
    @RequestMapping("/sqr-2-crm-ros-org")
    public String sqr2crmrosorg() {
        return "sqr-2-crm-ros-org";
    }
    @RequestMapping("/sqr-3-crm-ros-org")
    public String sqr3crmrosorg() {
        return "sqr-3-crm-ros-org";
    }
    @RequestMapping("/sqr-1-crm-swr-org")
    public String sqr1crmswrorg() {
        return "sqr-1-crm-swr-org";
    }
    @RequestMapping("/sqr-2-crm-swr-org")
    public String sqr2crmrswrorg() {
        return "sqr-2-crm-swr-org";
    }
    @RequestMapping("/sqr-3-crm-swr-org")
    public String sqr3crmrswrorg() {
        return "sqr-3-crm-swr-org";
    }





    @RequestMapping("/sqr-1-cho-wht-pnk")
    public String sqr1chowhtpnk() {
        return "sqr-1-cho-wht-pnk";
    }

    @RequestMapping("/sqr-2-cho-wht-pnk")
    public String sqr2chowhtpnk() {
        return "sqr-2-cho-wht-pnk";
    }

    @RequestMapping("/sqr-3-cho-wht-pnk")
    public String sqr3chowhtpnk() {
        return "sqr-3-cho-wht-pnk";
    }

    @RequestMapping("/sqr-1-cho-ros-pnk")
    public String sqr1chorospnk() {
        return "sqr-1-cho-ros-mnt";
    }

    @RequestMapping("/sqr-2-cho-ros-pnk")
    public String sqr2chorospnk() {
        return "sqr-2-cho-ros-pnk";
    }

    @RequestMapping("/sqr-3-cho-ros-pnk")
    public String sqr3chorospnk() {
        return "sqr-3-cho-ros-pnk";
    }

    @RequestMapping("/sqr-1-cho-swr-pnk")
    public String sqr1choswrpnk() {
        return "sqr-1-cho-swr-pnk";
    }

    @RequestMapping("/sqr-2-cho-swr-pnk")
    public String sqr2chorswrpnk() {
        return "sqr-2-cho-swr-pnk";
    }

    @RequestMapping("/sqr-3-cho-swr-pnk")
    public String sqr3chorswrpnk() {
        return "sqr-3-cho-swr-pnk";
    }

    @RequestMapping("/sqr-1-crm-wht-pnk")
    public String sqr1crmwhtpnk() {
        return "sqr-1-crm-wht-pnk";
    }
    @RequestMapping("/sqr-2-crm-wht-pnk")
    public String sqr2crmwhtpnk() {
        return "sqr-2-crm-wht-pnk";
    }
    @RequestMapping("/sqr-3-crm-wht-pnk")
    public String sqr3crmwhtpnk() {
        return "sqr-3-crm-wht-pnk";
    }
    @RequestMapping("/sqr-1-crm-ros-pnk")
    public String sqr1crmrospnk() {
        return "sqr-1-crm-ros-pnk";
    }
    @RequestMapping("/sqr-2-crm-ros-pnk")
    public String sqr2crmrospnk() {
        return "sqr-2-crm-ros-pnk";
    }
    @RequestMapping("/sqr-3-crm-ros-pnk")
    public String sqr3crmrospnk() {
        return "sqr-3-crm-ros-pnk";
    }
    @RequestMapping("/sqr-1-crm-swr-pnk")
    public String sqr1crmswrpnk() {
        return "sqr-1-crm-swr-pnk";
    }
    @RequestMapping("/sqr-2-crm-swr-pnk")
    public String sqr2crmrswrpnk() {
        return "sqr-2-crm-swr-pnk";
    }
    @RequestMapping("/sqr-3-crm-swr-pnk")
    public String sqr3crmrswrpnk() {
        return "sqr-3-crm-swr-pnk";
    }





    @RequestMapping("/sqr-1-cho-wht-red")
    public String sqr1chowhtred() {
        return "sqr-1-cho-wht-red";
    }

    @RequestMapping("/sqr-2-cho-wht-red")
    public String sqr2chowhtred() {
        return "sqr-2-cho-wht-red";
    }

    @RequestMapping("/sqr-3-cho-wht-red")
    public String sqr3chowhtred() {
        return "sqr-3-cho-wht-red";
    }

    @RequestMapping("/sqr-1-cho-ros-red")
    public String sqr1chorosred() {
        return "sqr-1-cho-ros-mnt";
    }

    @RequestMapping("/sqr-2-cho-ros-red")
    public String sqr2chorosred() {
        return "sqr-2-cho-ros-red";
    }

    @RequestMapping("/sqr-3-cho-ros-red")
    public String sqr3chorosred() {
        return "sqr-3-cho-ros-red";
    }

    @RequestMapping("/sqr-1-cho-swr-red")
    public String sqr1choswrred() {
        return "sqr-1-cho-swr-red";
    }

    @RequestMapping("/sqr-2-cho-swr-red")
    public String sqr2chorswrred() {
        return "sqr-2-cho-swr-red";
    }

    @RequestMapping("/sqr-3-cho-swr-red")
    public String sqr3chorswrred() {
        return "sqr-3-cho-swr-red";
    }

    @RequestMapping("/sqr-1-crm-wht-red")
    public String sqr1crmwhtred() {
        return "sqr-1-crm-wht-red";
    }
    @RequestMapping("/sqr-2-crm-wht-red")
    public String sqr2crmwhtred() {
        return "sqr-2-crm-wht-red";
    }
    @RequestMapping("/sqr-3-crm-wht-red")
    public String sqr3crmwhtred() {
        return "sqr-3-crm-wht-red";
    }
    @RequestMapping("/sqr-1-crm-ros-red")
    public String sqr1crmrosred() {
        return "sqr-1-crm-ros-red";
    }
    @RequestMapping("/sqr-2-crm-ros-red")
    public String sqr2crmrosred() {
        return "sqr-2-crm-ros-red";
    }
    @RequestMapping("/sqr-3-crm-ros-red")
    public String sqr3crmrosred() {
        return "sqr-3-crm-ros-red";
    }
    @RequestMapping("/sqr-1-crm-swr-red")
    public String sqr1crmswrred() {
        return "sqr-1-crm-swr-red";
    }
    @RequestMapping("/sqr-2-crm-swr-red")
    public String sqr2crmrswrred() {
        return "sqr-2-crm-swr-red";
    }
    @RequestMapping("/sqr-3-crm-swr-red")
    public String sqr3crmrswrred() {
        return "sqr-3-crm-swr-red";
    }





    @RequestMapping("/sqr-1-cho-wht-wht")
    public String sqr1chowhtwht() {
        return "sqr-1-cho-wht-wht";
    }

    @RequestMapping("/sqr-2-cho-wht-wht")
    public String sqr2chowhtwht() {
        return "sqr-2-cho-wht-wht";
    }

    @RequestMapping("/sqr-3-cho-wht-wht")
    public String sqr3chowhtwht() {
        return "sqr-3-cho-wht-wht";
    }

    @RequestMapping("/sqr-1-cho-ros-wht")
    public String sqr1choroswht() {
        return "sqr-1-cho-ros-mnt";
    }

    @RequestMapping("/sqr-2-cho-ros-wht")
    public String sqr2choroswht() {
        return "sqr-2-cho-ros-wht";
    }

    @RequestMapping("/sqr-3-cho-ros-wht")
    public String sqr3choroswht() {
        return "sqr-3-cho-ros-wht";
    }

    @RequestMapping("/sqr-1-cho-swr-wht")
    public String sqr1choswrwht() {
        return "sqr-1-cho-swr-wht";
    }

    @RequestMapping("/sqr-2-cho-swr-wht")
    public String sqr2chorswrwht() {
        return "sqr-2-cho-swr-wht";
    }

    @RequestMapping("/sqr-3-cho-swr-wht")
    public String sqr3chorswrwht() {
        return "sqr-3-cho-swr-wht";
    }

    @RequestMapping("/sqr-1-crm-wht-wht")
    public String sqr1crmwhtwht() {
        return "sqr-1-crm-wht-wht";
    }
    @RequestMapping("/sqr-2-crm-wht-wht")
    public String sqr2crmwhtwht() {
        return "sqr-2-crm-wht-wht";
    }
    @RequestMapping("/sqr-3-crm-wht-wht")
    public String sqr3crmwhtwht() {
        return "sqr-3-crm-wht-wht";
    }
    @RequestMapping("/sqr-1-crm-ros-wht")
    public String sqr1crmroswht() {
        return "sqr-1-crm-ros-wht";
    }
    @RequestMapping("/sqr-2-crm-ros-wht")
    public String sqr2crmroswht() {
        return "sqr-2-crm-ros-wht";
    }
    @RequestMapping("/sqr-3-crm-ros-wht")
    public String sqr3crmroswht() {
        return "sqr-3-crm-ros-wht";
    }
    @RequestMapping("/sqr-1-crm-swr-wht")
    public String sqr1crmswrwht() {
        return "sqr-1-crm-swr-wht";
    }
    @RequestMapping("/sqr-2-crm-swr-wht")
    public String sqr2crmrswrwht() {
        return "sqr-2-crm-swr-wht";
    }
    @RequestMapping("/sqr-3-crm-swr-wht")
    public String sqr3crmrswrwht() {
        return "sqr-3-crm-swr-wht";
    }




    


    @RequestMapping("/cir-1-cho-wht-pnk")
    public String cir1chowhtpnk() {
        return "cir-1-cho-wht-pnk";
    }

    @RequestMapping("/cir-2-cho-wht-pnk")
    public String cir2chowhtpnk() {
        return "cir-2-cho-wht-pnk";
    }

    @RequestMapping("/cir-3-cho-wht-pnk")
    public String cir3chowhtpnk() {
        return "cir-3-cho-wht-pnk";
    }

    @RequestMapping("/cir-1-cho-ros-pnk")
    public String cir1chorospnk() {
        return "cir-1-cho-ros-mnt";
    }

    @RequestMapping("/cir-2-cho-ros-pnk")
    public String cir2chorospnk() {
        return "cir-2-cho-ros-pnk";
    }

    @RequestMapping("/cir-3-cho-ros-pnk")
    public String cir3chorospnk() {
        return "cir-3-cho-ros-pnk";
    }

    @RequestMapping("/cir-1-cho-swr-pnk")
    public String cir1choswrpnk() {
        return "cir-1-cho-swr-pnk";
    }

    @RequestMapping("/cir-2-cho-swr-pnk")
    public String cir2chorswrpnk() {
        return "cir-2-cho-swr-pnk";
    }

    @RequestMapping("/cir-3-cho-swr-pnk")
    public String cir3chorswrpnk() {
        return "cir-3-cho-swr-pnk";
    }

    @RequestMapping("/cir-1-crm-wht-pnk")
    public String cir1crmwhtpnk() {
        return "cir-1-crm-wht-pnk";
    }
    @RequestMapping("/cir-2-crm-wht-pnk")
    public String cir2crmwhtpnk() {
        return "cir-2-crm-wht-pnk";
    }
    @RequestMapping("/cir-3-crm-wht-pnk")
    public String cir3crmwhtpnk() {
        return "cir-3-crm-wht-pnk";
    }
    @RequestMapping("/cir-1-crm-ros-pnk")
    public String cir1crmrospnk() {
        return "cir-1-crm-ros-pnk";
    }
    @RequestMapping("/cir-2-crm-ros-pnk")
    public String cir2crmrospnk() {
        return "cir-2-crm-ros-pnk";
    }
    @RequestMapping("/cir-3-crm-ros-pnk")
    public String cir3crmrospnk() {
        return "cir-3-crm-ros-pnk";
    }
    @RequestMapping("/cir-1-crm-swr-pnk")
    public String cir1crmswrpnk() {
        return "cir-1-crm-swr-pnk";
    }
    @RequestMapping("/cir-2-crm-swr-pnk")
    public String cir2crmrswrpnk() {
        return "cir-2-crm-swr-pnk";
    }
    @RequestMapping("/cir-3-crm-swr-pnk")
    public String cir3crmrswrpnk() {
        return "cir-3-crm-swr-pnk";
    }





    @RequestMapping("/cir-1-cho-wht-red")
    public String cir1chowhtred() {
        return "cir-1-cho-wht-red";
    }

    @RequestMapping("/cir-2-cho-wht-red")
    public String cir2chowhtred() {
        return "cir-2-cho-wht-red";
    }

    @RequestMapping("/cir-3-cho-wht-red")
    public String cir3chowhtred() {
        return "cir-3-cho-wht-red";
    }

    @RequestMapping("/cir-1-cho-ros-red")
    public String cir1chorosred() {
        return "cir-1-cho-ros-mnt";
    }

    @RequestMapping("/cir-2-cho-ros-red")
    public String cir2chorosred() {
        return "cir-2-cho-ros-red";
    }

    @RequestMapping("/cir-3-cho-ros-red")
    public String cir3chorosred() {
        return "cir-3-cho-ros-red";
    }

    @RequestMapping("/cir-1-cho-swr-red")
    public String cir1choswrred() {
        return "cir-1-cho-swr-red";
    }

    @RequestMapping("/cir-2-cho-swr-red")
    public String cir2chorswrred() {
        return "cir-2-cho-swr-red";
    }

    @RequestMapping("/cir-3-cho-swr-red")
    public String cir3chorswrred() {
        return "cir-3-cho-swr-red";
    }

    @RequestMapping("/cir-1-crm-wht-red")
    public String cir1crmwhtred() {
        return "cir-1-crm-wht-red";
    }
    @RequestMapping("/cir-2-crm-wht-red")
    public String cir2crmwhtred() {
        return "cir-2-crm-wht-red";
    }
    @RequestMapping("/cir-3-crm-wht-red")
    public String cir3crmwhtred() {
        return "cir-3-crm-wht-red";
    }
    @RequestMapping("/cir-1-crm-ros-red")
    public String cir1crmrosred() {
        return "cir-1-crm-ros-red";
    }
    @RequestMapping("/cir-2-crm-ros-red")
    public String cir2crmrosred() {
        return "cir-2-crm-ros-red";
    }
    @RequestMapping("/cir-3-crm-ros-red")
    public String cir3crmrosred() {
        return "cir-3-crm-ros-red";
    }
    @RequestMapping("/cir-1-crm-swr-red")
    public String cir1crmswrred() {
        return "cir-1-crm-swr-red";
    }
    @RequestMapping("/cir-2-crm-swr-red")
    public String cir2crmrswrred() {
        return "cir-2-crm-swr-red";
    }
    @RequestMapping("/cir-3-crm-swr-red")
    public String cir3crmrswrred() {
        return "cir-3-crm-swr-red";
    }





    @RequestMapping("/cir-1-cho-wht-wht")
    public String cir1chowhtwht() {
        return "cir-1-cho-wht-wht";
    }

    @RequestMapping("/cir-2-cho-wht-wht")
    public String cir2chowhtwht() {
        return "cir-2-cho-wht-wht";
    }

    @RequestMapping("/cir-3-cho-wht-wht")
    public String cir3chowhtwht() {
        return "cir-3-cho-wht-wht";
    }

    @RequestMapping("/cir-1-cho-ros-wht")
    public String cir1choroswht() {
        return "cir-1-cho-ros-mnt";
    }

    @RequestMapping("/cir-2-cho-ros-wht")
    public String cir2choroswht() {
        return "cir-2-cho-ros-wht";
    }

    @RequestMapping("/cir-3-cho-ros-wht")
    public String cir3choroswht() {
        return "cir-3-cho-ros-wht";
    }

    @RequestMapping("/cir-1-cho-swr-wht")
    public String cir1choswrwht() {
        return "cir-1-cho-swr-wht";
    }

    @RequestMapping("/cir-2-cho-swr-wht")
    public String cir2chorswrwht() {
        return "cir-2-cho-swr-wht";
    }

    @RequestMapping("/cir-3-cho-swr-wht")
    public String cir3chorswrwht() {
        return "cir-3-cho-swr-wht";
    }

    @RequestMapping("/cir-1-crm-wht-wht")
    public String cir1crmwhtwht() {
        return "cir-1-crm-wht-wht";
    }
    @RequestMapping("/cir-2-crm-wht-wht")
    public String cir2crmwhtwht() {
        return "cir-2-crm-wht-wht";
    }
    @RequestMapping("/cir-3-crm-wht-wht")
    public String cir3crmwhtwht() {
        return "cir-3-crm-wht-wht";
    }
    @RequestMapping("/cir-1-crm-ros-wht")
    public String cir1crmroswht() {
        return "cir-1-crm-ros-wht";
    }
    @RequestMapping("/cir-2-crm-ros-wht")
    public String cir2crmroswht() {
        return "cir-2-crm-ros-wht";
    }
    @RequestMapping("/cir-3-crm-ros-wht")
    public String cir3crmroswht() {
        return "cir-3-crm-ros-wht";
    }
    @RequestMapping("/cir-1-crm-swr-wht")
    public String cir1crmswrwht() {
        return "cir-1-crm-swr-wht";
    }
    @RequestMapping("/cir-2-crm-swr-wht")
    public String cir2crmrswrwht() {
        return "cir-2-crm-swr-wht";
    }
    @RequestMapping("/cir-3-crm-swr-wht")
    public String cir3crmrswrwht() {
        return "cir-3-crm-swr-wht";
    }
    @RequestMapping("/OtherFlav")
    public String other() {
        return "OtherFlav";
    }

}