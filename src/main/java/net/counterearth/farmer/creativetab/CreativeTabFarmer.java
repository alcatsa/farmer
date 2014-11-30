package net.counterearth.farmer.creativetab;

import net.counterearth.farmer.init.ModItems;
import net.counterearth.farmer.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Andreas Sjöstedt on 2014-09-08.
 */
public class CreativeTabFarmer
{
    public static final CreativeTabs Farmer_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.sourmilk;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Farmer";
        }

    };
}
