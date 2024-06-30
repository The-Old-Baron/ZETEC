package com.dreamcatcher.zetec.item;

import com.dreamcatcher.zetec.ZETEC;

import com.dreamcatcher.zetec.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZETEC.MODID);

    public static final RegistryObject<CreativeModeTab> ZETEC_TAB = CREATIVE_MODE_TABS.register("zetec_tab",
            ()->CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.zetec_tab"))
                    .displayItems((pParameters,pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        pOutput.accept(ModBlock.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlock.RAW_SAPPHIRE_BLOCK.get());
                    })
                    .build()
    );
    
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
