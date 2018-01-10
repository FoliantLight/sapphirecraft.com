package com.sapphirecraft.JustAnotherPack.Tabs;

import com.sapphirecraft.JustAnotherPack.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabItems extends CreativeTabs {
    TabItems(int position, String tabID)
    {
        super(position, tabID);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.itemShiningMix;
    }

}
