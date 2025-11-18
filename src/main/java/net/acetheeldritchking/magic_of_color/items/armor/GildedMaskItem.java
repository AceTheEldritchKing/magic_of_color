package net.acetheeldritchking.magic_of_color.items.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import net.acetheeldritchking.aces_spell_utils.items.example.ImbuableExtendedGeoArmorItem;
import net.acetheeldritchking.magic_of_color.entity.armor.GildedHoodModel;
import net.acetheeldritchking.magic_of_color.entity.armor.GildedMaskModel;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GildedMaskItem extends ImbuableExtendedGeoArmorItem {
    public GildedMaskItem(Type slot, Properties settings) {
        super(MOCArmorMaterialRegistry.GILDED_HATS, slot, settings, schoolAttributes(AttributeRegistry.SPELL_RESIST, 150, 0.5F, 0.05F));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new GildedMaskModel());
    }
}
