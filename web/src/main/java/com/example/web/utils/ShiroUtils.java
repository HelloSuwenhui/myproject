package com.example.web.utils;

import com.example.commons.utils.StringUtils;
import com.example.commons.utils.bean.BeanUtils;
import com.example.userInterface.po.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

public class ShiroUtils {
    public static Subject getSubject()
    {
        return SecurityUtils.getSubject();
    }

    public static User getUser() {
        User user = null;
        Object obj = getSubject().getPrincipal();
        if (StringUtils.isNotNull(obj))
        {
            user = new User();
            BeanUtils.copyBeanProp(user, obj);
        }
        return user;
    }
}
