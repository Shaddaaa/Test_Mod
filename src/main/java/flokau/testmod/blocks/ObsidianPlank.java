package flokau.testmod.blocks;

import flokau.testmod.entities.tileentities.ObsidianPlankTileEntity;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;

public class ObsidianPlank extends BlockBase{
	
	
	
	public ObsidianPlank(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(10000F);
		setHarvestLevel("pickaxe", 3);
	}
		
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new ObsidianPlankTileEntity(world);
	}
}
