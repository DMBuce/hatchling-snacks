package dmbuce.hatchling_snacks;

import dmbuce.hatchling_snacks.food.ItemHatchFood;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("hatchling-snacks:cheese")
    public static ItemHatchFood itemCheese;

    @GameRegistry.ObjectHolder("hatchling-snacks:wine")
    public static ItemHatchFood itemWine;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemCheese.initModel();
        itemWine.initModel();
    }
}
