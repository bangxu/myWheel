package com.ahau.bang.graphic;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  0:40 2018/5/31
 */
public enum MenuItemEnum {

    FILE_OPEN(MenuEnum.FILE,"打开"),
    FILE_EDIT(MenuEnum.FILE,"编辑");

    private MenuEnum menuEnum;
    private String title;

    private MenuItemEnum(MenuEnum menuEnum,String title){

        this.menuEnum = menuEnum;
        this.title = title;

    }

}
