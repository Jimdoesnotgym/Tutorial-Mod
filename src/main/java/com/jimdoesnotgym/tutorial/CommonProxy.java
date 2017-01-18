package com.jimdoesnotgym.tutorial;

/**
 * Created by ms076 on 2017-01-18.
 */

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/*The ClientProxy is called on startup if minecraft is started from a Combined Client
        The ServerProxy is called on startup if minecraft is started from a Dedicated Server
        A game process runs on the Server Side if it executes the world update tasks etc.
        A game process runs on the Client Side if it executes rendering and shows the world to a player who controls his character*/

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){

    }

    public void init(FMLInitializationEvent e){

    }

    public void postInit(FMLPostInitializationEvent e){

    }
}
