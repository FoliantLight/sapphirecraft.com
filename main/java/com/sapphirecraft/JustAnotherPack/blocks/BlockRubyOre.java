package com.sapphirecraft.JustAnotherPack.blocks;

import com.sapphirecraft.JustAnotherPack.Main;
import com.sapphirecraft.JustAnotherPack.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

import static net.minecraft.enchantment.Enchantment.fortune;

public class BlockRubyOre extends Block {
	
	private int least_quantity = 2;
	private int most_quantity = 4;
	
	protected BlockRubyOre()
	{
		super(Material.rock);
		this.setBlockTextureName(Main.MODID + ":jasRubyOre");
		this.setHardness(1.5F);
		this.setBlockName("blockRubyOre");
		
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return ModItems.itemRuby;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
	
	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return 500;
	}
}
