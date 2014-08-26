package net.counterearth.farmer.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.counterearth.farmer.handler.ConfigurationHandler;
import net.counterearth.farmer.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by Andreas Sjöstedt on 2014-08-26.
 */
public class ModGuiConfig extends GuiConfig
{
    public  ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }

}
