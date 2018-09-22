package flokau.testmod.init;

import java.util.List;

import flokau.testmod.items.ItemBase;
import flokau.testmod.items.armor.ArmorBase;
import flokau.testmod.items.tools.ToolAxe;
import flokau.testmod.items.tools.ToolHoe;
import flokau.testmod.items.tools.ToolPickaxe;
import flokau.testmod.items.tools.ToolShovel;
import flokau.testmod.items.tools.ToolSword;
import flokau.testmod.util.Reference;

import java.util.ArrayList;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
	public static final ToolMaterial TOOL_MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("tool_material_obsidian", 3, 2301, 9.0F, 2.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian", Reference.MOD_ID + ":obsidian_ingot", 40, new int[]{3/*Boots*/, 6/*Legs*/, 8/*Plates*/, 3/*Helmets*/}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
	
	//Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	
	//Tools
	public static final ItemSword OBSIDIAN_SWORDS = new ToolSword("obsidian_sword", TOOL_MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", TOOL_MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", TOOL_MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SPADE = new ToolShovel("obsidian_shovel", TOOL_MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", TOOL_MATERIAL_OBSIDIAN);
	
	//Armor
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHEST = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
}	
