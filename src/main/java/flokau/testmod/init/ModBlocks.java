package flokau.testmod.init;


import java.util.ArrayList;
import java.util.List;

import flokau.testmod.blocks.BlockBase;
import flokau.testmod.blocks.ObsidianPlank;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OBSIDIAN_PLANK = new ObsidianPlank("obsidian_plank", Material.IRON);
}
