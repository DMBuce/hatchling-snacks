
package dmbuce.hatchling_snacks.proxy;

import dmbuce.hatchling_snacks.ModItems;
import dmbuce.hatchling_snacks.ModRecipes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
	}

	public void init(FMLInitializationEvent e) {
		ModRecipes.initRecipes(e);
	}

	public void postInit(FMLPostInitializationEvent e) {
	}

	//@SubscribeEvent
	//public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
	//}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.initItems(event);
	}
}

