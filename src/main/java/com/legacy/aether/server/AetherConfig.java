package com.legacy.aether.server;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;

public class AetherConfig 
{

	private static boolean christmas_content;

	private static int aether_biome_id, aether_dimension_id;

	public static void init(File location)
	{
		File newFile = new File(location + "/aether" + "/Aether_Legacy.cfg");

		try
		{
			newFile.createNewFile();
		}
		catch (IOException e)
		{

		}

		Configuration config = new Configuration(newFile);

		config.load();

		christmas_content = config.get("Aether World Generation", "Christmas Content", false).getBoolean(false);

		aether_dimension_id = config.get("World Identification", "Aether Dimension ID", 4).getInt(4);
		aether_biome_id = config.get("World Identification", "Aether Biome ID", 127).getInt(127);

		config.save();
	}

	public static int getAetherDimensionID()
	{
		return AetherConfig.aether_dimension_id;
	}

	public static int getAetherBiomeID()
	{
		return AetherConfig.aether_biome_id;
	}

	public static boolean shouldLoadHolidayContent()
	{
		return AetherConfig.christmas_content;
	}

}