package com.sapphirecraft.JustAnotherPack;

import com.sapphirecraft.JustAnotherPack.items.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class EventHandler {
	
	@SubscribeEvent
	public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent e)
	{
		NBTTagCompound nbt = e.player.getEntityData();
		if (!e.player.worldObj.isRemote) {
			if (!nbt.hasKey("isPlayed")) {
				nbt.setBoolean("isPlayed", true);
				
				e.player.inventory.addItemStackToInventory(new ItemStack(ModItems.itemBook));
			}
		}
	}
}
