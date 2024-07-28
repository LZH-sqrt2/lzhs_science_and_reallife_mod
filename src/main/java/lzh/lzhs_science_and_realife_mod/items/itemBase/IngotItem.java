package lzh.lzhs_science_and_realife_mod.items.itemBase;

import net.minecraft.world.item.Item;

public class IngotItem extends Item {
    public IngotItem(Properties pProperties) {
        super(pProperties.stacksTo(64).fireResistant());
    }
}
