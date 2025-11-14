package net.acetheeldritchking.magic_of_color.registries;

import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.acetheeldritchking.magic_of_color.MagicofColor;
import net.acetheeldritchking.magic_of_color.items.armor.*;
import net.acetheeldritchking.magic_of_color.items.staffs.InquisitorsGauntletStaff;
import net.acetheeldritchking.magic_of_color.items.staffs.PraetorsGauntletStaff;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collection;

public class ItemRegistries {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MagicofColor.MOD_ID);

    /***
     * Spellbooks
     */

    /***
     * Staffs
     */
    // Inquisitor's Gauntlet
    public static final DeferredHolder<Item, Item> INQUISITORS_GAUNTLET = ITEMS.register("inquisitors_gauntlet", InquisitorsGauntletStaff::new);

    // Praetor's Gauntlet
    public static final DeferredHolder<Item, Item> PRAETORS_GAUNTLET = ITEMS.register("praetors_gauntlet", PraetorsGauntletStaff::new);

    /***
     * Armor
     */
    // Bedrock Warlock armors
    public static final DeferredHolder<Item, Item> BEDROCK_WARLOCK_HAT = ITEMS.register("bedrock_warlock_hat", () -> new BedrockWarlockArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(40)).component(DataComponents.UNBREAKABLE, new Unbreakable(false))));
    public static final DeferredHolder<Item, Item> BEDROCK_WARLOCK_HOOD = ITEMS.register("bedrock_warlock_hood", () -> new BedrockWarlockHoodArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(40)).component(DataComponents.UNBREAKABLE, new Unbreakable(false))));
    public static final DeferredHolder<Item, Item> BEDROCK_WARLOCK_HELMET = ITEMS.register("bedrock_warlock_helmet", () -> new BedrockWarlockHelmetArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(40)).component(DataComponents.UNBREAKABLE, new Unbreakable(false))));
    public static final DeferredHolder<Item, Item> BEDROCK_WARLOCK_ROBES = ITEMS.register("bedrock_warlock_robes", () -> new BedrockWarlockArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(40)).component(DataComponents.UNBREAKABLE, new Unbreakable(false))));
    public static final DeferredHolder<Item, Item> BEDROCK_WARLOCK_LEGGINGS = ITEMS.register("bedrock_warlock_leggings", () -> new BedrockWarlockArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(40)).component(DataComponents.UNBREAKABLE, new Unbreakable(false))));
    public static final DeferredHolder<Item, Item> BEDROCK_WARLOCK_GREAVES = ITEMS.register("bedrock_warlock_greaves", () -> new BedrockWarlockArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(40)).component(DataComponents.UNBREAKABLE, new Unbreakable(false))));

    // Gilded Magician's armors
    // Gilded Magician's Hat
    public static final DeferredHolder<Item, Item> GILDED_MAGICIANS_HAT = ITEMS.register("gilded_magicians_hat", () -> new GildedHatItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(12))));
    // Gilded Magician's Hood
    public static final DeferredHolder<Item, Item> GILDED_MAGICIANS_HOOD = ITEMS.register("gilded_magicians_hood", () -> new GildedHoodItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(12))));
    // Gilded Magician's Mask
    public static final DeferredHolder<Item, Item> GILDED_MAGICIANS_MASK = ITEMS.register("gilded_magicians_mask", () -> new GildedMaskItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(12))));

    public static Collection<DeferredHolder<Item, ? extends Item>> getMOCItems()
    {
        return ITEMS.getEntries();
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
