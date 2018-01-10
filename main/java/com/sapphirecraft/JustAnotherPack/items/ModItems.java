package com.sapphirecraft.JustAnotherPack.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import static com.sapphirecraft.JustAnotherPack.Tabs.ModTabs.jaspackItems;

public class ModItems {
    public static Item itemSapphire;
    public static Item itemRuby;
    public static Item itemOther;
    public static Item itemLightOpticDust;
    public static Item itemRitualWand;


    public static void init(){
        GameRegistry.registerItem(itemSapphire = new MetaItem("Sapphire", 3).setCreativeTab(jaspackItems),
                "itemSapphire");
        GameRegistry.registerItem(itemRuby = new MetaItem("Ruby", 3).setCreativeTab(jaspackItems),
                "itemRuby");
        GameRegistry.registerItem(itemOther = new MetaItem("Other", 2).setCreativeTab(jaspackItems),
				"itemOther");
        GameRegistry.registerItem(itemLightOpticDust = new ItemShiningMix().setCreativeTab(jaspackItems),
                "itemLightOpticDust");
        GameRegistry.registerItem(itemRitualWand = new ItemSwapWand().setCreativeTab(jaspackItems),
                "itemRitualWand");
    }
}
