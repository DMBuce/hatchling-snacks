package dmbuce.hatchling_snacks;

import dmbuce.hatchling_snacks.food.ItemHatchFood;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("hatchling-snacks:noodles")
    public static ItemHatchFood item_noodles;

    @GameRegistry.ObjectHolder("hatchling-snacks:cheese")
    public static ItemHatchFood item_cheese;

    @GameRegistry.ObjectHolder("hatchling-snacks:fried_egg")
    public static ItemHatchFood item_fried_egg;

    @GameRegistry.ObjectHolder("hatchling-snacks:apple_juice")
    public static ItemHatchFood item_apple_juice;

    @GameRegistry.ObjectHolder("hatchling-snacks:chocolate_milk")
    public static ItemHatchFood item_chocolate_milk;

    @GameRegistry.ObjectHolder("hatchling-snacks:wine")
    public static ItemHatchFood item_wine;

    @GameRegistry.ObjectHolder("hatchling-snacks:mac_and_cheese")
    public static ItemHatchFood item_mac_and_cheese;

    @GameRegistry.ObjectHolder("hatchling-snacks:chicken_noodle_soup")
    public static ItemHatchFood item_chicken_noodle_soup;

    @GameRegistry.ObjectHolder("hatchling-snacks:apple_pie")
    public static ItemHatchFood item_apple_pie;

    @GameRegistry.ObjectHolder("hatchling-snacks:sandwich_cheese")
    public static ItemHatchFood item_sandwich_cheese;

    @GameRegistry.ObjectHolder("hatchling-snacks:sandwich_grilled_cheese")
    public static ItemHatchFood item_sandwich_grilled_cheese;

    @GameRegistry.ObjectHolder("hatchling-snacks:sandwich_cheese_ham")
    public static ItemHatchFood item_sandwich_cheese_ham;

    @GameRegistry.ObjectHolder("hatchling-snacks:sandwich_grilled_cheese_ham")
    public static ItemHatchFood item_sandwich_grilled_cheese_ham;

    @GameRegistry.ObjectHolder("hatchling-snacks:sandwich_cheese_steak")
    public static ItemHatchFood item_sandwich_cheese_steak;

    @GameRegistry.ObjectHolder("hatchling-snacks:burger_cheese_chicken")
    public static ItemHatchFood item_burger_cheese_chicken;

    @GameRegistry.ObjectHolder("hatchling-snacks:burger_cheese_fish")
    public static ItemHatchFood item_burger_cheese_fish;

    @GameRegistry.ObjectHolder("hatchling-snacks:burger_cheese_bacon_egg")
    public static ItemHatchFood item_burger_cheese_bacon_egg;

    @GameRegistry.ObjectHolder("hatchling-snacks:burger")
    public static ItemHatchFood item_burger;

    @GameRegistry.ObjectHolder("hatchling-snacks:burger_cheese_bacon")
    public static ItemHatchFood item_burger_cheese_bacon;

    @GameRegistry.ObjectHolder("hatchling-snacks:burger_mushroom")
    public static ItemHatchFood item_burger_mushroom;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	item_noodles.initModel();
    	item_cheese.initModel();
    	item_fried_egg.initModel();
    	item_apple_juice.initModel();
    	item_chocolate_milk.initModel();
    	item_wine.initModel();
    	item_mac_and_cheese.initModel();
    	item_chicken_noodle_soup.initModel();
    	item_apple_pie.initModel();
        item_sandwich_cheese.initModel();
        item_sandwich_grilled_cheese.initModel();
        item_sandwich_cheese_ham.initModel();
        item_sandwich_grilled_cheese_ham.initModel();
        item_sandwich_cheese_steak.initModel();
        item_burger_cheese_chicken.initModel();
        item_burger_cheese_fish.initModel();
        item_burger_cheese_bacon_egg.initModel();
        item_burger.initModel();
        item_burger_cheese_bacon.initModel();
        item_burger_mushroom.initModel();
    }

    public static void initItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new  ItemHatchFood("noodles",                      1,   0.3f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("cheese",                       3,   0.6f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("fried_egg",                    3,   0.6f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("apple_juice",                  2,   0.6f,  1,   EnumAction.DRINK,  Items.GLASS_BOTTLE,  false));
        event.getRegistry().register(new  ItemHatchFood("chocolate_milk",               2,   0.6f,  1,   EnumAction.DRINK,  Items.GLASS_BOTTLE,  false));
        event.getRegistry().register(new  ItemHatchFood("wine",                         1,   0.6f,  1,   EnumAction.DRINK,  Items.GLASS_BOTTLE,  false));
        event.getRegistry().register(new  ItemHatchFood("mac_and_cheese",               6,   0.6f,  1,   EnumAction.EAT,    Items.BOWL,          false));
        event.getRegistry().register(new  ItemHatchFood("chicken_noodle_soup",          6,   0.6f,  1,   EnumAction.DRINK,  Items.BOWL,          false));
        event.getRegistry().register(new  ItemHatchFood("apple_pie",                    8,   0.3f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("sandwich_cheese",              6,   0.6f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("sandwich_grilled_cheese",      7,   0.6f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("sandwich_cheese_ham",          8,   0.8f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("sandwich_grilled_cheese_ham",  10,  0.8f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("sandwich_cheese_steak",        10,  0.8f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("burger_cheese_chicken",        8,   0.6f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("burger_cheese_fish",           8,   0.6f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("burger_cheese_bacon_egg",      10,  0.8f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("burger",                       8,   0.8f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("burger_cheese_bacon",          10,  0.8f,  64,  EnumAction.EAT,    null,                false));
        event.getRegistry().register(new  ItemHatchFood("burger_mushroom",              9,   0.8f,  64,  EnumAction.EAT,    null,                false));
    }
}
