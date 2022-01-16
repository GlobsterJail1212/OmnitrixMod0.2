package com.mod.omnitrixmod.world.gen;

import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){
        for (OreType ore: OreType.values()) {
            OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    (BlockState) ore.getBlock().get().getStatements(), ore.getMaxVeinSize());

            ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configured(
                    new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

                    ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

                    event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);

        }
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(OreType ore, OreFeatureConfig oreFeatureConfig,
                                                              ConfiguredPlacement configuredPlacement){
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getBlock().get().toString(),
                Feature.ORE.configured(oreFeatureConfig).place(configuredPlacement)
                        .square().count(2));
    }
}
