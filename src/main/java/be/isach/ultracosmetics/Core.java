//BubbleNetwork start
package be.isach.ultracosmetics;

import be.isach.ultracosmetics.command.CommandManager;

public class Core extends UltraCosmetics{
    public static boolean vaultLoaded,placeHolderColor;
    public static CommandManager commandManager;
    public static Core instance;

    public Core(){
        super();
        instance = this;
    }
}

//BubbleNetwork end
