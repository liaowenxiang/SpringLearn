package com.lwx.springdemo12;

/**
 * Created by Administrator on 2017/3/13.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
