package flokau.testmod.util.handlers;

import flokau.testmod.entities.tileentities.ObsidianPlankTileEntity;
import flokau.testmod.init.ModBlocks;
import flokau.testmod.init.ModItems;
import flokau.testmod.items.ItemBase;
import flokau.testmod.util.IHasModel;
import flokau.testmod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler
{
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		
		RegistryHandler.registerTileEntities();
	}
	
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(ObsidianPlankTileEntity.class, new ResourceLocation(Reference.MOD_ID, ObsidianPlankTileEntity.NAME));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) 
	{
		for (Item item : ModItems.ITEMS) 
		{
			if (item instanceof IHasModel) 
			{
				((IHasModel)item).registerModels(); 
			}
		}
		
		for (Block block : ModBlocks.BLOCKS) 
		{
			if (block instanceof IHasModel) 
			{
				((IHasModel)block).registerModels(); 
			}
		}
	}
}
