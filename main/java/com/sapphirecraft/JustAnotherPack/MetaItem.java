package com.sapphirecraft.JustAnotherPack;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class MetaItem extends Item {
    
    public IIcon[] icons;
    private String itemMainName;
    
    protected MetaItem(String itemMainName, int count) {
        this.itemMainName = itemMainName;
        this.icons = new IIcon[count];
        
        this.setUnlocalizedName("Item" + this.itemMainName);
        this.setHasSubtypes(true);
    }
    
    @Override
    public void registerIcons(IIconRegister reg) {
        for (int i = 0; i < icons.length; i ++) {
            this.icons[i] = reg.registerIcon(Main.MODID + ":jas" + itemMainName + "." + i);
        }
    }
    
    @Override
    public IIcon getIconFromDamage(int meta) {
        if (meta > icons.length - 1)
            meta = 0;
        
        return this.icons[meta];
    }
    
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < icons.length; i ++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "." + stack.getItemDamage();
    }
    
}
