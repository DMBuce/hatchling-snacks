package dmbuce.hatchling_snacks;

//import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {

    //public static void initRecipes(RegistryEvent.Register<IRecipe> e) {
    public static void initRecipes(FMLInitializationEvent e) {
        GameRegistry.addSmelting(ModItems.item_sandwich_cheese,     new ItemStack(ModItems.item_sandwich_grilled_cheese,     1), 0.35f);
        GameRegistry.addSmelting(ModItems.item_sandwich_cheese_ham, new ItemStack(ModItems.item_sandwich_grilled_cheese_ham, 1), 0.35f);
        for ( ItemStack eggItemStack: OreDictionary.getOres("egg") ) {
            GameRegistry.addSmelting(eggItemStack, new ItemStack(ModItems.item_fried_egg, 1), 0.35f);
        }
    }
}
