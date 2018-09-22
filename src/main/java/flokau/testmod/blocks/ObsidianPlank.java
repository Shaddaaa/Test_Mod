package flokau.testmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ObsidianPlank extends BlockBase 
{

	public ObsidianPlank(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(10000F);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel(1.0f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
	
	
}
