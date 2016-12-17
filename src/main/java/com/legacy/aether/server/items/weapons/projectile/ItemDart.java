package com.legacy.aether.server.items.weapons.projectile;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.legacy.aether.server.items.util.EnumDartType;
import com.legacy.aether.server.registry.creative_tabs.AetherCreativeTabs;

public class ItemDart extends Item
{

    public ItemDart()
    {
        super();
        this.setHasSubtypes(true);
        this.setCreativeTab(AetherCreativeTabs.weapons);
    }

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		int i = itemstack.getItemDamage();

		return this.getUnlocalizedName() + "_" + EnumDartType.values()[i].toString();
	}

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < EnumDartType.values().length ; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }

}