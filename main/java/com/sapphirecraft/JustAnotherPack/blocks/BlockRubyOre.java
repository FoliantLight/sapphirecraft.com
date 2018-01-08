package com.sapphirecraft.JustAnotherPack.blocks;

import com.sapphirecraft.JustAnotherPack.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRubyOre extends Block {
	protected BlockRubyOre()
	{
		super(Material.rock);
		this.setBlockTextureName(Main.MODID + ":jasRubyOre");
		this.setHardness(1.5F);
		this.setBlockName("blockRubyOre");
	}
}