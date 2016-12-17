package com.legacy.aether.server.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.legacy.aether.server.player.PlayerAether;

public class ItemWhiteApple extends ItemAetherFood
{

	public ItemWhiteApple()
	{
		super(0);
		this.setAlwaysEdible();
	}

    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
    {
    	PlayerAether.get(player).attainCure(300);
    }

}