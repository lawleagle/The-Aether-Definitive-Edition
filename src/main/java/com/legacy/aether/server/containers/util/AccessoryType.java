package com.legacy.aether.server.containers.util;

import net.minecraft.inventory.Slot;

import com.legacy.aether.server.containers.slots.SlotAccessory;

public enum AccessoryType
{
	RING("Ring", 11, 3),
	PENDANT("Pendant", 16, 7),
	CAPE("Cape", 15, 5),
	SHIELD("Shield", 13, 0),
	GLOVE("Gloves", 10, 0),
	MISC("Miscellaneous", 10, 0);

	private int maxDamage, damagedReduced;

	private String displayName;

	AccessoryType(String displayName, int maxDamage, int damageReduced)
	{
		this.displayName = displayName;
		this.maxDamage = maxDamage;
		this.damagedReduced = damageReduced;
	}

	public int getMaxDamage()
	{
		return this.maxDamage;
	}

	public int getDamageReduced()
	{
		return this.damagedReduced;
	}

	public String getDisplayName()
	{
		return this.displayName;
	}

	public boolean isSlotValid(Slot slot)
	{
		if (slot instanceof SlotAccessory)
		{
			SlotAccessory accessorySlot = (SlotAccessory) slot;

			if (accessorySlot.getAccessoryType().equals(this))
			{
				return true;
			}
		}

		return false;
	}

}