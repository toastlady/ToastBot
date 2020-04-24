package me.dedose.bot.main;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class BotMain {

    private static JDA jda;

    public static void main(String[] args) throws Exception{
        jda = JDA (AccountType.BOT)
               .setToken("NzAzMjQ3OTg3MzQxNzg3MTc3.XqL1RQ.HxrT8g8yd1z32iA0xSJLPiPmMCk");



    }
}

