package com.ahau.bang.graphic.menu;

import com.ahau.bang.graphic.MenuEnum;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * @author By Barry
 * @Description: 菜单类工具吗，用来产生各种需要的菜单类对象
 * @date create in  23:59 2018/5/30
 */
public class MenuUtils {


    public static void addMenu(JFrame thiz,MenuEnum menuEnum){

        if(thiz.getJMenuBar()==null){
            thiz.setJMenuBar(new JMenuBar());
        }

        if(menuEnum==MenuEnum.FILE){
            getFileMenu(thiz,menuEnum.getTitle());
        }else if(menuEnum==MenuEnum.EDIT){
            getEditMenu(thiz,menuEnum.getTitle());
        }else if(menuEnum==MenuEnum.ABOUT){
            getAboutMenu(thiz,menuEnum.getTitle());
        }

    }


    private static void getFileMenu(JFrame thiz,String s) {
        JMenuBar menubar;   //菜单条
        JMenu menuFile; //菜单
        JMenuItem itemOpen, itemSave;   //菜单项
        thiz.setTitle(s);
        menubar = thiz.getJMenuBar();
        menuFile = new JMenu("文件(F)");
        menuFile.setMnemonic('F');  //设置菜单的键盘操作方式是Alt + F键
        itemOpen = new JMenuItem("打开(O)");
        itemSave = new JMenuItem("保存(S)");

        //设置菜单项的键盘操作方式是Ctrl+O和Ctrl+S键
        KeyStroke Ctrl_cutKey =
                KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK);
        itemOpen.setAccelerator(Ctrl_cutKey);
        Ctrl_cutKey =
                KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK);
        itemSave.setAccelerator(Ctrl_cutKey);

        menuFile.add(itemOpen);
        //menuFile.addSeparator();
        menuFile.add(itemSave);
        menubar.add(menuFile);  //将菜单添加到菜单条上
    }

    private static  void getEditMenu(JFrame thiz,String s) {
        JMenuBar menubar;   //菜单条
        JMenu menuFile; //菜单
        JMenuItem itemCopy, itemSave;   //菜单项
        thiz.setTitle(s);
        menubar = thiz.getJMenuBar();
        menuFile = new JMenu("编辑(E)");
        menuFile.setMnemonic('F');  //设置菜单的键盘操作方式是Alt + F键
        itemCopy = new JMenuItem("复制(C)");
        itemSave = new JMenuItem("剪切(T)");

        //设置菜单项的键盘操作快捷键
        KeyStroke Ctrl_cutKey =
                KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK);
        itemCopy.setAccelerator(Ctrl_cutKey);
        Ctrl_cutKey =
                KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK);
        itemSave.setAccelerator(Ctrl_cutKey);

        menuFile.add(itemCopy);
        //menuFile.addSeparator();
        menuFile.add(itemSave);
        menubar.add(menuFile);  //将菜单添加到菜单条上
    }

    private static  void getAboutMenu(JFrame thiz,String s) {
        JMenuBar menubar;   //菜单条
        JMenu menuFile; //菜单
        JMenuItem itemAbout,itemHelp;   //菜单项
        thiz.setTitle(s);
        menubar = thiz.getJMenuBar();
        menuFile = new JMenu("帮助(H)");
        menuFile.setMnemonic('F');  //设置菜单的键盘操作方式是Alt + F键
        itemAbout = new JMenuItem("关于(A)");
        itemHelp = new JMenuItem("帮助(H)");

        //设置菜单项的键盘操作快捷键
        KeyStroke Ctrl_cutKey =
                KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK);
        itemAbout.setAccelerator(Ctrl_cutKey);
        Ctrl_cutKey =
                KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK);
        itemHelp.setAccelerator(Ctrl_cutKey);

        menuFile.add(itemHelp);
        //menuFile.addSeparator();
        menuFile.add(itemAbout);
        menubar.add(menuFile);  //将菜单添加到菜单条上
    }

}
