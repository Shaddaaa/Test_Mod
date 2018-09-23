package flokau.testmod.entities.tileentities;


import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;

public class ObsidianPlankTileEntity extends TileEntity implements ITickable {
	
	public static final String NAME = "ObsidianPlankTileEntity";
	
	@Override
	public void update() {
		System.out.println("TEST------------------------------------1");
		List<EntityPlayer> players = world.playerEntities;
		for (EntityPlayer p : players) {
			System.out.println("TEST------------------------------------2");
			if (   Math.abs(p.posX-this.pos.getX()) < 1.0
				&& Math.abs(p.posY-this.pos.getY()) < 1.1
				&& Math.abs(p.posZ-this.pos.getZ()) < 1.0) {
				System.out.println("TEST------------------------------------3");
				p.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("speed"), 60, 1, false, false));
			}
		}
		
	}
	
	public ObsidianPlankTileEntity(World world) {
		this.world = world;
	}
	
	public ObsidianPlankTileEntity() {
	}
}
