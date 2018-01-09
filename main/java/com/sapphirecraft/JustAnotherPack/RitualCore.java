package com.sapphirecraft.JustAnotherPack;

import com.sapphirecraft.JustAnotherPack.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class RitualCore {
	public static void ritualOreToOre(World world, int x, int y, int z, Block block)
	{
		for(int i = -1; i < 2; i++)
		{
			for (int j = -1; j < 2; j++)
			{
				for(int a = -1; a < 2; a++) {
					if (world.getBlock(x + i, y + j, z + a) == Blocks.lit_redstone_ore)
					{
						world.setBlock(x+i,y+j,z+a, Blocks.redstone_ore);
					}
				}
			}
		}
		
		if(getCountOfBlock(world,x,y,z,block) >= 9)
		{
			int count = 0;
			for(int i = -1; i < 2; i++)
			{
				for (int j = -1; j < 2; j++)
				{
					for(int a = -1; a < 2; a++) {
						if (world.getBlock(x + i, y + j, z + a) == block && count < 9)
						{
							world.setBlock(x+i,y+j,z+a, Blocks.air);
							count++;
						}
					}
				}
			}
			
			if(block == Blocks.lapis_ore)
				world.setBlock(x, y, z, ModBlocks.blockSapphireOre);
			else if(block == Blocks.redstone_ore)
				world.setBlock(x,y,z, ModBlocks.blockRubyOre);
		}
	}
	
	private static int getCountOfBlock(World world, int x, int y, int z, Block block)
	{
		int count = 0;
		
		for(int i = -1; i < 2; i++)
		{
			for (int j = -1; j < 2; j++)
			{
				for(int a = -1; a < 2; a++) {
					if (world.getBlock(x + i, y + j, z + a) == block)
					{
						count++;
					}
				}
			}
		}
		return count;
	}
}
