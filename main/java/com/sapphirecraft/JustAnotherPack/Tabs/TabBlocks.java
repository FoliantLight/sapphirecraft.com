package com.sapphirecraft.JustAnotherPack.Tabs;

import com.sapphirecraft.JustAnotherPack.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabBlocks extends CreativeTabs {
    TabBlocks(int position, String tabID)
    {
        super(position, tabID);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.blockLightGlass);
    }

}
