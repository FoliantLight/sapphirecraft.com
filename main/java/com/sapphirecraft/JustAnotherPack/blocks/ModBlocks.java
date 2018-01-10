package com.sapphirecraft.JustAnotherPack.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import static com.sapphirecraft.JustAnotherPack.Tabs.ModTabs.jaspackBlocks;

public class ModBlocks {
    public static Block blockLightGlass;
    public static Block blockRubyOre;
    public static Block blockSapphireOre;

    public static void init(){
        GameRegistry.registerBlock(blockLightGlass = new BlockShiningGlass().setCreativeTab(jaspackBlocks),
                "blockLightGlass");
        GameRegistry.registerBlock(blockRubyOre = blockRubyOre = new BlockRubyOre().setCreativeTab(jaspackBlocks),
                "blockRubyOre");
        GameRegistry.registerBlock(blockSapphireOre = blockSapphireOre = new BlockSapphireOre().setCreativeTab(jaspackBlocks),
                "blockSapphireOre");
    }
}
