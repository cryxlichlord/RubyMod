package com.LuckyDemigod.rubymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase
{

	public RubyBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(3F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		//BlockBase temp = new BlockBase("", Material.WOOD);
		//temp.
		
	}

	
	
	
	
}
