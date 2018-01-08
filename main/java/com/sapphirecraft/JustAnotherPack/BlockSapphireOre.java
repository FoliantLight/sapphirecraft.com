package com.sapphirecraft.JustAnotherPack;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSapphireOre extends Block {
	protected BlockSapphireOre()
	{
		super(Material.rock);
		this.setBlockTextureName(Main.MODID + ":jasSapphireOre");
		this.setHardness(1.5F);
		this.setBlockName("blockSapphireOre");
	}
}
