package com.jimdoesnotgym.tutorial;

import com.jimdoesnotgym.tutorial.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ms076 on 2017-01-18.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent e) {
    }

    @Override
    public void init(FMLInitializationEvent e) {
        // we call registerRenders here because rendering is only on client side
        ModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
    }
}
