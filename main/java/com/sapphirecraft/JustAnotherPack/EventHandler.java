package com.sapphirecraft.JustAnotherPack;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EventHandler {
	
	@SubscribeEvent
	public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent e)
	{
		System.out.println("Кто-то зашел");
		if(!e.player.worldObj.isRemote)
			e.player.inventory.addItemStackToInventory(new ItemStack(Items.stick));
	}
}
