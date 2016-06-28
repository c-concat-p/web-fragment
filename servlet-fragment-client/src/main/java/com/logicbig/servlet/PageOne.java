package com.logicbig.servlet;


public class PageOne implements Page {
    @Override
    public String getPageViewInfo() {
        return "view one info";
    }

    @Override
    public String getPageModelInfo() {
        return "model one info";
    }

    @Override
    public String getPath() {
        return "/pageOne";
    }
}
