package com.wladek.Gmart.web;

import com.wladek.Gmart.domain.User;
import com.wladek.Gmart.domain.enumeration.UserRole;
import com.wladek.Gmart.service.UserDetailsImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wladek on 7/6/15.
 */
@Controller
public class PageDirectorController {

    @RequestMapping("/url_processor")
    public String redirect(){
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        User user = userDetails.getUser();

        if (user.getUserRole().equals(UserRole.ADMIN)){
            return "redirect:/admin/home" ;
        }

        if (user.getUserRole().equals(UserRole.USER)){
            return "redirect:/administrator/manage/home" ;
        }

        return "redirect:/";

    }
}
