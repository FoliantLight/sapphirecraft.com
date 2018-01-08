package com.sapphirecraft.JustAnotherPack.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import static com.sapphirecraft.JustAnotherPack.Tabs.ModTabs.jaspackItems;

public class ModItems {
    public static Item itemSapphire;
    public static Item itemRuby;
    public static Item itemLightOpticDust;
    public static Item itemRitualWand;

    public static void init(){
        GameRegistry.registerItem(itemSapphire = new MetaItem("Sapphire", 3).setCreativeTab(jaspackItems),
                "itemSapphire");
        GameRegistry.registerItem(itemRuby = new MetaItem("Ruby", 3).setCreativeTab(jaspackItems),
                "itemRuby");
        GameRegistry.registerItem(itemLightOpticDust = new ItemLigthOpticDust().setCreativeTab(jaspackItems),
                "itemLightOpticDust");
        GameRegistry.registerItem(itemRitualWand = new ItemRitualWand().setCreativeTab(jaspackItems),
                "itemRitualWand");
    }
}
