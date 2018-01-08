package com.sapphirecraft.JustAnotherPack.Tabs;

import net.minecraft.creativetab.CreativeTabs;

public class ModTabs {
    public static CreativeTabs jaspackItems;
    public static CreativeTabs jaspackBlocks;

    public static void init(){
        jaspackItems = new TabItems(CreativeTabs.getNextID(), "JASItems");
        jaspackBlocks = new TabBlocks(CreativeTabs.getNextID(), "JASBlocks");
    }
}
