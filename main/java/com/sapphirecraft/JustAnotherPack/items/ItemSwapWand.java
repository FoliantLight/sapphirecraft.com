package com.sapphirecraft.JustAnotherPack.items;

import com.sapphirecraft.JustAnotherPack.Main;
import com.sapphirecraft.JustAnotherPack.SwapCore;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSwapWand extends Item {
	protected ItemSwapWand()
	{
		this.setUnlocalizedName("someCoolNameOfRitualWand");
		this.setTextureName(Main.MODID + ":jasChangeOreWand");
		this.setMaxStackSize(1);
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world,
							 int x, int y, int z, int par7, float hitX, float hitY, float hitZ)
	{
		Block interactedBlock = world.getBlock(x, y, z);
		
		if (interactedBlock == Blocks.lapis_ore) {
			SwapCore.swapOre(world, x, y, z, Blocks.lapis_ore,3);
			return true;
		}
		
		if (interactedBlock == Blocks.redstone_ore || interactedBlock == Blocks.lit_redstone_ore) {
			SwapCore.swapOre(world, x, y, z, Blocks.redstone_ore, 3);
			return true;
		}
		
		return false;
	}
	
}