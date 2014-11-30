package net.counterearth.farmer.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.counterearth.farmer.block.BlockChurn;
import net.counterearth.farmer.block.BlockFarmer;
import net.counterearth.farmer.reference.Reference;

/**
 * Created by Andreas Sjöstedt on 2014-09-08.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockFarmer churn = new BlockChurn();

    public static void init()
    {
        GameRegistry.registerBlock(churn, "churn");
    }
}
