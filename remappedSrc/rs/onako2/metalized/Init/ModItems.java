package rs.onako2.metalized.Init;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rs.onako2.metalized.Metalized;

public class ModItems {
    public static void Init() {
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "iron_stairs"), new BlockItem(Metalized.IRON_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "coal_stairs"), new BlockItem(Metalized.COAL_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "gold_stairs"), new BlockItem(Metalized.GOLD_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "diamond_stairs"), new BlockItem(Metalized.DIAMOND_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "emerald_stairs"), new BlockItem(Metalized.EMERALD_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "redstone_stairs"), new BlockItem(Metalized.REDSTONE_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "lapis_stairs"), new BlockItem(Metalized.LAPIS_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "netherite_stairs"), new BlockItem(Metalized.NETHERITE_STAIRS, new Item.Settings()));

        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "iron_ladder"), new BlockItem(Metalized.IRON_LADDER, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "coal_ladder"), new BlockItem(Metalized.COAL_LADDER, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "gold_ladder"), new BlockItem(Metalized.GOLD_LADDER, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "diamond_ladder"), new BlockItem(Metalized.DIAMOND_LADDER, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "emerald_ladder"), new BlockItem(Metalized.EMERALD_LADDER, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "redstone_ladder"), new BlockItem(Metalized.REDSTONE_LADDER, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "lapis_ladder"), new BlockItem(Metalized.LAPIS_LADDER, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.tryParse("metalized", "netherite_ladder"), new BlockItem(Metalized.NETHERITE_LADDER, new Item.Settings()));

        FuelRegistry.INSTANCE.add(Metalized.COAL_LADDER, 300);
        FuelRegistry.INSTANCE.add(Metalized.COAL_STAIRS, 300);
    }
}
