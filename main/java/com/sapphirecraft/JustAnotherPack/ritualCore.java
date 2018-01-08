package com.sapphirecraft.JustAnotherPack;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class ritualCore {
	public void ritualOreToOre(World world, int x, int y, int z, Block block)
	{
		if(getCountOfBlock(world,x,y,z,block) == 9)
		{
			for(int i = -2; i < 3; i++)
			{
				for (int j = -2; j < 3; j++)
				{
					for(int a = -2; a < 3; a++) {
						if (world.getBlock(x + i, y + j, z + a) == block)
						{
							world.setBlock(x+i,y+j,z+a, Blocks.air);
						}
					}
				}
			}
			
			if(block == Blocks.lapis_ore)
				world.setBlock(x, y, z, Main.blockSapphireOre);
			if(block == Blocks.redstone_ore)
				world.setBlock(x,y,z, Main.blockRubyOre);
		}
	}
	
	private int getCountOfBlock(World world, int x, int y, int z, Block block)
	{
		int count = 0;
		
		for(int i = -2; i < 3; i++)
		{
			for (int j = -2; j < 3; j++)
			{
				for(int a = -2; a < 3; a++) {
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
