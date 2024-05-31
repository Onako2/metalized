package rs.onako2.metalized.Init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rs.onako2.metalized.Metalized;

public class ModItems {
    public static void Init() {
        Registry.register(Registries.ITEM, new Identifier("metalized", "iron_stairs"), new BlockItem(Metalized.IRON_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "coal_stairs"), new BlockItem(Metalized.COAL_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "gold_stairs"), new BlockItem(Metalized.GOLD_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "diamond_stairs"), new BlockItem(Metalized.DIAMOND_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "emerald_stairs"), new BlockItem(Metalized.EMERALD_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "redstone_stairs"), new BlockItem(Metalized.REDSTONE_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "lapis_stairs"), new BlockItem(Metalized.LAPIS_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "netherite_stairs"), new BlockItem(Metalized.NETHERITE_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier("metalized", "iron_ladder"), new BlockItem(Metalized.IRON_LADDER, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "coal_ladder"), new BlockItem(Metalized.COAL_LADDER, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "gold_ladder"), new BlockItem(Metalized.GOLD_LADDER, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "diamond_ladder"), new BlockItem(Metalized.DIAMOND_LADDER, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "emerald_ladder"), new BlockItem(Metalized.EMERALD_LADDER, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "redstone_ladder"), new BlockItem(Metalized.REDSTONE_LADDER, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "lapis_ladder"), new BlockItem(Metalized.LAPIS_LADDER, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("metalized", "netherite_ladder"), new BlockItem(Metalized.NETHERITE_LADDER, new FabricItemSettings()));

        FuelRegistry.INSTANCE.add(Metalized.COAL_LADDER, 300);
        FuelRegistry.INSTANCE.add(Metalized.COAL_STAIRS, 300);
    }
}