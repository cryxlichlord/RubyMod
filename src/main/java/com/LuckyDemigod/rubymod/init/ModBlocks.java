package com.LuckyDemigod.rubymod.init;

import java.util.*;

import com.LuckyDemigod.rubymod.blocks.BlockBase;
import com.LuckyDemigod.rubymod.blocks.RubyBlock;
import com.LuckyDemigod.rubymod.blocks.RubyOre;
import net.minecraft.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block SMALL_HOUSE = new BlockBase("small_house", Material.WOOD);
}
