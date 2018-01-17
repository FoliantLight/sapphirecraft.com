package com.sapphirecraft.JustAnotherPack.items;

import com.sapphirecraft.JustAnotherPack.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemWritableBook;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class ItemBook extends ItemWritableBook {
	
	private String author = "Foliant Light";
	
	private ArrayList<String> pages = new ArrayList<String>();
	
	protected ItemBook()
	{
		
		this.setUnlocalizedName("itemJASBook");
		this.setMaxStackSize(1);
		this.setTextureName(Main.MODID + ":jasBook");
		
		pages.add(I18n.format("jas.msg.itemIsBroken"));
		pages.add("65465465465464654654654654654654654654654");
		pages.add("65465465465464654654654654654654654654654");
		pages.add("65465465465464654654654654654654654654654");
		pages.add("65465465465464654654654654654654654654654");
		pages.add("65465465465464654654654654654654654654654");
		pages.add("65465465465464654654654654654654654654654");
	}
	
	
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean bool) {
		NBTTagCompound nbt;
		if(stack.stackTagCompound != null)
			nbt = stack.stackTagCompound;
		else
			nbt = new NBTTagCompound();
		
		writeListToNBT(nbt);
		
		nbt.setString("author", author);
		
		stack.setTagCompound(nbt);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		Minecraft.getMinecraft().displayGuiScreen(new GuiScreenBook(player, stack, false));
		return stack;
	}
	
	public NBTTagCompound writeListToNBT(NBTTagCompound comp)
	{
		NBTTagList tagList = new NBTTagList();
		for(int i = 0; i < pages.size(); i++)
		{
			String s = pages.get(i);
			if(s != null)
			{
				tagList.appendTag( new NBTTagString(s));
			}
		}
		comp.setTag("pages", tagList);
		
		return comp;
	}
}
