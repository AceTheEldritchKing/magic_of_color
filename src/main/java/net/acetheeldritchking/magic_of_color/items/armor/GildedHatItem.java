package net.acetheeldritchking.magic_of_color.items.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import net.acetheeldritchking.aces_spell_utils.items.example.ImbuableExtendedGeoArmorItem;
import net.acetheeldritchking.magic_of_color.entity.armor.GildedHatModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GildedHatItem extends ImbuableExtendedGeoArmorItem {
    public GildedHatItem(Type slot, Properties settings) {
        super(MOCArmorMaterialRegistry.GILDED_HATS, slot, settings, schoolAttributes(AttributeRegistry.MANA_REGEN, 150, 0.5F, 0.05F));
    }

    @Override
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new GildedHatModel());
    }
}
