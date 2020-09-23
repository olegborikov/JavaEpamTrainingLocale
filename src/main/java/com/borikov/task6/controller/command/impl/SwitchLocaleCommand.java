package com.borikov.task6.controller.command.impl;

import com.borikov.task6.controller.PagePath;
import com.borikov.task6.controller.RequestParameter;
import com.borikov.task6.controller.command.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SwitchLocaleCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        String page = PagePath.INDEX;
        String locale = request.getParameter(RequestParameter.LOCALE);
        HttpSession session = request.getSession();
        session.setAttribute(RequestParameter.LOCALE, locale);
        return page;
    }
}
