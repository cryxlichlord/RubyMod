package com.LuckyDemigod.rubymod.blocks;

import com.LuckyDemigod.rubymod.items.ItemBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import java.util.Random;
public class RubyOre extends BlockBase {

	
	private ItemBase itemToDrop;
	private int minDropAmouint;
	private int maxDropAmount;
	public RubyOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(2F);
		BlockBase temp = new BlockBase(name, material);
		
	}

}
