package rs.onako2.metalized;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.onako2.metalized.Block.RedstoneLaddersBlock;
import rs.onako2.metalized.Block.RedstoneStairsBlock;
import rs.onako2.metalized.Init.Identifiers;
import rs.onako2.metalized.Init.ModItems;

import static rs.onako2.metalized.Init.Identifiers.ironStairs;
import static rs.onako2.metalized.Init.Identifiers.redstoneStairs;

public class Metalized implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("metalized");

    public static final StairsBlock IRON_STAIRS;
    public static final StairsBlock GOLD_STAIRS;
    public static final StairsBlock LAPIS_STAIRS;
    public static final StairsBlock DIAMOND_STAIRS;
    public static final StairsBlock EMERALD_STAIRS;
    public static final StairsBlock COAL_STAIRS;
    public static final RedstoneStairsBlock REDSTONE_STAIRS;
    public static final StairsBlock NETHERITE_STAIRS;

    public static final LadderBlock IRON_LADDER;
    public static final LadderBlock GOLD_LADDER;
    public static final LadderBlock LAPIS_LADDER;
    public static final LadderBlock DIAMOND_LADDER;
    public static final LadderBlock EMERALD_LADDER;
    public static final LadderBlock COAL_LADDER;
    public static final RedstoneLaddersBlock REDSTONE_LADDER;
    public static final LadderBlock NETHERITE_LADDER;

    public static final ItemGroup METALIZED_ITEM_GROUP;

    static {
        IRON_STAIRS = (StairsBlock) registerStairsBlock(ironStairs, Blocks.IRON_BLOCK);
        GOLD_STAIRS = (StairsBlock) registerStairsBlock(Identifiers.goldStairs, Blocks.GOLD_BLOCK);
        LAPIS_STAIRS = (StairsBlock) registerStairsBlock(Identifiers.lapisStairs, Blocks.LAPIS_BLOCK);
        DIAMOND_STAIRS = (StairsBlock) registerStairsBlock(Identifiers.diamondStairs, Blocks.DIAMOND_BLOCK);
        EMERALD_STAIRS = (StairsBlock) registerStairsBlock(Identifiers.emeraldStairs, Blocks.EMERALD_BLOCK);
        COAL_STAIRS = (StairsBlock) registerStairsBlock(Identifiers.coalStairs, Blocks.COAL_BLOCK);
        REDSTONE_STAIRS = (RedstoneStairsBlock) Blocks.register(RegistryKey.of(RegistryKeys.BLOCK, redstoneStairs), (settings) -> new RedstoneStairsBlock(Blocks.REDSTONE_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK).notSolid().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
        NETHERITE_STAIRS = (StairsBlock) registerStairsBlock(Identifiers.netheriteStairs, Blocks.NETHERITE_BLOCK);

        IRON_LADDER = (LadderBlock) registerLadderBlock(Identifiers.ironLadder, Blocks.IRON_BLOCK);
        GOLD_LADDER = (LadderBlock) registerLadderBlock(Identifiers.goldLadder, Blocks.GOLD_BLOCK);
        LAPIS_LADDER = (LadderBlock) registerLadderBlock(Identifiers.lapisLadder, Blocks.LAPIS_BLOCK);
        DIAMOND_LADDER = (LadderBlock) registerLadderBlock(Identifiers.diamondLadder, Blocks.DIAMOND_BLOCK);
        EMERALD_LADDER = (LadderBlock) registerLadderBlock(Identifiers.emeraldLadder, Blocks.EMERALD_BLOCK);
        COAL_LADDER = (LadderBlock) registerLadderBlock(Identifiers.coalLadder, Blocks.COAL_BLOCK);
        REDSTONE_LADDER = (RedstoneLaddersBlock) Blocks.register(RegistryKey.of(RegistryKeys.BLOCK, Identifiers.redstoneLadder), RedstoneLaddersBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK).notSolid().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
        NETHERITE_LADDER = (LadderBlock) registerLadderBlock(Identifiers.netheriteLadder, Blocks.NETHERITE_BLOCK);

        METALIZED_ITEM_GROUP = FabricItemGroup.builder()
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
                    entries.add(LAPIS_LADDER);
                    entries.add(NETHERITE_LADDER);
                })
                .build();
    }

    private static Block registerStairsBlock(Identifier id, Block base) {
        return Blocks.register(RegistryKey.of(RegistryKeys.BLOCK, id), (settings) -> new StairsBlock(base.getDefaultState(), settings), AbstractBlock.Settings.copy(base));
    }

    private static Block registerLadderBlock(Identifier id, Block base) {
        return Blocks.register(RegistryKey.of(RegistryKeys.BLOCK, id), LadderBlock::new, AbstractBlock.Settings.copy(base).notSolid().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Metalizing da blocks and converting them to breakfast!");
        ModItems.Init();
        Registry.register(Registries.ITEM_GROUP, Identifier.of("metalized", "main_group"), Metalized.METALIZED_ITEM_GROUP);
    }

}