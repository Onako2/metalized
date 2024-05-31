package rs.onako2.metalized;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import rs.onako2.metalized.Block.RedstoneLaddersBlock;
import rs.onako2.metalized.Block.RedstoneStairsBlock;
import rs.onako2.metalized.Init.InventoryInit;
import rs.onako2.metalized.Init.ModBlocks;
import rs.onako2.metalized.Init.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Metalized implements ModInitializer {

	// MOD IS WIP

	// stairs
	public static final Logger LOGGER = LoggerFactory.getLogger("metalized");

	public static final Block IRON_STAIRS = new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).notSolid());

	public static final Block GOLD_STAIRS = new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.GOLD).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.METAL).notSolid());

	public static final Block LAPIS_STAIRS = new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.LAPIS_BLUE).requiresTool().strength(3.0f, 3.0f).notSolid());

	public static final Block DIAMOND_STAIRS = new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DIAMOND_BLUE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).notSolid());

	public static final Block EMERALD_STAIRS = new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DIAMOND_BLUE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).notSolid());

	public static final Block COAL_STAIRS = new StairsBlock(Blocks.COAL_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BLACK).requiresTool().strength(5.0f, 6.0f).notSolid());

	public static final Block REDSTONE_STAIRS = new RedstoneStairsBlock(Blocks.REDSTONE_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BRIGHT_RED).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).notSolid());

	public static final Block NETHERITE_STAIRS = new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BLACK).requiresTool().strength(50.0f, 120.0f).sounds(BlockSoundGroup.NETHERITE).notSolid());

	// ladders
	public static final Block IRON_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	public static final Block GOLD_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	public static final Block LAPIS_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	public static final Block DIAMOND_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	public static final Block EMERALD_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	public static final Block COAL_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	public static final Block REDSTONE_LADDER = new RedstoneLaddersBlock(FabricBlockSettings.create().notSolid().strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	public static final Block NETHERITE_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(50.0f).sounds(BlockSoundGroup.NETHERITE).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	public static final ItemGroup METALIZED_ITEM_GROUP = FabricItemGroup.builder()
    	.icon(() -> new ItemStack(IRON_STAIRS))
    	.displayName(Text.translatable("itemGroup.metalized.main_group"))
            .entries((context, entries) -> {
    		entries.add(IRON_STAIRS);
			entries.add(COAL_STAIRS);
			entries.add(REDSTONE_STAIRS);
			entries.add(EMERALD_STAIRS);
			entries.add(GOLD_STAIRS);
			entries.add(DIAMOND_STAIRS);
			entries.add(LAPIS_STAIRS);
			entries.add(NETHERITE_STAIRS);
			entries.add(IRON_LADDER);
			entries.add(COAL_LADDER);
			entries.add(REDSTONE_LADDER);
			entries.add(EMERALD_LADDER);
			entries.add(GOLD_LADDER);
			entries.add(DIAMOND_LADDER);
			entries.add(NETHERITE_LADDER);
    	})
    	.build();

	@Override
	public void onInitialize() {

		LOGGER.info("Metalizing da blocks and converting them to breakfast!");
		ModBlocks.Init();
		ModItems.Init();
		InventoryInit.Init();
		LOGGER.info("Metalized da blocks for realz!");
	}
}