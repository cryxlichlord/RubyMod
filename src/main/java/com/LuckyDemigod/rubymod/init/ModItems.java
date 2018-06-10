package com.LuckyDemigod.rubymod.init;
import java.util.*;

import com.LuckyDemigod.rubymod.items.ItemBase;
/*
import com.LuckyDemigod.rubymod.items.tools.ToolAxe;
import com.LuckyDemigod.rubymod.items.tools.ToolPickaxe;
//import com.LuckyDemigod.rubymod.items.tools.ToolSword;
*/
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	
	public static final ToolMaterial MATERIAL_RUBY= EnumHelper.addToolMaterial("material_ruby", 4, 150, 9.0F, 4.0F, 50);
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	
	/*
	//Tools
	//public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_HAMMER = new ToolAxe("ruby_hammer", MATERIAL_RUBY);
	//public static final 
	*/
}