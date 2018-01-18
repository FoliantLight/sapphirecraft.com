package com.sapphirecraft.JustAnotherPack.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import static com.sapphirecraft.JustAnotherPack.Tabs.ModTabs.jaspackItems;

public class ModItems {
    public static Item itemSapphire;
    public static Item itemRuby;
    public static Item itemOther;
    public static Item itemShiningMix;
    public static Item itemSwapWand;
    public static Item itemConstrictor;
    public static Item itemBook;


    public static void init(){
        GameRegistry.registerItem(itemBook = new ItemBook().setCreativeTab(jaspackItems), "itemJASBook");
        GameRegistry.registerItem(itemSapphire = new MetaItem("Sapphire", 3).setCreativeTab(jaspackItems),
                "itemSapphire");
        GameRegistry.registerItem(itemRuby = new MetaItem("Ruby", 3).setCreativeTab(jaspackItems),
                "itemRuby");
        GameRegistry.registerItem(itemOther = new MetaItem("Other", 2).setCreativeTab(jaspackItems),
				"itemOther");
        GameRegistry.registerItem(itemShiningMix = new ItemShiningMix().setCreativeTab(jaspackItems),
                "itemShiningMix");
        GameRegistry.registerItem(itemSwapWand = new ItemSwapWand().setCreativeTab(jaspackItems),
                "itemSwapWand");
        GameRegistry.registerItem(itemConstrictor = new ItemConstrictor().setCreativeTab(jaspackItems),
                "itemConstrictor");
    }
}
