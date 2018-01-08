package com.sapphirecraft.JustAnotherPack;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

import static cpw.mods.fml.relauncher.Side.CLIENT;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)

public class Main {

    public static final String MODID = "JAS";
    public static final String NAME = "Just Another Sapphirepack";
    public static final String VERSION = "0.0.1";
    
    public static Item itemSapphire;
    public static Item itemRuby;
    public static Item itemLightOpticDust;
    public static Item itemRitualWand;
    
    public static Block blockLightGlass;
    public static Block blockRubyOre;
	public static Block blockSapphireOre;
	
	public static CreativeTabs jaspackItems = new CreativeTabs("JASItems"){
		@SideOnly(CLIENT)
		public Item getTabIconItem() {
			return Main.itemSapphire;
		}
	};
	
	public static CreativeTabs jaspackBlocks = new CreativeTabs("JASBlocks"){
		@SideOnly(CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Main.blockLightGlass);
		}
	};
	
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        itemSapphire = new MetaItem("Sapphire", 3).setCreativeTab(jaspackItems);
		itemRuby = new MetaItem("Ruby", 3).setCreativeTab(jaspackItems);
		itemLightOpticDust = new ItemLigthOpticDust().setCreativeTab(jaspackItems);
		itemRitualWand = new ItemRitualWand().setCreativeTab(jaspackItems);
		
		blockLightGlass = new BlockLightGlass().setCreativeTab(jaspackBlocks);
		blockSapphireOre = new BlockSapphireOre().setCreativeTab(jaspackBlocks);
		blockRubyOre = new BlockRubyOre().setCreativeTab(jaspackBlocks);

		GameRegistry.registerItem(itemSapphire, "itemSapphire");
		GameRegistry.registerItem(itemRuby, "itemRuby");
		GameRegistry.registerItem(itemLightOpticDust, "itemLightOpticDust");
		GameRegistry.registerBlock(blockLightGlass, "blockLightGlass");

		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(Main.itemSapphire), 1, 3, 3));
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(Main.itemRuby), 1, 3, 3));
	}
/*
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new EventHandler());
    }*/
}
