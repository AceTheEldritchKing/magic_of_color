package net.acetheeldritchking.magic_of_color.items.armor;

import earth.terrarium.pastel.PastelCommon;
import earth.terrarium.pastel.registries.PastelItems;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.acetheeldritchking.magic_of_color.MagicofColor;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class MOCArmorMaterialRegistry {
    private static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, MagicofColor.MOD_ID);

    // Bedrock Warlock
    public static DeferredHolder<ArmorMaterial, ArmorMaterial> BEDROCK_WARLOCK = register("bedrock_warlock",
            bedrockArmorMap(),
            25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(PastelItems.BEDROCK_DUST),
            PastelCommon.CONFIG.BedrockArmorToughness,
            PastelCommon.CONFIG.BedrockArmorKnockbackResistance);

    // Gilded Wizard Hats
    public static DeferredHolder<ArmorMaterial, ArmorMaterial> GILDED_HATS = register("gilded_hats",
            baseArmorMap(),
            25,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            () -> Ingredient.of(ItemRegistry.MAGIC_CLOTH.get()),
            0,
            0);


    private static DeferredHolder<ArmorMaterial, ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            Supplier<Ingredient> repairIngredient,
            float toughness,
            float knockbackResistance
    )
    {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(MagicofColor.id(name)));
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(defense, enchantmentValue, equipSound, repairIngredient, list, toughness, knockbackResistance));
    }

    public static EnumMap<ArmorItem.Type, Integer> makeArmorMap(int helmet, int chestplate, int leggings, int boots)
    {
        return Util.make(new EnumMap<>(ArmorItem.Type.class), (typeIntegerEnumMap) -> {
            typeIntegerEnumMap.put(ArmorItem.Type.HELMET, helmet);
            typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, chestplate);
            typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, leggings);
            typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, boots);
        });
    }

    public static EnumMap<ArmorItem.Type, Integer> baseArmorMap()
    {
        return makeArmorMap(3, 8, 6, 3);
    }

    public static EnumMap<ArmorItem.Type, Integer> warlockArmorMap()
    {
        return makeArmorMap(4, 9, 7, 4);
    }

    public static EnumMap<ArmorItem.Type, Integer> bedrockArmorMap()
    {
        return makeArmorMap(PastelCommon.CONFIG.BedrockArmorHelmetProtection, PastelCommon.CONFIG.BedrockArmorChestplateProtection, PastelCommon.CONFIG.BedrockArmorLeggingsProtection, PastelCommon.CONFIG.BedrockArmorBootsProtection);
    }

    public static void register(IEventBus eventBus)
    {
        ARMOR_MATERIALS.register(eventBus);
    }
}
