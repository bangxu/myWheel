package com.ahau.bang.graphic;

/**
 * @author By Barry
 * @Description: 定义菜单类枚举
 * @date create in  0:04 2018/5/31
 */
public enum MenuEnum {

    FILE("文件"),
    EDIT("编辑"),
    PLUGIN("插件"),
    ABOUT("关于")
    ;

    private String title;


    private MenuEnum(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

}
