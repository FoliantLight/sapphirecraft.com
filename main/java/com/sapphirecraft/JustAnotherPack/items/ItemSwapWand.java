package com.sapphirecraft.JustAnotherPack.items;

import com.sapphirecraft.JustAnotherPack.Main;
import com.sapphirecraft.JustAnotherPack.SwapCore;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.List;

public class ItemSwapWand extends Item {
	protected ItemSwapWand()
	{
		this.setUnlocalizedName("SwapWand");
		this.setTextureName(Main.MODID + ":jasSwapWand");
		this.setMaxStackSize(1);
		this.setMaxDamage(50);
	}
	
	/*@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("Power", 200);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean b) {
		if(stack.hasTagCompound() && stack.getTagCompound().hasKey("Power"))
		{
			lores.add("Power: " + Integer.toString(stack.getTagCompound().getInteger("Power")));
		}
	}
	*/
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world,
							 int x, int y, int z, int par7, float hitX, float hitY, float hitZ)
	{
		Block interactedBlock = world.getBlock(x, y, z);
		
		if (interactedBlock == Blocks.lapis_ore) {
			SwapCore.swapOre(world, x, y, z, Blocks.lapis_ore,3);
			stack.setItemDamage(stack.getItemDamage() + 1);
			return true;
		}
		
		if (interactedBlock == Blocks.redstone_ore || interactedBlock == Blocks.lit_redstone_ore) {
			SwapCore.swapOre(world, x, y, z, Blocks.redstone_ore, 3);
			stack.setItemDamage(stack.getItemDamage() + 1);
			return true;
		}
		
		return false;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.uncommon;
	}
	
	@Override
	public boolean isDamageable() {
		return true;
	}
	
	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		return true;
	}
}