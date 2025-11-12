package net.acetheeldritchking.magic_of_color.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.acetheeldritchking.magic_of_color.MagicofColor;
import net.acetheeldritchking.magic_of_color.items.armor.GildedHatItem;
import net.acetheeldritchking.magic_of_color.items.armor.GildedMaskItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class GildedMaskModel extends DefaultedEntityGeoModel<GildedMaskItem> {
    public GildedMaskModel() {
        super(ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(GildedMaskItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, "geo/gilded_hood_mask.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GildedMaskItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, "textures/models/armor/gilded_mask.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GildedMaskItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
