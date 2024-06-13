package rs.onako2.metalized.Init;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rs.onako2.metalized.Metalized;

public class ModBlocks {
    public static void Init() {
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "iron_stairs"), Metalized.IRON_STAIRS);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "gold_stairs"), Metalized.GOLD_STAIRS);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "redstone_stairs"), Metalized.REDSTONE_STAIRS);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "diamond_stairs"), Metalized.DIAMOND_STAIRS);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "coal_stairs"), Metalized.COAL_STAIRS);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "emerald_stairs"), Metalized.EMERALD_STAIRS);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "lapis_stairs"), Metalized.LAPIS_STAIRS);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "netherite_stairs"), Metalized.NETHERITE_STAIRS);

        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "iron_ladder"), Metalized.IRON_LADDER);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "gold_ladder"), Metalized.GOLD_LADDER);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "redstone_ladder"), Metalized.REDSTONE_LADDER);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "diamond_ladder"), Metalized.DIAMOND_LADDER);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "coal_ladder"), Metalized.COAL_LADDER);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "emerald_ladder"), Metalized.EMERALD_LADDER);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "lapis_ladder"), Metalized.LAPIS_LADDER);
        Registry.register(Registries.BLOCK, Identifier.tryParse("metalized", "netherite_ladder"), Metalized.NETHERITE_LADDER);
    }
}
