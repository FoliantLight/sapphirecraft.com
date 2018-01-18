package com.sapphirecraft.JustAnotherPack.items;

import com.sapphirecraft.JustAnotherPack.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.client.resources.I18n; //<<-- не удалять либу. Забуду название и не вспомню
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
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
		
		pages.add("Книга ни о чем, просто книга, которая не дает какой-либо информации");
		pages.add("Абсолютно никакой");
		pages.add("Клара козявка");
		pages.add("Но я её люблю");
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.epic;
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
		lores.add("Author: Foliant Light");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		Minecraft.getMinecraft().displayGuiScreen(new GuiScreenBook(player, stack, false));
		return stack;
	}
	
	private NBTTagCompound writeListToNBT(NBTTagCompound comp)
	{
		NBTTagList tagList = new NBTTagList();
		for (String s : pages) {
			if (s != null) {
				tagList.appendTag(new NBTTagString(s));
			}
		}
		comp.setTag("pages", tagList);
		
		return comp;
	}
}
