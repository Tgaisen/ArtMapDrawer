package org.pythonchik.drawler.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.client.MinecraftClient;

public class ModMenu implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> DrawlerSettings.create(MinecraftClient.getInstance().currentScreen);

    }
}

