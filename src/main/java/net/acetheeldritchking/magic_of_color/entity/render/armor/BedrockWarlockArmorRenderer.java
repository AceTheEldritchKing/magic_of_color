package net.acetheeldritchking.magic_of_color.entity.render.armor;

import mod.azure.azurelib.common.render.armor.AzArmorRenderer;
import mod.azure.azurelib.common.render.armor.AzArmorRendererConfig;
import net.acetheeldritchking.magic_of_color.events.MagicofColor;
import net.minecraft.resources.ResourceLocation;

public class BedrockWarlockArmorRenderer extends AzArmorRenderer {
    private static final ResourceLocation GEO = ResourceLocation.fromNamespaceAndPath(
            MagicofColor.MOD_ID,
            "geo/bedrock_wizard_armor.geo.json"
    );

    private static final ResourceLocation TEX = ResourceLocation.fromNamespaceAndPath(
            MagicofColor.MOD_ID,
            "textures/models/armor/bedrock_wizard_armor.png"
    );

    public BedrockWarlockArmorRenderer() {
        super(
                AzArmorRendererConfig.builder(GEO, TEX)
                        .setPipelineContext(AzArmorLowerCloakLayerPipeline::new)
                        .build()
        );
    }
}
