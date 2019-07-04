package dmbuce.hatchling_snacks.food;

import dmbuce.hatchling_snacks.HatchlingSnacks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHatchFood extends ItemFood {

    private final EnumAction action;

    public ItemHatchFood(String name, int amount, float saturation, boolean isWolfFood, int maxStackSize, EnumAction action) {
        super(amount, saturation, isWolfFood);
        this.setMaxStackSize(maxStackSize);
        this.action = action;
        this.setCreativeTab(CreativeTabs.FOOD);
        setRegistryName(new ResourceLocation(HatchlingSnacks.MODID, name));        // The unique name (within your mod) that identifies this item
        setTranslationKey(HatchlingSnacks.MODID + "." + name);     // Used for localization (en_US.lang)
    }

    //public ItemHatchFood(String name, int amount, boolean isWolfFood) {
    //    this(name, amount, 0.6F, isWolfFood);
    //}

    public EnumAction getItemUseAction(ItemStack stack) {
        return this.action;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}

