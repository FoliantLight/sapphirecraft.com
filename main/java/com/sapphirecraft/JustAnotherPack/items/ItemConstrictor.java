package com.sapphirecraft.JustAnotherPack.items;

import com.sapphirecraft.JustAnotherPack.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class ItemConstrictor extends Item {
    protected ItemConstrictor(){
        this.setUnlocalizedName("itemConstrictor");
        this.setTextureName(Main.MODID + ":jasConstrictor");
    }

    public void onCreated(ItemStack itemStack, World world, EntityPlayer player) {
        itemStack.stackTagCompound = new NBTTagCompound();
        itemStack.stackTagCompound.setString("Owner", player.getDisplayName());
        itemStack.stackTagCompound.setInteger("Power level", 100000);
    }

    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
        if (itemStack.stackTagCompound != null) {
            String owner = itemStack.stackTagCompound.getString("Owner");
            int power = itemStack.stackTagCompound.getInteger("Power level");
            list.add(StatCollector.translateToLocal("Волшебная палочка для стращных дел"));

            list.add("Owner: " + owner);

            if (owner.equals(player.getDisplayName())) {
                list.add(EnumChatFormatting.GREEN + "Power level: " + power);
            } else {
                list.add(EnumChatFormatting.RED + "Power level: "
                        + EnumChatFormatting.OBFUSCATED + power);
            }
        }
    }
}
