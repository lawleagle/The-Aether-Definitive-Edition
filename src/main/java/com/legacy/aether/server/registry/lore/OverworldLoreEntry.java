package com.legacy.aether.server.registry.lore;

import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.legacy.aether.server.registry.objects.EntryInformation;
import com.legacy.aether.server.registry.objects.LoreEntry;

public class OverworldLoreEntry extends LoreEntry
{

	private ArrayList<EntryInformation> information;

	@Override
	public OverworldLoreEntry initEntries()
	{
		information = new ArrayList<EntryInformation>();
		information.add(new EntryInformation(new ItemStack(Blocks.AIR), "Air", "HOW IN THE WORLD", "DID YOU EVEN GET THIS!?!?!?!", "~Kino", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.BEDROCK), "Bedrock", "An unbreakable block", "found at the bottom of the world", "as well as on top", "of the world, only", "in the nether.", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.GRASS), "Grass", "Found above ground and", "is used to grow trees and", "plant flowers.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.DIRT, 1, 0), "Dirt", "Found near or below grass", "as well as in undground caves", "if put near light and grass", "it will turn back into grass.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.DIRT, 1, 1), "Coarse Dirt", "Dirt molded with Gravel.", "This Dirt cannot have", "grass grown on it.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.DIRT, 1, 2), "Podzol", "An unatural type of Grass", "allows mushrooms to be grown", "and place no matter what", "light level it is placed at.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SAPLING, 1, 0), "Oak Sapling", "dropped by Oak Leaves", "can be used to replant", "trees that were chopped.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SAPLING, 1, 1), "Spruce Sapling", "dropped by Spruce Leaves", "can be used to replant", "trees that were chopped.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SAPLING, 1, 2), "Birch Sapling", "dropped by Birch Leaves", "can be used to replant", "trees that were chopped.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SAPLING, 1, 3), "Jungle Sapling", "dropped by Jungle Leaves", "can be used to replant", "trees that were chopped.", "If four planted together", "it will create a massive", "jungle tree."));
		information.add(new EntryInformation(new ItemStack(Blocks.SAPLING, 1, 4), "Acacia Sapling", "dropped by Acacia Leaves", "can be used to replant", "trees that were chopped.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SAPLING, 1, 5), "Oak Wood Sapling", "dropped by Oak Wood Leaves", "can be used to replant", "trees that were chopped.", "Only works when planted", "together with three other", "Oak Wood Saplings."));
		information.add(new EntryInformation(new ItemStack(Blocks.STONE), "Stone", "Usually found underground and", "can be used for decoration", "as well as making decoration", "blocks such as stone slabs.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.STONE, 1, 1), "Granite", "Created from Diorite and", "a nether quartz.", "Used to create Polished", "Granite.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.STONE, 1, 2), "Polished Granite", "Created from compacting", "Granite. Used for", "Decorations.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.STONE, 1, 3), "Diorite", "Created from two nether", "quartz and cobblestone.", "Used to create Polished", "Diorite.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.STONE, 1, 4), "Polished Diorite", "Created from compacting", "Diorite. Used for", "Decorations.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.STONE, 1, 5), "Andesite", "Created from Diorite", "and Cobblestone. Used", "to create Polished", "Andesite.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.STONE, 1, 6), "Polished Andesite", "Created from compacting", "Andesite. Used for", "Decorations", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.COBBLESTONE), "Cobblestone", "a block formed by", "mining stone naturally.", "used for various different", "recipes such as creating", "tools and Furnaces.", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.PLANKS, 1, 0), "Oak Wood Plank", "Crafted from Oak Wood", "useful crafting material as well", "as useful for decoration.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.PLANKS, 1, 1), "Spruce Wood Plank", "Crafted from Spruce Wood", "useful crafting material as well", "as useful for decoration.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.PLANKS, 1, 2), "Birch Wood Plank", "Crafted from Birch Wood", "useful crafting material as well", "as useful for decoration.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.PLANKS, 1, 3), "Jungle Wood Plank", "Crafted from Jungle Wood", "useful crafting material as well", "as useful for decoration.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.PLANKS, 1, 4), "Acacia Wood Plank", "Crafted from Acacia Wood", "useful crafting material as well", "as useful for decoration.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.PLANKS, 1, 5), "Dark Oak Wood Plank", "Crafted from Dark Oak Wood", "useful crafting material as well", "as useful for decoration.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SAND, 1, 0), "Sand", "Usually found near beaches", "or deserts. Sand can", "be used to make Glass", "as well as be compacted", "into Sandstone.", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SAND, 1, 1), "Red Sand", "Usually found in Mesa Biomes", "Red Sand can", "be used to make Glass", "as well as be compacted", "into Red Sandstone.", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SANDSTONE, 1, 0), "Sandstone", "crafted from Sand", "used as decoration as", "well as being able to be", "chiseled or smoothened.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SANDSTONE, 1, 1), "Chiseled Sandstone", "Sandstone that has been", "chiseled to have a", "creeper decoration which is", "no longer revertable.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SANDSTONE, 1, 2), "Smooth Sandstone", "Sandstone that has been", "smoothened to have a", "a sleek decoration which is", "no longer revertable.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.GRAVEL), "Gravel", "Found underground in a bounch", "falls when unsupported by", "another block. Has a", "chance to drop Flint.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.COAL_ORE), "Coal Ore", "An ore containing", "Coal. Can be extracted", "by smelting it in a", "Furnace for a while", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.IRON_ORE), "Iron Ore", "An ore containing", "Iron. Can be extracted", "by smelting it in a", "Furnace for a while.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.GOLD_ORE), "Gold Ore", "An ore containing", "Gold. Can be extracted", "by smelting it in a", "Furnace for a while.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.DIAMOND_ORE), "Diamond Ore", "An ore containing", "Diamond. Once mined", "will release a Diamond.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.LAPIS_ORE), "Lapis Ore", "An ore containing", "Lapis Lazuli. Once mined", "will release an", "abundance of Lapis.", "Used for Enchanting.", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.REDSTONE_ORE), "Redstone Ore", "An ore containing", "Redstone. Once mined", "will release an", "abundance of Redstone.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.EMERALD_ORE), "Emerald Ore", "An ore containing", "Emerald. once mined", "will release an Emerald.", "Found only on", "Extreme Hill Biomes.", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SPONGE), "Sponge", "Absorbs any Nearby", "water around it.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.GLASS), "Glass", "Crafted from smelting", "Sand in a Furnace.", "Used as decoration and", "can be used to make", "Glass Panes", "(Dyeable)"));
		information.add(new EntryInformation(new ItemStack(Blocks.STAINED_GLASS), "Stained Glass", "Glass stained from", "using dye on a", "Glass block.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.STAINED_GLASS_PANE), "Stained Glass Pane", "Glass Pane stained", "from using dye on", "a Glass Panes block.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.WOOL), "Wool", "A soft material which", "can be harvest from sheep", "or crafted with String.", "can be used for Beds", "as well as is dyable.", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.GOLD_BLOCK), "Gold Block", "Nine pieces of Gold", "compressed into one block", "which can be changed", "back into nine pieces", "of Gold. It is", "an aesthetic block."));
		information.add(new EntryInformation(new ItemStack(Blocks.IRON_BLOCK), "Iron Block", "Nine pieces of Iron", "compressed into one block", "which can be changed", "back into nine pieces", "of Iron. It is", "an aesthetic block."));
		information.add(new EntryInformation(new ItemStack(Blocks.DIAMOND_BLOCK), "Diamond Block", "Nine peices of Diamond", "compressed into one block", "which can be changed", "back into nine pieces", "of Diamond. It is", "an aesthetic block."));
		information.add(new EntryInformation(new ItemStack(Blocks.BRICK_BLOCK), "Brick Block", "Four peices of Brick", "compressed into one block", "which can be changed", "back into four pieces", "of Brick. It is", "an aesthetic block."));
		information.add(new EntryInformation(new ItemStack(Blocks.BOOKSHELF), "Bookshelf", "A compression of", "wood and books. A", "valued factor for", "efficient enchantment.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.MOSSY_COBBLESTONE), "Mossy Cobblestone", "Cobble which has", "been mossed up.", "Found in spawner", "dungeons.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.OBSIDIAN), "Obsidian", "The result of an", "attempt of mixing", "water and lava together.", "Used to make Nether", "Portals.", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.ICE), "Ice Block", "The result of", "freezing water.", "Can be thawed back", "into water.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.SNOW), "Snow Block", "A compression of", "four snowballs which", "can be broken back into", "four snowballs.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.DISPENSER), "Dispenser", "A mechanism used", "to dispense items", "or shoot arrows for", "traps.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.NOTEBLOCK), "Noteblock", "A block which", "can produce multiple", "ammounts of notes to", "produce music.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.GOLDEN_RAIL), "Powered Rail", "Used to provide", "an extra boost to", "minecarts.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.ACTIVATOR_RAIL), "Activator Rail", "Used to emit a", "redstone signal when", "a minecart is on", "it.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.PISTON), "Piston", "A mechanism that", "pushes blocks to", "to other locations.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.STICKY_PISTON), "Sticky Piston", "A mechanism that", "acts like a piston", "but will bring", "the block back to", "its original position", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.WEB), "Spider Web", "A stick substance", "that slows players down", "and negates their", "fall damage.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.DEADBUSH), "Dead Bush", "A bush which has", "wilted away. Found", "around Deserts.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.YELLOW_FLOWER), "Yellow Flower", "A flower commonly found", "in a forest.", "Can be used to", "craft yellow dye.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.RED_FLOWER), "Red Flower", "A flower commonly found", "in a forest.", "Can be used to", "craft red dye", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.BROWN_MUSHROOM), "Brown Mushroom", "A brown mushroom which", "spawn in dark places", "as well as in", "special biomes.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.RED_MUSHROOM), "Brown Mushroom", "A brown mushroom which", "spawn in dark places", "as well as in", "special biomes.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.TNT), "TNT", "An explosive block", "which destroys the", "landscape around it.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.TORCH), "Torch", "The main light source", "of Minecraft. Can", "be placed on walls", "and flooring.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.FIRE), "Fire", "Burns any trees", "in its path. Used", "to mail Chainmail.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.CHEST), "Chest", "Used to store any", "items and helpful for", "people settling anywhere.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.CRAFTING_TABLE), "Crafting Table", "This table is where", "all the crafting will take place.", "Used to expand crafting", "availability.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.FURNACE), "Furnace", "A coal powered", "machine which will", "smelt specific items", "to form new materials.", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.LADDER), "Ladder", "Used to elevate players", "from one area to another.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Blocks.RAIL), "Rail", "Used as the base for", "minecart movement and", "transportation.", "", "", ""));

		information.add(new EntryInformation(new ItemStack(Items.BUCKET), "Bucket", "Used to carry", "liquids ranging from", "Lava to even", "Milk.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.LAVA_BUCKET), "Lava Bucket", "A bucket filled", "with Lava. Can", "be used to create", "Obsidian.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.WATER_BUCKET), "Water Bucket", "A bucket filled", "with Water. Can", "be used to activate", "Aether Portals.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.SNOWBALL), "Snowball", "A playful ball", "of snow which can", "be thrown at Mobs", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.MILK_BUCKET), "Milk Bucket", "A bucket filled", "with Milk. Can", "be used to make", "cake.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.PAPER), "Paper", "Crafted from Sugar", "Cane, used to make", "books.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.BOOK), "Book", "Crafted from Paper", "and Leather, used to", "make Bookshelves.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.SLIME_BALL), "Slime Ball", "A piece of Slime", "used to create", "Slime Blocks, Stick", "Pistons and Magma", "Cream.", ""));
		information.add(new EntryInformation(new ItemStack(Items.BONE), "Bone", "A piece of a Skeleton", "Can be crafted into", "bonemeal and to", "tame wolves.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.ENDER_EYE), "Ender Eye", "The Essence of Enderman", "used to find and reveal", "End Portal locations.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.ENDER_PEARL), "Ender Pearl", "Dropped by Enderman", "can be used to teleport", "around by being", "thrown", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.FIRE_CHARGE), "Fire Charge", "Used in similar", "fashion to a", "Fint and Steel with", "a one time use.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.EXPERIENCE_BOTTLE), "Experience Bottle", "Can be obtained by", "Villager trade. When thrown", "it will drop experience.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.WRITABLE_BOOK), "Book and Quill", "Can be used to", "send messages to", "players or keep", "records of events.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_HORSE_ARMOR), "Golden Horse Armor", "Provides minimal", "protection to Horses.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_HORSE_ARMOR), "Iron Horse Armor", "Provides fair", "protection to Horses.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_HORSE_ARMOR), "Diamond Horse Armor", "Provides great", "protection to Horses.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_11), "Disc - 11", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_CAT), "Disc - Cat", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_BLOCKS), "Disc - Blocks", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_CHIRP), "Disc - Chirp", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_FAR), "Disc - Far", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_MALL), "Disc - Mall", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_STAL), "Disc - Stal", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_STRAD), "Disc - Strad", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_MELLOHI), "Disc - Mellohi", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_WARD), "Disc - Ward", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_13), "Disc - 13", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RECORD_WAIT), "Disc - Wait", "A music disc", "provided by C418.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.COAL), "Coal", "Mined from Coal", "ore, used as smelting", "material", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GLASS_BOTTLE), "Glass Bottle", "A bottle which", "can carry water and", "be used for potions.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.FERMENTED_SPIDER_EYE), "Fermented Spider Eye", "A Spider Eye mixed", "with Sugar and a", "Brown Mushroom. Used", "to make various potion", "effects.", ""));
		information.add(new EntryInformation(new ItemStack(Items.SPECKLED_MELON), "Glistering Melon", "A Melon covered in", "Golden Nuggets. Used to", "make Regeneration", "potions.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_CARROT), "Golden Carrot", "A Carrot covered in", "Golden Nuggets. Used to", "make Night Vision", "potions.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RABBIT_FOOT), "Rabbit Foot", "The foot of a Rabbit,", "used to create potions", "of Leaping.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.CAULDRON), "Cauldron", "A container which carries", "water and can be", "used to clean leather", "armor and can extinguish", "mobs.", ""));
		information.add(new EntryInformation(new ItemStack(Items.BREWING_STAND), "Brewing Stand", "The workstation of", "potion making. Can make", "up to three potions at", "a time.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DRAGON_BREATH), "Dragon's Breath", "The breath of a dragon", "which can be used", "to make lingering potions.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.SHIELD), "Shield", "A shield that protects", "the user from incoming", "projectile attacks.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.BOW), "Bow", "A ranged weapon which", "can be used to attack", "enemies from a safe", "distance.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.ARROW), "Arrow", "Ammo for the Bow", "as well as the Phoenix", "Bow which can be", "customized with potions.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.WOODEN_SWORD), "Wooden Sword", "A sword with minimal", "strength.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_SWORD), "Golden Sword", "A sword with minimal", "strength.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.STONE_SWORD), "Stone Sword", "A sword with decent", "strength.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_SWORD), "Iron Sword", "A sword with great", "strength.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_SWORD), "Diamond Sword", "A sword with fantastic", "strength.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.LEATHER_HELMET), "Leather Helmet", "A Helmet with minimal", "protction.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.LEATHER_CHESTPLATE), "Leather Chestplate", "A Chestplate with minimal", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.LEATHER_LEGGINGS), "Leather Leggings", "A Leggings with minimal", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.LEATHER_BOOTS), "Leather Boots", "A Boots with minimal", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_HELMET), "Iron Helmet", "A Helmet with great", "protction.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_CHESTPLATE), "Iron Chestplate", "A Chestplate with great", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_LEGGINGS), "Iron Leggings", "A Leggings with great", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_BOOTS), "Iron Boots", "A Boots with great", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_HELMET), "Diamond Helmet", "A Helmet with fantastic", "protction.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_CHESTPLATE), "Diamond Chestplate", "A Chestplate with fantastic", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_LEGGINGS), "Diamond Leggings", "A Leggings with fantastic", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_BOOTS), "Diamond Boots", "A Boots with fantastic", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_HELMET), "Golden Helmet", "A Helmet with fair", "protction.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_CHESTPLATE), "Golden Chestplate", "A Chestplate with fair", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_LEGGINGS), "Golden Leggings", "A Leggings with fair", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_BOOTS), "Golden Boots", "A Boots with fair", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.CHAINMAIL_HELMET), "Golden Helmet", "A Helmet with good", "protction.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.CHAINMAIL_CHESTPLATE), "Golden Chestplate", "A Chestplate with good", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.CHAINMAIL_LEGGINGS), "Golden Leggings", "A Leggings with good", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.CHAINMAIL_BOOTS), "Golden Boots", "A Boots with good", "protection.", "", "","", ""));
		information.add(new EntryInformation(new ItemStack(Items.WOODEN_SHOVEL), "Wooden Shovel", "A Shovel with", "a slow mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.WOODEN_PICKAXE), "Wooden Pickaxe", "A Pickaxe with", "a slow mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.WOODEN_AXE), "Wooden Axe", "A Axe with", "a slow mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.WOODEN_HOE), "Wooden Hoe", "A Hoe with", "low farming uses.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.STONE_SHOVEL), "Stone Shovel", "A Shovel with", "a decent mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.STONE_PICKAXE), "Stone Pickaxe", "A Pickaxe with", "a decent mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.STONE_AXE), "Stone Axe", "A Axe with", "a decent mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.STONE_HOE), "Stone Hoe", "A Hoe with", "decent farming uses.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_SHOVEL), "Iron Shovel", "A Shovel with", "a good mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_PICKAXE), "Iron Pickaxe", "A Pickaxe with", "a good mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_AXE), "Iron Axe", "A Axe with", "a good mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_HOE), "Iron Hoe", "A Hoe with", "good farming uses.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_SHOVEL), "Diamond Shovel", "A Shovel with", "a great mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_PICKAXE), "Diamond Pickaxe", "A Pickaxe with", "a great mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_AXE), "Diamond Axe", "A Axe with", "a great mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND_HOE), "Diamond Hoe", "A Hoe with", "great farming uses.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_SHOVEL), "Golden Shovel", "A Shovel with", "a fast mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_PICKAXE), "Golden Pickaxe", "A Pickaxe with", "a fast mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_AXE), "Golden Axe", "A Axe with", "a fast mining speed.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLDEN_HOE), "Golden Hoe", "A Hoe with", "minimal farming uses.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.COMPASS), "Compass", "A directional item which", "points to the users", "spawn point.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.FISHING_ROD), "Fishing Rod", "The main item for", "fishing in oceans.", "Can be used to find fish", "and other rare items", "lurking in the waters.", ""));
		information.add(new EntryInformation(new ItemStack(Items.CLOCK), "Clock", "A mechanism for telling", "time in overworld locations.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.SHEARS), "Shears", "A tool used to obtain", "wool from sheep.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.LEAD), "Lead", "Used to tug mobs around", "and make them follow you.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.NAME_TAG), "Name Tag", "Used to name mobs to", "what the name tag is named.", "Can be changed using", "an anvil.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.FLINT_AND_STEEL), "Flint and Steel", "A tool used to place", "fire and activate", "nether portals.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.CAKE), "Cake", "It's a lie.", "", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.COAL, 1, 1), "Charcoal", "The result of smelting Wood", "in a furnace. Used", "as fuel for Furnaces.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DIAMOND), "Diamond", "Obtained from mining Diamond", "Ore. Used to make", "diamond tools and", "armor.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.FEATHER), "Feather", "Obtained from killing Chickens", "and Moas. Used to", "make arrows.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.STRING), "String", "Obtained from killing Spiders.", "Used for traps, make wool", "and make bows.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.BOWL), "Bowl", "Used to make food", "such as Mushroom Stew and", "Beetroot Soup.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.FLINT), "Flint", "Obtained from mining Gravel.", "Used to make Arrows.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.IRON_INGOT), "Iron Ingot", "Obtained from smelting", "Iron Ore. Used to make", "Iron tools and armor.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GOLD_INGOT), "Gold Ingot", "Obtained from smelting", "Gold Ore. Used to make", "Golden tools and armor.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.LEATHER), "Leather", "Obtained from killing Cows.", "Used to make books, item", "frames and armor.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.STICK), "Stick", "An essential item in Minecraft.", "Used to craft the bare", "basics for surviving.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.CLAY_BALL), "Clay", "Obtained from mining Clay.", "When smelted, makes bricks.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.BRICK), "Brick", "Obtained from smelting Clay.", "Used to make Brick Blocks", "and Pots.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.REEDS), "Sugar Canes", "Found in the wild,", "used to make sugar and paper.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.WHEAT), "Wheat", "Fully grown wheat", "used to make Bread and", "Cake.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.WHEAT_SEEDS), "Seeds", "Found in the wild,", "used to grow Wheat.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.GUNPOWDER), "Gunpowder", "Obtained from killing Creepers.", "Used to make Fireworks", "and TNT.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.NETHER_STAR), "Nether Star", "A star obtained from", "killing the Wither. Used", "to create Beacons.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.EGG), "Egg", "Obtained from Chickens. Used", "to make Cake.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.RABBIT_HIDE), "Rabbit Hide", "Obtained from killing Bunnies.", "Used to create leather.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.BEETROOT_SEEDS), "Beetroot Seeds", "Found in dungeons", "and villages. Used to", "grow beetroot.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.SUGAR), "Sugar", "Created from Sugar Canes.", "Used to make Cake.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.EMERALD), "Emerald", "Obtained from mining Emerald", "Ore. Used to trade", "trade with Villagers.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.MELON_SEEDS), "Melon Seeds", "Found in dungeons.", "Used to grow Melons.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.PUMPKIN_SEEDS), "Pumpkin Seeds", "Found in dungeons.", "Used to grow Pumpkins.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.PRISMARINE_SHARD), "Prismarine Shard", "Obtained from killing", "Guardians. Used to create Prismarine", "Blocks and Sea Lanterns.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.PRISMARINE_CRYSTALS), "Prismarine Crystals", "Obtained from killing", "Guardians. Used to create", "Sea Lanterns", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DYE, 1, 3), "Cocoa Beans", "Found in Jungles.", "Used to make Cookies.", "", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DYE), "Ink Sac", "Obtained from killing Squids.", "Used to create book", "and quils.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DYE, 1, 4), "Lapis Lazuli", "Obtained from mining Lapis", "Ore. Used to enchant", "items in the enchantment", "table.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.DYE, 1, 15), "Bone Meal", "Crafted from Bones, used", "to decorate natural", "areas.", "", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.SADDLE), "Saddle", "An item used to mount", "on specific mobs. Allows", "for proper control", "on a mount.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.CARROT_ON_A_STICK), "Carrot on a Stick", "Bait used to", "steer pigs in any", "direction the stick", "is pointed at.", "", ""));
		information.add(new EntryInformation(new ItemStack(Items.ELYTRA), "Elytra", "Wings used to allow", "the player real-time", "flight.", "", "", ""));

		return this;
	}

	@Override
	public ArrayList<EntryInformation> EntryInformation() 
	{
		return information;
	}

}
