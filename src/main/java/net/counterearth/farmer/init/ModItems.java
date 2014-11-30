package net.counterearth.farmer.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.counterearth.farmer.item.ItemFarmer;
import net.counterearth.farmer.item.ItemSourMilk;
import net.counterearth.farmer.reference.Reference;

/**
 * Created by Andreas Sjöstedt on 2014-09-08.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemFarmer sourmilk = new ItemSourMilk();

    public static void init()
    {
        GameRegistry.registerItem(sourmilk,"sourmilk" );
    }
}
