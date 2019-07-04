package dmbuce.hatchling_snacks.food;

import dmbuce.hatchling_snacks.HatchlingSnacks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHatchFood extends ItemFood {

    private final EnumAction action;
    private final Item container;

    public ItemHatchFood(String name, int halfHaunches, float saturation, int maxStackSize, EnumAction action, Item containerItem, boolean isWolfFood) {
        super(halfHaunches, saturation, isWolfFood);
        this.setMaxStackSize(maxStackSize);
        this.action = action;
        this.container = containerItem;
        this.setCreativeTab(CreativeTabs.FOOD);
        setRegistryName(new ResourceLocation(HatchlingSnacks.MODID, name));        // The unique name (within your mod) that identifies this item
        setTranslationKey(HatchlingSnacks.MODID + "." + name);     // Used for localization (en_US.lang)
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if (this.container != null) {
            return new ItemStack(this.container);
        } else {
            return stack;
        }
    }

    public EnumAction getItemUseAction(ItemStack stack) {
        return this.action;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}

