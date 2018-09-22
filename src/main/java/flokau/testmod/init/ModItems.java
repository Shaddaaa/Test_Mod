package flokau.testmod.init;

import java.util.List;

import flokau.testmod.items.ItemBase;
import flokau.testmod.items.tools.ToolAxe;
import flokau.testmod.items.tools.ToolHoe;
import flokau.testmod.items.tools.ToolPickaxe;
import flokau.testmod.items.tools.ToolShovel;
import flokau.testmod.items.tools.ToolSword;

import java.util.ArrayList;	
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 2301, 9.0F, 2.0F, 10);
	
	
	//Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	
	//Tools
	public static final ItemSword OBSIDIAN_SWORDS = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SPADE = new ToolShovel("obsidian_shovel", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);
}	
