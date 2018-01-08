package com.sapphirecraft.JustAnotherPack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLightGlass extends Block {
	protected BlockLightGlass() {
		super(Material.glass);
		this.setLightLevel(1.0f);
		this.setBlockTextureName(Main.MODID + ":jasLightGlass");
		this.setHardness(0.3F);
		this.setStepSound(soundTypeGlass);
		this.setBlockName("blockLightGlass");
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass()
	{
		return 1;
	}
}
