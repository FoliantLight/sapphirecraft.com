package com.sapphirecraft.JustAnotherPack;

import com.sapphirecraft.JustAnotherPack.Tabs.ModTabs;
import com.sapphirecraft.JustAnotherPack.blocks.ModBlocks;
import com.sapphirecraft.JustAnotherPack.items.ModItems;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)

public class Main {

    public static final String MODID = "JAS";
    public static final String NAME = "Just Another Sapphirepack";
    public static final String VERSION = "0.0.4";
	private EventHandler events = new EventHandler();
	
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		FMLCommonHandler.instance().bus().register(events);
		MinecraftForge.EVENT_BUS.register(events);

		ModTabs.init();
		ModBlocks.init();
		ModItems.init();

		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(
				new ItemStack(ModItems.itemSapphire), 1, 3, 3));
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(
				new ItemStack(ModItems.itemRuby), 1, 3, 3));
	}
}
